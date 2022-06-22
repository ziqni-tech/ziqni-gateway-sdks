# @ZiqniTechGatewayApiClient.CompetitionsApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompetitionById**](CompetitionsApi.md#getCompetitionById) | **GET** /api/v1/{spaceName}/competitions/{id} | Returns the competition by requested id
[**getCompetitions**](CompetitionsApi.md#getCompetitions) | **GET** /api/v1/{spaceName}/competitions | Returns a list of competitions



## getCompetitionById

> CompetitionByIdResponse getCompetitionById(X_API_KEY, spaceName, id, opts)

Returns the competition by requested id

Returns a competition with a list of all available contests and rewards for that competition.  This assumes that a competition and contests have first been created using the web console. Otherwise, no data is returned.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.CompetitionsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let id = geyhMXwBDhJLemKG3d8J; // String | Unique identifier of the resource
let opts = {
  'include': products, // String | Allows you to add the products and metadata objects to the response. Case sensitive
  'lang': es, // String | Allows you to preview the label, description and terms and conditions of the competition in a requested language. Case sensitive
  'uomKey': usd // String | Adding a `?_uomKey` will give you the value of rewards converted to the specific Units Of Measure multiplier Case sensitive * The unit of measure type of currency provided has to be the same as the rewards. Otherwise, the value will remain the same.  Usage syntax:  `?_uomKey=search_word`
};
apiInstance.getCompetitionById(X_API_KEY, spaceName, id, opts, (error, data, response) => {
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

[**CompetitionByIdResponse**](CompetitionByIdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getCompetitions

> CompetitionResponse getCompetitions(X_API_KEY, spaceName, opts)

Returns a list of competitions

Returns a simplified list of available Competitions for ALL.  The default behaviour of a response is that the competitions that are in Ready, Active or Finished state AND are eligible for ALL will be returned unless queried otherwise.  To return eligibility for specific groups you need to send an endpoint for options limitEntrantsTo (the value of \&quot;search_word\&quot; is the member group or multiple groups that you are searching for that is eligible to participate). This filter will check eligibility against 4 types of member group setup: 1. should - if a member part of this group then a competition will be returned 2. must - the competition with this group has to exist 3. must-not - groups that can not participate 4. ALL - by default if any competition is in ALL member group then it will be returned even if the filter is request for must, should or must-not  The response is competitions that are eligible to ALL + limitEntrantsTo  This assumes that competitions have first been created using the web console otherwise no data will be returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata will be 0.  GET responses can be filtered out based on the competition parameters to narrow down the results.  The denser the queryable URL the more precise the response will be.   Sort by fields is limited to: * created (DateTime of the competition creation) * label (the label of the competition) * scheduled start and end DateTime * actual start and end DateTime * status code that indicates the status of the competition  Example:  ?_sortByFields&#x3D;created  ?_sortByFields&#x3D;label  ?_sortByFields&#x3D;options.scheduledDates.start  ?_sortByFields&#x3D;options.scheduledDates.end  ?_sortByFields&#x3D;options.actualDates.start  ?_sortByFields&#x3D;options.actualDates.end  ?_sortByFields&#x3D;statusCode

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.CompetitionsApi();
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
  'optionsActualDatesEnd': "2021-10-01T00:00:00", // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.end=search_DateTime`
  'actualEnd': "2021-10-01T00:00:00", // String | Start and end time of when it actually ended  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualEnd=search_DateTime`
  'productsProductRefId': "my-first-product", // String | Search by products reference Id and products metadata. Case sensitive.  `?products.productRefId=search_word`
  'productRefId': "my-first-product", // String | Search by products reference Id and products metadata. Case sensitive.  `?productRefId=search_word`
  'optionsProductsMetadataKey': "my-first-meta-key", // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.key=search_word`
  'optionsProductsMetadataValue': "my-first-meta-value", // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.metadata.value=search_word`
  'optionsProductsProductRefId': "my-first-product", // String | Search by products reference Id and products metadata. Case sensitive.  `?options.products.productRefId=search_word`
  'status': Active, // String | The status of the competition. Case sensitive. Supported values - `Unknown` `Deleting` `Deleted` `Draft` `Template` `Preparing` `Ready` `Starting` `Active` `Finishing` `Finished` `Cancelling` `Cancelled`
  'statusCode': 5, // Number | The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled) 
  'optionsLimitEntrantsTo': "GB", // [String] | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?options.limitEntrantsTo=search_word`
  'limitEntrantsTo': "GB,SW", // [String] | The value is the member group that you are searching for that is eligible to participate. Case sensitive.  `?limitEntrantsTo=search_word`
  'optionsScheduledDatesStart': "2021-10-01T00:00:00", // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.start=search_DateTime`
  'scheduledStart': "2021-10-01T00:00:00", // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
  'optionsScheduledDatesEnd': "2021-10-01T00:00:00", // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.scheduledDates.end=search_DateTime`
  'scheduledEnd': "2021-10-01T00:00:00", // String | Start and end time of when it was scheduled  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?scheduledStart=search_DateTime`
  'optionsActualDatesStart': "2021-10-01T00:00:00", // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?options.actualDates.start=search_DateTime`
  'actualStart': "2021-10-01T00:00:00" // String | Start and end time of when it actually started  Supported DateTime patterns - * String = \"yyyy-MM-dd'T'HH:mm:ss.SSSZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss.SSS\" * String = \"yyyy-MM-dd'T'HH:mm:ssZ\" * String = \"yyyy-MM-dd'T'HH:mm:ss\" * String = \"yyyy-MM-dd'T'HH:mm\" * String = \"yyyy-MM-dd HH:mm:ss\" * String = \"yyyy-MM-dd HH:mm\" * String = \"yyyy/MM/dd HH:mm:ss\" * String = \"yyyy/MM/dd HH:mm\"  `?actualStart=search_DateTime`
};
apiInstance.getCompetitions(X_API_KEY, spaceName, opts, (error, data, response) => {
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
 **optionsActualDatesEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.end&#x3D;search_DateTime&#x60; | [optional] 
 **actualEnd** | **String**| Start and end time of when it actually ended  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualEnd&#x3D;search_DateTime&#x60; | [optional] 
 **productsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?products.productRefId&#x3D;search_word&#x60; | [optional] 
 **productRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?productRefId&#x3D;search_word&#x60; | [optional] 
 **optionsProductsMetadataKey** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.key&#x3D;search_word&#x60; | [optional] 
 **optionsProductsMetadataValue** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.metadata.value&#x3D;search_word&#x60; | [optional] 
 **optionsProductsProductRefId** | **String**| Search by products reference Id and products metadata. Case sensitive.  &#x60;?options.products.productRefId&#x3D;search_word&#x60; | [optional] 
 **status** | **String**| The status of the competition. Case sensitive. Supported values - &#x60;Unknown&#x60; &#x60;Deleting&#x60; &#x60;Deleted&#x60; &#x60;Draft&#x60; &#x60;Template&#x60; &#x60;Preparing&#x60; &#x60;Ready&#x60; &#x60;Starting&#x60; &#x60;Active&#x60; &#x60;Finishing&#x60; &#x60;Finished&#x60; &#x60;Cancelling&#x60; &#x60;Cancelled&#x60; | [optional] 
 **statusCode** | **Number**| The status code of the competition. Numbers only.  Supported values:  -3 (Unknown)  -2 (Deleting)  -1 (Deleted)  0 (Draft)  1 (Template)  2 (Preparing)  3 (Ready)  4 (Starting)  5 (Active)  6 (Finishing)  7 (Finished)  8 (Cancelling)  9 (Cancelled)  | [optional] 
 **optionsLimitEntrantsTo** | [**[String]**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?options.limitEntrantsTo&#x3D;search_word&#x60; | [optional] 
 **limitEntrantsTo** | [**[String]**](String.md)| The value is the member group that you are searching for that is eligible to participate. Case sensitive.  &#x60;?limitEntrantsTo&#x3D;search_word&#x60; | [optional] 
 **optionsScheduledDatesStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.start&#x3D;search_DateTime&#x60; | [optional] 
 **scheduledStart** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional] 
 **optionsScheduledDatesEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.scheduledDates.end&#x3D;search_DateTime&#x60; | [optional] 
 **scheduledEnd** | **String**| Start and end time of when it was scheduled  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?scheduledStart&#x3D;search_DateTime&#x60; | [optional] 
 **optionsActualDatesStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?options.actualDates.start&#x3D;search_DateTime&#x60; | [optional] 
 **actualStart** | **String**| Start and end time of when it actually started  Supported DateTime patterns - * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ssZ\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd&#39;T&#39;HH:mm\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy-MM-dd HH:mm\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm:ss\&quot; * String &#x3D; \&quot;yyyy/MM/dd HH:mm\&quot;  &#x60;?actualStart&#x3D;search_DateTime&#x60; | [optional] 

### Return type

[**CompetitionResponse**](CompetitionResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

