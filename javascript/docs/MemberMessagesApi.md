# @ZiqniTechGatewayApiClient.MemberMessagesApi

All URIs are relative to *https://gateway.ziqni.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMessageByIdAndMemberId**](MemberMessagesApi.md#getMessageByIdAndMemberId) | **GET** /api/v1/{spaceName}/members/{memberId}/messages/{id} | Returns messages for a member by requested id
[**getMessageByIdAndMemberRefId**](MemberMessagesApi.md#getMessageByIdAndMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/messages/{id} | Returns messages for a member by requested id
[**getMessagesByMemberId**](MemberMessagesApi.md#getMessagesByMemberId) | **GET** /api/v1/{spaceName}/members/{id}/messages | Returns messages for a member by requested id
[**getMessagesByMemberRefId**](MemberMessagesApi.md#getMessagesByMemberRefId) | **GET** /api/v1/{spaceName}/members/reference/{memberRefId}/messages/ | Returns messages for a member by requested reference id



## getMessageByIdAndMemberId

> MemberMessageResponse getMessageByIdAndMemberId(X_API_KEY, spaceName, memberId, id)

Returns messages for a member by requested id

Returns member message details for the member and message ID specified. When a message with a status of New is accessed by this endpoint then the status of the message becomes Read automatically.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberMessagesApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberId = adkjaflklafll; // String | Id of a Member
let id = geyhMXwBDhJLemKG3d8J; // String | Unique identifier of the resource
apiInstance.getMessageByIdAndMemberId(X_API_KEY, spaceName, memberId, id, (error, data, response) => {
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
 **id** | **String**| Unique identifier of the resource | 

### Return type

[**MemberMessageResponse**](MemberMessageResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMessageByIdAndMemberRefId

> MemberMessageResponse getMessageByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, id)

Returns messages for a member by requested id

Returns member message details for the member and message ID specified. When a message with a status of New is accessed by this endpoint then the status of the message becomes Read automatically.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberMessagesApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberRefId = adkjaflklafll; // String | Reference Id of a Member
let id = geyhMXwBDhJLemKG3d8J; // String | Unique identifier of the resource
apiInstance.getMessageByIdAndMemberRefId(X_API_KEY, spaceName, memberRefId, id, (error, data, response) => {
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
 **id** | **String**| Unique identifier of the resource | 

### Return type

[**MemberMessageResponse**](MemberMessageResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMessagesByMemberId

> MemberMessageResponse getMessagesByMemberId(X_API_KEY, spaceName, opts)

Returns messages for a member by requested id

Returns a list of available messages for the specified memberId.  GET responses can be filtered out based on the member messages parameters to narrow down the results.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberMessagesApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let opts = {
  'id': geyhMXwBDhJLemKG3d8J, geYhMXwBDhJLemKG3d9J, // [String] | The unique identifiers of the resources
  'eventRefType': ContestType, // String | Defines an event type attached to the message. Case sensitive Supported values - `CompetitionType` `ContestType` `AchievementType`  `?eventRefType=search_string`
  'eventReferenceId': dfadadfadfafaf, // String | The reference ID of the event object. Case sensitive   `?eventReferenceId=search_string`
  'messageType': SumBest, // String | The type of message of the member. Case sensitive Supported values - `Notification` `Achievement` `Reward`  `?messageType=search_string`
  'subject': my first subject, // String | The title of the message. Case sensitive  `?subject=search_string`
  'prizeRewardEntityType': Contest, // String | Can be achievement or contest. Case sensitive Supported values - `Achievement` `Contest`  `?prize.reward.entityType=search_string`
  'prizeRewardEntityId': gsgsggwtwsdvdfadf, // String | Achievement id or Contest id. Case sensitive   `?prize.reward.entityId=search_string`
  'prizeRewardRewardRank': 1, // String | If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  `?prize.reward.rewardRank=search_string`
  'prizeRewardValue': 1.2, // Number | Numerical value of the reward that will be issued based on the reward type  `?prize.reward.value=search_double`
  'prizeRewardRewardType': reward-type-id, // String | Reward type id   `?prize.reward.rewardType=search_string`
  'prizeRewardDelay': 1, // Number | Delay of issuing a reward in minutes   `?prize.reward.delay=search_integer`
  'prizeRewardMemberAcknowledgmentRequired': false, // Boolean | To claim a reward   `?prize.reward.memberAcknowledgmentRequired=search_boolean`
  'prizeRewardMetadataKey': reward-metadata-key, // String | Search by reward metadata key.   `?prize.reward.metadata.key=search_word`
  'prizeRewardMetadataValue': reward-metadata-value, // String | Search by reward metadata value.   `?prize.reward.metadata.value=search_word`
  'prizeRewardCreated': 2018-08-23T14:23:09, // Date | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.reward.created=search_datetime`
  'prizeRewardId': wrwtsdrvxfnjuuu4133, // String | Search by reward id. Case sensitive   `?prize.reward.id=search_string`
  'prizeClaimed': false, // Boolean | Has the award been claimed or not.   `?prize.claimed=search_boolean`
  'prizeEntityType': Contest, // String | The type of entity this Award relates to. Case sensitive   Supported values -   `Contest` `Achievement`   `?prize.entityType=search_word`
  'prizeEntityId': wrwtsdrvxfnjuuu4133, // String | The Id of the contest or achievement related to this Award. Case sensitive   `?prize.entityId=search_string`
  'prizeCreated': 2018-08-23T14:23:09, // Date | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.created=search_datetime`
  'prizeId': wrwtsdrvxfnjuuu4133, // String | Award id. Case sensitive   `?prize.id=search_word`
  'status': Read, // String | The status of the message. Case sensitive  Supported values - `New` `Read` `CollaborationRequest` `Actioned` `Claimed` `Expired` `Canceled` `Deprecated`   `?status=search_string`
  'created': 2018-08-23T14:23:09, // Date | Works with simple dates or date and time, eg:   `?created=<created-date>`
  'metadataKey': "my-first-meta-key", // String | Search by metadata key. Case sensitive.  `?metadata.key=search_word`
  'metadataValue': "my-first-meta-value" // String | Search by metadata value. Case sensitive.  `?metadata.value=search_word`
};
apiInstance.getMessagesByMemberId(X_API_KEY, spaceName, opts, (error, data, response) => {
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
 **eventRefType** | **String**| Defines an event type attached to the message. Case sensitive Supported values - &#x60;CompetitionType&#x60; &#x60;ContestType&#x60; &#x60;AchievementType&#x60;  &#x60;?eventRefType&#x3D;search_string&#x60; | [optional] 
 **eventReferenceId** | **String**| The reference ID of the event object. Case sensitive   &#x60;?eventReferenceId&#x3D;search_string&#x60; | [optional] 
 **messageType** | **String**| The type of message of the member. Case sensitive Supported values - &#x60;Notification&#x60; &#x60;Achievement&#x60; &#x60;Reward&#x60;  &#x60;?messageType&#x3D;search_string&#x60; | [optional] 
 **subject** | **String**| The title of the message. Case sensitive  &#x60;?subject&#x3D;search_string&#x60; | [optional] 
 **prizeRewardEntityType** | **String**| Can be achievement or contest. Case sensitive Supported values - &#x60;Achievement&#x60; &#x60;Contest&#x60;  &#x60;?prize.reward.entityType&#x3D;search_string&#x60; | [optional] 
 **prizeRewardEntityId** | **String**| Achievement id or Contest id. Case sensitive   &#x60;?prize.reward.entityId&#x3D;search_string&#x60; | [optional] 
 **prizeRewardRewardRank** | **String**| If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  &#x60;?prize.reward.rewardRank&#x3D;search_string&#x60; | [optional] 
 **prizeRewardValue** | **Number**| Numerical value of the reward that will be issued based on the reward type  &#x60;?prize.reward.value&#x3D;search_double&#x60; | [optional] 
 **prizeRewardRewardType** | **String**| Reward type id   &#x60;?prize.reward.rewardType&#x3D;search_string&#x60; | [optional] 
 **prizeRewardDelay** | **Number**| Delay of issuing a reward in minutes   &#x60;?prize.reward.delay&#x3D;search_integer&#x60; | [optional] 
 **prizeRewardMemberAcknowledgmentRequired** | **Boolean**| To claim a reward   &#x60;?prize.reward.memberAcknowledgmentRequired&#x3D;search_boolean&#x60; | [optional] 
 **prizeRewardMetadataKey** | **String**| Search by reward metadata key.   &#x60;?prize.reward.metadata.key&#x3D;search_word&#x60; | [optional] 
 **prizeRewardMetadataValue** | **String**| Search by reward metadata value.   &#x60;?prize.reward.metadata.value&#x3D;search_word&#x60; | [optional] 
 **prizeRewardCreated** | **Date**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.reward.created&#x3D;search_datetime&#x60; | [optional] 
 **prizeRewardId** | **String**| Search by reward id. Case sensitive   &#x60;?prize.reward.id&#x3D;search_string&#x60; | [optional] 
 **prizeClaimed** | **Boolean**| Has the award been claimed or not.   &#x60;?prize.claimed&#x3D;search_boolean&#x60; | [optional] 
 **prizeEntityType** | **String**| The type of entity this Award relates to. Case sensitive   Supported values -   &#x60;Contest&#x60; &#x60;Achievement&#x60;   &#x60;?prize.entityType&#x3D;search_word&#x60; | [optional] 
 **prizeEntityId** | **String**| The Id of the contest or achievement related to this Award. Case sensitive   &#x60;?prize.entityId&#x3D;search_string&#x60; | [optional] 
 **prizeCreated** | **Date**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.created&#x3D;search_datetime&#x60; | [optional] 
 **prizeId** | **String**| Award id. Case sensitive   &#x60;?prize.id&#x3D;search_word&#x60; | [optional] 
 **status** | **String**| The status of the message. Case sensitive  Supported values - &#x60;New&#x60; &#x60;Read&#x60; &#x60;CollaborationRequest&#x60; &#x60;Actioned&#x60; &#x60;Claimed&#x60; &#x60;Expired&#x60; &#x60;Canceled&#x60; &#x60;Deprecated&#x60;   &#x60;?status&#x3D;search_string&#x60; | [optional] 
 **created** | **Date**| Works with simple dates or date and time, eg:   &#x60;?created&#x3D;&lt;created-date&gt;&#x60; | [optional] 
 **metadataKey** | **String**| Search by metadata key. Case sensitive.  &#x60;?metadata.key&#x3D;search_word&#x60; | [optional] 
 **metadataValue** | **String**| Search by metadata value. Case sensitive.  &#x60;?metadata.value&#x3D;search_word&#x60; | [optional] 

### Return type

[**MemberMessageResponse**](MemberMessageResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMessagesByMemberRefId

> MemberMessageResponse getMessagesByMemberRefId(X_API_KEY, spaceName, memberRefId, opts)

Returns messages for a member by requested reference id

Returns a list of available messages for the specified member Reference ID.  GET responses can be filtered out based on the member messages parameters to narrow down the results.

### Example

```javascript
import @ZiqniTechGatewayApiClient from '@ziqni-tech/gateway-api-client';
let defaultClient = @ZiqniTechGatewayApiClient.ApiClient.instance;
// Configure API key authorization: apiKey
let apiKey = defaultClient.authentications['apiKey'];
apiKey.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//apiKey.apiKeyPrefix = 'Token';

let apiInstance = new @ZiqniTechGatewayApiClient.MemberMessagesApi();
let X_API_KEY = "X_API_KEY_example"; // String | Your unique API key
let spaceName = myFirstSpace; // String | This is the space name which is linked to the account
let memberRefId = adkjaflklafll; // String | Reference Id of a Member
let opts = {
  'eventRefType': ContestType, // String | Defines an event type attached to the message. Case sensitive Supported values - `CompetitionType` `ContestType` `AchievementType`  `?eventRefType=search_string`
  'eventReferenceId': dfadadfadfafaf, // String | The reference ID of the event object. Case sensitive   `?eventReferenceId=search_string`
  'messageType': SumBest, // String | The type of message of the member. Case sensitive Supported values - `Notification` `Achievement` `Reward`  `?messageType=search_string`
  'subject': my first subject, // String | The title of the message. Case sensitive  `?subject=search_string`
  'prizeRewardEntityType': Contest, // String | Can be achievement or contest. Case sensitive Supported values - `Achievement` `Contest`  `?prize.reward.entityType=search_string`
  'prizeRewardEntityId': gsgsggwtwsdvdfadf, // String | Achievement id or Contest id. Case sensitive   `?prize.reward.entityId=search_string`
  'prizeRewardRewardRank': 1, // String | If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  `?prize.reward.rewardRank=search_string`
  'prizeRewardValue': 1.2, // Number | Numerical value of the reward that will be issued based on the reward type  `?prize.reward.value=search_double`
  'prizeRewardRewardType': reward-type-id, // String | Reward type id   `?prize.reward.rewardType=search_string`
  'prizeRewardDelay': 1, // Number | Delay of issuing a reward in minutes   `?prize.reward.delay=search_integer`
  'prizeRewardMemberAcknowledgmentRequired': false, // Boolean | To claim a reward   `?prize.reward.memberAcknowledgmentRequired=search_boolean`
  'prizeRewardMetadataKey': reward-metadata-key, // String | Search by reward metadata key.   `?prize.reward.metadata.key=search_word`
  'prizeRewardMetadataValue': reward-metadata-value, // String | Search by reward metadata value.   `?prize.reward.metadata.value=search_word`
  'prizeRewardCreated': 2018-08-23T14:23:09, // Date | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.reward.created=search_datetime`
  'prizeRewardId': wrwtsdrvxfnjuuu4133, // String | Search by reward id. Case sensitive   `?prize.reward.id=search_string`
  'prizeClaimed': false, // Boolean | Has the award been claimed or not.   `?prize.claimed=search_boolean`
  'prizeEntityType': Contest, // String | The type of entity this Award relates to. Case sensitive   Supported values -   `Contest` `Achievement`   `?prize.entityType=search_word`
  'prizeEntityId': wrwtsdrvxfnjuuu4133, // String | The Id of the contest or achievement related to this Award. Case sensitive   `?prize.entityId=search_string`
  'prizeCreated': 2018-08-23T14:23:09, // Date | ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   `?prize.created=search_datetime`
  'prizeId': wrwtsdrvxfnjuuu4133, // String | Award id. Case sensitive   `?prize.id=search_word`
  'status': Read, // String | The status of the message. Case sensitive  Supported values - `New` `Read` `CollaborationRequest` `Actioned` `Claimed` `Expired` `Canceled` `Deprecated`   `?status=search_string`
  'created': 2018-08-23T14:23:09, // Date | Works with simple dates or date and time, eg:   `?created=<created-date>`
  'metadataKey': "my-first-meta-key", // String | Search by metadata key. Case sensitive.  `?metadata.key=search_word`
  'metadataValue': "my-first-meta-value", // String | Search by metadata value. Case sensitive.  `?metadata.value=search_word`
  'id': geyhMXwBDhJLemKG3d8J, geYhMXwBDhJLemKG3d9J // [String] | The unique identifiers of the resources
};
apiInstance.getMessagesByMemberRefId(X_API_KEY, spaceName, memberRefId, opts, (error, data, response) => {
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
 **eventRefType** | **String**| Defines an event type attached to the message. Case sensitive Supported values - &#x60;CompetitionType&#x60; &#x60;ContestType&#x60; &#x60;AchievementType&#x60;  &#x60;?eventRefType&#x3D;search_string&#x60; | [optional] 
 **eventReferenceId** | **String**| The reference ID of the event object. Case sensitive   &#x60;?eventReferenceId&#x3D;search_string&#x60; | [optional] 
 **messageType** | **String**| The type of message of the member. Case sensitive Supported values - &#x60;Notification&#x60; &#x60;Achievement&#x60; &#x60;Reward&#x60;  &#x60;?messageType&#x3D;search_string&#x60; | [optional] 
 **subject** | **String**| The title of the message. Case sensitive  &#x60;?subject&#x3D;search_string&#x60; | [optional] 
 **prizeRewardEntityType** | **String**| Can be achievement or contest. Case sensitive Supported values - &#x60;Achievement&#x60; &#x60;Contest&#x60;  &#x60;?prize.reward.entityType&#x3D;search_string&#x60; | [optional] 
 **prizeRewardEntityId** | **String**| Achievement id or Contest id. Case sensitive   &#x60;?prize.reward.entityId&#x3D;search_string&#x60; | [optional] 
 **prizeRewardRewardRank** | **String**| If used in the context of contest this will associate with the rank of the leaderboard. Case sensitive  &#x60;?prize.reward.rewardRank&#x3D;search_string&#x60; | [optional] 
 **prizeRewardValue** | **Number**| Numerical value of the reward that will be issued based on the reward type  &#x60;?prize.reward.value&#x3D;search_double&#x60; | [optional] 
 **prizeRewardRewardType** | **String**| Reward type id   &#x60;?prize.reward.rewardType&#x3D;search_string&#x60; | [optional] 
 **prizeRewardDelay** | **Number**| Delay of issuing a reward in minutes   &#x60;?prize.reward.delay&#x3D;search_integer&#x60; | [optional] 
 **prizeRewardMemberAcknowledgmentRequired** | **Boolean**| To claim a reward   &#x60;?prize.reward.memberAcknowledgmentRequired&#x3D;search_boolean&#x60; | [optional] 
 **prizeRewardMetadataKey** | **String**| Search by reward metadata key.   &#x60;?prize.reward.metadata.key&#x3D;search_word&#x60; | [optional] 
 **prizeRewardMetadataValue** | **String**| Search by reward metadata value.   &#x60;?prize.reward.metadata.value&#x3D;search_word&#x60; | [optional] 
 **prizeRewardCreated** | **Date**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.reward.created&#x3D;search_datetime&#x60; | [optional] 
 **prizeRewardId** | **String**| Search by reward id. Case sensitive   &#x60;?prize.reward.id&#x3D;search_string&#x60; | [optional] 
 **prizeClaimed** | **Boolean**| Has the award been claimed or not.   &#x60;?prize.claimed&#x3D;search_boolean&#x60; | [optional] 
 **prizeEntityType** | **String**| The type of entity this Award relates to. Case sensitive   Supported values -   &#x60;Contest&#x60; &#x60;Achievement&#x60;   &#x60;?prize.entityType&#x3D;search_word&#x60; | [optional] 
 **prizeEntityId** | **String**| The Id of the contest or achievement related to this Award. Case sensitive   &#x60;?prize.entityId&#x3D;search_string&#x60; | [optional] 
 **prizeCreated** | **Date**| ISO8601 timestamp for when a Reward was created. All records are stored in UTC time zone.   &#x60;?prize.created&#x3D;search_datetime&#x60; | [optional] 
 **prizeId** | **String**| Award id. Case sensitive   &#x60;?prize.id&#x3D;search_word&#x60; | [optional] 
 **status** | **String**| The status of the message. Case sensitive  Supported values - &#x60;New&#x60; &#x60;Read&#x60; &#x60;CollaborationRequest&#x60; &#x60;Actioned&#x60; &#x60;Claimed&#x60; &#x60;Expired&#x60; &#x60;Canceled&#x60; &#x60;Deprecated&#x60;   &#x60;?status&#x3D;search_string&#x60; | [optional] 
 **created** | **Date**| Works with simple dates or date and time, eg:   &#x60;?created&#x3D;&lt;created-date&gt;&#x60; | [optional] 
 **metadataKey** | **String**| Search by metadata key. Case sensitive.  &#x60;?metadata.key&#x3D;search_word&#x60; | [optional] 
 **metadataValue** | **String**| Search by metadata value. Case sensitive.  &#x60;?metadata.value&#x3D;search_word&#x60; | [optional] 
 **id** | [**[String]**](String.md)| The unique identifiers of the resources | [optional] 

### Return type

[**MemberMessageResponse**](MemberMessageResponse.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

