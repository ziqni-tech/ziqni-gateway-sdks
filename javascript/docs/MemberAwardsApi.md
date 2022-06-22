# @ZiqniTechGatewayApiClient.MemberAwardsApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**claimAwardByIdAndMemberId**](MemberAwardsApi.md#claimAwardByIdAndMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/award/{awardId}/award | Claim a specific award for a member
[**claimAwardByIdAndMemberRefId**](MemberAwardsApi.md#claimAwardByIdAndMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/award/{awardId}/award | Claim a specific award for a member
[**getAwardByIdAndMemberId**](MemberAwardsApi.md#getAwardByIdAndMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/award/{awardId} | Returns specific award for a member
[**getAwardByIdAndMemberRefId**](MemberAwardsApi.md#getAwardByIdAndMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/award/{awardId} | Returns specific award for a member



## claimAwardByIdAndMemberId

> MemberAwardByIdResponse claimAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId)

Claim a specific award for a member

Claims an Award for a given Member ID. This is only applicable when an award needs to be claimed.  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL 

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAwardsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberId = adkjaflklafll; // String | Id of a Member
let awardId = adkjaflklafll; // String | Id of the award
apiInstance.claimAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId, (error, data, response) => {
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
 **awardId** | **String**| Id of the award | 

### Return type

[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## claimAwardByIdAndMemberRefId

> MemberAwardByIdResponse claimAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId)

Claim a specific award for a member

Claims an Award for a given Member ID. This is only applicable when an award needs to be claimed.  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL 

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAwardsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberRefId = adkjaflklafll; // String | Reference Id of a Member
let awardId = adkjaflklafll; // String | Id of the award
apiInstance.claimAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId, (error, data, response) => {
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
 **awardId** | **String**| Id of the award | 

### Return type

[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAwardByIdAndMemberId

> MemberAwardByIdResponse getAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId)

Returns specific award for a member

Returns the an award for a given member ID  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAwardsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberId = adkjaflklafll; // String | Id of a Member
let awardId = adkjaflklafll; // String | Id of the award
apiInstance.getAwardByIdAndMemberId(X_API_KEY, spaceName, memberId, awardId, (error, data, response) => {
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
 **awardId** | **String**| Id of the award | 

### Return type

[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getAwardByIdAndMemberRefId

> MemberAwardByIdResponse getAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId)

Returns specific award for a member

Returns the an award for a given member ID  You can retrieve an award id using GET Messages public API endpoint and querying the &#x60;prize&#x60;.  EXAMPLE  &#x60;GET /api/v1/:space/members/:memberId/messages?prize.memberId&#x3D;:memberId&#x60;  The response prize id is the awardId that is needed for the Request URL

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberAwardsApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberRefId = adkjaflklafll; // String | Reference Id of a Member
let awardId = adkjaflklafll; // String | Id of the award
apiInstance.getAwardByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, awardId, (error, data, response) => {
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
 **awardId** | **String**| Id of the award | 

### Return type

[**MemberAwardByIdResponse**](MemberAwardByIdResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

