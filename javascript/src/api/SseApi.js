/**
 * Ziqni Gateway Services
 * These are the Gateway services to be used by customers.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ziqni.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import ApiErrorResponse from '../model/ApiErrorResponse';
import Error from '../model/Error';
import SseMemberMessage from '../model/SseMemberMessage';

/**
* Sse service.
* @module api/SseApi
* @version 0.0.1
*/
export default class SseApi {

    /**
    * Constructs a new SseApi. 
    * @alias module:api/SseApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the subscribeSseChannelByMemberId operation.
     * @callback module:api/SseApi~subscribeSseChannelByMemberIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SseMemberMessage} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Subscribe to SSE channel
     * Establishes an SSE channel for a specific member id.
     * @param {String} X_API_KEY Your unique API key
     * @param {String} spaceName This is the space name which is linked to the account
     * @param {String} memberId Id of a Member
     * @param {module:api/SseApi~subscribeSseChannelByMemberIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SseMemberMessage}
     */
    subscribeSseChannelByMemberId(X_API_KEY, spaceName, memberId, callback) {
      let postBody = null;
      // verify the required parameter 'X_API_KEY' is set
      if (X_API_KEY === undefined || X_API_KEY === null) {
        throw new Error("Missing the required parameter 'X_API_KEY' when calling subscribeSseChannelByMemberId");
      }
      // verify the required parameter 'spaceName' is set
      if (spaceName === undefined || spaceName === null) {
        throw new Error("Missing the required parameter 'spaceName' when calling subscribeSseChannelByMemberId");
      }
      // verify the required parameter 'memberId' is set
      if (memberId === undefined || memberId === null) {
        throw new Error("Missing the required parameter 'memberId' when calling subscribeSseChannelByMemberId");
      }

      let pathParams = {
        'spaceName': spaceName,
        'memberId': memberId
      };
      let queryParams = {
      };
      let headerParams = {
        'X-API-KEY': X_API_KEY
      };
      let formParams = {
      };

      let authNames = ['apiKey'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = SseMemberMessage;
      return this.apiClient.callApi(
        '/api/v1/{spaceName}/sse/{memberId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the subscribeSseChannelByMemberRefId operation.
     * @callback module:api/SseApi~subscribeSseChannelByMemberRefIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SseMemberMessage} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Subscribe to SSE channel
     * Establishes an SSE channel for a specific member ref id.
     * @param {String} X_API_KEY Your unique API key
     * @param {String} spaceName This is the space name which is linked to the account
     * @param {String} memberRefId Reference Id of a Member
     * @param {module:api/SseApi~subscribeSseChannelByMemberRefIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SseMemberMessage}
     */
    subscribeSseChannelByMemberRefId(X_API_KEY, spaceName, memberRefId, callback) {
      let postBody = null;
      // verify the required parameter 'X_API_KEY' is set
      if (X_API_KEY === undefined || X_API_KEY === null) {
        throw new Error("Missing the required parameter 'X_API_KEY' when calling subscribeSseChannelByMemberRefId");
      }
      // verify the required parameter 'spaceName' is set
      if (spaceName === undefined || spaceName === null) {
        throw new Error("Missing the required parameter 'spaceName' when calling subscribeSseChannelByMemberRefId");
      }
      // verify the required parameter 'memberRefId' is set
      if (memberRefId === undefined || memberRefId === null) {
        throw new Error("Missing the required parameter 'memberRefId' when calling subscribeSseChannelByMemberRefId");
      }

      let pathParams = {
        'spaceName': spaceName,
        'memberRefId': memberRefId
      };
      let queryParams = {
      };
      let headerParams = {
        'X-API-KEY': X_API_KEY
      };
      let formParams = {
      };

      let authNames = ['apiKey'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = SseMemberMessage;
      return this.apiClient.callApi(
        '/api/v1/{spaceName}/sse/reference/{memberRefId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the subscribeSseChannelHeartbeatByMemberId operation.
     * @callback module:api/SseApi~subscribeSseChannelHeartbeatByMemberIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SseMemberMessage} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Subscribe to SSE channel
     * Establishes an SSE channel for a specific member id.
     * @param {String} X_API_KEY Your unique API key
     * @param {String} spaceName This is the space name which is linked to the account
     * @param {String} memberId Id of a Member
     * @param {module:api/SseApi~subscribeSseChannelHeartbeatByMemberIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SseMemberMessage}
     */
    subscribeSseChannelHeartbeatByMemberId(X_API_KEY, spaceName, memberId, callback) {
      let postBody = null;
      // verify the required parameter 'X_API_KEY' is set
      if (X_API_KEY === undefined || X_API_KEY === null) {
        throw new Error("Missing the required parameter 'X_API_KEY' when calling subscribeSseChannelHeartbeatByMemberId");
      }
      // verify the required parameter 'spaceName' is set
      if (spaceName === undefined || spaceName === null) {
        throw new Error("Missing the required parameter 'spaceName' when calling subscribeSseChannelHeartbeatByMemberId");
      }
      // verify the required parameter 'memberId' is set
      if (memberId === undefined || memberId === null) {
        throw new Error("Missing the required parameter 'memberId' when calling subscribeSseChannelHeartbeatByMemberId");
      }

      let pathParams = {
        'spaceName': spaceName,
        'memberId': memberId
      };
      let queryParams = {
      };
      let headerParams = {
        'X-API-KEY': X_API_KEY
      };
      let formParams = {
      };

      let authNames = ['apiKey'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = SseMemberMessage;
      return this.apiClient.callApi(
        '/api/v1/{spaceName}/sse/{memberId}/heartbeat', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the subscribeSseChannelHeartbeatByMemberRefId operation.
     * @callback module:api/SseApi~subscribeSseChannelHeartbeatByMemberRefIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/SseMemberMessage} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Subscribe to SSE channel
     * Establishes an SSE channel for a specific member id.
     * @param {String} X_API_KEY Your unique API key
     * @param {String} spaceName This is the space name which is linked to the account
     * @param {String} memberRefId Reference Id of a Member
     * @param {module:api/SseApi~subscribeSseChannelHeartbeatByMemberRefIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/SseMemberMessage}
     */
    subscribeSseChannelHeartbeatByMemberRefId(X_API_KEY, spaceName, memberRefId, callback) {
      let postBody = null;
      // verify the required parameter 'X_API_KEY' is set
      if (X_API_KEY === undefined || X_API_KEY === null) {
        throw new Error("Missing the required parameter 'X_API_KEY' when calling subscribeSseChannelHeartbeatByMemberRefId");
      }
      // verify the required parameter 'spaceName' is set
      if (spaceName === undefined || spaceName === null) {
        throw new Error("Missing the required parameter 'spaceName' when calling subscribeSseChannelHeartbeatByMemberRefId");
      }
      // verify the required parameter 'memberRefId' is set
      if (memberRefId === undefined || memberRefId === null) {
        throw new Error("Missing the required parameter 'memberRefId' when calling subscribeSseChannelHeartbeatByMemberRefId");
      }

      let pathParams = {
        'spaceName': spaceName,
        'memberRefId': memberRefId
      };
      let queryParams = {
      };
      let headerParams = {
        'X-API-KEY': X_API_KEY
      };
      let formParams = {
      };

      let authNames = ['apiKey'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = SseMemberMessage;
      return this.apiClient.callApi(
        '/api/v1/{spaceName}/sse/reference/{memberRefId}/heartbeat', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}