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

import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Pair;

import com.ziqni.gateway.client.model.ApiErrorResponse;
import com.ziqni.gateway.client.model.Error;
import com.ziqni.gateway.client.model.MemberResponse;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.function.Consumer;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;

import java.util.concurrent.CompletableFuture;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MembersApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;

  public MembersApi() {
    this(new ApiClient());
  }

  public MembersApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
  }

  private ApiException getApiException(String operationId, HttpResponse<String> response) {
    String message = formatExceptionMessage(operationId, response.statusCode(), response.body());
    return new ApiException(response.statusCode(), message, response.headers(), response.body());
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Returns the member by requested id
   * Returns the information for a given Member id
   * @param X_API_KEY Your unique API key (required)
   * @param spaceName This is the space name which is linked to the account (required)
   * @param id Unique identifier of the resource (required)
   * @return CompletableFuture&lt;MemberResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<MemberResponse> getMemberById(String X_API_KEY, String spaceName, String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getMemberByIdRequestBuilder(X_API_KEY, spaceName, id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getMemberById", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MemberResponse>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Returns the member by requested id
   * Returns the information for a given Member id
   * @param X_API_KEY Your unique API key (required)
   * @param spaceName This is the space name which is linked to the account (required)
   * @param id Unique identifier of the resource (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MemberResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<MemberResponse>> getMemberByIdWithHttpInfo(String X_API_KEY, String spaceName, String id) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getMemberByIdRequestBuilder(X_API_KEY, spaceName, id);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getMemberById", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<MemberResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MemberResponse>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getMemberByIdRequestBuilder(String X_API_KEY, String spaceName, String id) throws ApiException {
    // verify the required parameter 'X_API_KEY' is set
    if (X_API_KEY == null) {
      throw new ApiException(400, "Missing the required parameter 'X_API_KEY' when calling getMemberById");
    }
    // verify the required parameter 'spaceName' is set
    if (spaceName == null) {
      throw new ApiException(400, "Missing the required parameter 'spaceName' when calling getMemberById");
    }
    // verify the required parameter 'id' is set
    if (id == null) {
      throw new ApiException(400, "Missing the required parameter 'id' when calling getMemberById");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/{spaceName}/members/{id}"
        .replace("{spaceName}", ApiClient.urlEncode(spaceName.toString()))
        .replace("{id}", ApiClient.urlEncode(id.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (X_API_KEY != null) {
      localVarRequestBuilder.header("X-API-KEY", X_API_KEY.toString());
    }
    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Returns the member by requested id
   * Returns the information for a given Member Reference ID
   * @param X_API_KEY Your unique API key (required)
   * @param spaceName This is the space name which is linked to the account (required)
   * @param memberRefId Reference Id of a Member (required)
   * @return CompletableFuture&lt;MemberResponse&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<MemberResponse> getMemberByRefId(String X_API_KEY, String spaceName, String memberRefId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getMemberByRefIdRequestBuilder(X_API_KEY, spaceName, memberRefId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getMemberByRefId", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MemberResponse>() {})
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
      });
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  /**
   * Returns the member by requested id
   * Returns the information for a given Member Reference ID
   * @param X_API_KEY Your unique API key (required)
   * @param spaceName This is the space name which is linked to the account (required)
   * @param memberRefId Reference Id of a Member (required)
   * @return CompletableFuture&lt;ApiResponse&lt;MemberResponse&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public CompletableFuture<ApiResponse<MemberResponse>> getMemberByRefIdWithHttpInfo(String X_API_KEY, String spaceName, String memberRefId) throws ApiException {
    try {
      HttpRequest.Builder localVarRequestBuilder = getMemberByRefIdRequestBuilder(X_API_KEY, spaceName, memberRefId);
      return memberVarHttpClient.sendAsync(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofString()).thenComposeAsync(localVarResponse -> {
            if (localVarResponse.statusCode()/ 100 != 2) {
              return CompletableFuture.failedFuture(getApiException("getMemberByRefId", localVarResponse));
            }
            try {
              return CompletableFuture.completedFuture(
                  new ApiResponse<MemberResponse>(
                      localVarResponse.statusCode(),
                      localVarResponse.headers().map(),
                      memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<MemberResponse>() {}))
              );
            } catch (IOException e) {
              return CompletableFuture.failedFuture(new ApiException(e));
            }
        }
      );
    }
    catch (ApiException e) {
      return CompletableFuture.failedFuture(e);
    }
  }

  private HttpRequest.Builder getMemberByRefIdRequestBuilder(String X_API_KEY, String spaceName, String memberRefId) throws ApiException {
    // verify the required parameter 'X_API_KEY' is set
    if (X_API_KEY == null) {
      throw new ApiException(400, "Missing the required parameter 'X_API_KEY' when calling getMemberByRefId");
    }
    // verify the required parameter 'spaceName' is set
    if (spaceName == null) {
      throw new ApiException(400, "Missing the required parameter 'spaceName' when calling getMemberByRefId");
    }
    // verify the required parameter 'memberRefId' is set
    if (memberRefId == null) {
      throw new ApiException(400, "Missing the required parameter 'memberRefId' when calling getMemberByRefId");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/api/v1/{spaceName}/members/reference/{memberRefId}"
        .replace("{spaceName}", ApiClient.urlEncode(spaceName.toString()))
        .replace("{memberRefId}", ApiClient.urlEncode(memberRefId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (X_API_KEY != null) {
      localVarRequestBuilder.header("X-API-KEY", X_API_KEY.toString());
    }
    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
