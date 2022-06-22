/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */
package com.ziqni.gateway.client.streaming;

import com.fasterxml.jackson.databind.JavaType;
import com.ziqni.common.utils.ClassScanner;
import org.springframework.messaging.simp.stomp.StompHeaders;
import org.springframework.messaging.simp.stomp.StompSession;

import java.lang.reflect.Type;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ApiCallbackEventHandler extends EventHandler<String> {

    private static final Logger logger = Logger.getLogger(ApiCallbackEventHandler.class.getName());

    private final String topic;
    private final ClassScanner classScanner;
    private final ForkJoinPool forkJoinPool;
    private final AtomicLong sequenceNumber = new AtomicLong(0);
    private final ConcurrentHashMap<String, ApiCallbackResponse<?,?>> awaitingResponse = new ConcurrentHashMap<>();

    public ApiCallbackEventHandler() {
        this("/user/queue/rpc-results");
    }

    public ApiCallbackEventHandler(String topic) {
        this.topic = topic;
        this.forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        this.classScanner = new ClassScanner("com.ziqni.admin.client.model");
    }

    @Override
    public String getTopic() {
        return topic;
    }

    @Override
    public JavaType getValType(StompHeaders headers) {
        return objectMapper.constructType(getPayloadType(headers));
    }

    @Override
    public void onData(String data) {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public Type getPayloadType(StompHeaders headers) {
        return this.classScanner.get(headers.getFirst("objectType")).orElse(Object.class);
    }

    @Override
    public void handleFrame(StompHeaders headers, Object payload) {
        var sn = getSequenceNumber(headers);

        if(sn.isPresent()){
            handleWithSequenceNumber(sn.get(), headers, payload);
        }
        else {
            if(!payload.getClass().isInstance(Message.class))
                logger.log(Level.SEVERE,"No sequence number provided. Headers: " + headers + ". Payload: " + payload);
        }
    }

    public void addStreamingResponse(ApiCallbackResponse<?, ?> in){
        awaitingResponse.put(in.getSequenceNumberAsString(), in);
    }

    public long getNextSequenceNumber() {
        return sequenceNumber.incrementAndGet();
    }

    public <T extends Object, TIN> ApiCallbackResponse<T,TIN> send(String destination, T payload, BiConsumer<StompHeaders, TIN> callback, BiFunction<StompHeaders, T, StompSession.Receiptable> doSend){
        var sn = getNextSequenceNumber();
        var nextSeq = Long.toString(sn);

        StompHeaders headers = new StompHeaders();

        headers.setDestination(destination);
        headers.setReceiptId(nextSeq);
        headers.add("sn", nextSeq);

        var streamingResponse = new ApiCallbackResponse<>(sn, payload, callback);
        addStreamingResponse(streamingResponse);
        StompSession.Receiptable receipt = doSend.apply(headers, payload);
        return streamingResponse;
    }

    private Optional<String> getSequenceNumber(StompHeaders headers){
        return Optional.ofNullable(headers.get("sn")).map(list -> {
            var snIter = list.iterator();
            if(snIter.hasNext()){
                var sn = snIter.next();
                return (sn == null && sn.trim().isBlank())
                        ? null
                        : sn;
            }
            else
                return null;
        });
    }

    private void handleWithSequenceNumber(String sequenceNumber, StompHeaders headers, Object payload) {
        var handleWith = Optional.ofNullable(awaitingResponse.remove(sequenceNumber));

        if(handleWith.isPresent())

            handleWith.map( sr ->
                    this.forkJoinPool.submit(
                            sr.onCallBack(headers,payload)
                    )
            );
        else {
            logger.log(Level.SEVERE,"No handler waiting for sequence number: "+ sequenceNumber +". Headers: " + headers + ". Payload: " + payload);
        }
    }
}
