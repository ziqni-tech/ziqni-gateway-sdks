# @ZiqniTechGatewayApiClient.ContestsApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getContestById**](ContestsApi.md#getContestById) | **GET** /api/v1/{spaceName}/contests/{id} | Returns the contest by requested id
[**getContests**](ContestsApi.md#getContests) | **GET** /api/v1/{spaceName}/contests | Returns a list of contests
[**getLeaderboardByContestId**](ContestsApi.md#getLeaderboardByContestId) | **GET** /api/v1/{spaceName}/contests/{id}/leaderboard | Returns the leaderboard for a by contest id



## getContestById

> ContestByIdResponse getContestById(X_API_KEY, spaceName, id, opts)

Returns the contest by requested id

Returns a contest and rewards attached to it by request.  This assumes that a competition and contests have first been created using the web console. Otherwise no data is returned.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.ContestsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let id = geyhMXwBDhJLemKG3d8J; // String | Unique identifier of the resource
let opts = {
  'include': products, // String | Allows you to add the products and metadata objects to the response. Case sensitive
  'lang': es, // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
  'uomKey': usd // String | Adding a `?_uomKey` will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  `?_uomKey=search_word`
};
apiInstance.getContestById(X_API_KEY, spaceName, id, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
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

[**ContestByIdResponse**](ContestByIdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getContests

> ContestResponse getContests(X_API_KEY, spaceName, opts)

Returns a list of contests

Returns a simplified list of available Contests and rewards attached to it.  * The response of a contest is different than the competitions. While competitions give a response of only Ready, Active and Finished competitions states the contest gives all the contests that are in cancelled state as well.  This assumes that the competitions and contests have first been created using the web console otherwise no data will be returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata will be 0.  GET responses can be filtered out based on the contests parameters to narrow down the results.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.ContestsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let opts = {
  'id': geyhMXwBDhJLemKG3d8J, geYhMXwBDhJLemKG3d9J, // [String] | The unique identifiers of the resources
  'limit': 5, // Number | Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number.
  'skip': 10, // Number | Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  <url>?_limit=5&_skip=0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  `<url>?_limit=5&_skip=10`
  'sortByFields': transactionTimestamp:desc,created:asc, // String | Enables sorting of results based on fields and order specified.  Supported ordering  `asc, desc`   Usage syntax  `_sortByFields=<field-to-sort-on>:<order>`   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  `<url>?_sortByFields=transactionTimestamp:desc,created:asc`
  'include': products, // String | Allows you to add the products and metadata objects to the response. Case sensitive
  'lang': es, // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
  '': "_example", // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" or \"Active\" state that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status=Ready,Active&options.limitEntrantsTo=group1,group2`
  '2': "_example", // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \"Ready\" state only that have either a group1 or group2 entrant limitation  `<url>/competitions?_skip=0&_limit=100&status==Ready&options.limitEntrantsTo=group1,group2`
  '3': transactionTimestamp<=2016-02-09T17:38:08.328, // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<=2021-02-09T17:38:08.328`
  '4': "_example", // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp<==2021-02-09T17:38:08.328`
  '5': "_example", // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp=>2021-02-09T17:38:08.328`
  '6': "_example", // String | Single `=` sign usage will work as a `should/OR` action and `==` will work as a `must/AND` action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  `<url>events?transactionTimestamp==>2021-02-09T17:38:08.328`
  'uomKey': usd, // String | Adding a `?_uomKey` will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  `?_uomKey=search_word`
  'competitionId': kjlakdfljadfljlajfiop, // [String] | Competition id to query.  `?competitionId=<competition-id>`
  'number': 1, // Number | Contest number to query  `?number=<contest-number>`
  'round': 1, // Number | Contest round  `?round=<round-value>`
  'optionsNumberOfEntrantsMaximum': 1000, // Number | Filter results by maximum number of entrants  `?options.numberOfEntrants.maximum=search_number`
  'optionsNumberOfEntrantsMinimum': 10, // Number | Filter results by minimum number of entrants  `?options.numberOfEntrants.minimum=search_number`
  'optionsIsPublic': true, // Boolean | Whether the event is public or private  `?options.isPublic=<search-boolean>`
  'optionsAutoStart': true, // Boolean | Whether the event is enable for auto start or not  `?options.autoStart=search_boolean`
  'optionsAutoStop': true, // Boolean | Whether the event is enable for auto stop or not  `?options.autoStop=search_boolean`
  'optionsActualDatesEnd': "2021-10-01T00:00:00", // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.end=search_DateTime`
  'optionsScheduledDatesStart': "2021-10-01T00:00:00", // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.start=search_DateTime`
  'optionsScheduledDatesEnd': "2021-10-01T00:00:00", // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.end=search_DateTime`
  'optionsActualDatesStart': "2021-10-01T00:00:00", // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.start=search_DateTime`
  'optionsStrategiesRankingStrategyScoreDesc': true, // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.scoreDesc=search_boolean`
  'optionsStrategiesRankingStrategyTimeDesc': true, // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.scoreDesc=search_boolean`
  'optionsStrategiesRankingStrategyScoreFirst': true, // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.scoreFirst=search_boolean`
  'optionsStrategiesRankingStrategyIgnoreTime': true, // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.ignoreTime=search_boolean`
  'optionsStrategiesRankingStrategyIgnoreScore': true, // Boolean | Filter results by ranking strategies  `?options.strategies.rankingStrategy.ignoreScore=search_boolean`
  'optionsStrategiesScoringStrategyLimitUpdatesTo': 5, // Number | Filter results by scoring strategies  `?options.strategies.scoringStrategy.limitUpdatesTo=search_number`
  'optionsStrategiesScoringStrategySumBestXOf': 10.5, // Number | Filter results by scoring strategies  `?options.strategies.scoringStrategy.sumBestXOf=search_number`
  'optionsStrategiesScoringStrategyLastUpdateTimeStamp': 1633272371, // Number | Filter results by scoring strategies  `?options.strategies.scoringStrategy.lastUpdateTimeStamp=search_number`
  'optionsStrategiesScoringStrategyRecordTimeWhenSumReaches': 10, // Number | Filter results by scoring strategies  `?options.strategies.scoringStrategy.recordTimeWhenSumReaches=search_number`
  'optionsStrategiesStrategyType': SumBest, // String | The scoring strategy type Supported values - `TotalCumulative` `SumBest` `LimitedTo` `FirstTo`  `?options.strategies.strategyType=search_string`
  'created': 2018-08-23T14:23:09 // Date | Works with simple dates or date and time, eg:   `?created=<created-date>`
};
apiInstance.getContests(X_API_KEY, spaceName, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key | 
 **spaceName** | **String**| This is the space name which is linked to the account | 
 **id** | [**[String]**](String.md)| The unique identifiers of the resources | [optional] 
 **limit** | **Number**| Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number. | [optional] 
 **skip** | **Number**| Used for pagination. Setting the skip value will cause the system to return records from the specified position onwards.  EXAMPLE below returns the results for requested resource without skipping any records  &lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;0  EXAMPLE below returns the results for requested resource after skipping the first 10 records  &#x60;&lt;url&gt;?_limit&#x3D;5&amp;_skip&#x3D;10&#x60; | [optional] 
 **sortByFields** | **String**| Enables sorting of results based on fields and order specified.  Supported ordering  &#x60;asc, desc&#x60;   Usage syntax  &#x60;_sortByFields&#x3D;&lt;field-to-sort-on&gt;:&lt;order&gt;&#x60;   EXAMPLE The query will return data sorted by transactionTimestamp in descending order  &#x60;&lt;url&gt;?_sortByFields&#x3D;transactionTimestamp:desc,created:asc&#x60; | [optional] 
 **include** | **String**| Allows you to add the products and metadata objects to the response. Case sensitive | [optional] 
 **lang** | **String**| Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive | [optional] 
 **** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; or \&quot;Active\&quot; state that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;Ready,Active&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional] 
 **2** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  Single equals sign usage has two types of applications in formulating API queries - * assigning values to predefined/reserved parameters like _skip, _limit, _lang, _sortByFields, _uomKey, _include * assigning values to model based parameters (Example name, transactionTimestamp, options.limitEntrantsTo etc.)  EXAMPLE below returns all competitions in \&quot;Ready\&quot; state only that have either a group1 or group2 entrant limitation  &#x60;&lt;url&gt;/competitions?_skip&#x3D;0&amp;_limit&#x3D;100&amp;status&#x3D;&#x3D;Ready&amp;options.limitEntrantsTo&#x3D;group1,group2&#x60; | [optional] 
 **3** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which was uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional] 
 **4** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The less than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or less than the specified field value.  EXAMPLE below returns all the data which were uploaded before 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&lt;&#x3D;&#x3D;2021-02-09T17:38:08.328&#x60; | [optional] 
 **5** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional] 
 **6** | **String**| Single &#x60;&#x3D;&#x60; sign usage will work as a &#x60;should/OR&#x60; action and &#x60;&#x3D;&#x3D;&#x60; will work as a &#x60;must/AND&#x60; action  The greater than equal filter can be used on fields with a data type of integer, long, double, float, date, time or date-time. The filter will return all matching records that are equal to or greater than the specified field value.  EXAMPLE below returns all the data which were uploaded after 17:38 9th of February 2021 (defaults to 20 results).  &#x60;&lt;url&gt;events?transactionTimestamp&#x3D;&#x3D;&gt;2021-02-09T17:38:08.328&#x60; | [optional] 
 **uomKey** | **String**| Adding a &#x60;?_uomKey&#x60; will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  &#x60;?_uomKey&#x3D;search_word&#x60; | [optional] 
 **competitionId** | [**[String]**](String.md)| Competition id to query.  &#x60;?competitionId&#x3D;&lt;competition-id&gt;&#x60; | [optional] 
 **number** | **Number**| Contest number to query  &#x60;?number&#x3D;&lt;contest-number&gt;&#x60; | [optional] 
 **round** | **Number**| Contest round  &#x60;?round&#x3D;&lt;round-value&gt;&#x60; | [optional] 
 **optionsNumberOfEntrantsMaximum** | **Number**| Filter results by maximum number of entrants  &#x60;?options.numberOfEntrants.maximum&#x3D;search_number&#x60; | [optional] 
 **optionsNumberOfEntrantsMinimum** | **Number**| Filter results by minimum number of entrants  &#x60;?options.numberOfEntrants.minimum&#x3D;search_number&#x60; | [optional] 
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
 **optionsStrategiesScoringStrategyLimitUpdatesTo** | **Number**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.limitUpdatesTo&#x3D;search_number&#x60; | [optional] 
 **optionsStrategiesScoringStrategySumBestXOf** | **Number**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.sumBestXOf&#x3D;search_number&#x60; | [optional] 
 **optionsStrategiesScoringStrategyLastUpdateTimeStamp** | **Number**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.lastUpdateTimeStamp&#x3D;search_number&#x60; | [optional] 
 **optionsStrategiesScoringStrategyRecordTimeWhenSumReaches** | **Number**| Filter results by scoring strategies  &#x60;?options.strategies.scoringStrategy.recordTimeWhenSumReaches&#x3D;search_number&#x60; | [optional] 
 **optionsStrategiesStrategyType** | **String**| The scoring strategy type Supported values - &#x60;TotalCumulative&#x60; &#x60;SumBest&#x60; &#x60;LimitedTo&#x60; &#x60;FirstTo&#x60;  &#x60;?options.strategies.strategyType&#x3D;search_string&#x60; | [optional] 
 **created** | **Date**| Works with simple dates or date and time, eg:   &#x60;?created&#x3D;&lt;created-date&gt;&#x60; | [optional] 

### Return type

[**ContestResponse**](ContestResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getLeaderboardByContestId

> LeaderboardResponse getLeaderboardByContestId(X_API_KEY, spaceName, id, memberId, opts)

Returns the leaderboard for a by contest id

Leaderboards, also referred to as score board, give you aggregates of rank and points by member.  Leaderboards are calculated on a near real-time basis. The rate data is received by CompetitionLabs is directly proportional to the update of member positions on the leaderboard.  GET responses can be queried based on generic query parameters (_limit, memberId) to filter results appropriately.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.ContestsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let id = geyhMXwBDhJLemKG3d8J; // String | Unique identifier of the resource
let memberId = adkjaflklafll; // String | Member identifier. Can be a Member reference ID or a Ziqni Member ID  `The response will show the members with a limit of how much you have inserted and it will include the member that you are searching in the leaderboard`  `example - GET https://gateway.ziqni.com/api/v1/test_space/contests/TAHz-2wB9hDCDt3Z_ArD/leaderboard?_limit=100&memberId=tester-0sn4DmUBkPH_lz9GgxBM`  `means that 101 members are shown in the list and the member with the id is included in the list as the last member` `?memberId=search_word`
let opts = {
  'limit': 5 // Number | Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number.
};
apiInstance.getLeaderboardByContestId(X_API_KEY, spaceName, id, memberId, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **X_API_KEY** | **String**| Your unique API key | 
 **spaceName** | **String**| This is the space name which is linked to the account | 
 **id** | **String**| Unique identifier of the resource | 
 **memberId** | **String**| Member identifier. Can be a Member reference ID or a Ziqni Member ID  &#x60;The response will show the members with a limit of how much you have inserted and it will include the member that you are searching in the leaderboard&#x60;  &#x60;example - GET https://gateway.ziqni.com/api/v1/test_space/contests/TAHz-2wB9hDCDt3Z_ArD/leaderboard?_limit&#x3D;100&amp;memberId&#x3D;tester-0sn4DmUBkPH_lz9GgxBM&#x60;  &#x60;means that 101 members are shown in the list and the member with the id is included in the list as the last member&#x60; &#x60;?memberId&#x3D;search_word&#x60; | 
 **limit** | **Number**| Used for pagination. Setting the limit value will cause the system to limit the number of records returned to the specified number. | [optional] 

### Return type

[**LeaderboardResponse**](LeaderboardResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

