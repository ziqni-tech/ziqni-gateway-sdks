# @ZiqniTechGatewayApiClient.SseApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**subscribeSseChannelByMemberId**](SseApi.md#subscribeSseChannelByMemberId) | **GET** /api/v1/{spaceName}/sse/{memberId} | Subscribe to SSE channel
[**subscribeSseChannelByMemberRefId**](SseApi.md#subscribeSseChannelByMemberRefId) | **GET** /api/v1/{spaceName}/sse/reference/{memberRefId} | Subscribe to SSE channel
[**subscribeSseChannelHeartbeatByMemberId**](SseApi.md#subscribeSseChannelHeartbeatByMemberId) | **GET** /api/v1/{spaceName}/sse/{memberId}/heartbeat | Subscribe to SSE channel
[**subscribeSseChannelHeartbeatByMemberRefId**](SseApi.md#subscribeSseChannelHeartbeatByMemberRefId) | **GET** /api/v1/{spaceName}/sse/reference/{memberRefId}/heartbeat | Subscribe to SSE channel



## subscribeSseChannelByMemberId

> SseMemberMessage subscribeSseChannelByMemberId(X_API_KEY, spaceName, memberId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member id.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.SseApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberId = adkjaflklafll; // String | Id of a Member
apiInstance.subscribeSseChannelByMemberId(X_API_KEY, spaceName, memberId, (error, data, response) => {
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

[**SseMemberMessage**](SseMemberMessage.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## subscribeSseChannelByMemberRefId

> SseMemberMessage subscribeSseChannelByMemberRefId(X_API_KEY, spaceName, memberRefId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member ref id.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.SseApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberRefId = adkjaflklafll; // String | Reference Id of a Member
apiInstance.subscribeSseChannelByMemberRefId(X_API_KEY, spaceName, memberRefId, (error, data, response) => {
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

[**SseMemberMessage**](SseMemberMessage.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## subscribeSseChannelHeartbeatByMemberId

> SseMemberMessage subscribeSseChannelHeartbeatByMemberId(X_API_KEY, spaceName, memberId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member id.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.SseApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberId = adkjaflklafll; // String | Id of a Member
apiInstance.subscribeSseChannelHeartbeatByMemberId(X_API_KEY, spaceName, memberId, (error, data, response) => {
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

[**SseMemberMessage**](SseMemberMessage.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## subscribeSseChannelHeartbeatByMemberRefId

> SseMemberMessage subscribeSseChannelHeartbeatByMemberRefId(X_API_KEY, spaceName, memberRefId)

Subscribe to SSE channel

Establishes an SSE channel for a specific member id.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.SseApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberRefId = adkjaflklafll; // String | Reference Id of a Member
apiInstance.subscribeSseChannelHeartbeatByMemberRefId(X_API_KEY, spaceName, memberRefId, (error, data, response) => {
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

[**SseMemberMessage**](SseMemberMessage.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

