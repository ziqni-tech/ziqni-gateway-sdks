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
import com.ziqni.gateway.client.api.MemberAwardsApi;
import com.ziqni.gateway.client.model.ApiErrorResponse;
import com.ziqni.gateway.client.model.Error;
import com.ziqni.gateway.client.model.MemberAwardByIdResponse;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.CompletableFuture;

/**
 * API tests for MemberAwardsApi
 */

public class MemberAwardsApiTest {

    private final MemberAwardsApi api = new MemberAwardsApi();

    
    /**
     * Claim a specific award for a member
     *
     * Claims an Award for a given Member ID. This is only applicable when an award needs to be claimed.  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void claimAwardByIdAndMemberIdTest() throws ApiException {
        String X_API_KEY = null;
        String spaceName = null;
        String memberId = null;
        String awardId = null;
        CompletableFuture<MemberAwardByIdResponse> response = 
        api.claimAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId);
        
        // TODO: test validations
    }
    
    /**
     * Claim a specific award for a member
     *
     * Claims an Award for a given Member ID. This is only applicable when an award needs to be claimed.  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void claimAwardByIdAndMemberRefIdTest() throws ApiException {
        String X_API_KEY = null;
        String spaceName = null;
        String memberRefId = null;
        String awardId = null;
        CompletableFuture<MemberAwardByIdResponse> response = 
        api.claimAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId);
        
        // TODO: test validations
    }
    
    /**
     * Returns specific award for a member
     *
     * Returns the an award for a given member ID  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAwardByIdAndMemberIdTest() throws ApiException {
        String X_API_KEY = null;
        String spaceName = null;
        String memberId = null;
        String awardId = null;
        CompletableFuture<MemberAwardByIdResponse> response = 
        api.getAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId);
        
        // TODO: test validations
    }
    
    /**
     * Returns specific award for a member
     *
     * Returns the an award for a given member ID  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAwardByIdAndMemberRefIdTest() throws ApiException {
        String X_API_KEY = null;
        String spaceName = null;
        String memberRefId = null;
        String awardId = null;
        CompletableFuture<MemberAwardByIdResponse> response = 
        api.getAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId);
        
        // TODO: test validations
    }
    
}