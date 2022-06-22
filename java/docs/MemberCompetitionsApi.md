# MemberCompetitionsApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkMemberOptinStatus**](MemberCompetitionsApi.md#checkMemberOptinStatus) | **GET** /api/v1/{spaceName}/members/{memberId}/competitions/{competitionId}/entrants | Returns details if the member has opted in
[**checkMemberOptinStatusWithHttpInfo**](MemberCompetitionsApi.md#checkMemberOptinStatusWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{memberId}/competitions/{competitionId}/entrants | Returns details if the member has opted in
[**checkMemberOptinStatusByRefId**](MemberCompetitionsApi.md#checkMemberOptinStatusByRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/competitions/{competitionId}/entrants | Returns details if the member has opted in
[**checkMemberOptinStatusByRefIdWithHttpInfo**](MemberCompetitionsApi.md#checkMemberOptinStatusByRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/competitions/{competitionId}/entrants | Returns details if the member has opted in
[**getCompetitionsByMemberRefId**](MemberCompetitionsApi.md#getCompetitionsByMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/competitions | Returns a list of competitions for a specific member
[**getCompetitionsByMemberRefIdWithHttpInfo**](MemberCompetitionsApi.md#getCompetitionsByMemberRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/competitions | Returns a list of competitions for a specific member
[**getMemberCompetitions**](MemberCompetitionsApi.md#getMemberCompetitions) | **GET** /api/v1/{spaceName}/members/{memberId}/competitions | Returns a list of competitions for a specific member
[**getMemberCompetitionsWithHttpInfo**](MemberCompetitionsApi.md#getMemberCompetitionsWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{memberId}/competitions | Returns a list of competitions for a specific member
[**optinMemberToCompetition**](MemberCompetitionsApi.md#optinMemberToCompetition) | **GET** /api/v1/{spaceName}/members/{memberId}/competitions/{competitionId}/optin | Opt in a member in a competition
[**optinMemberToCompetitionWithHttpInfo**](MemberCompetitionsApi.md#optinMemberToCompetitionWithHttpInfo) | **GET** /api/v1/{spaceName}/members/{memberId}/competitions/{competitionId}/optin | Opt in a member in a competition
[**optinMemberToCompetitionByRefId**](MemberCompetitionsApi.md#optinMemberToCompetitionByRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/competitions/{competitionId}/optin | Opt in a member in a competition
[**optinMemberToCompetitionByRefIdWithHttpInfo**](MemberCompetitionsApi.md#optinMemberToCompetitionByRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/competitions/{competitionId}/optin | Opt in a member in a competition



## checkMemberOptinStatus

> CompletableFuture<MemberResponse> checkMemberOptinStatus(X_API_KEY, spaceName, memberId, competitionId)

Returns details if the member has opted in

Check if a member is opted into a Competition using a Member Id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String competitionId = "adkjaflklafll"; // String | Id of a competition
        try {
            CompletableFuture<MemberResponse> result = apiInstance.checkMemberOptinStatus(X_API_KEY, spaceName, memberId, competitionId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#checkMemberOptinStatus");
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
 **competitionId** | **String**| Id of a competition |

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
| **400** | Member has not opted in |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## checkMemberOptinStatusWithHttpInfo

> CompletableFuture<ApiResponse<MemberResponse>> checkMemberOptinStatus checkMemberOptinStatusWithHttpInfo(X_API_KEY, spaceName, memberId, competitionId)

Returns details if the member has opted in

Check if a member is opted into a Competition using a Member Id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String competitionId = "adkjaflklafll"; // String | Id of a competition
        try {
            CompletableFuture<ApiResponse<MemberResponse>> response = apiInstance.checkMemberOptinStatusWithHttpInfo(X_API_KEY, spaceName, memberId, competitionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberCompetitionsApi#checkMemberOptinStatus");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#checkMemberOptinStatus");
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
 **competitionId** | **String**| Id of a competition |

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
| **400** | Member has not opted in |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## checkMemberOptinStatusByRefId

> CompletableFuture<MemberResponse> checkMemberOptinStatusByRefId(X_API_KEY, spaceName, memberRefId, competitionId)

Returns details if the member has opted in

Check if a member is opted into a Competition using a Member Id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String competitionId = "adkjaflklafll"; // String | Id of a competition
        try {
            CompletableFuture<MemberResponse> result = apiInstance.checkMemberOptinStatusByRefId(X_API_KEY, spaceName, memberRefId, competitionId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#checkMemberOptinStatusByRefId");
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
 **competitionId** | **String**| Id of a competition |

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
| **400** | Member has not opted in |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |

## checkMemberOptinStatusByRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberResponse>> checkMemberOptinStatusByRefId checkMemberOptinStatusByRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, competitionId)

Returns details if the member has opted in

Check if a member is opted into a Competition using a Member Id.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String competitionId = "adkjaflklafll"; // String | Id of a competition
        try {
            CompletableFuture<ApiResponse<MemberResponse>> response = apiInstance.checkMemberOptinStatusByRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, competitionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberCompetitionsApi#checkMemberOptinStatusByRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#checkMemberOptinStatusByRefId");
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
 **competitionId** | **String**| Id of a competition |

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
| **400** | Member has not opted in |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or Member with requested id does not exist. |  -  |


## getCompetitionsByMemberRefId

> CompletableFuture<MemberCompetitionResponse> getCompetitionsByMemberRefId(X_API_KEY, spaceName, memberRefId, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, optionsActualDatesEnd, actualEnd, productsProductRefId, productRefId, optionsProductsMetadataKey, optionsProductsMetadataValue, optionsProductsProductRefId, status, statusCode, optionsLimitEntrantsTo, limitEntrantsTo, optionsScheduledDatesStart, scheduledStart, optionsScheduledDatesEnd, scheduledEnd, optionsActualDatesStart, actualStart)

Returns a list of competitions for a specific member

Returns a list of competitions that the member can participate in (filtering will be done automatically for member group eligibility).  &#x60;The default behaviour of a response is that the competitions that are in Ready, Active or Finished state AND are eligible for ALL and eligible for the member Id requested will be returned unless queried otherwise.&#x60;  This assumes that competitions have first been created using the web console otherwise no data will be returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata will be 0.  GET responses can be filtered out based on the competition parameters to narrow down the results.  The denser the queryable URL the more precise the response will be.   Sort by fields is limited to: * created (DateTime of the competition creation) * label (the label of the competition) * scheduled start and end DateTime * actual start and end DateTime * status code that indicates the status of the competition  Example:  ?_sortByFields&#x3D;created  ?_sortByFields&#x3D;label  ?_sortByFields&#x3D;options.scheduledDates.start  ?_sortByFields&#x3D;options.scheduledDates.end  ?_sortByFields&#x3D;options.actualDates.start  ?_sortByFields&#x3D;options.actualDates.end  ?_sortByFields&#x3D;statusCode

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        Integer limit = 5; // Integer | Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number.
        Integer skip = 10; // Integer | Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  <url>?_limit=5&_skip=0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  `<url>?_limit=5&_skip=10`
        String sortByFields = "transactionTimestamp:desc,created:asc"; // String | Enables sorting of results based on fields and order specified.  Supported ordering  `asc, desc`   Usage syntax  `_sortByFields=<field-to-sort-on>:<order>`   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  `<url>?_sortByFields=transactionTimestamp:desc,created:asc`
        String include = "products"; // String | Allows you to add the products and metadata objects to the response. Case sensitive
        String lang = "es"; // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
        String equal = "equal_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" or \"Active\" state that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status=Ready,Active&options.limitEntrantsTo=group1,group2`
        String equalEqual = "equalEqual_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" state only that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status==Ready&options.limitEntrantsTo=group1,group2`
        String lessThanEqual = "transactionTimestamp<=2016-02-09T17:38:08.328"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<=2021-02-09T17:38:08.328`
        String lessThanEqualEqual = "lessThanEqualEqual_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<==2021-02-09T17:38:08.328`
        String equalGreaterThan = "equalGreaterThan_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp=>2021-02-09T17:38:08.328`
        String equalEqualGreaterThan = "equalEqualGreaterThan_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp==>2021-02-09T17:38:08.328`
        String optionsActualDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.end=search_DateTime`
        String actualEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualEnd=search_DateTime`
        String productsProductRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?products.productRefId=search_word`
        String productRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?productRefId=search_word`
        String optionsProductsMetadataKey = "\"my-first-meta-key\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.key=search_word`
        String optionsProductsMetadataValue = "\"my-first-meta-value\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.value=search_word`
        String optionsProductsProductRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.productRefId=search_word`
        String status = "Active"; // String | The status of the competition. Case sensitive. Supported values - `Unknown` `Deleting` `Deleted` `Draft` `Template` `Preparing` `Ready` `Starting` `Active` `Finishing` `Finished` `Cancelling` `Cancelled`
        Integer statusCode = 5; // Integer | The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled) 
        List<String> optionsLimitEntrantsTo = Arrays.asList(); // List<String> | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?options.limitEntrantsTo=search_word`
        List<String> limitEntrantsTo = Arrays.asList(); // List<String> | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?limitEntrantsTo=search_word`
        String optionsScheduledDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.start=search_DateTime`
        String scheduledStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
        String optionsScheduledDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.end=search_DateTime`
        String scheduledEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
        String optionsActualDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.start=search_DateTime`
        String actualStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualStart=search_DateTime`
        try {
            CompletableFuture<MemberCompetitionResponse> result = apiInstance.getCompetitionsByMemberRefId(X_API_KEY, spaceName, memberRefId, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, optionsActualDatesEnd, actualEnd, productsProductRefId, productRefId, optionsProductsMetadataKey, optionsProductsMetadataValue, optionsProductsProductRefId, status, statusCode, optionsLimitEntrantsTo, limitEntrantsTo, optionsScheduledDatesStart, scheduledStart, optionsScheduledDatesEnd, scheduledEnd, optionsActualDatesStart, actualStart);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#getCompetitionsByMemberRefId");
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
 **limit** | **Integer**| Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number. | [optional]
 **skip** | **Integer**| Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  &lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  &#x60;&lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;10&#x60; | [optional]
 **sortByFields** | **String**| Enables sorting of results based on fields and order specified.  Supported ordering  &#x60;asc, desc&#x60;   Usage syntax  &#x60;_sortByFields&#x3D;&lt;field-to-sort-on&gt;:&lt;order&gt;&#x60;   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  &#x60;&lt;url&gt;?_sortByFields&#x3D;transactionTimestamp:desc,created:asc&#x60; | [optional]
 **include** | **String**| Allows you to add the products and metadata objects to the response. Case sensitive | [optional]
 **lang** | **String**| Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive | [optional]
 **equal** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; or \&quot;Active\&quot; state that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;Ready,Active&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional]
 **equalEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; state only that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;&#x3D;Ready&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional]
 **lessThanEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional]
 **lessThanEqualEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional]
 **equalGreaterThan** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional]
 **equalEqualGreaterThan** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional]
 **optionsActualDatesEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.end&#x3D;search_DateTime&#x60; | [optional]
 **actualEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualEnd&#x3D;search_DateTime&#x60; | [optional]
 **productsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?products.productRefId&#x3D;search_word&#x60; | [optional]
 **productRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?productRefId&#x3D;search_word&#x60; | [optional]
 **optionsProductsMetadataKey** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.key&#x3D;search_word&#x60; | [optional]
 **optionsProductsMetadataValue** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.value&#x3D;search_word&#x60; | [optional]
 **optionsProductsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.productRefId&#x3D;search_word&#x60; | [optional]
 **status** | **String**| The status of the competition. Case sensitive. Supported values - &#x60;Unknown&#x60; &#x60;Deleting&#x60; &#x60;Deleted&#x60; &#x60;Draft&#x60; &#x60;Template&#x60; &#x60;Preparing&#x60; &#x60;Ready&#x60; &#x60;Starting&#x60; &#x60;Active&#x60; &#x60;Finishing&#x60; &#x60;Finished&#x60; &#x60;Cancelling&#x60; &#x60;Cancelled&#x60; | [optional]
 **statusCode** | **Integer**| The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled)  | [optional]
 **optionsLimitEntrantsTo** | [**List&lt;String&gt;**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?options.limitEntrantsTo&#x3D;search_word&#x60; | [optional]
 **limitEntrantsTo** | [**List&lt;String&gt;**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?limitEntrantsTo&#x3D;search_word&#x60; | [optional]
 **optionsScheduledDatesStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.start&#x3D;search_DateTime&#x60; | [optional]
 **scheduledStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional]
 **optionsScheduledDatesEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.end&#x3D;search_DateTime&#x60; | [optional]
 **scheduledEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional]
 **optionsActualDatesStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.start&#x3D;search_DateTime&#x60; | [optional]
 **actualStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualStart&#x3D;search_DateTime&#x60; | [optional]

### Return type

CompletableFuture<[**MemberCompetitionResponse**](MemberCompetitionResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions for a member |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |

## getCompetitionsByMemberRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberCompetitionResponse>> getCompetitionsByMemberRefId getCompetitionsByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, optionsActualDatesEnd, actualEnd, productsProductRefId, productRefId, optionsProductsMetadataKey, optionsProductsMetadataValue, optionsProductsProductRefId, status, statusCode, optionsLimitEntrantsTo, limitEntrantsTo, optionsScheduledDatesStart, scheduledStart, optionsScheduledDatesEnd, scheduledEnd, optionsActualDatesStart, actualStart)

Returns a list of competitions for a specific member

Returns a list of competitions that the member can participate in (filtering will be done automatically for member group eligibility).  &#x60;The default behaviour of a response is that the competitions that are in Ready, Active or Finished state AND are eligible for ALL and eligible for the member Id requested will be returned unless queried otherwise.&#x60;  This assumes that competitions have first been created using the web console otherwise no data will be returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata will be 0.  GET responses can be filtered out based on the competition parameters to narrow down the results.  The denser the queryable URL the more precise the response will be.   Sort by fields is limited to: * created (DateTime of the competition creation) * label (the label of the competition) * scheduled start and end DateTime * actual start and end DateTime * status code that indicates the status of the competition  Example:  ?_sortByFields&#x3D;created  ?_sortByFields&#x3D;label  ?_sortByFields&#x3D;options.scheduledDates.start  ?_sortByFields&#x3D;options.scheduledDates.end  ?_sortByFields&#x3D;options.actualDates.start  ?_sortByFields&#x3D;options.actualDates.end  ?_sortByFields&#x3D;statusCode

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        Integer limit = 5; // Integer | Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number.
        Integer skip = 10; // Integer | Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  <url>?_limit=5&_skip=0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  `<url>?_limit=5&_skip=10`
        String sortByFields = "transactionTimestamp:desc,created:asc"; // String | Enables sorting of results based on fields and order specified.  Supported ordering  `asc, desc`   Usage syntax  `_sortByFields=<field-to-sort-on>:<order>`   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  `<url>?_sortByFields=transactionTimestamp:desc,created:asc`
        String include = "products"; // String | Allows you to add the products and metadata objects to the response. Case sensitive
        String lang = "es"; // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
        String equal = "equal_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" or \"Active\" state that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status=Ready,Active&options.limitEntrantsTo=group1,group2`
        String equalEqual = "equalEqual_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" state only that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status==Ready&options.limitEntrantsTo=group1,group2`
        String lessThanEqual = "transactionTimestamp<=2016-02-09T17:38:08.328"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<=2021-02-09T17:38:08.328`
        String lessThanEqualEqual = "lessThanEqualEqual_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<==2021-02-09T17:38:08.328`
        String equalGreaterThan = "equalGreaterThan_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp=>2021-02-09T17:38:08.328`
        String equalEqualGreaterThan = "equalEqualGreaterThan_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp==>2021-02-09T17:38:08.328`
        String optionsActualDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.end=search_DateTime`
        String actualEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualEnd=search_DateTime`
        String productsProductRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?products.productRefId=search_word`
        String productRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?productRefId=search_word`
        String optionsProductsMetadataKey = "\"my-first-meta-key\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.key=search_word`
        String optionsProductsMetadataValue = "\"my-first-meta-value\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.value=search_word`
        String optionsProductsProductRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.productRefId=search_word`
        String status = "Active"; // String | The status of the competition. Case sensitive. Supported values - `Unknown` `Deleting` `Deleted` `Draft` `Template` `Preparing` `Ready` `Starting` `Active` `Finishing` `Finished` `Cancelling` `Cancelled`
        Integer statusCode = 5; // Integer | The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled) 
        List<String> optionsLimitEntrantsTo = Arrays.asList(); // List<String> | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?options.limitEntrantsTo=search_word`
        List<String> limitEntrantsTo = Arrays.asList(); // List<String> | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?limitEntrantsTo=search_word`
        String optionsScheduledDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.start=search_DateTime`
        String scheduledStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
        String optionsScheduledDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.end=search_DateTime`
        String scheduledEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
        String optionsActualDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.start=search_DateTime`
        String actualStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualStart=search_DateTime`
        try {
            CompletableFuture<ApiResponse<MemberCompetitionResponse>> response = apiInstance.getCompetitionsByMemberRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, optionsActualDatesEnd, actualEnd, productsProductRefId, productRefId, optionsProductsMetadataKey, optionsProductsMetadataValue, optionsProductsProductRefId, status, statusCode, optionsLimitEntrantsTo, limitEntrantsTo, optionsScheduledDatesStart, scheduledStart, optionsScheduledDatesEnd, scheduledEnd, optionsActualDatesStart, actualStart);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberCompetitionsApi#getCompetitionsByMemberRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#getCompetitionsByMemberRefId");
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
 **limit** | **Integer**| Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number. | [optional]
 **skip** | **Integer**| Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  &lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  &#x60;&lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;10&#x60; | [optional]
 **sortByFields** | **String**| Enables sorting of results based on fields and order specified.  Supported ordering  &#x60;asc, desc&#x60;   Usage syntax  &#x60;_sortByFields&#x3D;&lt;field-to-sort-on&gt;:&lt;order&gt;&#x60;   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  &#x60;&lt;url&gt;?_sortByFields&#x3D;transactionTimestamp:desc,created:asc&#x60; | [optional]
 **include** | **String**| Allows you to add the products and metadata objects to the response. Case sensitive | [optional]
 **lang** | **String**| Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive | [optional]
 **equal** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; or \&quot;Active\&quot; state that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;Ready,Active&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional]
 **equalEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; state only that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;&#x3D;Ready&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional]
 **lessThanEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional]
 **lessThanEqualEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional]
 **equalGreaterThan** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional]
 **equalEqualGreaterThan** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional]
 **optionsActualDatesEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.end&#x3D;search_DateTime&#x60; | [optional]
 **actualEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualEnd&#x3D;search_DateTime&#x60; | [optional]
 **productsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?products.productRefId&#x3D;search_word&#x60; | [optional]
 **productRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?productRefId&#x3D;search_word&#x60; | [optional]
 **optionsProductsMetadataKey** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.key&#x3D;search_word&#x60; | [optional]
 **optionsProductsMetadataValue** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.value&#x3D;search_word&#x60; | [optional]
 **optionsProductsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.productRefId&#x3D;search_word&#x60; | [optional]
 **status** | **String**| The status of the competition. Case sensitive. Supported values - &#x60;Unknown&#x60; &#x60;Deleting&#x60; &#x60;Deleted&#x60; &#x60;Draft&#x60; &#x60;Template&#x60; &#x60;Preparing&#x60; &#x60;Ready&#x60; &#x60;Starting&#x60; &#x60;Active&#x60; &#x60;Finishing&#x60; &#x60;Finished&#x60; &#x60;Cancelling&#x60; &#x60;Cancelled&#x60; | [optional]
 **statusCode** | **Integer**| The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled)  | [optional]
 **optionsLimitEntrantsTo** | [**List&lt;String&gt;**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?options.limitEntrantsTo&#x3D;search_word&#x60; | [optional]
 **limitEntrantsTo** | [**List&lt;String&gt;**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?limitEntrantsTo&#x3D;search_word&#x60; | [optional]
 **optionsScheduledDatesStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.start&#x3D;search_DateTime&#x60; | [optional]
 **scheduledStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional]
 **optionsScheduledDatesEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.end&#x3D;search_DateTime&#x60; | [optional]
 **scheduledEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional]
 **optionsActualDatesStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.start&#x3D;search_DateTime&#x60; | [optional]
 **actualStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualStart&#x3D;search_DateTime&#x60; | [optional]

### Return type

CompletableFuture<ApiResponse<[**MemberCompetitionResponse**](MemberCompetitionResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions for a member |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |


## getMemberCompetitions

> CompletableFuture<MemberCompetitionResponse> getMemberCompetitions(X_API_KEY, spaceName, memberId, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, optionsActualDatesEnd, actualEnd, productsProductRefId, productRefId, optionsProductsMetadataKey, optionsProductsMetadataValue, optionsProductsProductRefId, status, statusCode, optionsLimitEntrantsTo, limitEntrantsTo, optionsScheduledDatesStart, scheduledStart, optionsScheduledDatesEnd, scheduledEnd, optionsActualDatesStart, actualStart)

Returns a list of competitions for a specific member

Returns a list of competitions that the member can participate in (filtering will be done automatically for member group eligibility).  &#x60;The default behaviour of a response is that the competitions that are in Ready, Active or Finished state AND are eligible for ALL and eligible for the member Id requested will be returned unless queried otherwise.&#x60;  This assumes that competitions have first been created using the web console otherwise no data will be returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata will be 0.  GET responses can be filtered out based on the competition parameters to narrow down the results.  The denser the queryable URL the more precise the response will be.   Sort by fields is limited to: * created (DateTime of the competition creation) * label (the label of the competition) * scheduled start and end DateTime * actual start and end DateTime * status code that indicates the status of the competition  Example:  ?_sortByFields&#x3D;created  ?_sortByFields&#x3D;label  ?_sortByFields&#x3D;options.scheduledDates.start  ?_sortByFields&#x3D;options.scheduledDates.end  ?_sortByFields&#x3D;options.actualDates.start  ?_sortByFields&#x3D;options.actualDates.end  ?_sortByFields&#x3D;statusCode

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        Integer limit = 5; // Integer | Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number.
        Integer skip = 10; // Integer | Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  <url>?_limit=5&_skip=0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  `<url>?_limit=5&_skip=10`
        String sortByFields = "transactionTimestamp:desc,created:asc"; // String | Enables sorting of results based on fields and order specified.  Supported ordering  `asc, desc`   Usage syntax  `_sortByFields=<field-to-sort-on>:<order>`   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  `<url>?_sortByFields=transactionTimestamp:desc,created:asc`
        String include = "products"; // String | Allows you to add the products and metadata objects to the response. Case sensitive
        String lang = "es"; // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
        String equal = "equal_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" or \"Active\" state that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status=Ready,Active&options.limitEntrantsTo=group1,group2`
        String equalEqual = "equalEqual_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" state only that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status==Ready&options.limitEntrantsTo=group1,group2`
        String lessThanEqual = "transactionTimestamp<=2016-02-09T17:38:08.328"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<=2021-02-09T17:38:08.328`
        String lessThanEqualEqual = "lessThanEqualEqual_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<==2021-02-09T17:38:08.328`
        String equalGreaterThan = "equalGreaterThan_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp=>2021-02-09T17:38:08.328`
        String equalEqualGreaterThan = "equalEqualGreaterThan_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp==>2021-02-09T17:38:08.328`
        String optionsActualDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.end=search_DateTime`
        String actualEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualEnd=search_DateTime`
        String productsProductRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?products.productRefId=search_word`
        String productRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?productRefId=search_word`
        String optionsProductsMetadataKey = "\"my-first-meta-key\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.key=search_word`
        String optionsProductsMetadataValue = "\"my-first-meta-value\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.value=search_word`
        String optionsProductsProductRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.productRefId=search_word`
        String status = "Active"; // String | The status of the competition. Case sensitive. Supported values - `Unknown` `Deleting` `Deleted` `Draft` `Template` `Preparing` `Ready` `Starting` `Active` `Finishing` `Finished` `Cancelling` `Cancelled`
        Integer statusCode = 5; // Integer | The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled) 
        List<String> optionsLimitEntrantsTo = Arrays.asList(); // List<String> | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?options.limitEntrantsTo=search_word`
        List<String> limitEntrantsTo = Arrays.asList(); // List<String> | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?limitEntrantsTo=search_word`
        String optionsScheduledDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.start=search_DateTime`
        String scheduledStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
        String optionsScheduledDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.end=search_DateTime`
        String scheduledEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
        String optionsActualDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.start=search_DateTime`
        String actualStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualStart=search_DateTime`
        try {
            CompletableFuture<MemberCompetitionResponse> result = apiInstance.getMemberCompetitions(X_API_KEY, spaceName, memberId, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, optionsActualDatesEnd, actualEnd, productsProductRefId, productRefId, optionsProductsMetadataKey, optionsProductsMetadataValue, optionsProductsProductRefId, status, statusCode, optionsLimitEntrantsTo, limitEntrantsTo, optionsScheduledDatesStart, scheduledStart, optionsScheduledDatesEnd, scheduledEnd, optionsActualDatesStart, actualStart);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#getMemberCompetitions");
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
 **limit** | **Integer**| Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number. | [optional]
 **skip** | **Integer**| Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  &lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  &#x60;&lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;10&#x60; | [optional]
 **sortByFields** | **String**| Enables sorting of results based on fields and order specified.  Supported ordering  &#x60;asc, desc&#x60;   Usage syntax  &#x60;_sortByFields&#x3D;&lt;field-to-sort-on&gt;:&lt;order&gt;&#x60;   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  &#x60;&lt;url&gt;?_sortByFields&#x3D;transactionTimestamp:desc,created:asc&#x60; | [optional]
 **include** | **String**| Allows you to add the products and metadata objects to the response. Case sensitive | [optional]
 **lang** | **String**| Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive | [optional]
 **equal** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; or \&quot;Active\&quot; state that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;Ready,Active&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional]
 **equalEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; state only that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;&#x3D;Ready&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional]
 **lessThanEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional]
 **lessThanEqualEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional]
 **equalGreaterThan** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional]
 **equalEqualGreaterThan** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional]
 **optionsActualDatesEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.end&#x3D;search_DateTime&#x60; | [optional]
 **actualEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualEnd&#x3D;search_DateTime&#x60; | [optional]
 **productsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?products.productRefId&#x3D;search_word&#x60; | [optional]
 **productRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?productRefId&#x3D;search_word&#x60; | [optional]
 **optionsProductsMetadataKey** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.key&#x3D;search_word&#x60; | [optional]
 **optionsProductsMetadataValue** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.value&#x3D;search_word&#x60; | [optional]
 **optionsProductsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.productRefId&#x3D;search_word&#x60; | [optional]
 **status** | **String**| The status of the competition. Case sensitive. Supported values - &#x60;Unknown&#x60; &#x60;Deleting&#x60; &#x60;Deleted&#x60; &#x60;Draft&#x60; &#x60;Template&#x60; &#x60;Preparing&#x60; &#x60;Ready&#x60; &#x60;Starting&#x60; &#x60;Active&#x60; &#x60;Finishing&#x60; &#x60;Finished&#x60; &#x60;Cancelling&#x60; &#x60;Cancelled&#x60; | [optional]
 **statusCode** | **Integer**| The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled)  | [optional]
 **optionsLimitEntrantsTo** | [**List&lt;String&gt;**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?options.limitEntrantsTo&#x3D;search_word&#x60; | [optional]
 **limitEntrantsTo** | [**List&lt;String&gt;**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?limitEntrantsTo&#x3D;search_word&#x60; | [optional]
 **optionsScheduledDatesStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.start&#x3D;search_DateTime&#x60; | [optional]
 **scheduledStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional]
 **optionsScheduledDatesEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.end&#x3D;search_DateTime&#x60; | [optional]
 **scheduledEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional]
 **optionsActualDatesStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.start&#x3D;search_DateTime&#x60; | [optional]
 **actualStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualStart&#x3D;search_DateTime&#x60; | [optional]

### Return type

CompletableFuture<[**MemberCompetitionResponse**](MemberCompetitionResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions for a member |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |

## getMemberCompetitionsWithHttpInfo

> CompletableFuture<ApiResponse<MemberCompetitionResponse>> getMemberCompetitions getMemberCompetitionsWithHttpInfo(X_API_KEY, spaceName, memberId, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, optionsActualDatesEnd, actualEnd, productsProductRefId, productRefId, optionsProductsMetadataKey, optionsProductsMetadataValue, optionsProductsProductRefId, status, statusCode, optionsLimitEntrantsTo, limitEntrantsTo, optionsScheduledDatesStart, scheduledStart, optionsScheduledDatesEnd, scheduledEnd, optionsActualDatesStart, actualStart)

Returns a list of competitions for a specific member

Returns a list of competitions that the member can participate in (filtering will be done automatically for member group eligibility).  &#x60;The default behaviour of a response is that the competitions that are in Ready, Active or Finished state AND are eligible for ALL and eligible for the member Id requested will be returned unless queried otherwise.&#x60;  This assumes that competitions have first been created using the web console otherwise no data will be returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata will be 0.  GET responses can be filtered out based on the competition parameters to narrow down the results.  The denser the queryable URL the more precise the response will be.   Sort by fields is limited to: * created (DateTime of the competition creation) * label (the label of the competition) * scheduled start and end DateTime * actual start and end DateTime * status code that indicates the status of the competition  Example:  ?_sortByFields&#x3D;created  ?_sortByFields&#x3D;label  ?_sortByFields&#x3D;options.scheduledDates.start  ?_sortByFields&#x3D;options.scheduledDates.end  ?_sortByFields&#x3D;options.actualDates.start  ?_sortByFields&#x3D;options.actualDates.end  ?_sortByFields&#x3D;statusCode

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        List<String> id = Arrays.asList(); // List<String> | The unique identifiers of the resources
        Integer limit = 5; // Integer | Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number.
        Integer skip = 10; // Integer | Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  <url>?_limit=5&_skip=0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  `<url>?_limit=5&_skip=10`
        String sortByFields = "transactionTimestamp:desc,created:asc"; // String | Enables sorting of results based on fields and order specified.  Supported ordering  `asc, desc`   Usage syntax  `_sortByFields=<field-to-sort-on>:<order>`   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  `<url>?_sortByFields=transactionTimestamp:desc,created:asc`
        String include = "products"; // String | Allows you to add the products and metadata objects to the response. Case sensitive
        String lang = "es"; // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
        String equal = "equal_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" or \"Active\" state that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status=Ready,Active&options.limitEntrantsTo=group1,group2`
        String equalEqual = "equalEqual_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" state only that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status==Ready&options.limitEntrantsTo=group1,group2`
        String lessThanEqual = "transactionTimestamp<=2016-02-09T17:38:08.328"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<=2021-02-09T17:38:08.328`
        String lessThanEqualEqual = "lessThanEqualEqual_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<==2021-02-09T17:38:08.328`
        String equalGreaterThan = "equalGreaterThan_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp=>2021-02-09T17:38:08.328`
        String equalEqualGreaterThan = "equalEqualGreaterThan_example"; // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp==>2021-02-09T17:38:08.328`
        String optionsActualDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.end=search_DateTime`
        String actualEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualEnd=search_DateTime`
        String productsProductRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?products.productRefId=search_word`
        String productRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?productRefId=search_word`
        String optionsProductsMetadataKey = "\"my-first-meta-key\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.key=search_word`
        String optionsProductsMetadataValue = "\"my-first-meta-value\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.value=search_word`
        String optionsProductsProductRefId = "\"my-first-product\""; // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.productRefId=search_word`
        String status = "Active"; // String | The status of the competition. Case sensitive. Supported values - `Unknown` `Deleting` `Deleted` `Draft` `Template` `Preparing` `Ready` `Starting` `Active` `Finishing` `Finished` `Cancelling` `Cancelled`
        Integer statusCode = 5; // Integer | The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled) 
        List<String> optionsLimitEntrantsTo = Arrays.asList(); // List<String> | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?options.limitEntrantsTo=search_word`
        List<String> limitEntrantsTo = Arrays.asList(); // List<String> | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?limitEntrantsTo=search_word`
        String optionsScheduledDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.start=search_DateTime`
        String scheduledStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
        String optionsScheduledDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.end=search_DateTime`
        String scheduledEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
        String optionsActualDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.start=search_DateTime`
        String actualStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualStart=search_DateTime`
        try {
            CompletableFuture<ApiResponse<MemberCompetitionResponse>> response = apiInstance.getMemberCompetitionsWithHttpInfo(X_API_KEY, spaceName, memberId, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, optionsActualDatesEnd, actualEnd, productsProductRefId, productRefId, optionsProductsMetadataKey, optionsProductsMetadataValue, optionsProductsProductRefId, status, statusCode, optionsLimitEntrantsTo, limitEntrantsTo, optionsScheduledDatesStart, scheduledStart, optionsScheduledDatesEnd, scheduledEnd, optionsActualDatesStart, actualStart);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberCompetitionsApi#getMemberCompetitions");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#getMemberCompetitions");
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
 **limit** | **Integer**| Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number. | [optional]
 **skip** | **Integer**| Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  &lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  &#x60;&lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;10&#x60; | [optional]
 **sortByFields** | **String**| Enables sorting of results based on fields and order specified.  Supported ordering  &#x60;asc, desc&#x60;   Usage syntax  &#x60;_sortByFields&#x3D;&lt;field-to-sort-on&gt;:&lt;order&gt;&#x60;   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  &#x60;&lt;url&gt;?_sortByFields&#x3D;transactionTimestamp:desc,created:asc&#x60; | [optional]
 **include** | **String**| Allows you to add the products and metadata objects to the response. Case sensitive | [optional]
 **lang** | **String**| Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive | [optional]
 **equal** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; or \&quot;Active\&quot; state that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;Ready,Active&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional]
 **equalEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; state only that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;&#x3D;Ready&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional]
 **lessThanEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional]
 **lessThanEqualEqual** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional]
 **equalGreaterThan** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional]
 **equalEqualGreaterThan** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional]
 **optionsActualDatesEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.end&#x3D;search_DateTime&#x60; | [optional]
 **actualEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualEnd&#x3D;search_DateTime&#x60; | [optional]
 **productsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?products.productRefId&#x3D;search_word&#x60; | [optional]
 **productRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?productRefId&#x3D;search_word&#x60; | [optional]
 **optionsProductsMetadataKey** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.key&#x3D;search_word&#x60; | [optional]
 **optionsProductsMetadataValue** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.value&#x3D;search_word&#x60; | [optional]
 **optionsProductsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.productRefId&#x3D;search_word&#x60; | [optional]
 **status** | **String**| The status of the competition. Case sensitive. Supported values - &#x60;Unknown&#x60; &#x60;Deleting&#x60; &#x60;Deleted&#x60; &#x60;Draft&#x60; &#x60;Template&#x60; &#x60;Preparing&#x60; &#x60;Ready&#x60; &#x60;Starting&#x60; &#x60;Active&#x60; &#x60;Finishing&#x60; &#x60;Finished&#x60; &#x60;Cancelling&#x60; &#x60;Cancelled&#x60; | [optional]
 **statusCode** | **Integer**| The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled)  | [optional]
 **optionsLimitEntrantsTo** | [**List&lt;String&gt;**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?options.limitEntrantsTo&#x3D;search_word&#x60; | [optional]
 **limitEntrantsTo** | [**List&lt;String&gt;**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?limitEntrantsTo&#x3D;search_word&#x60; | [optional]
 **optionsScheduledDatesStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.start&#x3D;search_DateTime&#x60; | [optional]
 **scheduledStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional]
 **optionsScheduledDatesEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.end&#x3D;search_DateTime&#x60; | [optional]
 **scheduledEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional]
 **optionsActualDatesStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.start&#x3D;search_DateTime&#x60; | [optional]
 **actualStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualStart&#x3D;search_DateTime&#x60; | [optional]

