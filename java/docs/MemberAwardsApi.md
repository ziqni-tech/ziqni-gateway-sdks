# MemberAwardsApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**claimAwardByIdAndMemberId**](MemberAwardsApi.md#claimAwardByIdAndMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/award/{awardId}/award | Claim a specific award for a member
[**claimAwardByIdAndMemberIdWithHttpInfo**](MemberAwardsApi.md#claimAwardByIdAndMemberIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{memberId}/award/{awardId}/award | Claim a specific award for a member
[**claimAwardByIdAndMemberRefId**](MemberAwardsApi.md#claimAwardByIdAndMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/award/{awardId}/award | Claim a specific award for a member
[**claimAwardByIdAndMemberRefIdWithHttpInfo**](MemberAwardsApi.md#claimAwardByIdAndMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/award/{awardId}/award | Claim a specific award for a member
[**getAwardByIdAndMemberId**](MemberAwardsApi.md#getAwardByIdAndMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/award/{awardId} | Returns specific award for a member
[**getAwardByIdAndMemberIdWithHttpInfo**](MemberAwardsApi.md#getAwardByIdAndMemberIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{memberId}/award/{awardId} | Returns specific award for a member
[**getAwardByIdAndMemberRefId**](MemberAwardsApi.md#getAwardByIdAndMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/award/{awardId} | Returns specific award for a member
[**getAwardByIdAndMemberRefIdWithHttpInfo**](MemberAwardsApi.md#getAwardByIdAndMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/award/{awardId} | Returns specific award for a member



## claimAwardByIdAndMemberId

> CompletableFuture<MemberAwardByIdResponse> claimAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId)

Claim a specific award for a member

Claims an Award for a given Member ID. This is only applicable when an award needs to be claimed.  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL 

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAwardsApi;
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

        MemberAwardsApi apiInstance = new MemberAwardsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String awardId = "adkjaflklafll"; // String | Id of the award
        try {
            CompletableFuture<MemberAwardByIdResponse> result = apiInstance.claimAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAwardsApi#claimAwardByIdAndMemberId");
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
 **awardId** | **String**| Id of the award |

### Return type

CompletableFuture<[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Award by id |  -  |
| **400** | Award already claimed |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **403** | Award has expired |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist or award does not exist. |  -  |

## claimAwardByIdAndMemberIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberAwardByIdResponse>> claimAwardByIdAndMemberId claimAwardByIdAndMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, awardId)

Claim a specific award for a member

Claims an Award for a given Member ID. This is only applicable when an award needs to be claimed.  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL 

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAwardsApi;
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

        MemberAwardsApi apiInstance = new MemberAwardsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String awardId = "adkjaflklafll"; // String | Id of the award
        try {
            CompletableFuture<ApiResponse<MemberAwardByIdResponse>> response = apiInstance.claimAwardByIdAndMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, awardId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAwardsApi#claimAwardByIdAndMemberId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAwardsApi#claimAwardByIdAndMemberId");
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
 **awardId** | **String**| Id of the award |

### Return type

CompletableFuture<ApiResponse<[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Award by id |  -  |
| **400** | Award already claimed |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **403** | Award has expired |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist or award does not exist. |  -  |


## claimAwardByIdAndMemberRefId

> CompletableFuture<MemberAwardByIdResponse> claimAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId)

Claim a specific award for a member

Claims an Award for a given Member ID. This is only applicable when an award needs to be claimed.  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL 

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAwardsApi;
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

        MemberAwardsApi apiInstance = new MemberAwardsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String awardId = "adkjaflklafll"; // String | Id of the award
        try {
            CompletableFuture<MemberAwardByIdResponse> result = apiInstance.claimAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAwardsApi#claimAwardByIdAndMemberRefId");
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
 **awardId** | **String**| Id of the award |

### Return type

CompletableFuture<[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Award by id |  -  |
| **400** | Award already claimed |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **403** | Award has expired |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist or award does not exist. |  -  |

## claimAwardByIdAndMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberAwardByIdResponse>> claimAwardByIdAndMemberRefId claimAwardByIdAndMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, awardId)

Claim a specific award for a member

Claims an Award for a given Member ID. This is only applicable when an award needs to be claimed.  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL 

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAwardsApi;
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

        MemberAwardsApi apiInstance = new MemberAwardsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String awardId = "adkjaflklafll"; // String | Id of the award
        try {
            CompletableFuture<ApiResponse<MemberAwardByIdResponse>> response = apiInstance.claimAwardByIdAndMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, awardId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAwardsApi#claimAwardByIdAndMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAwardsApi#claimAwardByIdAndMemberRefId");
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
 **awardId** | **String**| Id of the award |

### Return type

CompletableFuture<ApiResponse<[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Award by id |  -  |
| **400** | Award already claimed |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **403** | Award has expired |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist or award does not exist. |  -  |


## getAwardByIdAndMemberId

> CompletableFuture<MemberAwardByIdResponse> getAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId)

Returns specific award for a member

Returns the an award for a given member ID  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAwardsApi;
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

        MemberAwardsApi apiInstance = new MemberAwardsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String awardId = "adkjaflklafll"; // String | Id of the award
        try {
            CompletableFuture<MemberAwardByIdResponse> result = apiInstance.getAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAwardsApi#getAwardByIdAndMemberId");
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
 **awardId** | **String**| Id of the award |

### Return type

CompletableFuture<[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Award by id |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getAwardByIdAndMemberIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberAwardByIdResponse>> getAwardByIdAndMemberId getAwardByIdAndMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, awardId)

Returns specific award for a member

Returns the an award for a given member ID  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAwardsApi;
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

        MemberAwardsApi apiInstance = new MemberAwardsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String awardId = "adkjaflklafll"; // String | Id of the award
        try {
            CompletableFuture<ApiResponse<MemberAwardByIdResponse>> response = apiInstance.getAwardByIdAndMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, awardId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAwardsApi#getAwardByIdAndMemberId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAwardsApi#getAwardByIdAndMemberId");
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
 **awardId** | **String**| Id of the award |

### Return type

CompletableFuture<ApiResponse<[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Award by id |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getAwardByIdAndMemberRefId

> CompletableFuture<MemberAwardByIdResponse> getAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId)

Returns specific award for a member

Returns the an award for a given member ID  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAwardsApi;
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

        MemberAwardsApi apiInstance = new MemberAwardsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String awardId = "adkjaflklafll"; // String | Id of the award
        try {
            CompletableFuture<MemberAwardByIdResponse> result = apiInstance.getAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAwardsApi#getAwardByIdAndMemberRefId");
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
 **awardId** | **String**| Id of the award |

### Return type

CompletableFuture<[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Award by id |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getAwardByIdAndMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberAwardByIdResponse>> getAwardByIdAndMemberRefId getAwardByIdAndMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, awardId)

Returns specific award for a member

Returns the an award for a given member ID  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAwardsApi;
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

        MemberAwardsApi apiInstance = new MemberAwardsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String awardId = "adkjaflklafll"; // String | Id of the award
        try {
            CompletableFuture<ApiResponse<MemberAwardByIdResponse>> response = apiInstance.getAwardByIdAndMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, awardId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAwardsApi#getAwardByIdAndMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAwardsApi#getAwardByIdAndMemberRefId");
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
 **awardId** | **String**| Id of the award |

### Return type

CompletableFuture<ApiResponse<[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Award by id |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

