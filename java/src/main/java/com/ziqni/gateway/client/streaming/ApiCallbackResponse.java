/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gateway.client.streaming;

import org.springframework.messaging.simp.stomp.StompHeaders;

import java.util.function.BiConsumer;
import java.util.logging.Logger;

public class ApiCallbackResponse<T, TIN> {

    private static final Logger logger = Logger.getLogger(ApiCallbackResponse.class.getName());

    private final long sequenceNumber;
    private final T payload;
    private final BiConsumer<StompHeaders, TIN> callback;

    public ApiCallbackResponse(long sequenceNumber, T payload, BiConsumer<StompHeaders, TIN> callback) {
        this.sequenceNumber = sequenceNumber;
        this.payload = payload;
        this.callback = callback;
    }

    public long getSequenceNumber() {
        return sequenceNumber;
    }
    public String getSequenceNumberAsString() {
        return Long.toString(sequenceNumber);
    }

    public T getPayload() {
        return payload;
    }

    public BiConsumer<StompHeaders, TIN> getCallbackFunction() {
        return callback;
    }

    public Runnable onCallBack(StompHeaders headers, Object response) {
        return () ->
                callback.accept(headers,(TIN)response);
    }
}
