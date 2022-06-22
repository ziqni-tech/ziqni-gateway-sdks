/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gateway.client.ws;

import com.ziqni.gateway.client.StreamingClient;
import com.ziqni.gateway.client.streaming.ApiCallbackResponse;
import org.springframework.messaging.simp.stomp.StompHeaders;

import java.util.concurrent.CompletableFuture;

public class WsCompletableFuture<TA, TAIN> extends CompletableFuture<TAIN> {

    private String destination;
    private ApiCallbackResponse<TA, TAIN> apiCallbackResponse;

    public WsCompletableFuture(StreamingClient streamingClient, String destination, TA payload) {
        this.destination = destination;
        this.apiCallbackResponse = streamingClient.send(destination,payload, this::onCallback);
    }

    public String getDestination() {
        return destination;
    }

    public ApiCallbackResponse<TA, TAIN> getApiCallbackResponse() {
        return apiCallbackResponse;
    }

    private void onCallback(StompHeaders stompHeaders, TAIN result){
        super.complete(result);
    }
}