### Return type

CompletableFuture<ApiResponse<[**MemberCompetitionResponse**](MemberCompetitionResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of competitions for a member |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |


## optinMemberToCompetition

> CompletableFuture<MemberOptinResponse> optinMemberToCompetition(X_API_KEY, spaceName, memberId, competitionId)

Opt in a member in a competition

Allows a member to opt-in into an existing Competition using an existing Member Id.  Use &#x60;/api/v1/:space/members/:memberId/competition/:competitionId/entrants&#x60; or &#x60;/api/v1/:space/members/reference/:memberRefId/competition/:competitionId/entrants&#x60;  API endpoint to determine if a Member is already Opted in to a Competition.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String competitionId = "adkjaflklafll"; // String | Id of a competition
        try {
            CompletableFuture<MemberOptinResponse> result = apiInstance.optinMemberToCompetition(X_API_KEY, spaceName, memberId, competitionId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#optinMemberToCompetition");
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
 **competitionId** | **String**| Id of a competition |

### Return type

CompletableFuture<[**MemberOptinResponse**](MemberOptinResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member optin response |  -  |
| **400** | Competition does not require opt in or Competition has finished or member has already opted in |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or member with requested id not found. |  -  |

## optinMemberToCompetitionWithHttpInfo

> CompletableFuture<ApiResponse<MemberOptinResponse>> optinMemberToCompetition optinMemberToCompetitionWithHttpInfo(X_API_KEY, spaceName, memberId, competitionId)

Opt in a member in a competition

Allows a member to opt-in into an existing Competition using an existing Member Id.  Use &#x60;/api/v1/:space/members/:memberId/competition/:competitionId/entrants&#x60; or &#x60;/api/v1/:space/members/reference/:memberRefId/competition/:competitionId/entrants&#x60;  API endpoint to determine if a Member is already Opted in to a Competition.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
        String competitionId = "adkjaflklafll"; // String | Id of a competition
        try {
            CompletableFuture<ApiResponse<MemberOptinResponse>> response = apiInstance.optinMemberToCompetitionWithHttpInfo(X_API_KEY, spaceName, memberId, competitionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberCompetitionsApi#optinMemberToCompetition");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#optinMemberToCompetition");
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
 **competitionId** | **String**| Id of a competition |

### Return type

CompletableFuture<ApiResponse<[**MemberOptinResponse**](MemberOptinResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member optin response |  -  |
| **400** | Competition does not require opt in or Competition has finished or member has already opted in |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or member with requested id not found. |  -  |


## optinMemberToCompetitionByRefId

> CompletableFuture<MemberOptinResponse> optinMemberToCompetitionByRefId(X_API_KEY, spaceName, memberRefId, competitionId)

Opt in a member in a competition

Allows a member to opt-in into an existing Competition using an existing Member Id.  Use &#x60;/api/v1/:space/members/:memberId/competition/:competitionId/entrants&#x60; or &#x60;/api/v1/:space/members/reference/:memberRefId/competition/:competitionId/entrants&#x60;  API endpoint to determine if a Member is already Opted in to a Competition.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String competitionId = "adkjaflklafll"; // String | Id of a competition
        try {
            CompletableFuture<MemberOptinResponse> result = apiInstance.optinMemberToCompetitionByRefId(X_API_KEY, spaceName, memberRefId, competitionId);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#optinMemberToCompetitionByRefId");
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
 **competitionId** | **String**| Id of a competition |

### Return type

CompletableFuture<[**MemberOptinResponse**](MemberOptinResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member optin response |  -  |
| **400** | Competition does not require opt in or Competition has finished or member has already opted in |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or member with requested id not found. |  -  |

## optinMemberToCompetitionByRefIdWithHttpInfo

> CompletableFuture<ApiResponse<MemberOptinResponse>> optinMemberToCompetitionByRefId optinMemberToCompetitionByRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, competitionId)

Opt in a member in a competition

Allows a member to opt-in into an existing Competition using an existing Member Id.  Use &#x60;/api/v1/:space/members/:memberId/competition/:competitionId/entrants&#x60; or &#x60;/api/v1/:space/members/reference/:memberRefId/competition/:competitionId/entrants&#x60;  API endpoint to determine if a Member is already Opted in to a Competition.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.MemberCompetitionsApi;
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

        MemberCompetitionsApi apiInstance = new MemberCompetitionsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
        String competitionId = "adkjaflklafll"; // String | Id of a competition
        try {
            CompletableFuture<ApiResponse<MemberOptinResponse>> response = apiInstance.optinMemberToCompetitionByRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, competitionId);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling MemberCompetitionsApi#optinMemberToCompetitionByRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling MemberCompetitionsApi#optinMemberToCompetitionByRefId");
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
 **competitionId** | **String**| Id of a competition |

### Return type

CompletableFuture<ApiResponse<[**MemberOptinResponse**](MemberOptinResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Member optin response |  -  |
| **400** | Competition does not require opt in or Competition has finished or member has already opted in |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or member with requested id not found. |  -  |

