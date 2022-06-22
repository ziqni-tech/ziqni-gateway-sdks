# @ZiqniTechGatewayApiClient.MemberAchievementsApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAchievementByIdAndMemberId**](MemberAchievementsApi.md#getAchievementByIdAndMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/achievements/{achievementId} | Returns specific achievement for a member
[**getAchievementByIdAndMemberRefId**](MemberAchievementsApi.md#getAchievementByIdAndMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/achievements/{achievementId} | Returns specific achievement for a member
[**getAchievementsByMemberId**](MemberAchievementsApi.md#getAchievementsByMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/achievements | Returns achievements for a member
[**getAchievementsByMemberRefId**](MemberAchievementsApi.md#getAchievementsByMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/achievements | Returns achievements for a member
[**getIssuedAchievementsByMemberId**](MemberAchievementsApi.md#getIssuedAchievementsByMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/achievements/issued | Returns achievements issued for a member
[**getIssuedAchievementsByMemberRefId**](MemberAchievementsApi.md#getIssuedAchievementsByMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/achievements/issued | Returns achievements issued for a member



## getAchievementByIdAndMemberId

> MemberAchievementResponse getAchievementByIdAndMemberId(X_API_KEY, spaceName, memberId, achievementId)

Returns specific achievement for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.  

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAchievementsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberId = adkjaflklafll; // String | Id of a Member
let achievementId = adkjaflklafll; // String | Id of an achievement
apiInstance.getAchievementByIdAndMemberId(X_API_KEY, spaceName, memberId, achievementId, (error, data, response) => {
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
 **memberId** | **String**| Id of a Member | 
 **achievementId** | **String**| Id of an achievement | 

### Return type

[**MemberAchievementResponse**](MemberAchievementResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAchievementByIdAndMemberRefId

> MemberAchievementResponse getAchievementByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, achievementId)

Returns specific achievement for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.  

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAchievementsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberRefId = adkjaflklafll; // String | Reference Id of a Member
let achievementId = adkjaflklafll; // String | Id of an achievement
apiInstance.getAchievementByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, achievementId, (error, data, response) => {
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
 **memberRefId** | **String**| Reference Id of a Member | 
 **achievementId** | **String**| Id of an achievement | 

### Return type

[**MemberAchievementResponse**](MemberAchievementResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAchievementsByMemberId

> MemberAchievementResponse getAchievementsByMemberId(X_API_KEY, spaceName, memberId, opts)

Returns achievements for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAchievementsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberId = adkjaflklafll; // String | Id of a Member
let opts = {
  'id': geyhMXwBDhJLemKG3d8J, geYhMXwBDhJLemKG3d9J // [String] | The unique identifiers of the resources
};
apiInstance.getAchievementsByMemberId(X_API_KEY, spaceName, memberId, opts, (error, data, response) => {
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
 **memberId** | **String**| Id of a Member | 
 **id** | [**[String]**](String.md)| The unique identifiers of the resources | [optional] 

### Return type

[**MemberAchievementResponse**](MemberAchievementResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAchievementsByMemberRefId

> MemberAchievementResponse getAchievementsByMemberRefId(X_API_KEY, spaceName, memberRefId, opts)

Returns achievements for a member

Returns a progression list of achieved percentages based on the configured achievements rules for a specified member.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAchievementsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberRefId = adkjaflklafll; // String | Reference Id of a Member
let opts = {
  'id': geyhMXwBDhJLemKG3d8J, geYhMXwBDhJLemKG3d9J // [String] | The unique identifiers of the resources
};
apiInstance.getAchievementsByMemberRefId(X_API_KEY, spaceName, memberRefId, opts, (error, data, response) => {
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
 **memberRefId** | **String**| Reference Id of a Member | 
 **id** | [**[String]**](String.md)| The unique identifiers of the resources | [optional] 

### Return type

[**MemberAchievementResponse**](MemberAchievementResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getIssuedAchievementsByMemberId

> AchievementIssuedResponse getIssuedAchievementsByMemberId(X_API_KEY, spaceName, memberId)

Returns achievements issued for a member

Returns an aggregated list of achieved achievement IDs for a specified member with a count that indicates the amount of times this achievement was issued for the specified memerId.  If there is no achievement data inside the events stream for a specified user no data returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata is 0.  &#x60;All the achievements, including deprecated/archived ones, that were issued to the member are displayed.&#x60;

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAchievementsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberId = adkjaflklafll; // String | Id of a Member
apiInstance.getIssuedAchievementsByMemberId(X_API_KEY, spaceName, memberId, (error, data, response) => {
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
 **memberId** | **String**| Id of a Member | 

### Return type

[**AchievementIssuedResponse**](AchievementIssuedResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getIssuedAchievementsByMemberRefId

> AchievementIssuedResponse getIssuedAchievementsByMemberRefId(X_API_KEY, spaceName, memberRefId)

Returns achievements issued for a member

Returns an aggregated list of achieved achievement IDs for a specified member with a count that indicates the amount of times this achievement was issued for the specified memerId.  If there is no achievement data inside the events stream for a specified user no data returned and the value of the \&quot;totalRecordsFound\&quot; variable in metadata is 0.  &#x60;All the achievements, including deprecated/archived ones, that were issued to the member are displayed.&#x60;

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAchievementsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberRefId = adkjaflklafll; // String | Reference Id of a Member
apiInstance.getIssuedAchievementsByMemberRefId(X_API_KEY, spaceName, memberRefId, (error, data, response) => {
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
 **memberRefId** | **String**| Reference Id of a Member | 

### Return type

[**AchievementIssuedResponse**](AchievementIssuedResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

