/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gateway.client.streaming;

import com.google.common.collect.Iterables;
import com.ziqni.common.utils.CoreClientObjectMapper;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;
import org.springframework.messaging.simp.stomp.ConnectionLostException;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandlerAdapter;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.util.concurrent.FailureCallback;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.SuccessCallback;
import org.springframework.web.socket.WebSocketHttpHeaders;
import org.springframework.web.socket.client.jetty.JettyWebSocketClient;
import org.springframework.web.socket.messaging.WebSocketStompClient;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.Transport;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;

import java.util.*;
import java.util.logging.Logger;

public class WebSocketClient {

    private static final Logger logger = Logger.getLogger(WebSocketClient.class.getName());

    private static final long DEFAULT_RECONNECT_DELAY = 1000;

    private final Timer reconnectTimer;

    private final long reconnectDelay;

    private final TaskScheduler taskScheduler;

    private final String wsUri;

    private final StompHeaders stompHeaders;

    private WebSocketStompClient stompClient;

    private StompSession stompSession;

    private final Map<String, List<EventHandler<?>>> topicHandlers;

    private final List<SuccessCallback<StompSession>> connectListeners;

    private final List<FailureCallback> disconnectListeners;

    private boolean started;

    private boolean shutdown;

    public WebSocketClient(String wsUri) {
        this(wsUri, DEFAULT_RECONNECT_DELAY, makeAuthHeader());
    }

    protected WebSocketClient(String wsUri, StompHeaders stompHeaders) {
        this(wsUri, DEFAULT_RECONNECT_DELAY, stompHeaders);
    }

    protected WebSocketClient(String wsUri, long reconnectDelay, StompHeaders stompHeaders) {
        this.wsUri = wsUri;
        this.taskScheduler = new ThreadPoolTaskScheduler();
        this.reconnectTimer = new Timer("ReconnectTimer");
        this.reconnectDelay = reconnectDelay;
        this.topicHandlers = Collections.synchronizedMap(new LinkedHashMap<>());
        this.connectListeners = Collections.synchronizedList(new ArrayList<>());
        this.disconnectListeners = Collections.synchronizedList(new ArrayList<>());
        this.started = false;
        this.shutdown = false;
        this.stompHeaders = stompHeaders;

    }

    private static StompHeaders makeAuthHeader(){

        StompHeaders stompHeaders = new StompHeaders();
        updateOauthToken(stompHeaders);
        return stompHeaders;
    }

    // Fixme - Is this required?
    private static void updateOauthToken(StompHeaders stompHeaders){
//        String oauthToken = AdminApiClientConfig.getAccessTokenString();
//        if (stompHeaders.containsKey("Authorization"))
//            stompHeaders.remove("Authorization");
//
//        stompHeaders.add("Authorization", "Bearer " + oauthToken);
    }

    public <T> StompSession.Receiptable send(StompHeaders headers, T payload ){
        return stompSession.send(headers, payload);
    }

    public void subscribe(EventHandler<?> handler) {
        if (topicHandlers.get(handler.getTopic()) == null) {
            topicHandlers.put(handler.getTopic(), Collections.synchronizedList(new ArrayList<>()));
        }
        topicHandlers.get(handler.getTopic()).add(handler);
        if (stompSession != null && stompSession.isConnected()) {
            logger.info("Subscribing to " + handler.getTopic());
            handler.setStompSubscription(stompSession.subscribe(handler.getTopic(), handler));
        }
    }

    /**
     * Add a listener to fire on successful WebSocket/Stomp connection
     * @param listener
     */
    public void addConnectListener(SuccessCallback<StompSession> listener) {
        connectListeners.add(listener);
    }

    /**
     * Add a listener which fires when the WebSocket/Stomp connection is broken (or fails to connect)
     * @param listener
     */
    public void addDisconnectListener(FailureCallback listener) {
        disconnectListeners.add(listener);
    }

    public boolean isStarted() {
        return started;
    }

