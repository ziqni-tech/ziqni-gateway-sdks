# AchievementsApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAchievements**](AchievementsApi.md#getAchievements) | **GET** /api/v1/{spaceName}/achievements | Returns a list of achievements
[**getAchievementsWithHttpInfo**](AchievementsApi.md#getAchievementsWithHttpInfo) | **GET** /api/v1/{spaceName}/achievements | Returns a list of achievements
[**getAchievementsById**](AchievementsApi.md#getAchievementsById) | **GET** /api/v1/{spaceName}/achievements/{id} | Returns an achievement by id
[**getAchievementsByIdWithHttpInfo**](AchievementsApi.md#getAchievementsByIdWithHttpInfo) | **GET** /api/v1/{spaceName}/achievements/{id} | Returns an achievement by id
[**getMemberAchievements**](AchievementsApi.md#getMemberAchievements) | **GET** /api/v1/{spaceName}/achievements/members/{memberId} | Returns a list of achievements for a specific member
[**getMemberAchievementsWithHttpInfo**](AchievementsApi.md#getMemberAchievementsWithHttpInfo) | **GET** /api/v1/{spaceName}/achievements/members/{memberId} | Returns a list of achievements for a specific member
[**getMemberAchievementsByRefId**](AchievementsApi.md#getMemberAchievementsByRefId) | **GET** /api/v1/{spaceName}/achievements/members/reference/{memberRefId} | Returns a list of achievements by member ref id
[**getMemberAchievementsByRefIdWithHttpInfo**](AchievementsApi.md#getMemberAchievementsByRefIdWithHttpInfo) | **GET** /api/v1/{spaceName}/achievements/members/reference/{memberRefId} | Returns a list of achievements by member ref id



## getAchievements

> CompletableFuture<AchievementResponse> getAchievements(X_API_KEY, spaceName, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState)

Returns a list of achievements

Returns a simplified list of available Achievements.  This assumes that achievements have first been created using the web console. Otherwise no data is returned and the value of the \&quot;totalRecordsFound\&quot; variable in the metadata section of the response is 0.  GET responses can be filtered out based on the achievement parameters to narrow down the results.  &#x60;Requesting a list of Achievements a response will show Achievements that are in Live state and/or Expired.&#x60;   &#x60;Achievements that are in Draft state or Deprecated - will not be displayed.&#x60;   Include query parameter options are:  &#x60;?_include&#x3D;ruleSets&#x60; &#x60;?_include&#x3D;dependantOn&#x60; &#x60;?_include&#x3D;products&#x60; &#x60;?_include&#x3D;metadata&#x60; &#x60;?_include&#x3D;rewards&#x60;  or multiple at the same time: &#x60;?_include&#x3D;products,metadata,ruleSets,dependantOn,rewards&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.AchievementsApi;
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

        AchievementsApi apiInstance = new AchievementsApi(defaultClient);
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
        Boolean deprecated = false; // Boolean | Is the achievement active or deprecated  `?deprecated=search_boolean`
        String achievementLiveStatus = "Live"; // String | Is the achievement in Live or Draft status  Supported values:  `Live` `Draft`  `?achievementLiveStatus=search_string`
        Integer initialState = 1; // Integer | Is the hidden or visible   Supported Values:   `1` and `0`   `?initialState=search_integer`
        try {
            CompletableFuture<AchievementResponse> result = apiInstance.getAchievements(X_API_KEY, spaceName, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AchievementsApi#getAchievements");
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
 **deprecated** | **Boolean**| Is the achievement active or deprecated  &#x60;?deprecated&#x3D;search_boolean&#x60; | [optional]
 **achievementLiveStatus** | **String**| Is the achievement in Live or Draft status  Supported values:  &#x60;Live&#x60; &#x60;Draft&#x60;  &#x60;?achievementLiveStatus&#x3D;search_string&#x60; | [optional]
 **initialState** | **Integer**| Is the hidden or visible   Supported Values:   &#x60;1&#x60; and &#x60;0&#x60;   &#x60;?initialState&#x3D;search_integer&#x60; | [optional]

### Return type

CompletableFuture<[**AchievementResponse**](AchievementResponse.md)>


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

## getAchievementsWithHttpInfo

> CompletableFuture<ApiResponse<AchievementResponse>> getAchievements getAchievementsWithHttpInfo(X_API_KEY, spaceName, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState)

Returns a list of achievements

Returns a simplified list of available Achievements.  This assumes that achievements have first been created using the web console. Otherwise no data is returned and the value of the \&quot;totalRecordsFound\&quot; variable in the metadata section of the response is 0.  GET responses can be filtered out based on the achievement parameters to narrow down the results.  &#x60;Requesting a list of Achievements a response will show Achievements that are in Live state and/or Expired.&#x60;   &#x60;Achievements that are in Draft state or Deprecated - will not be displayed.&#x60;   Include query parameter options are:  &#x60;?_include&#x3D;ruleSets&#x60; &#x60;?_include&#x3D;dependantOn&#x60; &#x60;?_include&#x3D;products&#x60; &#x60;?_include&#x3D;metadata&#x60; &#x60;?_include&#x3D;rewards&#x60;  or multiple at the same time: &#x60;?_include&#x3D;products,metadata,ruleSets,dependantOn,rewards&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.AchievementsApi;
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

        AchievementsApi apiInstance = new AchievementsApi(defaultClient);
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
        Boolean deprecated = false; // Boolean | Is the achievement active or deprecated  `?deprecated=search_boolean`
        String achievementLiveStatus = "Live"; // String | Is the achievement in Live or Draft status  Supported values:  `Live` `Draft`  `?achievementLiveStatus=search_string`
        Integer initialState = 1; // Integer | Is the hidden or visible   Supported Values:   `1` and `0`   `?initialState=search_integer`
        try {
            CompletableFuture<ApiResponse<AchievementResponse>> response = apiInstance.getAchievementsWithHttpInfo(X_API_KEY, spaceName, id, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AchievementsApi#getAchievements");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AchievementsApi#getAchievements");
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
 **deprecated** | **Boolean**| Is the achievement active or deprecated  &#x60;?deprecated&#x3D;search_boolean&#x60; | [optional]
 **achievementLiveStatus** | **String**| Is the achievement in Live or Draft status  Supported values:  &#x60;Live&#x60; &#x60;Draft&#x60;  &#x60;?achievementLiveStatus&#x3D;search_string&#x60; | [optional]
 **initialState** | **Integer**| Is the hidden or visible   Supported Values:   &#x60;1&#x60; and &#x60;0&#x60;   &#x60;?initialState&#x3D;search_integer&#x60; | [optional]

### Return type

CompletableFuture<ApiResponse<[**AchievementResponse**](AchievementResponse.md)>>


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


## getAchievementsById

> CompletableFuture<AchievementByIdResponse> getAchievementsById(X_API_KEY, spaceName, id, include, lang)

Returns an achievement by id

Returns public facing achievement information for the specified achievement identifier. The response object can be expanded depending on the query include parameter.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.AchievementsApi;
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

        AchievementsApi apiInstance = new AchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        String include = "products"; // String | Allows you to add the products and metadata objects to the response. Case sensitive
        String lang = "es"; // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
        try {
            CompletableFuture<AchievementByIdResponse> result = apiInstance.getAchievementsById(X_API_KEY, spaceName, id, include, lang);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AchievementsApi#getAchievementsById");
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

### Return type

CompletableFuture<[**AchievementByIdResponse**](AchievementByIdResponse.md)>


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
| **404** | The X-API-KEY or space name is incorrect. |  -  |

## getAchievementsByIdWithHttpInfo

> CompletableFuture<ApiResponse<AchievementByIdResponse>> getAchievementsById getAchievementsByIdWithHttpInfo(X_API_KEY, spaceName, id, include, lang)

Returns an achievement by id

Returns public facing achievement information for the specified achievement identifier. The response object can be expanded depending on the query include parameter.

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.AchievementsApi;
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

        AchievementsApi apiInstance = new AchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String id = "geyhMXwBDhJLemKG3d8J"; // String | Unique identifier of the resource
        String include = "products"; // String | Allows you to add the products and metadata objects to the response. Case sensitive
        String lang = "es"; // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
        try {
            CompletableFuture<ApiResponse<AchievementByIdResponse>> response = apiInstance.getAchievementsByIdWithHttpInfo(X_API_KEY, spaceName, id, include, lang);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AchievementsApi#getAchievementsById");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AchievementsApi#getAchievementsById");
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

### Return type

CompletableFuture<ApiResponse<[**AchievementByIdResponse**](AchievementByIdResponse.md)>>


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
| **404** | The X-API-KEY or space name is incorrect. |  -  |


## getMemberAchievements

> CompletableFuture<AchievementResponse> getMemberAchievements(X_API_KEY, spaceName, memberId, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState)

Returns a list of achievements for a specific member

Returns a simplified list of available Achievements.  This assumes that achievements have first been created using the web console. Otherwise no data is returned and the value of the \&quot;totalRecordsFound\&quot; variable in the metadata section of the response is 0.  GET responses can be filtered out based on the achievement parameters to narrow down the results.  &#x60;Requesting a list of Achievements a response will show Achievements that are in Live state and/or Expired.&#x60;   &#x60;Achievements that are in Draft state or Deprecated - will not be displayed.&#x60;   Include query parameter options are:  &#x60;?_include&#x3D;ruleSets&#x60; &#x60;?_include&#x3D;dependantOn&#x60; &#x60;?_include&#x3D;products&#x60; &#x60;?_include&#x3D;metadata&#x60; &#x60;?_include&#x3D;rewards&#x60;  or multiple at the same time: &#x60;?_include&#x3D;products,metadata,ruleSets,dependantOn,rewards&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.AchievementsApi;
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

        AchievementsApi apiInstance = new AchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
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
        Boolean deprecated = false; // Boolean | Is the achievement active or deprecated  `?deprecated=search_boolean`
        String achievementLiveStatus = "Live"; // String | Is the achievement in Live or Draft status  Supported values:  `Live` `Draft`  `?achievementLiveStatus=search_string`
        Integer initialState = 1; // Integer | Is the hidden or visible   Supported Values:   `1` and `0`   `?initialState=search_integer`
        try {
            CompletableFuture<AchievementResponse> result = apiInstance.getMemberAchievements(X_API_KEY, spaceName, memberId, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AchievementsApi#getMemberAchievements");
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
 **deprecated** | **Boolean**| Is the achievement active or deprecated  &#x60;?deprecated&#x3D;search_boolean&#x60; | [optional]
 **achievementLiveStatus** | **String**| Is the achievement in Live or Draft status  Supported values:  &#x60;Live&#x60; &#x60;Draft&#x60;  &#x60;?achievementLiveStatus&#x3D;search_string&#x60; | [optional]
 **initialState** | **Integer**| Is the hidden or visible   Supported Values:   &#x60;1&#x60; and &#x60;0&#x60;   &#x60;?initialState&#x3D;search_integer&#x60; | [optional]

### Return type

CompletableFuture<[**AchievementResponse**](AchievementResponse.md)>


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

## getMemberAchievementsWithHttpInfo

> CompletableFuture<ApiResponse<AchievementResponse>> getMemberAchievements getMemberAchievementsWithHttpInfo(X_API_KEY, spaceName, memberId, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState)

Returns a list of achievements for a specific member

Returns a simplified list of available Achievements.  This assumes that achievements have first been created using the web console. Otherwise no data is returned and the value of the \&quot;totalRecordsFound\&quot; variable in the metadata section of the response is 0.  GET responses can be filtered out based on the achievement parameters to narrow down the results.  &#x60;Requesting a list of Achievements a response will show Achievements that are in Live state and/or Expired.&#x60;   &#x60;Achievements that are in Draft state or Deprecated - will not be displayed.&#x60;   Include query parameter options are:  &#x60;?_include&#x3D;ruleSets&#x60; &#x60;?_include&#x3D;dependantOn&#x60; &#x60;?_include&#x3D;products&#x60; &#x60;?_include&#x3D;metadata&#x60; &#x60;?_include&#x3D;rewards&#x60;  or multiple at the same time: &#x60;?_include&#x3D;products,metadata,ruleSets,dependantOn,rewards&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.AchievementsApi;
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

        AchievementsApi apiInstance = new AchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberId = "adkjaflklafll"; // String | Id of a Member
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
        Boolean deprecated = false; // Boolean | Is the achievement active or deprecated  `?deprecated=search_boolean`
        String achievementLiveStatus = "Live"; // String | Is the achievement in Live or Draft status  Supported values:  `Live` `Draft`  `?achievementLiveStatus=search_string`
        Integer initialState = 1; // Integer | Is the hidden or visible   Supported Values:   `1` and `0`   `?initialState=search_integer`
        try {
            CompletableFuture<ApiResponse<AchievementResponse>> response = apiInstance.getMemberAchievementsWithHttpInfo(X_API_KEY, spaceName, memberId, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AchievementsApi#getMemberAchievements");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AchievementsApi#getMemberAchievements");
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
 **deprecated** | **Boolean**| Is the achievement active or deprecated  &#x60;?deprecated&#x3D;search_boolean&#x60; | [optional]
 **achievementLiveStatus** | **String**| Is the achievement in Live or Draft status  Supported values:  &#x60;Live&#x60; &#x60;Draft&#x60;  &#x60;?achievementLiveStatus&#x3D;search_string&#x60; | [optional]
 **initialState** | **Integer**| Is the hidden or visible   Supported Values:   &#x60;1&#x60; and &#x60;0&#x60;   &#x60;?initialState&#x3D;search_integer&#x60; | [optional]

### Return type

CompletableFuture<ApiResponse<[**AchievementResponse**](AchievementResponse.md)>>


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


## getMemberAchievementsByRefId

> CompletableFuture<AchievementResponse> getMemberAchievementsByRefId(X_API_KEY, spaceName, memberRefId, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState)

Returns a list of achievements by member ref id

Returns a simplified list of available Achievements.  This assumes that achievements have first been created using the web console. Otherwise no data is returned and the value of the \&quot;totalRecordsFound\&quot; variable in the metadata section of the response is 0.  GET responses can be filtered out based on the achievement parameters to narrow down the results.  &#x60;Requesting a list of Achievements a response will show Achievements that are in Live state and/or Expired.&#x60;   &#x60;Achievements that are in Draft state or Deprecated - will not be displayed.&#x60;   Include query parameter options are:  &#x60;?_include&#x3D;ruleSets&#x60; &#x60;?_include&#x3D;dependantOn&#x60; &#x60;?_include&#x3D;products&#x60; &#x60;?_include&#x3D;metadata&#x60; &#x60;?_include&#x3D;rewards&#x60;  or multiple at the same time: &#x60;?_include&#x3D;products,metadata,ruleSets,dependantOn,rewards&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.AchievementsApi;
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

        AchievementsApi apiInstance = new AchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
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
        Boolean deprecated = false; // Boolean | Is the achievement active or deprecated  `?deprecated=search_boolean`
        String achievementLiveStatus = "Live"; // String | Is the achievement in Live or Draft status  Supported values:  `Live` `Draft`  `?achievementLiveStatus=search_string`
        Integer initialState = 1; // Integer | Is the hidden or visible   Supported Values:   `1` and `0`   `?initialState=search_integer`
        try {
            CompletableFuture<AchievementResponse> result = apiInstance.getMemberAchievementsByRefId(X_API_KEY, spaceName, memberRefId, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState);
            System.out.println(result.get());
        } catch (ApiException e) {
            System.err.println("Exception when calling AchievementsApi#getMemberAchievementsByRefId");
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
 **deprecated** | **Boolean**| Is the achievement active or deprecated  &#x60;?deprecated&#x3D;search_boolean&#x60; | [optional]
 **achievementLiveStatus** | **String**| Is the achievement in Live or Draft status  Supported values:  &#x60;Live&#x60; &#x60;Draft&#x60;  &#x60;?achievementLiveStatus&#x3D;search_string&#x60; | [optional]
 **initialState** | **Integer**| Is the hidden or visible   Supported Values:   &#x60;1&#x60; and &#x60;0&#x60;   &#x60;?initialState&#x3D;search_integer&#x60; | [optional]

### Return type

CompletableFuture<[**AchievementResponse**](AchievementResponse.md)>


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

## getMemberAchievementsByRefIdWithHttpInfo

> CompletableFuture<ApiResponse<AchievementResponse>> getMemberAchievementsByRefId getMemberAchievementsByRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState)

Returns a list of achievements by member ref id

Returns a simplified list of available Achievements.  This assumes that achievements have first been created using the web console. Otherwise no data is returned and the value of the \&quot;totalRecordsFound\&quot; variable in the metadata section of the response is 0.  GET responses can be filtered out based on the achievement parameters to narrow down the results.  &#x60;Requesting a list of Achievements a response will show Achievements that are in Live state and/or Expired.&#x60;   &#x60;Achievements that are in Draft state or Deprecated - will not be displayed.&#x60;   Include query parameter options are:  &#x60;?_include&#x3D;ruleSets&#x60; &#x60;?_include&#x3D;dependantOn&#x60; &#x60;?_include&#x3D;products&#x60; &#x60;?_include&#x3D;metadata&#x60; &#x60;?_include&#x3D;rewards&#x60;  or multiple at the same time: &#x60;?_include&#x3D;products,metadata,ruleSets,dependantOn,rewards&#x60;

### Example

```java
// Import classes:
import com.ziqni.gateway.client.ApiClient;
import com.ziqni.gateway.client.ApiException;
import com.ziqni.gateway.client.ApiResponse;
import com.ziqni.gateway.client.Configuration;
import com.ziqni.gateway.client.auth.*;
import com.ziqni.gateway.client.models.*;
import com.ziqni.gateway.client.api.AchievementsApi;
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

        AchievementsApi apiInstance = new AchievementsApi(defaultClient);
        String X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
        String spaceName = "myFirstSpace"; // String | This is the space name which is linked to the account
        String memberRefId = "adkjaflklafll"; // String | Reference Id of a Member
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
        Boolean deprecated = false; // Boolean | Is the achievement active or deprecated  `?deprecated=search_boolean`
        String achievementLiveStatus = "Live"; // String | Is the achievement in Live or Draft status  Supported values:  `Live` `Draft`  `?achievementLiveStatus=search_string`
        Integer initialState = 1; // Integer | Is the hidden or visible   Supported Values:   `1` and `0`   `?initialState=search_integer`
        try {
            CompletableFuture<ApiResponse<AchievementResponse>> response = apiInstance.getMemberAchievementsByRefIdWithHttpInfo(X_API_KEY, spaceName, memberRefId, limit, skip, sortByFields, include, lang, equal, equalEqual, lessThanEqual, lessThanEqualEqual, equalGreaterThan, equalEqualGreaterThan, deprecated, achievementLiveStatus, initialState);
            System.out.println("Status code: " + response.get().getStatusCode());
            System.out.println("Response headers: " + response.get().getHeaders());
            System.out.println("Response body: " + response.get().getData());
        } catch (InterruptedException | ExecutionException e) {
            ApiException apiException = (ApiException)e.getCause();
            System.err.println("Exception when calling AchievementsApi#getMemberAchievementsByRefId");
            System.err.println("Status code: " + apiException.getCode());
            System.err.println("Response headers: " + apiException.getResponseHeaders());
            System.err.println("Reason: " + apiException.getResponseBody());
            e.printStackTrace();
        } catch (ApiException e) {
            System.err.println("Exception when calling AchievementsApi#getMemberAchievementsByRefId");
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
 **deprecated** | **Boolean**| Is the achievement active or deprecated  &#x60;?deprecated&#x3D;search_boolean&#x60; | [optional]
 **achievementLiveStatus** | **String**| Is the achievement in Live or Draft status  Supported values:  &#x60;Live&#x60; &#x60;Draft&#x60;  &#x60;?achievementLiveStatus&#x3D;search_string&#x60; | [optional]
 **initialState** | **Integer**| Is the hidden or visible   Supported Values:   &#x60;1&#x60; and &#x60;0&#x60;   &#x60;?initialState&#x3D;search_integer&#x60; | [optional]

### Return type

CompletableFuture<ApiResponse<[**AchievementResponse**](AchievementResponse.md)>>


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

