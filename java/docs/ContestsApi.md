# ContestsApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContestById**](ContestsApi.md#getContestById) | **GET** /api/v1/{spaceName}/contests/{id} | Returns the contest by requested id
[**getContestByIdWithHttpInfo**](ContestsApi.md#getContestByIdWithHttpInfo) | **GET** /api/v1/{spaceName}/contests/{id} | Returns the contest by requested id
[**getContests**](ContestsApi.md#getContests) | **GET** /api/v1/{spaceName}/contests | Returns a list of contests
[**getContestsWithHttpInfo**](ContestsApi.md#getContestsWithHttpInfo) | **GET** /api/v1/{spaceName}/contests | Returns a list of contests
[**getLeaderboardByContestId**](ContestsApi.md#getLeaderboardByContestId) | **GET** /api/v1/{spaceName}/contests/{id}/leaderboard | Returns the leaderboard for a by contest id
[**getLeaderboardByContestIdWithHttpInfo**](ContestsApi.md#getLeaderboardByContestIdWithHttpInfo) | **GET** /api/v1/{spaceName}/contests/{id}/leaderboard | Returns the leaderboard for a by contest id



## getContestById

> CompletableFuture<ContestByIdResponse> getContestById(X_API_KEY, spaceName, id, include, lang, uomKey)

Returns the contest by requested id

Returns a contest and rewards attached to it by request.  This assumes that a competition and contests have first been created using the web console. Otherwise no data is returned.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.ContestsApi;
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

        ContestsApi apiInstance = new ContestsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        String include = "products"; // String | Allows you to add the products and metadata objects to the response. Case sensitive
        String lang = "es"; // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
        String uomKey = "usd"; // String | Adding a `?_uomKey` will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  `?_uomKey=search_word`
        try {
            CompletableFuture<ContestByIdResponse> result = apiInstance.getContestById(X_API_KEY, spaceName, id, include, lang, uomKey);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContestsApi#getContestById");
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
 **include** | **String**| Allows you to add the products and metadata objects to the response. Case sensitive | [optional]
 **lang** | **String**| Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive | [optional]
 **uomKey** | **String**| Adding a &#x60;?_uomKey&#x60; will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  &#x60;?_uomKey&#x3D;search_word&#x60; | [optional]

### Return type

CompletableFuture<[**ContestByIdResponse**](ContestByIdResponse.md)>


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

## getContestByIdWithHttpInfo

> CompletableFuture<ApiResponse<ContestByIdResponse>> getContestById getContestByIdWithHttpInfo(X_API_KEY, spaceName, id, include, lang, uomKey)

Returns the contest by requested id

Returns a contest and rewards attached to it by request.  This assumes that a competition and contests have first been created using the web console. Otherwise no data is returned.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.ContestsApi;
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

        ContestsApi apiInstance = new ContestsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        String include = "products"; // String | Allows you to add the products and metadata objects to the response. Case sensitive
        String lang = "es"; // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
        String uomKey = "usd"; // String | Adding a `?_uomKey` will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  `?_uomKey=search_word`
        try {
            CompletableFuture<ApiResponse<ContestByIdResponse>> response = apiInstance.getContestByIdWithHttpInfo(X_API_KEY, spaceName, id, include, lang, uomKey);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContestsApi#getContestById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContestsApi#getContestById");
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
 **include** | **String**| Allows you to add the products and metadata objects to the response. Case sensitive | [optional]
 **lang** | **String**| Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive | [optional]
 **uomKey** | **String**| Adding a &#x60;?_uomKey&#x60; will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  &#x60;?_uomKey&#x3D;search_word&#x60; | [optional]

### Return type

CompletableFuture<ApiResponse<[**ContestByIdResponse**](ContestByIdResponse.md)>>


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


## getContests

> CompletableFuture<ContestResponse> getContests(X_API_KEY, spaceName, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, uomKey, competitionId, number, round, optionsNumberOfEntrantsMaximum, optionsNumberOfEntrantsMinimum, optionsIsPublic, optionsAutoStart, optionsAutoStop, optionsActualDatesEnd, optionsScheduledDatesStart, optionsScheduledDatesEnd, optionsActualDatesStart, optionsStrategiesRankingStrategyScoreDesc, optionsStrategiesRankingStrategyTimeDesc, optionsStrategiesRankingStrategyScoreFirst, optionsStrategiesRankingStrategyIgnoreTime, optionsStrategiesRankingStrategyIgnoreScore, optionsStrategiesScoringStrategyLimitUpdatesTo, optionsStrategiesScoringStrategySumBestXOf, optionsStrategiesScoringStrategyLastUpdateTimeStamp, optionsStrategiesScoringStrategyRecordTimeWhenSumReaches, optionsStrategiesStrategyType, created)

Returns a list of contests

Returns a simplified list of available Contests and rewards attached to it.  * The response of a contest is different than the competitions. While competitions give a response of only Ready, Active and Finished competitions states the contest gives all the contests that are in cancelled state as well.  This assumes that the competitions and contests have first been created using the web console otherwise no data will be returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata will be 0.  GET responses can be filtered out based on the contests parameters to narrow down the results.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.ContestsApi;
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

        ContestsApi apiInstance = new ContestsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
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
        String uomKey = "usd"; // String | Adding a `?_uomKey` will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  `?_uomKey=search_word`
        List<String> competitionId = Arrays.asList(); // List<String> | Competition id to query.  `?competitionId=<competition-id>`
        Integer number = 1; // Integer | Contest number to query  `?number=<contest-number>`
        Integer round = 1; // Integer | Contest round  `?round=<round-value>`
        Integer optionsNumberOfEntrantsMaximum = 1000; // Integer | Filter results by maximum number of entrants  `?options.numberOfEntrants.maximum=search_number`
        Integer optionsNumberOfEntrantsMinimum = 10; // Integer | Filter results by minimum number of entrants  `?options.numberOfEntrants.minimum=search_number`
        Boolean optionsIsPublic = true; // Boolean | Whether the event is public or private  `?options.isPublic=<search-boolean>`
        Boolean optionsAutoStart = true; // Boolean | Whether the event is enable for auto start or not  `?options.autoStart=search_boolean`
        Boolean optionsAutoStop = true; // Boolean | Whether the event is enable for auto stop or not  `?options.autoStop=search_boolean`
        String optionsActualDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.end=search_DateTime`
        String optionsScheduledDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.start=search_DateTime`
        String optionsScheduledDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.end=search_DateTime`
        String optionsActualDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.start=search_DateTime`
        Boolean optionsStrategiesRankingStrategyScoreDesc = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.scoreDesc=search_boolean`
        Boolean optionsStrategiesRankingStrategyTimeDesc = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.scoreDesc=search_boolean`
        Boolean optionsStrategiesRankingStrategyScoreFirst = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.scoreFirst=search_boolean`
        Boolean optionsStrategiesRankingStrategyIgnoreTime = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.ignoreTime=search_boolean`
        Boolean optionsStrategiesRankingStrategyIgnoreScore = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.ignoreScore=search_boolean`
        Integer optionsStrategiesScoringStrategyLimitUpdatesTo = 5; // Integer | Filter results by scoring strategies  `?options.strategies.scoringStrategy.limitUpdatesTo=search_number`
        Double optionsStrategiesScoringStrategySumBestXOf = 10.5D; // Double | Filter results by scoring strategies  `?options.strategies.scoringStrategy.sumBestXOf=search_number`
        Long optionsStrategiesScoringStrategyLastUpdateTimeStamp = 1633272371L; // Long | Filter results by scoring strategies  `?options.strategies.scoringStrategy.lastUpdateTimeStamp=search_number`
        Long optionsStrategiesScoringStrategyRecordTimeWhenSumReaches = 10L; // Long | Filter results by scoring strategies  `?options.strategies.scoringStrategy.recordTimeWhenSumReaches=search_number`
        String optionsStrategiesStrategyType = "SumBest"; // String | The scoring strategy type Supported values - `TotalCumulative` `SumBest` `LimitedTo` `FirstTo`  `?options.strategies.strategyType=search_string`
        OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | Works with simple dates or date and time, eg:   `?created=<created-date>`
        try {
            CompletableFuture<ContestResponse> result = apiInstance.getContests(X_API_KEY, spaceName, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, uomKey, competitionId, number, round, optionsNumberOfEntrantsMaximum, optionsNumberOfEntrantsMinimum, optionsIsPublic, optionsAutoStart, optionsAutoStop, optionsActualDatesEnd, optionsScheduledDatesStart, optionsScheduledDatesEnd, optionsActualDatesStart, optionsStrategiesRankingStrategyScoreDesc, optionsStrategiesRankingStrategyTimeDesc, optionsStrategiesRankingStrategyScoreFirst, optionsStrategiesRankingStrategyIgnoreTime, optionsStrategiesRankingStrategyIgnoreScore, optionsStrategiesScoringStrategyLimitUpdatesTo, optionsStrategiesScoringStrategySumBestXOf, optionsStrategiesScoringStrategyLastUpdateTimeStamp, optionsStrategiesScoringStrategyRecordTimeWhenSumReaches, optionsStrategiesStrategyType, created);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContestsApi#getContests");
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
 **uomKey** | **String**| Adding a &#x60;?_uomKey&#x60; will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  &#x60;?_uomKey&#x3D;search_word&#x60; | [optional]
 **competitionId** | [**List&lt;String&gt;**](String.md)| Competition id to query.  &#x60;?competitionId&#x3D;&lt;competition-id&gt;&#x60; | [optional]
 **number** | **Integer**| Contest number to query  &#x60;?number&#x3D;&lt;contest-number&gt;&#x60; | [optional]
 **round** | **Integer**| Contest round  &#x60;?round&#x3D;&lt;round-value&gt;&#x60; | [optional]
 **optionsNumberOfEntrantsMaximum** | **Integer**| Filter results by maximum number of entrants  &#x60;?options.numberOfEntrants.maximum&#x3D;search_number&#x60; | [optional]
 **optionsNumberOfEntrantsMinimum** | **Integer**| Filter results by minimum number of entrants  &#x60;?options.numberOfEntrants.minimum&#x3D;search_number&#x60; | [optional]
 **optionsIsPublic** | **Boolean**| Whether the event is public or private  &#x60;?options.isPublic&#x3D;&lt;search-boolean&gt;&#x60; | [optional]
 **optionsAutoStart** | **Boolean**| Whether the event is enable for auto start or not  &#x60;?options.autoStart&#x3D;search_boolean&#x60; | [optional]
 **optionsAutoStop** | **Boolean**| Whether the event is enable for auto stop or not  &#x60;?options.autoStop&#x3D;search_boolean&#x60; | [optional]
 **optionsActualDatesEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.end&#x3D;search_DateTime&#x60; | [optional]
 **optionsScheduledDatesStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.start&#x3D;search_DateTime&#x60; | [optional]
 **optionsScheduledDatesEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.end&#x3D;search_DateTime&#x60; | [optional]
 **optionsActualDatesStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.start&#x3D;search_DateTime&#x60; | [optional]
 **optionsStrategiesRankingStrategyScoreDesc** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.scoreDesc&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesRankingStrategyTimeDesc** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.scoreDesc&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesRankingStrategyScoreFirst** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.scoreFirst&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesRankingStrategyIgnoreTime** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.ignoreTime&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesRankingStrategyIgnoreScore** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.ignoreScore&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesScoringStrategyLimitUpdatesTo** | **Integer**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.limitUpdatesTo&#x3D;search_number&#x60; | [optional]
 **optionsStrategiesScoringStrategySumBestXOf** | **Double**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.sumBestXOf&#x3D;search_number&#x60; | [optional]
 **optionsStrategiesScoringStrategyLastUpdateTimeStamp** | **Long**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.lastUpdateTimeStamp&#x3D;search_number&#x60; | [optional]
 **optionsStrategiesScoringStrategyRecordTimeWhenSumReaches** | **Long**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.recordTimeWhenSumReaches&#x3D;search_number&#x60; | [optional]
 **optionsStrategiesStrategyType** | **String**| The scoring strategy type Supported values - &#x60;TotalCumulative&#x60; &#x60;SumBest&#x60; &#x60;LimitedTo&#x60; &#x60;FirstTo&#x60;  &#x60;?options.strategies.strategyType&#x3D;search_string&#x60; | [optional]
 **created** | **OffsetDateTime**| Works with simple dates or date and time, eg:   &#x60;?created&#x3D;&lt;created-date&gt;&#x60; | [optional]

### Return type

CompletableFuture<[**ContestResponse**](ContestResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of contest |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or request URL is incorrect. |  -  |

## getContestsWithHttpInfo

> CompletableFuture<ApiResponse<ContestResponse>> getContests getContestsWithHttpInfo(X_API_KEY, spaceName, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, uomKey, competitionId, number, round, optionsNumberOfEntrantsMaximum, optionsNumberOfEntrantsMinimum, optionsIsPublic, optionsAutoStart, optionsAutoStop, optionsActualDatesEnd, optionsScheduledDatesStart, optionsScheduledDatesEnd, optionsActualDatesStart, optionsStrategiesRankingStrategyScoreDesc, optionsStrategiesRankingStrategyTimeDesc, optionsStrategiesRankingStrategyScoreFirst, optionsStrategiesRankingStrategyIgnoreTime, optionsStrategiesRankingStrategyIgnoreScore, optionsStrategiesScoringStrategyLimitUpdatesTo, optionsStrategiesScoringStrategySumBestXOf, optionsStrategiesScoringStrategyLastUpdateTimeStamp, optionsStrategiesScoringStrategyRecordTimeWhenSumReaches, optionsStrategiesStrategyType, created)

Returns a list of contests

Returns a simplified list of available Contests and rewards attached to it.  * The response of a contest is different than the competitions. While competitions give a response of only Ready, Active and Finished competitions states the contest gives all the contests that are in cancelled state as well.  This assumes that the competitions and contests have first been created using the web console otherwise no data will be returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata will be 0.  GET responses can be filtered out based on the contests parameters to narrow down the results.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.ContestsApi;
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

        ContestsApi apiInstance = new ContestsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
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
        String uomKey = "usd"; // String | Adding a `?_uomKey` will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  `?_uomKey=search_word`
        List<String> competitionId = Arrays.asList(); // List<String> | Competition id to query.  `?competitionId=<competition-id>`
        Integer number = 1; // Integer | Contest number to query  `?number=<contest-number>`
        Integer round = 1; // Integer | Contest round  `?round=<round-value>`
        Integer optionsNumberOfEntrantsMaximum = 1000; // Integer | Filter results by maximum number of entrants  `?options.numberOfEntrants.maximum=search_number`
        Integer optionsNumberOfEntrantsMinimum = 10; // Integer | Filter results by minimum number of entrants  `?options.numberOfEntrants.minimum=search_number`
        Boolean optionsIsPublic = true; // Boolean | Whether the event is public or private  `?options.isPublic=<search-boolean>`
        Boolean optionsAutoStart = true; // Boolean | Whether the event is enable for auto start or not  `?options.autoStart=search_boolean`
        Boolean optionsAutoStop = true; // Boolean | Whether the event is enable for auto stop or not  `?options.autoStop=search_boolean`
        String optionsActualDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.end=search_DateTime`
        String optionsScheduledDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.start=search_DateTime`
        String optionsScheduledDatesEnd = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.end=search_DateTime`
        String optionsActualDatesStart = "\"2021-10-01T00:00:00\""; // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.start=search_DateTime`
        Boolean optionsStrategiesRankingStrategyScoreDesc = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.scoreDesc=search_boolean`
        Boolean optionsStrategiesRankingStrategyTimeDesc = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.scoreDesc=search_boolean`
        Boolean optionsStrategiesRankingStrategyScoreFirst = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.scoreFirst=search_boolean`
        Boolean optionsStrategiesRankingStrategyIgnoreTime = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.ignoreTime=search_boolean`
        Boolean optionsStrategiesRankingStrategyIgnoreScore = true; // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.ignoreScore=search_boolean`
        Integer optionsStrategiesScoringStrategyLimitUpdatesTo = 5; // Integer | Filter results by scoring strategies  `?options.strategies.scoringStrategy.limitUpdatesTo=search_number`
        Double optionsStrategiesScoringStrategySumBestXOf = 10.5D; // Double | Filter results by scoring strategies  `?options.strategies.scoringStrategy.sumBestXOf=search_number`
        Long optionsStrategiesScoringStrategyLastUpdateTimeStamp = 1633272371L; // Long | Filter results by scoring strategies  `?options.strategies.scoringStrategy.lastUpdateTimeStamp=search_number`
        Long optionsStrategiesScoringStrategyRecordTimeWhenSumReaches = 10L; // Long | Filter results by scoring strategies  `?options.strategies.scoringStrategy.recordTimeWhenSumReaches=search_number`
        String optionsStrategiesStrategyType = "SumBest"; // String | The scoring strategy type Supported values - `TotalCumulative` `SumBest` `LimitedTo` `FirstTo`  `?options.strategies.strategyType=search_string`
        OffsetDateTime created = OffsetDateTime.now(); // OffsetDateTime | Works with simple dates or date and time, eg:   `?created=<created-date>`
        try {
            CompletableFuture<ApiResponse<ContestResponse>> response = apiInstance.getContestsWithHttpInfo(X_API_KEY, spaceName, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, uomKey, competitionId, number, round, optionsNumberOfEntrantsMaximum, optionsNumberOfEntrantsMinimum, optionsIsPublic, optionsAutoStart, optionsAutoStop, optionsActualDatesEnd, optionsScheduledDatesStart, optionsScheduledDatesEnd, optionsActualDatesStart, optionsStrategiesRankingStrategyScoreDesc, optionsStrategiesRankingStrategyTimeDesc, optionsStrategiesRankingStrategyScoreFirst, optionsStrategiesRankingStrategyIgnoreTime, optionsStrategiesRankingStrategyIgnoreScore, optionsStrategiesScoringStrategyLimitUpdatesTo, optionsStrategiesScoringStrategySumBestXOf, optionsStrategiesScoringStrategyLastUpdateTimeStamp, optionsStrategiesScoringStrategyRecordTimeWhenSumReaches, optionsStrategiesStrategyType, created);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContestsApi#getContests");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContestsApi#getContests");
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
 **uomKey** | **String**| Adding a &#x60;?_uomKey&#x60; will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  &#x60;?_uomKey&#x3D;search_word&#x60; | [optional]
 **competitionId** | [**List&lt;String&gt;**](String.md)| Competition id to query.  &#x60;?competitionId&#x3D;&lt;competition-id&gt;&#x60; | [optional]
 **number** | **Integer**| Contest number to query  &#x60;?number&#x3D;&lt;contest-number&gt;&#x60; | [optional]
 **round** | **Integer**| Contest round  &#x60;?round&#x3D;&lt;round-value&gt;&#x60; | [optional]
 **optionsNumberOfEntrantsMaximum** | **Integer**| Filter results by maximum number of entrants  &#x60;?options.numberOfEntrants.maximum&#x3D;search_number&#x60; | [optional]
 **optionsNumberOfEntrantsMinimum** | **Integer**| Filter results by minimum number of entrants  &#x60;?options.numberOfEntrants.minimum&#x3D;search_number&#x60; | [optional]
 **optionsIsPublic** | **Boolean**| Whether the event is public or private  &#x60;?options.isPublic&#x3D;&lt;search-boolean&gt;&#x60; | [optional]
 **optionsAutoStart** | **Boolean**| Whether the event is enable for auto start or not  &#x60;?options.autoStart&#x3D;search_boolean&#x60; | [optional]
 **optionsAutoStop** | **Boolean**| Whether the event is enable for auto stop or not  &#x60;?options.autoStop&#x3D;search_boolean&#x60; | [optional]
 **optionsActualDatesEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.end&#x3D;search_DateTime&#x60; | [optional]
 **optionsScheduledDatesStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.start&#x3D;search_DateTime&#x60; | [optional]
 **optionsScheduledDatesEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.end&#x3D;search_DateTime&#x60; | [optional]
 **optionsActualDatesStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.start&#x3D;search_DateTime&#x60; | [optional]
 **optionsStrategiesRankingStrategyScoreDesc** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.scoreDesc&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesRankingStrategyTimeDesc** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.scoreDesc&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesRankingStrategyScoreFirst** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.scoreFirst&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesRankingStrategyIgnoreTime** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.ignoreTime&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesRankingStrategyIgnoreScore** | **Boolean**| Filter results by ranking strategies  &#x60;?options.strategies.rankingStrategy.ignoreScore&#x3D;search_boolean&#x60; | [optional]
 **optionsStrategiesScoringStrategyLimitUpdatesTo** | **Integer**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.limitUpdatesTo&#x3D;search_number&#x60; | [optional]
 **optionsStrategiesScoringStrategySumBestXOf** | **Double**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.sumBestXOf&#x3D;search_number&#x60; | [optional]
 **optionsStrategiesScoringStrategyLastUpdateTimeStamp** | **Long**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.lastUpdateTimeStamp&#x3D;search_number&#x60; | [optional]
 **optionsStrategiesScoringStrategyRecordTimeWhenSumReaches** | **Long**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.recordTimeWhenSumReaches&#x3D;search_number&#x60; | [optional]
 **optionsStrategiesStrategyType** | **String**| The scoring strategy type Supported values - &#x60;TotalCumulative&#x60; &#x60;SumBest&#x60; &#x60;LimitedTo&#x60; &#x60;FirstTo&#x60;  &#x60;?options.strategies.strategyType&#x3D;search_string&#x60; | [optional]
 **created** | **OffsetDateTime**| Works with simple dates or date and time, eg:   &#x60;?created&#x3D;&lt;created-date&gt;&#x60; | [optional]

### Return type

CompletableFuture<ApiResponse<[**ContestResponse**](ContestResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of contest |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect or request URL is incorrect. |  -  |


## getLeaderboardByContestId

> CompletableFuture<LeaderboardResponse> getLeaderboardByContestId(X_API_KEY, spaceName, id, memberId, limit)

Returns the leaderboard for a by contest id

Leaderboards, also referred to as score board, give you aggregates of rank and points by member.  Leaderboards are calculated on a near real-time basis. The rate data is received by CompetitionLabs is directly proportional to the update of member positions on the leaderboard.  GET responses can be queried based on generic query parameters (_limit, memberId) to filter results appropriately.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.ContestsApi;
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

        ContestsApi apiInstance = new ContestsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        String memberId = "adkjaflklafll"; // String | Member identifier. Can be a Member reference ID or a Ziqni Member ID  `The response will show the members with a limit of how much you have inserted and it will include the member that you are searching in the leaderboard`  `example - GET https://gateway.ziqni.com/api/v1/test_space/contests/TAHz-2wB9hDCDt3Z_ArD/leaderboard?_limit=100&memberId=tester-0sn4DmUBkPH_lz9GgxBM`  `means that 101 members are shown in the list and the member with the id is included in the list as the last member` `?memberId=search_word`
        Integer limit = 5; // Integer | Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number.
        try {
            CompletableFuture<LeaderboardResponse> result = apiInstance.getLeaderboardByContestId(X_API_KEY, spaceName, id, memberId, limit);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling ContestsApi#getLeaderboardByContestId");
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
 **memberId** | **String**| Member identifier. Can be a Member reference ID or a Ziqni Member ID  &#x60;The response will show the members with a limit of how much you have inserted and it will include the member that you are searching in the leaderboard&#x60;  &#x60;example - GET https://gateway.ziqni.com/api/v1/test_space/contests/TAHz-2wB9hDCDt3Z_ArD/leaderboard?_limit&#x3D;100&amp;memberId&#x3D;tester-0sn4DmUBkPH_lz9GgxBM&#x60;  &#x60;means that 101 members are shown in the list and the member with the id is included in the list as the last member&#x60; &#x60;?memberId&#x3D;search_word&#x60; |
 **limit** | **Integer**| Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number. | [optional]

### Return type

CompletableFuture<[**LeaderboardResponse**](LeaderboardResponse.md)>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Leaderboard entries |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |

## getLeaderboardByContestIdWithHttpInfo

> CompletableFuture<ApiResponse<LeaderboardResponse>> getLeaderboardByContestId getLeaderboardByContestIdWithHttpInfo(X_API_KEY, spaceName, id, memberId, limit)

Returns the leaderboard for a by contest id

Leaderboards, also referred to as score board, give you aggregates of rank and points by member.  Leaderboards are calculated on a near real-time basis. The rate data is received by CompetitionLabs is directly proportional to the update of member positions on the leaderboard.  GET responses can be queried based on generic query parameters (_limit, memberId) to filter results appropriately.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.ContestsApi;
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

        ContestsApi apiInstance = new ContestsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        String memberId = "adkjaflklafll"; // String | Member identifier. Can be a Member reference ID or a Ziqni Member ID  `The response will show the members with a limit of how much you have inserted and it will include the member that you are searching in the leaderboard`  `example - GET https://gateway.ziqni.com/api/v1/test_space/contests/TAHz-2wB9hDCDt3Z_ArD/leaderboard?_limit=100&memberId=tester-0sn4DmUBkPH_lz9GgxBM`  `means that 101 members are shown in the list and the member with the id is included in the list as the last member` `?memberId=search_word`
        Integer limit = 5; // Integer | Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number.
        try {
            CompletableFuture<ApiResponse<LeaderboardResponse>> response = apiInstance.getLeaderboardByContestIdWithHttpInfo(X_API_KEY, spaceName, id, memberId, limit);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling ContestsApi#getLeaderboardByContestId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling ContestsApi#getLeaderboardByContestId");
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
 **memberId** | **String**| Member identifier. Can be a Member reference ID or a Ziqni Member ID  &#x60;The response will show the members with a limit of how much you have inserted and it will include the member that you are searching in the leaderboard&#x60;  &#x60;example - GET https://gateway.ziqni.com/api/v1/test_space/contests/TAHz-2wB9hDCDt3Z_ArD/leaderboard?_limit&#x3D;100&amp;memberId&#x3D;tester-0sn4DmUBkPH_lz9GgxBM&#x60;  &#x60;means that 101 members are shown in the list and the member with the id is included in the list as the last member&#x60; &#x60;?memberId&#x3D;search_word&#x60; |
 **limit** | **Integer**| Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number. | [optional]

### Return type

CompletableFuture<ApiResponse<[**LeaderboardResponse**](LeaderboardResponse.md)>>


### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Leaderboard entries |  -  |
| **401** | The X-API-KEY is missing |  -  |
| **404** | The X-API-KEY or space name is incorrect. |  -  |

