/*
 * Copyright (c) 2022. ZIQNI LTD registered in England and Wales, company registration number-09693684
 */

/*
 * Ziqni Gateway Services
 * These are the Gateway services to be used by customers.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ziqni.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ziqni.gateway.client.api;

import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.api.SseApi;
import com.ziqni.gateway.client.model.ApiErrorResponse;
import com.ziqni.gateway.client.model.Error;
import com.ziqni.gateway.client.model.SseMemberMessage;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for SseApi
 */
public class SseApiTest {

    private final SseApi api = new SseApi();

    
    /**
     * Subscribe to SSE channel
     *
     * Establishes an SSE channel for a specific member id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscribeSseChannelByMemberIdTest() throws ApiException {
        String X_API_KEY = null;
        String spaceName = null;
        String memberId = null;
        CompletableFuture<SseMemberMessage> response = 
        api.subscribeSseChannelByMemberId(X_API_KEY, spaceName, memberId);
        
        // TODO: test validations
    }
    
    /**
     * Subscribe to SSE channel
     *
     * Establishes an SSE channel for a specific member ref id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscribeSseChannelByMemberRefIdTest() throws ApiException {
        String X_API_KEY = null;
        String spaceName = null;
        String memberRefId = null;
        CompletableFuture<SseMemberMessage> response = 
        api.subscribeSseChannelByMemberRefId(X_API_KEY, spaceName, memberRefId);
        
        // TODO: test validations
    }
    
    /**
     * Subscribe to SSE channel
     *
     * Establishes an SSE channel for a specific member id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscribeSseChannelHeartbeatByMemberIdTest() throws ApiException {
        String X_API_KEY = null;
        String spaceName = null;
        String memberId = null;
        CompletableFuture<SseMemberMessage> response = 
        api.subscribeSseChannelHeartbeatByMemberId(X_API_KEY, spaceName, memberId);
        
        // TODO: test validations
    }
    
    /**
     * Subscribe to SSE channel
     *
     * Establishes an SSE channel for a specific member id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscribeSseChannelHeartbeatByMemberRefIdTest() throws ApiException {
        String X_API_KEY = null;
        String spaceName = null;
        String memberRefId = null;
        CompletableFuture<SseMemberMessage> response = 
        api.subscribeSseChannelHeartbeatByMemberRefId(X_API_KEY, spaceName, memberRefId);
        
        // TODO: test validations
    }
    
}
