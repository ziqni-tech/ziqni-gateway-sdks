# MemberAchievementsApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAchievementByIdAndMemberId**](MemberAchievementsApi.md#getAchievementByIdAndMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/achievements/{achievementId} | Returns specific achievement for a member
[**getAchievementByIdAndMemberIdWithHttpInfo**](MemberAchievementsApi.md#getAchievementByIdAndMemberIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{memberId}/achievements/{achievementId} | Returns specific achievement for a member
[**getAchievementByIdAndMemberRefId**](MemberAchievementsApi.md#getAchievementByIdAndMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/achievements/{achievementId} | Returns specific achievement for a member
[**getAchievementByIdAndMemberRefIdWithHttpInfo**](MemberAchievementsApi.md#getAchievementByIdAndMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/achievements/{achievementId} | Returns specific achievement for a member
[**getAchievementsByMemberId**](MemberAchievementsApi.md#getAchievementsByMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/achievements | Returns achievements for a member
[**getAchievementsByMemberIdWithHttpInfo**](MemberAchievementsApi.md#getAchievementsByMemberIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{memberId}/achievements | Returns achievements for a member
[**getAchievementsByMemberRefId**](MemberAchievementsApi.md#getAchievementsByMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/achievements | Returns achievements for a member
[**getAchievementsByMemberRefIdWithHttpInfo**](MemberAchievementsApi.md#getAchievementsByMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/achievements | Returns achievements for a member
[**getIssuedAchievementsByMemberId**](MemberAchievementsApi.md#getIssuedAchievementsByMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/achievements/issued | Returns achievements issued for a member
[**getIssuedAchievementsByMemberIdWithHttpInfo**](MemberAchievementsApi.md#getIssuedAchievementsByMemberIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{memberId}/achievements/issued | Returns achievements issued for a member
[**getIssuedAchievementsByMemberRefId**](MemberAchievementsApi.md#getIssuedAchievementsByMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/achievements/issued | Returns achievements issued for a member
[**getIssuedAchievementsByMemberRefIdWithHttpInfo**](MemberAchievementsApi.md#getIssuedAchievementsByMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/achievements/issued | Returns achievements issued for a member



## getAchievementByIdAndMemberId

> CompletableFuture<MemberAchievementResponse> getAchievementByIdAndMemberId(X_API_KEY, spaceName, memberId, achievementId)

Returns specific achievement for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.  

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String achievementId = "adkjaflklafll"; // String | Id of an achievement
        try {
            CompletableFuture<MemberAchievementResponse> result = apiInstance.getAchievementByIdAndMemberId(X_API_KEY, spaceName, memberId, achievementId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementByIdAndMemberId");
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
 **achievementId** | **String**| Id of an achievement |

### Return type

CompletableFuture<[**MemberAchievementResponse**](MemberAchievementResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member Achievements |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getAchievementByIdAndMemberIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberAchievementResponse>> getAchievementByIdAndMemberId getAchievementByIdAndMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, achievementId)

Returns specific achievement for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.  

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String achievementId = "adkjaflklafll"; // String | Id of an achievement
        try {
            CompletableFuture<ApiResponse<MemberAchievementResponse>> response = apiInstance.getAchievementByIdAndMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, achievementId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementByIdAndMemberId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementByIdAndMemberId");
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
 **achievementId** | **String**| Id of an achievement |

### Return type

CompletableFuture<ApiResponse<[**MemberAchievementResponse**](MemberAchievementResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member Achievements |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getAchievementByIdAndMemberRefId

> CompletableFuture<MemberAchievementResponse> getAchievementByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, achievementId)

Returns specific achievement for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.  

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String achievementId = "adkjaflklafll"; // String | Id of an achievement
        try {
            CompletableFuture<MemberAchievementResponse> result = apiInstance.getAchievementByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, achievementId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementByIdAndMemberRefId");
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
 **achievementId** | **String**| Id of an achievement |

### Return type

CompletableFuture<[**MemberAchievementResponse**](MemberAchievementResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member Achievements |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getAchievementByIdAndMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberAchievementResponse>> getAchievementByIdAndMemberRefId getAchievementByIdAndMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, achievementId)

Returns specific achievement for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.  

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String achievementId = "adkjaflklafll"; // String | Id of an achievement
        try {
            CompletableFuture<ApiResponse<MemberAchievementResponse>> response = apiInstance.getAchievementByIdAndMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, achievementId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementByIdAndMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementByIdAndMemberRefId");
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
 **achievementId** | **String**| Id of an achievement |

### Return type

CompletableFuture<ApiResponse<[**MemberAchievementResponse**](MemberAchievementResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member Achievements |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getAchievementsByMemberId

> CompletableFuture<MemberAchievementResponse> getAchievementsByMemberId(X_API_KEY, spaceName, memberId, id)

Returns achievements for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        try {
            CompletableFuture<MemberAchievementResponse> result = apiInstance.getAchievementsByMemberId(X_API_KEY, spaceName, memberId, id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementsByMemberId");
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
 **id** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the resources | [optional]

### Return type

CompletableFuture<[**MemberAchievementResponse**](MemberAchievementResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member Achievements |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getAchievementsByMemberIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberAchievementResponse>> getAchievementsByMemberId getAchievementsByMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, id)

Returns achievements for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        try {
            CompletableFuture<ApiResponse<MemberAchievementResponse>> response = apiInstance.getAchievementsByMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementsByMemberId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementsByMemberId");
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
 **id** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the resources | [optional]

### Return type

CompletableFuture<ApiResponse<[**MemberAchievementResponse**](MemberAchievementResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member Achievements |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getAchievementsByMemberRefId

> CompletableFuture<MemberAchievementResponse> getAchievementsByMemberRefId(X_API_KEY, spaceName, memberRefId, id)

Returns achievements for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        try {
            CompletableFuture<MemberAchievementResponse> result = apiInstance.getAchievementsByMemberRefId(X_API_KEY, spaceName, memberRefId, id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementsByMemberRefId");
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
 **id** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the resources | [optional]

### Return type

CompletableFuture<[**MemberAchievementResponse**](MemberAchievementResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member Achievements |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getAchievementsByMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberAchievementResponse>> getAchievementsByMemberRefId getAchievementsByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, id)

Returns achievements for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        try {
            CompletableFuture<ApiResponse<MemberAchievementResponse>> response = apiInstance.getAchievementsByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementsByMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getAchievementsByMemberRefId");
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
 **id** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the resources | [optional]

### Return type

CompletableFuture<ApiResponse<[**MemberAchievementResponse**](MemberAchievementResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member Achievements |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getIssuedAchievementsByMemberId

> CompletableFuture<AchievementIssuedResponse> getIssuedAchievementsByMemberId(X_API_KEY, spaceName, memberId)

Returns achievements issued for a member

Returns an aggregated list of achieved achievement IDs for a specified member with a count that indicates the amount of times this achievement was issued for the specified memerId.  If there is no achievement data inside the events stream for a specified user no data returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata is 0.  &#x60;All the achievements, including deprecated/archived ones, that were issued to the member are displayed.&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        try {
            CompletableFuture<AchievementIssuedResponse> result = apiInstance.getIssuedAchievementsByMemberId(X_API_KEY, spaceName, memberId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getIssuedAchievementsByMemberId");
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

CompletableFuture<[**AchievementIssuedResponse**](AchievementIssuedResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** |  |  -  |

## getIssuedAchievementsByMemberIdWithHttpInfo

> CompletableFuture<ApiResponse<AchievementIssuedResponse>> getIssuedAchievementsByMemberId getIssuedAchievementsByMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId)

Returns achievements issued for a member

Returns an aggregated list of achieved achievement IDs for a specified member with a count that indicates the amount of times this achievement was issued for the specified memerId.  If there is no achievement data inside the events stream for a specified user no data returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata is 0.  &#x60;All the achievements, including deprecated/archived ones, that were issued to the member are displayed.&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        try {
            CompletableFuture<ApiResponse<AchievementIssuedResponse>> response = apiInstance.getIssuedAchievementsByMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAchievementsApi#getIssuedAchievementsByMemberId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getIssuedAchievementsByMemberId");
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

CompletableFuture<ApiResponse<[**AchievementIssuedResponse**](AchievementIssuedResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** |  |  -  |


## getIssuedAchievementsByMemberRefId

> CompletableFuture<AchievementIssuedResponse> getIssuedAchievementsByMemberRefId(X_API_KEY, spaceName, memberRefId)

Returns achievements issued for a member

Returns an aggregated list of achieved achievement IDs for a specified member with a count that indicates the amount of times this achievement was issued for the specified memerId.  If there is no achievement data inside the events stream for a specified user no data returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata is 0.  &#x60;All the achievements, including deprecated/archived ones, that were issued to the member are displayed.&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        try {
            CompletableFuture<AchievementIssuedResponse> result = apiInstance.getIssuedAchievementsByMemberRefId(X_API_KEY, spaceName, memberRefId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getIssuedAchievementsByMemberRefId");
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

CompletableFuture<[**AchievementIssuedResponse**](AchievementIssuedResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getIssuedAchievementsByMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<AchievementIssuedResponse>> getIssuedAchievementsByMemberRefId getIssuedAchievementsByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId)

Returns achievements issued for a member

Returns an aggregated list of achieved achievement IDs for a specified member with a count that indicates the amount of times this achievement was issued for the specified memerId.  If there is no achievement data inside the events stream for a specified user no data returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata is 0.  &#x60;All the achievements, including deprecated/archived ones, that were issued to the member are displayed.&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberAchievementsApi;
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

        MemberAchievementsApi apiInstance = new MemberAchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        try {
            CompletableFuture<ApiResponse<AchievementIssuedResponse>> response = apiInstance.getIssuedAchievementsByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberAchievementsApi#getIssuedAchievementsByMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberAchievementsApi#getIssuedAchievementsByMemberRefId");
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

CompletableFuture<ApiResponse<[**AchievementIssuedResponse**](AchievementIssuedResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

