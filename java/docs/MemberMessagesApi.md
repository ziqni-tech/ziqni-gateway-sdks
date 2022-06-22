# MemberMessagesApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessageByIdAndMemberId**](MemberMessagesApi.md#getMessageByIdAndMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/messages/{id} | Returns messages for a member by requested id
[**getMessageByIdAndMemberIdWithHttpInfo**](MemberMessagesApi.md#getMessageByIdAndMemberIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{memberId}/messages/{id} | Returns messages for a member by requested id
[**getMessageByIdAndMemberRefId**](MemberMessagesApi.md#getMessageByIdAndMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/messages/{id} | Returns messages for a member by requested id
[**getMessageByIdAndMemberRefIdWithHttpInfo**](MemberMessagesApi.md#getMessageByIdAndMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/messages/{id} | Returns messages for a member by requested id
[**getMessagesByMemberId**](MemberMessagesApi.md#getMessagesByMemberId) | **GET** /api/v1/{spaceName}/members/{id}/messages | Returns messages for a member by requested id
[**getMessagesByMemberIdWithHttpInfo**](MemberMessagesApi.md#getMessagesByMemberIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{id}/messages | Returns messages for a member by requested id
[**getMessagesByMemberRefId**](MemberMessagesApi.md#getMessagesByMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/messages/ | Returns messages for a member by requested reference id
[**getMessagesByMemberRefIdWithHttpInfo**](MemberMessagesApi.md#getMessagesByMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/messages/ | Returns messages for a member by requested reference id



## getMessageByIdAndMemberId

> CompletableFuture<MemberMessageResponse> getMessageByIdAndMemberId(X_API_KEY, spaceName, memberId, id)

Returns messages for a member by requested id

Returns member message details for the member and message ID specified. When a message with a status of New is accessed by this endpoint then the status of the message becomes Read automatically.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberMessagesApi;
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

        MemberMessagesApi apiInstance = new MemberMessagesApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        try {
            CompletableFuture<MemberMessageResponse> result = apiInstance.getMessageByIdAndMemberId(X_API_KEY, spaceName, memberId, id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberMessagesApi#getMessageByIdAndMemberId");
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
 **id** | **String**| Unique identifier of the resource |

### Return type

CompletableFuture<[**MemberMessageResponse**](MemberMessageResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getMessageByIdAndMemberIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberMessageResponse>> getMessageByIdAndMemberId getMessageByIdAndMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, id)

Returns messages for a member by requested id

Returns member message details for the member and message ID specified. When a message with a status of New is accessed by this endpoint then the status of the message becomes Read automatically.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberMessagesApi;
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

        MemberMessagesApi apiInstance = new MemberMessagesApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        try {
            CompletableFuture<ApiResponse<MemberMessageResponse>> response = apiInstance.getMessageByIdAndMemberIdWithHttpInfo(X_API_KEY, spaceName, memberId, id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberMessagesApi#getMessageByIdAndMemberId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberMessagesApi#getMessageByIdAndMemberId");
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
 **id** | **String**| Unique identifier of the resource |

### Return type

CompletableFuture<ApiResponse<[**MemberMessageResponse**](MemberMessageResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getMessageByIdAndMemberRefId

> CompletableFuture<MemberMessageResponse> getMessageByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, id)

Returns messages for a member by requested id

Returns member message details for the member and message ID specified. When a message with a status of New is accessed by this endpoint then the status of the message becomes Read automatically.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberMessagesApi;
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

        MemberMessagesApi apiInstance = new MemberMessagesApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        try {
            CompletableFuture<MemberMessageResponse> result = apiInstance.getMessageByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberMessagesApi#getMessageByIdAndMemberRefId");
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
 **id** | **String**| Unique identifier of the resource |

### Return type

CompletableFuture<[**MemberMessageResponse**](MemberMessageResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getMessageByIdAndMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberMessageResponse>> getMessageByIdAndMemberRefId getMessageByIdAndMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, id)

Returns messages for a member by requested id

Returns member message details for the member and message ID specified. When a message with a status of New is accessed by this endpoint then the status of the message becomes Read automatically.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberMessagesApi;
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

        MemberMessagesApi apiInstance = new MemberMessagesApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        try {
            CompletableFuture<ApiResponse<MemberMessageResponse>> response = apiInstance.getMessageByIdAndMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberMessagesApi#getMessageByIdAndMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberMessagesApi#getMessageByIdAndMemberRefId");
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
 **id** | **String**| Unique identifier of the resource |

### Return type

CompletableFuture<ApiResponse<[**MemberMessageResponse**](MemberMessageResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getMessagesByMemberId

> CompletableFuture<MemberMessageResponse> getMessagesByMemberId(X_API_KEY, spaceName, id, eventRefType, eventReferenceId, messageType, subject, prizeRewardEntityType, prizeRewardEntityId, prizeRewardRewardRank, prizeRewardValue, prizeRewardRewardType, prizeRewardDelay, prizeRewardMemberAcknowledgmentRequired, prizeRewardMetadataKey, prizeRewardMetadataValue, prizeRewardCreated, prizeRewardId, prizeClaimed, prizeEntityType, prizeEntityId, prizeCreated, prizeId, status, created, metadataKey, metadataValue)

Returns messages for a member by requested id

Returns a list of available messages for the specified memberId.  GET responses can be filtered out based on the member messages parameters to narrow down the results.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberMessagesApi;
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

        MemberMessagesApi apiInstance = new MemberMessagesApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        String eventRefType = "ContestType"; // String | Defines an event type attached to the message. Case sensitive Supported values - `CompetitionType` `ContestType` `AchievementType`  `?eventRefType=search_string`
        String eventReferenceId = "dfadadfadfafaf"; // String | The reference ID of the event object. Case sensitive   `?eventReferenceId=search_string`
        String messageType = "SumBest"; // String | The type of message of the member. Case sensitive Supported values - `Notification` `Achievement` `Reward`  `?messageType=search_string`
        String subject = "my first subject"; // String | The title of the message. Case sensitive  `?subject=search_string`
        String prizeRewardEntityType = "Contest"; // String | Can be achievement or contest. Case sensitive Supported values - `Achievement` `Contest`  `?prize.reward.entityType=search_string`
        String prizeRewardEntityId = "gsgsggwtwsdvdfadf"; // String | Achievement id or Contest id. Case sensitive   `?prize.reward.entityId=search_string`
        String prizeRewardRewardRank = "1"; // String | If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  `?prize.reward.rewardRank=search_string`
        Double prizeRewardValue = 1.2D; // Double | Numerical value of the reward that will be issued based on the reward type  `?prize.reward.value=search_double`
        String prizeRewardRewardType = "reward-type-id"; // String | Reward type id   `?prize.reward.rewardType=search_string`
        Integer prizeRewardDelay = 1; // Integer | Delay of issuing a reward in minutes   `?prize.reward.delay=search_integer`
        Boolean prizeRewardMemberAcknowledgmentRequired = false; // Boolean | To claim a reward   `?prize.reward.memberAcknowledgmentRequired=search_boolean`
        String prizeRewardMetadataKey = "reward-metadata-key"; // String | Search by reward metadata key.   `?prize.reward.metadata.key=search_word`
        String prizeRewardMetadataValue = "reward-metadata-value"; // String | Search by reward metadata value.   `?prize.reward.metadata.value=search_word`
        OffsetDateTime prizeRewardCreated = OffsetDateTime.now(); // OffsetDateTime | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.reward.created=search_datetime`
        String prizeRewardId = "wrwtsdrvxfnjuuu4133"; // String | Search by reward id. Case sensitive   `?prize.reward.id=search_string`
        Boolean prizeClaimed = false; // Boolean | Has the award been claimed or not.   `?prize.claimed=search_boolean`
        String prizeEntityType = "Contest"; // String | The type of entity this Award relates to. Case sensitive   Supported values -   `Contest` `Achievement`   `?prize.entityType=search_word`
        String prizeEntityId = "wrwtsdrvxfnjuuu4133"; // String | The Id of the contest or achievement related to this Award. Case sensitive   `?prize.entityId=search_string`
        OffsetDateTime prizeCreated = OffsetDateTime.now(); // OffsetDateTime | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.created=search_datetime`
        String prizeId = "wrwtsdrvxfnjuuu4133"; // String | Award id. Case sensitive   `?prize.id=search_word`
        String status = "Read"; // String | The status of the message. Case sensitive  Supported values - `New` `Read` `CollaborationRequest` `Actioned` `Claimed` `Expired` `Canceled` `Deprecated`   `?status=search_string`
        OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | Works with simple dates or date and time, eg:   `?created=<created-date>`
        String metadataKey = "\"my-first-meta-key\""; // String | Search by metadata key. Case sensitive.  `?metadata.key=search_word`
        String metadataValue = "\"my-first-meta-value\""; // String | Search by metadata value. Case sensitive.  `?metadata.value=search_word`
        try {
            CompletableFuture<MemberMessageResponse> result = apiInstance.getMessagesByMemberId(X_API_KEY, spaceName, id, eventRefType, eventReferenceId, messageType, subject, prizeRewardEntityType, prizeRewardEntityId, prizeRewardRewardRank, prizeRewardValue, prizeRewardRewardType, prizeRewardDelay, prizeRewardMemberAcknowledgmentRequired, prizeRewardMetadataKey, prizeRewardMetadataValue, prizeRewardCreated, prizeRewardId, prizeClaimed, prizeEntityType, prizeEntityId, prizeCreated, prizeId, status, created, metadataKey, metadataValue);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberMessagesApi#getMessagesByMemberId");
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
 **id** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the resources | [optional]
 **eventRefType** | **String**| Defines an event type attached to the message. Case sensitive Supported values - &#x60;CompetitionType&#x60; &#x60;ContestType&#x60; &#x60;AchievementType&#x60;  &#x60;?eventRefType&#x3D;search_string&#x60; | [optional]
 **eventReferenceId** | **String**| The reference ID of the event object. Case sensitive   &#x60;?eventReferenceId&#x3D;search_string&#x60; | [optional]
 **messageType** | **String**| The type of message of the member. Case sensitive Supported values - &#x60;Notification&#x60; &#x60;Achievement&#x60; &#x60;Reward&#x60;  &#x60;?messageType&#x3D;search_string&#x60; | [optional]
 **subject** | **String**| The title of the message. Case sensitive  &#x60;?subject&#x3D;search_string&#x60; | [optional]
 **prizeRewardEntityType** | **String**| Can be achievement or contest. Case sensitive Supported values - &#x60;Achievement&#x60; &#x60;Contest&#x60;  &#x60;?prize.reward.entityType&#x3D;search_string&#x60; | [optional]
 **prizeRewardEntityId** | **String**| Achievement id or Contest id. Case sensitive   &#x60;?prize.reward.entityId&#x3D;search_string&#x60; | [optional]
 **prizeRewardRewardRank** | **String**| If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  &#x60;?prize.reward.rewardRank&#x3D;search_string&#x60; | [optional]
 **prizeRewardValue** | **Double**| Numerical value of the reward that will be issued based on the reward type  &#x60;?prize.reward.value&#x3D;search_double&#x60; | [optional]
 **prizeRewardRewardType** | **String**| Reward type id   &#x60;?prize.reward.rewardType&#x3D;search_string&#x60; | [optional]
 **prizeRewardDelay** | **Integer**| Delay of issuing a reward in minutes   &#x60;?prize.reward.delay&#x3D;search_integer&#x60; | [optional]
 **prizeRewardMemberAcknowledgmentRequired** | **Boolean**| To claim a reward   &#x60;?prize.reward.memberAcknowledgmentRequired&#x3D;search_boolean&#x60; | [optional]
 **prizeRewardMetadataKey** | **String**| Search by reward metadata key.   &#x60;?prize.reward.metadata.key&#x3D;search_word&#x60; | [optional]
 **prizeRewardMetadataValue** | **String**| Search by reward metadata value.   &#x60;?prize.reward.metadata.value&#x3D;search_word&#x60; | [optional]
 **prizeRewardCreated** | **OffsetDateTime**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.reward.created&#x3D;search_datetime&#x60; | [optional]
 **prizeRewardId** | **String**| Search by reward id. Case sensitive   &#x60;?prize.reward.id&#x3D;search_string&#x60; | [optional]
 **prizeClaimed** | **Boolean**| Has the award been claimed or not.   &#x60;?prize.claimed&#x3D;search_boolean&#x60; | [optional]
 **prizeEntityType** | **String**| The type of entity this Award relates to. Case sensitive   Supported values -   &#x60;Contest&#x60; &#x60;Achievement&#x60;   &#x60;?prize.entityType&#x3D;search_word&#x60; | [optional]
 **prizeEntityId** | **String**| The Id of the contest or achievement related to this Award. Case sensitive   &#x60;?prize.entityId&#x3D;search_string&#x60; | [optional]
 **prizeCreated** | **OffsetDateTime**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.created&#x3D;search_datetime&#x60; | [optional]
 **prizeId** | **String**| Award id. Case sensitive   &#x60;?prize.id&#x3D;search_word&#x60; | [optional]
 **status** | **String**| The status of the message. Case sensitive  Supported values - &#x60;New&#x60; &#x60;Read&#x60; &#x60;CollaborationRequest&#x60; &#x60;Actioned&#x60; &#x60;Claimed&#x60; &#x60;Expired&#x60; &#x60;Canceled&#x60; &#x60;Deprecated&#x60;   &#x60;?status&#x3D;search_string&#x60; | [optional]
 **created** | **OffsetDateTime**| Works with simple dates or date and time, eg:   &#x60;?created&#x3D;&lt;created-date&gt;&#x60; | [optional]
 **metadataKey** | **String**| Search by metadata key. Case sensitive.  &#x60;?metadata.key&#x3D;search_word&#x60; | [optional]
 **metadataValue** | **String**| Search by metadata value. Case sensitive.  &#x60;?metadata.value&#x3D;search_word&#x60; | [optional]

### Return type

CompletableFuture<[**MemberMessageResponse**](MemberMessageResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getMessagesByMemberIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberMessageResponse>> getMessagesByMemberId getMessagesByMemberIdWithHttpInfo(X_API_KEY, spaceName, id, eventRefType, eventReferenceId, messageType, subject, prizeRewardEntityType, prizeRewardEntityId, prizeRewardRewardRank, prizeRewardValue, prizeRewardRewardType, prizeRewardDelay, prizeRewardMemberAcknowledgmentRequired, prizeRewardMetadataKey, prizeRewardMetadataValue, prizeRewardCreated, prizeRewardId, prizeClaimed, prizeEntityType, prizeEntityId, prizeCreated, prizeId, status, created, metadataKey, metadataValue)

Returns messages for a member by requested id

Returns a list of available messages for the specified memberId.  GET responses can be filtered out based on the member messages parameters to narrow down the results.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberMessagesApi;
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

        MemberMessagesApi apiInstance = new MemberMessagesApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        String eventRefType = "ContestType"; // String | Defines an event type attached to the message. Case sensitive Supported values - `CompetitionType` `ContestType` `AchievementType`  `?eventRefType=search_string`
        String eventReferenceId = "dfadadfadfafaf"; // String | The reference ID of the event object. Case sensitive   `?eventReferenceId=search_string`
        String messageType = "SumBest"; // String | The type of message of the member. Case sensitive Supported values - `Notification` `Achievement` `Reward`  `?messageType=search_string`
        String subject = "my first subject"; // String | The title of the message. Case sensitive  `?subject=search_string`
        String prizeRewardEntityType = "Contest"; // String | Can be achievement or contest. Case sensitive Supported values - `Achievement` `Contest`  `?prize.reward.entityType=search_string`
        String prizeRewardEntityId = "gsgsggwtwsdvdfadf"; // String | Achievement id or Contest id. Case sensitive   `?prize.reward.entityId=search_string`
        String prizeRewardRewardRank = "1"; // String | If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  `?prize.reward.rewardRank=search_string`
        Double prizeRewardValue = 1.2D; // Double | Numerical value of the reward that will be issued based on the reward type  `?prize.reward.value=search_double`
        String prizeRewardRewardType = "reward-type-id"; // String | Reward type id   `?prize.reward.rewardType=search_string`
        Integer prizeRewardDelay = 1; // Integer | Delay of issuing a reward in minutes   `?prize.reward.delay=search_integer`
        Boolean prizeRewardMemberAcknowledgmentRequired = false; // Boolean | To claim a reward   `?prize.reward.memberAcknowledgmentRequired=search_boolean`
        String prizeRewardMetadataKey = "reward-metadata-key"; // String | Search by reward metadata key.   `?prize.reward.metadata.key=search_word`
        String prizeRewardMetadataValue = "reward-metadata-value"; // String | Search by reward metadata value.   `?prize.reward.metadata.value=search_word`
        OffsetDateTime prizeRewardCreated = OffsetDateTime.now(); // OffsetDateTime | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.reward.created=search_datetime`
        String prizeRewardId = "wrwtsdrvxfnjuuu4133"; // String | Search by reward id. Case sensitive   `?prize.reward.id=search_string`
        Boolean prizeClaimed = false; // Boolean | Has the award been claimed or not.   `?prize.claimed=search_boolean`
        String prizeEntityType = "Contest"; // String | The type of entity this Award relates to. Case sensitive   Supported values -   `Contest` `Achievement`   `?prize.entityType=search_word`
        String prizeEntityId = "wrwtsdrvxfnjuuu4133"; // String | The Id of the contest or achievement related to this Award. Case sensitive   `?prize.entityId=search_string`
        OffsetDateTime prizeCreated = OffsetDateTime.now(); // OffsetDateTime | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.created=search_datetime`
        String prizeId = "wrwtsdrvxfnjuuu4133"; // String | Award id. Case sensitive   `?prize.id=search_word`
        String status = "Read"; // String | The status of the message. Case sensitive  Supported values - `New` `Read` `CollaborationRequest` `Actioned` `Claimed` `Expired` `Canceled` `Deprecated`   `?status=search_string`
        OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | Works with simple dates or date and time, eg:   `?created=<created-date>`
        String metadataKey = "\"my-first-meta-key\""; // String | Search by metadata key. Case sensitive.  `?metadata.key=search_word`
        String metadataValue = "\"my-first-meta-value\""; // String | Search by metadata value. Case sensitive.  `?metadata.value=search_word`
        try {
            CompletableFuture<ApiResponse<MemberMessageResponse>> response = apiInstance.getMessagesByMemberIdWithHttpInfo(X_API_KEY, spaceName, id, eventRefType, eventReferenceId, messageType, subject, prizeRewardEntityType, prizeRewardEntityId, prizeRewardRewardRank, prizeRewardValue, prizeRewardRewardType, prizeRewardDelay, prizeRewardMemberAcknowledgmentRequired, prizeRewardMetadataKey, prizeRewardMetadataValue, prizeRewardCreated, prizeRewardId, prizeClaimed, prizeEntityType, prizeEntityId, prizeCreated, prizeId, status, created, metadataKey, metadataValue);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberMessagesApi#getMessagesByMemberId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberMessagesApi#getMessagesByMemberId");
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
 **id** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the resources | [optional]
 **eventRefType** | **String**| Defines an event type attached to the message. Case sensitive Supported values - &#x60;CompetitionType&#x60; &#x60;ContestType&#x60; &#x60;AchievementType&#x60;  &#x60;?eventRefType&#x3D;search_string&#x60; | [optional]
 **eventReferenceId** | **String**| The reference ID of the event object. Case sensitive   &#x60;?eventReferenceId&#x3D;search_string&#x60; | [optional]
 **messageType** | **String**| The type of message of the member. Case sensitive Supported values - &#x60;Notification&#x60; &#x60;Achievement&#x60; &#x60;Reward&#x60;  &#x60;?messageType&#x3D;search_string&#x60; | [optional]
 **subject** | **String**| The title of the message. Case sensitive  &#x60;?subject&#x3D;search_string&#x60; | [optional]
 **prizeRewardEntityType** | **String**| Can be achievement or contest. Case sensitive Supported values - &#x60;Achievement&#x60; &#x60;Contest&#x60;  &#x60;?prize.reward.entityType&#x3D;search_string&#x60; | [optional]
 **prizeRewardEntityId** | **String**| Achievement id or Contest id. Case sensitive   &#x60;?prize.reward.entityId&#x3D;search_string&#x60; | [optional]
 **prizeRewardRewardRank** | **String**| If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  &#x60;?prize.reward.rewardRank&#x3D;search_string&#x60; | [optional]
 **prizeRewardValue** | **Double**| Numerical value of the reward that will be issued based on the reward type  &#x60;?prize.reward.value&#x3D;search_double&#x60; | [optional]
 **prizeRewardRewardType** | **String**| Reward type id   &#x60;?prize.reward.rewardType&#x3D;search_string&#x60; | [optional]
 **prizeRewardDelay** | **Integer**| Delay of issuing a reward in minutes   &#x60;?prize.reward.delay&#x3D;search_integer&#x60; | [optional]
 **prizeRewardMemberAcknowledgmentRequired** | **Boolean**| To claim a reward   &#x60;?prize.reward.memberAcknowledgmentRequired&#x3D;search_boolean&#x60; | [optional]
 **prizeRewardMetadataKey** | **String**| Search by reward metadata key.   &#x60;?prize.reward.metadata.key&#x3D;search_word&#x60; | [optional]
 **prizeRewardMetadataValue** | **String**| Search by reward metadata value.   &#x60;?prize.reward.metadata.value&#x3D;search_word&#x60; | [optional]
 **prizeRewardCreated** | **OffsetDateTime**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.reward.created&#x3D;search_datetime&#x60; | [optional]
 **prizeRewardId** | **String**| Search by reward id. Case sensitive   &#x60;?prize.reward.id&#x3D;search_string&#x60; | [optional]
 **prizeClaimed** | **Boolean**| Has the award been claimed or not.   &#x60;?prize.claimed&#x3D;search_boolean&#x60; | [optional]
 **prizeEntityType** | **String**| The type of entity this Award relates to. Case sensitive   Supported values -   &#x60;Contest&#x60; &#x60;Achievement&#x60;   &#x60;?prize.entityType&#x3D;search_word&#x60; | [optional]
 **prizeEntityId** | **String**| The Id of the contest or achievement related to this Award. Case sensitive   &#x60;?prize.entityId&#x3D;search_string&#x60; | [optional]
 **prizeCreated** | **OffsetDateTime**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.created&#x3D;search_datetime&#x60; | [optional]
 **prizeId** | **String**| Award id. Case sensitive   &#x60;?prize.id&#x3D;search_word&#x60; | [optional]
 **status** | **String**| The status of the message. Case sensitive  Supported values - &#x60;New&#x60; &#x60;Read&#x60; &#x60;CollaborationRequest&#x60; &#x60;Actioned&#x60; &#x60;Claimed&#x60; &#x60;Expired&#x60; &#x60;Canceled&#x60; &#x60;Deprecated&#x60;   &#x60;?status&#x3D;search_string&#x60; | [optional]
 **created** | **OffsetDateTime**| Works with simple dates or date and time, eg:   &#x60;?created&#x3D;&lt;created-date&gt;&#x60; | [optional]
 **metadataKey** | **String**| Search by metadata key. Case sensitive.  &#x60;?metadata.key&#x3D;search_word&#x60; | [optional]
 **metadataValue** | **String**| Search by metadata value. Case sensitive.  &#x60;?metadata.value&#x3D;search_word&#x60; | [optional]

### Return type

CompletableFuture<ApiResponse<[**MemberMessageResponse**](MemberMessageResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getMessagesByMemberRefId

> CompletableFuture<MemberMessageResponse> getMessagesByMemberRefId(X_API_KEY, spaceName, memberRefId, eventRefType, eventReferenceId, messageType, subject, prizeRewardEntityType, prizeRewardEntityId, prizeRewardRewardRank, prizeRewardValue, prizeRewardRewardType, prizeRewardDelay, prizeRewardMemberAcknowledgmentRequired, prizeRewardMetadataKey, prizeRewardMetadataValue, prizeRewardCreated, prizeRewardId, prizeClaimed, prizeEntityType, prizeEntityId, prizeCreated, prizeId, status, created, metadataKey, metadataValue, id)

Returns messages for a member by requested reference id

Returns a list of available messages for the specified member Reference ID.  GET responses can be filtered out based on the member messages parameters to narrow down the results.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberMessagesApi;
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

        MemberMessagesApi apiInstance = new MemberMessagesApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String eventRefType = "ContestType"; // String | Defines an event type attached to the message. Case sensitive Supported values - `CompetitionType` `ContestType` `AchievementType`  `?eventRefType=search_string`
        String eventReferenceId = "dfadadfadfafaf"; // String | The reference ID of the event object. Case sensitive   `?eventReferenceId=search_string`
        String messageType = "SumBest"; // String | The type of message of the member. Case sensitive Supported values - `Notification` `Achievement` `Reward`  `?messageType=search_string`
        String subject = "my first subject"; // String | The title of the message. Case sensitive  `?subject=search_string`
        String prizeRewardEntityType = "Contest"; // String | Can be achievement or contest. Case sensitive Supported values - `Achievement` `Contest`  `?prize.reward.entityType=search_string`
        String prizeRewardEntityId = "gsgsggwtwsdvdfadf"; // String | Achievement id or Contest id. Case sensitive   `?prize.reward.entityId=search_string`
        String prizeRewardRewardRank = "1"; // String | If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  `?prize.reward.rewardRank=search_string`
        Double prizeRewardValue = 1.2D; // Double | Numerical value of the reward that will be issued based on the reward type  `?prize.reward.value=search_double`
        String prizeRewardRewardType = "reward-type-id"; // String | Reward type id   `?prize.reward.rewardType=search_string`
        Integer prizeRewardDelay = 1; // Integer | Delay of issuing a reward in minutes   `?prize.reward.delay=search_integer`
        Boolean prizeRewardMemberAcknowledgmentRequired = false; // Boolean | To claim a reward   `?prize.reward.memberAcknowledgmentRequired=search_boolean`
        String prizeRewardMetadataKey = "reward-metadata-key"; // String | Search by reward metadata key.   `?prize.reward.metadata.key=search_word`
        String prizeRewardMetadataValue = "reward-metadata-value"; // String | Search by reward metadata value.   `?prize.reward.metadata.value=search_word`
        OffsetDateTime prizeRewardCreated = OffsetDateTime.now(); // OffsetDateTime | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.reward.created=search_datetime`
        String prizeRewardId = "wrwtsdrvxfnjuuu4133"; // String | Search by reward id. Case sensitive   `?prize.reward.id=search_string`
        Boolean prizeClaimed = false; // Boolean | Has the award been claimed or not.   `?prize.claimed=search_boolean`
        String prizeEntityType = "Contest"; // String | The type of entity this Award relates to. Case sensitive   Supported values -   `Contest` `Achievement`   `?prize.entityType=search_word`
        String prizeEntityId = "wrwtsdrvxfnjuuu4133"; // String | The Id of the contest or achievement related to this Award. Case sensitive   `?prize.entityId=search_string`
        OffsetDateTime prizeCreated = OffsetDateTime.now(); // OffsetDateTime | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.created=search_datetime`
        String prizeId = "wrwtsdrvxfnjuuu4133"; // String | Award id. Case sensitive   `?prize.id=search_word`
        String status = "Read"; // String | The status of the message. Case sensitive  Supported values - `New` `Read` `CollaborationRequest` `Actioned` `Claimed` `Expired` `Canceled` `Deprecated`   `?status=search_string`
        OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | Works with simple dates or date and time, eg:   `?created=<created-date>`
        String metadataKey = "\"my-first-meta-key\""; // String | Search by metadata key. Case sensitive.  `?metadata.key=search_word`
        String metadataValue = "\"my-first-meta-value\""; // String | Search by metadata value. Case sensitive.  `?metadata.value=search_word`
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        try {
            CompletableFuture<MemberMessageResponse> result = apiInstance.getMessagesByMemberRefId(X_API_KEY, spaceName, memberRefId, eventRefType, eventReferenceId, messageType, subject, prizeRewardEntityType, prizeRewardEntityId, prizeRewardRewardRank, prizeRewardValue, prizeRewardRewardType, prizeRewardDelay, prizeRewardMemberAcknowledgmentRequired, prizeRewardMetadataKey, prizeRewardMetadataValue, prizeRewardCreated, prizeRewardId, prizeClaimed, prizeEntityType, prizeEntityId, prizeCreated, prizeId, status, created, metadataKey, metadataValue, id);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberMessagesApi#getMessagesByMemberRefId");
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
 **eventRefType** | **String**| Defines an event type attached to the message. Case sensitive Supported values - &#x60;CompetitionType&#x60; &#x60;ContestType&#x60; &#x60;AchievementType&#x60;  &#x60;?eventRefType&#x3D;search_string&#x60; | [optional]
 **eventReferenceId** | **String**| The reference ID of the event object. Case sensitive   &#x60;?eventReferenceId&#x3D;search_string&#x60; | [optional]
 **messageType** | **String**| The type of message of the member. Case sensitive Supported values - &#x60;Notification&#x60; &#x60;Achievement&#x60; &#x60;Reward&#x60;  &#x60;?messageType&#x3D;search_string&#x60; | [optional]
 **subject** | **String**| The title of the message. Case sensitive  &#x60;?subject&#x3D;search_string&#x60; | [optional]
 **prizeRewardEntityType** | **String**| Can be achievement or contest. Case sensitive Supported values - &#x60;Achievement&#x60; &#x60;Contest&#x60;  &#x60;?prize.reward.entityType&#x3D;search_string&#x60; | [optional]
 **prizeRewardEntityId** | **String**| Achievement id or Contest id. Case sensitive   &#x60;?prize.reward.entityId&#x3D;search_string&#x60; | [optional]
 **prizeRewardRewardRank** | **String**| If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  &#x60;?prize.reward.rewardRank&#x3D;search_string&#x60; | [optional]
 **prizeRewardValue** | **Double**| Numerical value of the reward that will be issued based on the reward type  &#x60;?prize.reward.value&#x3D;search_double&#x60; | [optional]
 **prizeRewardRewardType** | **String**| Reward type id   &#x60;?prize.reward.rewardType&#x3D;search_string&#x60; | [optional]
 **prizeRewardDelay** | **Integer**| Delay of issuing a reward in minutes   &#x60;?prize.reward.delay&#x3D;search_integer&#x60; | [optional]
 **prizeRewardMemberAcknowledgmentRequired** | **Boolean**| To claim a reward   &#x60;?prize.reward.memberAcknowledgmentRequired&#x3D;search_boolean&#x60; | [optional]
 **prizeRewardMetadataKey** | **String**| Search by reward metadata key.   &#x60;?prize.reward.metadata.key&#x3D;search_word&#x60; | [optional]
 **prizeRewardMetadataValue** | **String**| Search by reward metadata value.   &#x60;?prize.reward.metadata.value&#x3D;search_word&#x60; | [optional]
 **prizeRewardCreated** | **OffsetDateTime**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.reward.created&#x3D;search_datetime&#x60; | [optional]
 **prizeRewardId** | **String**| Search by reward id. Case sensitive   &#x60;?prize.reward.id&#x3D;search_string&#x60; | [optional]
 **prizeClaimed** | **Boolean**| Has the award been claimed or not.   &#x60;?prize.claimed&#x3D;search_boolean&#x60; | [optional]
 **prizeEntityType** | **String**| The type of entity this Award relates to. Case sensitive   Supported values -   &#x60;Contest&#x60; &#x60;Achievement&#x60;   &#x60;?prize.entityType&#x3D;search_word&#x60; | [optional]
 **prizeEntityId** | **String**| The Id of the contest or achievement related to this Award. Case sensitive   &#x60;?prize.entityId&#x3D;search_string&#x60; | [optional]
 **prizeCreated** | **OffsetDateTime**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.created&#x3D;search_datetime&#x60; | [optional]
 **prizeId** | **String**| Award id. Case sensitive   &#x60;?prize.id&#x3D;search_word&#x60; | [optional]
 **status** | **String**| The status of the message. Case sensitive  Supported values - &#x60;New&#x60; &#x60;Read&#x60; &#x60;CollaborationRequest&#x60; &#x60;Actioned&#x60; &#x60;Claimed&#x60; &#x60;Expired&#x60; &#x60;Canceled&#x60; &#x60;Deprecated&#x60;   &#x60;?status&#x3D;search_string&#x60; | [optional]
 **created** | **OffsetDateTime**| Works with simple dates or date and time, eg:   &#x60;?created&#x3D;&lt;created-date&gt;&#x60; | [optional]
 **metadataKey** | **String**| Search by metadata key. Case sensitive.  &#x60;?metadata.key&#x3D;search_word&#x60; | [optional]
 **metadataValue** | **String**| Search by metadata value. Case sensitive.  &#x60;?metadata.value&#x3D;search_word&#x60; | [optional]
 **id** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the resources | [optional]

### Return type

CompletableFuture<[**MemberMessageResponse**](MemberMessageResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## getMessagesByMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberMessageResponse>> getMessagesByMemberRefId getMessagesByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, eventRefType, eventReferenceId, messageType, subject, prizeRewardEntityType, prizeRewardEntityId, prizeRewardRewardRank, prizeRewardValue, prizeRewardRewardType, prizeRewardDelay, prizeRewardMemberAcknowledgmentRequired, prizeRewardMetadataKey, prizeRewardMetadataValue, prizeRewardCreated, prizeRewardId, prizeClaimed, prizeEntityType, prizeEntityId, prizeCreated, prizeId, status, created, metadataKey, metadataValue, id)

Returns messages for a member by requested reference id

Returns a list of available messages for the specified member Reference ID.  GET responses can be filtered out based on the member messages parameters to narrow down the results.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberMessagesApi;
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

        MemberMessagesApi apiInstance = new MemberMessagesApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String eventRefType = "ContestType"; // String | Defines an event type attached to the message. Case sensitive Supported values - `CompetitionType` `ContestType` `AchievementType`  `?eventRefType=search_string`
        String eventReferenceId = "dfadadfadfafaf"; // String | The reference ID of the event object. Case sensitive   `?eventReferenceId=search_string`
        String messageType = "SumBest"; // String | The type of message of the member. Case sensitive Supported values - `Notification` `Achievement` `Reward`  `?messageType=search_string`
        String subject = "my first subject"; // String | The title of the message. Case sensitive  `?subject=search_string`
        String prizeRewardEntityType = "Contest"; // String | Can be achievement or contest. Case sensitive Supported values - `Achievement` `Contest`  `?prize.reward.entityType=search_string`
        String prizeRewardEntityId = "gsgsggwtwsdvdfadf"; // String | Achievement id or Contest id. Case sensitive   `?prize.reward.entityId=search_string`
        String prizeRewardRewardRank = "1"; // String | If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  `?prize.reward.rewardRank=search_string`
        Double prizeRewardValue = 1.2D; // Double | Numerical value of the reward that will be issued based on the reward type  `?prize.reward.value=search_double`
        String prizeRewardRewardType = "reward-type-id"; // String | Reward type id   `?prize.reward.rewardType=search_string`
        Integer prizeRewardDelay = 1; // Integer | Delay of issuing a reward in minutes   `?prize.reward.delay=search_integer`
        Boolean prizeRewardMemberAcknowledgmentRequired = false; // Boolean | To claim a reward   `?prize.reward.memberAcknowledgmentRequired=search_boolean`
        String prizeRewardMetadataKey = "reward-metadata-key"; // String | Search by reward metadata key.   `?prize.reward.metadata.key=search_word`
        String prizeRewardMetadataValue = "reward-metadata-value"; // String | Search by reward metadata value.   `?prize.reward.metadata.value=search_word`
        OffsetDateTime prizeRewardCreated = OffsetDateTime.now(); // OffsetDateTime | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.reward.created=search_datetime`
        String prizeRewardId = "wrwtsdrvxfnjuuu4133"; // String | Search by reward id. Case sensitive   `?prize.reward.id=search_string`
        Boolean prizeClaimed = false; // Boolean | Has the award been claimed or not.   `?prize.claimed=search_boolean`
        String prizeEntityType = "Contest"; // String | The type of entity this Award relates to. Case sensitive   Supported values -   `Contest` `Achievement`   `?prize.entityType=search_word`
        String prizeEntityId = "wrwtsdrvxfnjuuu4133"; // String | The Id of the contest or achievement related to this Award. Case sensitive   `?prize.entityId=search_string`
        OffsetDateTime prizeCreated = OffsetDateTime.now(); // OffsetDateTime | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.created=search_datetime`
        String prizeId = "wrwtsdrvxfnjuuu4133"; // String | Award id. Case sensitive   `?prize.id=search_word`
        String status = "Read"; // String | The status of the message. Case sensitive  Supported values - `New` `Read` `CollaborationRequest` `Actioned` `Claimed` `Expired` `Canceled` `Deprecated`   `?status=search_string`
        OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | Works with simple dates or date and time, eg:   `?created=<created-date>`
        String metadataKey = "\"my-first-meta-key\""; // String | Search by metadata key. Case sensitive.  `?metadata.key=search_word`
        String metadataValue = "\"my-first-meta-value\""; // String | Search by metadata value. Case sensitive.  `?metadata.value=search_word`
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        try {
            CompletableFuture<ApiResponse<MemberMessageResponse>> response = apiInstance.getMessagesByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, eventRefType, eventReferenceId, messageType, subject, prizeRewardEntityType, prizeRewardEntityId, prizeRewardRewardRank, prizeRewardValue, prizeRewardRewardType, prizeRewardDelay, prizeRewardMemberAcknowledgmentRequired, prizeRewardMetadataKey, prizeRewardMetadataValue, prizeRewardCreated, prizeRewardId, prizeClaimed, prizeEntityType, prizeEntityId, prizeCreated, prizeId, status, created, metadataKey, metadataValue, id);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberMessagesApi#getMessagesByMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberMessagesApi#getMessagesByMemberRefId");
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
 **eventRefType** | **String**| Defines an event type attached to the message. Case sensitive Supported values - &#x60;CompetitionType&#x60; &#x60;ContestType&#x60; &#x60;AchievementType&#x60;  &#x60;?eventRefType&#x3D;search_string&#x60; | [optional]
 **eventReferenceId** | **String**| The reference ID of the event object. Case sensitive   &#x60;?eventReferenceId&#x3D;search_string&#x60; | [optional]
 **messageType** | **String**| The type of message of the member. Case sensitive Supported values - &#x60;Notification&#x60; &#x60;Achievement&#x60; &#x60;Reward&#x60;  &#x60;?messageType&#x3D;search_string&#x60; | [optional]
 **subject** | **String**| The title of the message. Case sensitive  &#x60;?subject&#x3D;search_string&#x60; | [optional]
 **prizeRewardEntityType** | **String**| Can be achievement or contest. Case sensitive Supported values - &#x60;Achievement&#x60; &#x60;Contest&#x60;  &#x60;?prize.reward.entityType&#x3D;search_string&#x60; | [optional]
 **prizeRewardEntityId** | **String**| Achievement id or Contest id. Case sensitive   &#x60;?prize.reward.entityId&#x3D;search_string&#x60; | [optional]
 **prizeRewardRewardRank** | **String**| If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  &#x60;?prize.reward.rewardRank&#x3D;search_string&#x60; | [optional]
 **prizeRewardValue** | **Double**| Numerical value of the reward that will be issued based on the reward type  &#x60;?prize.reward.value&#x3D;search_double&#x60; | [optional]
 **prizeRewardRewardType** | **String**| Reward type id   &#x60;?prize.reward.rewardType&#x3D;search_string&#x60; | [optional]
 **prizeRewardDelay** | **Integer**| Delay of issuing a reward in minutes   &#x60;?prize.reward.delay&#x3D;search_integer&#x60; | [optional]
 **prizeRewardMemberAcknowledgmentRequired** | **Boolean**| To claim a reward   &#x60;?prize.reward.memberAcknowledgmentRequired&#x3D;search_boolean&#x60; | [optional]
 **prizeRewardMetadataKey** | **String**| Search by reward metadata key.   &#x60;?prize.reward.metadata.key&#x3D;search_word&#x60; | [optional]
 **prizeRewardMetadataValue** | **String**| Search by reward metadata value.   &#x60;?prize.reward.metadata.value&#x3D;search_word&#x60; | [optional]
 **prizeRewardCreated** | **OffsetDateTime**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.reward.created&#x3D;search_datetime&#x60; | [optional]
 **prizeRewardId** | **String**| Search by reward id. Case sensitive   &#x60;?prize.reward.id&#x3D;search_string&#x60; | [optional]
 **prizeClaimed** | **Boolean**| Has the award been claimed or not.   &#x60;?prize.claimed&#x3D;search_boolean&#x60; | [optional]
 **prizeEntityType** | **String**| The type of entity this Award relates to. Case sensitive   Supported values -   &#x60;Contest&#x60; &#x60;Achievement&#x60;   &#x60;?prize.entityType&#x3D;search_word&#x60; | [optional]
 **prizeEntityId** | **String**| The Id of the contest or achievement related to this Award. Case sensitive   &#x60;?prize.entityId&#x3D;search_string&#x60; | [optional]
 **prizeCreated** | **OffsetDateTime**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.created&#x3D;search_datetime&#x60; | [optional]
 **prizeId** | **String**| Award id. Case sensitive   &#x60;?prize.id&#x3D;search_word&#x60; | [optional]
 **status** | **String**| The status of the message. Case sensitive  Supported values - &#x60;New&#x60; &#x60;Read&#x60; &#x60;CollaborationRequest&#x60; &#x60;Actioned&#x60; &#x60;Claimed&#x60; &#x60;Expired&#x60; &#x60;Canceled&#x60; &#x60;Deprecated&#x60;   &#x60;?status&#x3D;search_string&#x60; | [optional]
 **created** | **OffsetDateTime**| Works with simple dates or date and time, eg:   &#x60;?created&#x3D;&lt;created-date&gt;&#x60; | [optional]
 **metadataKey** | **String**| Search by metadata key. Case sensitive.  &#x60;?metadata.key&#x3D;search_word&#x60; | [optional]
 **metadataValue** | **String**| Search by metadata value. Case sensitive.  &#x60;?metadata.value&#x3D;search_word&#x60; | [optional]
 **id** | [**List&lt;String&gt;**](String.md)| The unique identifiers of the resources | [optional]

### Return type

CompletableFuture<ApiResponse<[**MemberMessageResponse**](MemberMessageResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member message |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

