# MembersApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMemberById**](MembersApi.md#getMemberById) | **GET** /api/v1/{spaceName}/members/{id} | Returns the member by requested id
[**getMemberByIdWithHttpInfo**](MembersApi.md#getMemberByIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{id} | Returns the member by requested id
[**getMemberByRefId**](MembersApi.md#getMemberByRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId} | Returns the member by requested id
[**getMemberByRefIdWithHttpInfo**](MembersApi.md#getMemberByRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId} | Returns the member by requested id



## getMemberById

> CompletableFuture<MemberResponse> getMemberById(X_API_KEY, spaceName, id)

Returns the member by requested id

Returns the information for a given Member id

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MembersApi;
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

        MembersApi apiInstance = new MembersApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        try {
            CompletableFuture<MemberResponse> result = apiInstance.getMemberById(X_API_KEY, spaceName, id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MembersApi#getMemberById");
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
 **id** | **String**| Unique identifier of the resource |

### Return type

CompletableFuture<[**MemberResponse**](MemberResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message response |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getMemberByIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberResponse>> getMemberById getMemberByIdWithHttpInfo(X_API_KEY, spaceName, id)

Returns the member by requested id

Returns the information for a given Member id

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MembersApi;
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

        MembersApi apiInstance = new MembersApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        try {
            CompletableFuture<ApiResponse<MemberResponse>> response = apiInstance.getMemberByIdWithHttpInfo(X_API_KEY, spaceName, id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MembersApi#getMemberById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MembersApi#getMemberById");
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
 **id** | **String**| Unique identifier of the resource |

### Return type

CompletableFuture<ApiResponse<[**MemberResponse**](MemberResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message response |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getMemberByRefId

> CompletableFuture<MemberResponse> getMemberByRefId(X_API_KEY, spaceName, memberRefId)

Returns the member by requested id

Returns the information for a given Member Reference ID

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MembersApi;
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

        MembersApi apiInstance = new MembersApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        try {
            CompletableFuture<MemberResponse> result = apiInstance.getMemberByRefId(X_API_KEY, spaceName, memberRefId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MembersApi#getMemberByRefId");
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

CompletableFuture<[**MemberResponse**](MemberResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message response |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getMemberByRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberResponse>> getMemberByRefId getMemberByRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId)

Returns the member by requested id

Returns the information for a given Member Reference ID

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MembersApi;
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

        MembersApi apiInstance = new MembersApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        try {
            CompletableFuture<ApiResponse<MemberResponse>> response = apiInstance.getMemberByRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MembersApi#getMemberByRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MembersApi#getMemberByRefId");
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

CompletableFuture<ApiResponse<[**MemberResponse**](MemberResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message response |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

