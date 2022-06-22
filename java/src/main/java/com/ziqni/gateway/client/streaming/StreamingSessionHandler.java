package com.ziqni.gateway.client.streaming;//package com.ziqni.gateway.client.streaming;
//
//import com.ziqni.admin.utils.ClassScanner;
//import org.springframework.messaging.simp.stomp.*;
//
//import java.lang.reflect.Type;
//import java.util.Optional;
//import java.util.concurrent.ConcurrentHashMap;
//import java.util.concurrent.ForkJoinPool;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
//public class StreamingSessionHandler extends StompSessionHandlerAdapter {
//
//    private static final Logger logger = Logger.getLogger(StreamingSessionHandler.class.getName());
//
//    private final AtomicLong sequenceNumber = new AtomicLong(0);
//    private final ConcurrentHashMap<String, ApiCallbackResponse<?,?>> awaitingResponse = new ConcurrentHashMap<>();
//
//    private final ForkJoinPool forkJoinPool;
//    private final ClassScanner classScanner;
//
//    public StreamingSessionHandler() {
//        super();
//        this.forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
//        this.classScanner = new ClassScanner("com.ziqni.admin.client.model");
//    }
//
//    public StreamingSessionHandler(ForkJoinPool forkJoinPool) {
//        super();
//        this.forkJoinPool = forkJoinPool;
//        this.classScanner = new ClassScanner("com.ziqni.admin.client.model");
//    }
//
//    public StreamingSessionHandler(ForkJoinPool forkJoinPool, String packageToScan) {
//        super();
//        this.forkJoinPool = forkJoinPool;
//        this.classScanner = new ClassScanner(packageToScan);
//    }
//
//    public long getNextSequenceNumber() {
//        return sequenceNumber.incrementAndGet();
//    }
//
//    public Optional<ApiCallbackResponse<?, ?>> getAndRemoveAwaitingResponse(String sequenceNumber) {
//        return Optional.ofNullable(awaitingResponse.get(sequenceNumber));
//    }
//
//    public void addStreamingResponse(ApiCallbackResponse<?, ?> in){
//        awaitingResponse.put(in.getSequenceNumberAsString(), in);
//    }
//
//    @Override
//    public void afterConnected(StompSession session, StompHeaders headers) {
//        String sender = headers.getFirst("user-name");
//        session.send("/topic/messages", new Message(sender, "Join!"));
//    }
//
//    @Override
//    public Type getPayloadType(StompHeaders stompHeaders) {
//        return this.classScanner.get(stompHeaders.getFirst("objectType")).orElse(Object.class);
//    }
//
//    @Override
//    public void handleFrame(StompHeaders stompHeaders, Object payload) {
//
//        var sn = getSequenceNumber(stompHeaders);
//
//        if(sn.isPresent()){
//            handleWithSequenceNumber(sn.get(), stompHeaders, payload);
//        }
//        else {
//            logger.log(Level.SEVERE,"No sequence number provided. Headers: " + stompHeaders + ". Payload: " + payload);
//        }
//    }
//
//    @Override
//    public void handleException(StompSession session, StompCommand command, StompHeaders headers, byte[] payload, Throwable exception) {
//        exception.printStackTrace();
//    }
//
//    @Override
//    public void handleTransportError(StompSession session, Throwable exception) {
//        if (exception instanceof ConnectionLostException) {
//            logger.log(Level.SEVERE,"Connection Lost!");
//        }
//    }
//
//    public ForkJoinPool getForkJoinPool() {
//        return forkJoinPool;
//    }
//
//    private Optional<String> getSequenceNumber(StompHeaders stompHeaders){
//        return Optional.ofNullable(stompHeaders.get("sn")).map(list -> {
//            var snIter = list.iterator();
//            if(snIter.hasNext()){
//                var sn = snIter.next();
//                return (sn == null && sn.trim().isBlank())
//                        ? null
//                        : sn;
//            }
//            else
//                return null;
//        });
//    }
//
//    private void handleWithSequenceNumber(String sequenceNumber, StompHeaders stompHeaders, Object payload) {
//        var handleWith = Optional.ofNullable(awaitingResponse.remove(sequenceNumber));
//
//        if(handleWith.isPresent())
//
//            handleWith.map( sr ->
//                    this.forkJoinPool.submit(
//                            sr.onCallBack(stompHeaders,payload)
//                    )
//            );
//        else {
//            logger.log(Level.SEVERE,"No handler waiting for sequence number: "+ sequenceNumber +". Headers: " + stompHeaders + ". Payload: " + payload);
//        }
//    }
//}
