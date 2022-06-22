/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gateway.client;

import com.ziqni.gateway.client.streaming.ApiCallbackEventHandler;
import com.ziqni.gateway.client.streaming.ApiCallbackResponse;
import com.ziqni.gateway.client.streaming.MessageEventHandler;
import com.ziqni.gateway.client.streaming.WebSocketClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;

import java.util.concurrent.ExecutionException;
import java.util.function.BiConsumer;

public class StreamingClient {

    private static final Logger logger = LoggerFactory.getLogger(StreamingClient.class);

    private final String URL;

    private final WebSocketClient webSocketClient;
    private final ApiCallbackEventHandler apiCallbackEventHandler;

    public StreamingClient(String URL) throws ExecutionException, InterruptedException {

        this.URL = URL;
        this.apiCallbackEventHandler = new ApiCallbackEventHandler();
        this.webSocketClient = new WebSocketClient(URL);
        this.webSocketClient.subscribe(this.apiCallbackEventHandler);
        this.webSocketClient.subscribe(new MessageEventHandler("/gateway/user/queue/messages"));

        this.webSocketClient.start();
        Thread.sleep(500);
    }

    public WebSocketClient getWebSocketClient() {
        return webSocketClient;
    }

    public <T extends Object, TIN> ApiCallbackResponse<T,TIN> send(String destination, T payload, BiConsumer<StompHeaders, TIN> callback){
        return this.apiCallbackEventHandler.send(destination,payload, callback, this::send);
    }

    synchronized private <T> StompSession.Receiptable send(StompHeaders headers, T payload ){
        return this.webSocketClient.send(headers, payload);
    }

    public void stop(){
        if(this.webSocketClient != null)
            this.webSocketClient.shutdown();
    }
}
