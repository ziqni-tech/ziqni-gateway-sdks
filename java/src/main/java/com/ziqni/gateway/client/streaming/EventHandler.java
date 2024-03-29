/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gateway.client.streaming;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.messaging.simp.stomp.StompFrameHandler;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession.Subscription;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Logger;

public abstract class EventHandler<T> implements StompFrameHandler {

    private static final Logger logger = Logger.getLogger(EventHandler.class.getName());
    protected static final ObjectMapper objectMapper = new ObjectMapper();
    private Subscription stompSubscription;
    private boolean active = true;

    /**
     * Get the Topic name this handler should attach to
     *
     * @return
     */
    public abstract String getTopic();

    /**
     * Jackson value type that is expected to be returned
     *
     * @return
     */
    public abstract JavaType getValType(StompHeaders headers);

    /**
     * Listener method which fires when new data arrives
     *
     * @param data
     */
    public abstract void onData(T data);

    @Override
    public Type getPayloadType(StompHeaders headers) {
        return String.class;
    }

    @Override
    public void handleFrame(StompHeaders headers, Object payload) {
        try {
            T val = objectMapper.readValue((String) payload, getValType(headers));
            onData(val);

        } catch (IOException e) {
            logger.severe("Failed to decode message" + e);
        }
    }

    public void unsubscribe() {
        this.active = false;
        if (getStompSubscription() != null) {
            getStompSubscription().unsubscribe();
        }
    }

    public Subscription getStompSubscription() {
        return stompSubscription;
    }

    public void setStompSubscription(Subscription stompSubscription) {
        this.stompSubscription = stompSubscription;
    }

    public boolean isActive() {
        return active;
    }
}