    public boolean isShutdown() {
        return shutdown;
    }

    private void reconnect() {
        if (this.shutdown) {
            return;
        }
        if (stompClient != null) {
            logger.info("Reconnecting");
            disconnect(stompClient);
            createClient();
            doConnect();
            return;
        }
        start();
    }

    public void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        doStart();
    }

    private void doStart() {
        logger.info("Connecting");
        createClient();
        doConnect();
    }

    public void shutdown() {
        if (shutdown) {
            return;
        }
        shutdown = true;
        disconnect();
        reconnectTimer.cancel();
    }

    private void disconnect() {
        if (stompClient != null && stompClient.isRunning()) {
            disconnect(stompClient);
            stompClient = null;
            stompSession = null;
        }
    }

    private void disconnect(final WebSocketStompClient stompClient) {
        if (stompClient != null && stompClient.isRunning()) {
            new Thread(() -> {
                try {
                    stompClient.stop();
                } catch (Throwable t) {
                    logger.warning("err stopping client: " + t.getMessage());
                }
            }).start();
        }
    }

    private void createClient() {

        // setup transports & socksjs
        JettyWebSocketClient jettyWebSocketClient = new JettyWebSocketClient();
        List<Transport> transports = new ArrayList<>(2);
        transports.add(new WebSocketTransport(jettyWebSocketClient));
        SockJsClient sockJsClient = new SockJsClient(transports);

        // create stomp client
        stompClient = new WebSocketStompClient(sockJsClient);
        var objectMapper = new MappingJackson2MessageConverter();
        objectMapper.setObjectMapper(new CoreClientObjectMapper().serializingObjectMapper());
        stompClient.setMessageConverter(objectMapper);
        stompClient.setTaskScheduler(taskScheduler);
        stompClient.start();
    }

    private void doConnect() {

        updateOauthToken(stompHeaders);

        ListenableFuture<StompSession> future = stompClient.connect(wsUri, new WebSocketHttpHeaders(), stompHeaders, new StompSessionHandlerAdapter() {
            @Override
            public void handleTransportError(StompSession session, Throwable exception) {
                if (exception instanceof ConnectionLostException) {
                    notifyDisconnectListeners(exception);
                    reconnect(); // reconnect the client
                }
            }
        });

        future.addCallback(
                newStompSession -> {
                    stompSession = newStompSession;
                    if (topicHandlers != null && !topicHandlers.isEmpty()) {
                        reconnectAllTopics();
                    }
                    notifyConnectListeners(newStompSession);
                },
                throwable -> {
                    logger.severe("Failed to connect: " + throwable.getMessage());
                    notifyDisconnectListeners(throwable);
                    reconnectTimer.schedule(new TimerTask() {
                        @Override
                        public void run() {
                            reconnect();
                        }
                    }, reconnectDelay);
                }
        );

    }

    private void notifyConnectListeners(StompSession session) {
        for (SuccessCallback<StompSession> successCallback : connectListeners) {
            successCallback.onSuccess(session);
        }
    }

    private void notifyDisconnectListeners(Throwable throwable) {
        for (FailureCallback failCallback : disconnectListeners) {
            failCallback.onFailure(throwable);
        }
    }

    private void reconnectAllTopics() {
        if (topicHandlers == null || topicHandlers.isEmpty() || stompSession == null) {
            return;
        }

        pruneInactiveTopicHandlers(); // cleanup handlers before resubscribing

        for (String topic : topicHandlers.keySet()) {
            List<EventHandler<?>> handlers = topicHandlers.get(topic);
            for (EventHandler<?> handler : handlers) {
                if (handler.isActive()) {
                    logger.warning("Resubscribing to " + topic);
                    handler.setStompSubscription(stompSession.subscribe(topic, handler));
                }
            }
        }
    }

    private void pruneInactiveTopicHandlers() {
        for (String topic : topicHandlers.keySet()) {
            Iterables.removeIf(topicHandlers.get(topic), input -> !input.isActive());
        }
    }

}
