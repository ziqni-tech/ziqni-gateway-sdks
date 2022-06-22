# SseApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscribeSseChannelByMemberId**](SseApi.md#subscribeSseChannelByMemberId) | **GET** /api/v1/{spaceName}/sse/{memberId} | Subscribe to SSE channel
[**subscribeSseChannelByMemberIdWithHttpInfo**](SseApi.md#subscribeSseChannelByMemberIdWithHttpInfo) | **GET** /api/v1/{spaceName}/sse/{memberId} | Subscribe to SSE channel
[**subscribeSseChannelByMemberRefId**](SseApi.md#subscribeSseChannelByMemberRefId) | **GET** /api/v1/{spaceName}/sse/reference/{memberRefId} | Subscribe to SSE channel
[**subscribeSseChannelByMemberRefIdWithHttpInfo**](SseApi.md#subscribeSseChannelByMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/sse/reference/{memberRefId} | Subscribe to SSE channel
[**subscribeSseChannelHeartbeatByMemberId**](SseApi.md#subscribeSseChannelHeartbeatByMemberId) | **GET** /api/v1/{spaceName}/sse/{memberId}/heartbeat | Subscribe to SSE channel
[**subscribeSseChannelHeartbeatByMemberIdWithHttpInfo**](SseApi.md#subscribeSseChannelHeartbeatByMemberIdWithHttpInfo) | **GET** /api/v1/{spaceName}/sse/{memberId}/heartbeat | Subscribe to SSE channel
[**subscribeSseChannelHeartbeatByMemberRefId**](SseApi.md#subscribeSseChannelHeartbeatByMemberRefId) | **GET** /api/v1/{spaceName}/sse/reference/{memberRefId}/heartbeat | Subscribe to SSE channel
[**subscribeSseChannelHeartbeatByMemberRefIdWithHttpInfo**](SseApi.md#subscribeSseChannelHeartbeatByMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/sse/reference/{memberRefId}/heartbeat | Subscribe to SSE channel



## subscribeSseChannelByMemberId

> CompletableFuture<SseMemberMessage> subscribeSseChannelByMemberId(X_API_KEY, spaceName, memberId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.SseApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ziqni.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        SseApi apiInstance = new SseApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        try {
            CompletableFuture<SseMemberMessage> result = apiInstance.subscribeSseChannelByMemberId(X_API_KEY, spaceName, memberId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling SseApi#subscribeSseChannelByMemberId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key |
 **spaceName** | **String**| This is the space name which is linked to the account |
 **memberId** | **String**| Id of a Member |

### Return type

CompletableFuture<[**SseMemberMessage**](SseMemberMessage.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |

## subscribeSseChannelByMemberIdWithHttpInfo

> CompletableFuture<ApiResponse<SseMemberMessage>> subscribeSseChannelByMemberId subscribeSseChannelByMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.SseApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ziqni.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        SseApi apiInstance = new SseApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        try {
            CompletableFuture<ApiResponse<SseMemberMessage>> response = apiInstance.subscribeSseChannelByMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SseApi#subscribeSseChannelByMemberId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SseApi#subscribeSseChannelByMemberId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key |
 **spaceName** | **String**| This is the space name which is linked to the account |
 **memberId** | **String**| Id of a Member |

### Return type

CompletableFuture<ApiResponse<[**SseMemberMessage**](SseMemberMessage.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |


## subscribeSseChannelByMemberRefId

> CompletableFuture<SseMemberMessage> subscribeSseChannelByMemberRefId(X_API_KEY, spaceName, memberRefId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member ref id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.SseApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ziqni.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        SseApi apiInstance = new SseApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        try {
            CompletableFuture<SseMemberMessage> result = apiInstance.subscribeSseChannelByMemberRefId(X_API_KEY, spaceName, memberRefId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling SseApi#subscribeSseChannelByMemberRefId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key |
 **spaceName** | **String**| This is the space name which is linked to the account |
 **memberRefId** | **String**| Reference Id of a Member |

### Return type

CompletableFuture<[**SseMemberMessage**](SseMemberMessage.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |

## subscribeSseChannelByMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<SseMemberMessage>> subscribeSseChannelByMemberRefId subscribeSseChannelByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member ref id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.SseApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ziqni.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        SseApi apiInstance = new SseApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        try {
            CompletableFuture<ApiResponse<SseMemberMessage>> response = apiInstance.subscribeSseChannelByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SseApi#subscribeSseChannelByMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SseApi#subscribeSseChannelByMemberRefId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key |
 **spaceName** | **String**| This is the space name which is linked to the account |
 **memberRefId** | **String**| Reference Id of a Member |

### Return type

CompletableFuture<ApiResponse<[**SseMemberMessage**](SseMemberMessage.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |


## subscribeSseChannelHeartbeatByMemberId

> CompletableFuture<SseMemberMessage> subscribeSseChannelHeartbeatByMemberId(X_API_KEY, spaceName, memberId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.SseApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ziqni.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        SseApi apiInstance = new SseApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        try {
            CompletableFuture<SseMemberMessage> result = apiInstance.subscribeSseChannelHeartbeatByMemberId(X_API_KEY, spaceName, memberId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling SseApi#subscribeSseChannelHeartbeatByMemberId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key |
 **spaceName** | **String**| This is the space name which is linked to the account |
 **memberId** | **String**| Id of a Member |

### Return type

CompletableFuture<[**SseMemberMessage**](SseMemberMessage.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |

## subscribeSseChannelHeartbeatByMemberIdWithHttpInfo

> CompletableFuture<ApiResponse<SseMemberMessage>> subscribeSseChannelHeartbeatByMemberId subscribeSseChannelHeartbeatByMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.SseApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ziqni.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        SseApi apiInstance = new SseApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        try {
            CompletableFuture<ApiResponse<SseMemberMessage>> response = apiInstance.subscribeSseChannelHeartbeatByMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SseApi#subscribeSseChannelHeartbeatByMemberId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SseApi#subscribeSseChannelHeartbeatByMemberId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key |
 **spaceName** | **String**| This is the space name which is linked to the account |
 **memberId** | **String**| Id of a Member |

### Return type

CompletableFuture<ApiResponse<[**SseMemberMessage**](SseMemberMessage.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |


## subscribeSseChannelHeartbeatByMemberRefId

> CompletableFuture<SseMemberMessage> subscribeSseChannelHeartbeatByMemberRefId(X_API_KEY, spaceName, memberRefId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.SseApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ziqni.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        SseApi apiInstance = new SseApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        try {
            CompletableFuture<SseMemberMessage> result = apiInstance.subscribeSseChannelHeartbeatByMemberRefId(X_API_KEY, spaceName, memberRefId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling SseApi#subscribeSseChannelHeartbeatByMemberRefId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key |
 **spaceName** | **String**| This is the space name which is linked to the account |
 **memberRefId** | **String**| Reference Id of a Member |

### Return type

CompletableFuture<[**SseMemberMessage**](SseMemberMessage.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |

## subscribeSseChannelHeartbeatByMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<SseMemberMessage>> subscribeSseChannelHeartbeatByMemberRefId subscribeSseChannelHeartbeatByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.SseApi;
import java.util.concurrent.CompletableFuture;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://gateway.ziqni.com");
        
        // Configure API key authorization: apiKey
        ApiKeyAuth apiKey = (ApiKeyAuth) defaultClient.getAuthentication("apiKey");
        apiKey.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKey.setApiKeyPrefix("Token");

        SseApi apiInstance = new SseApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        try {
            CompletableFuture<ApiResponse<SseMemberMessage>> response = apiInstance.subscribeSseChannelHeartbeatByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling SseApi#subscribeSseChannelHeartbeatByMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling SseApi#subscribeSseChannelHeartbeatByMemberRefId");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key |
 **spaceName** | **String**| This is the space name which is linked to the account |
 **memberRefId** | **String**| Reference Id of a Member |

### Return type

CompletableFuture<ApiResponse<[**SseMemberMessage**](SseMemberMessage.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |

