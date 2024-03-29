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
import MemberResponse from '../model/MemberResponse';

/**
* Members service.
* @module api/MembersApi
* @version 0.0.1
*/
export default class MembersApi {

    /**
    * Constructs a new MembersApi. 
    * @alias module:api/MembersApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the getMemberById operation.
     * @callback module:api/MembersApi~getMemberByIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MemberResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Returns the member by requested id
     * Returns the information for a given Member id
     * @param {String} X_API_KEY Your unique API key
     * @param {String} spaceName This is the space name which is linked to the account
     * @param {String} id Unique identifier of the resource
     * @param {module:api/MembersApi~getMemberByIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MemberResponse}
     */
    getMemberById(X_API_KEY, spaceName, id, callback) {
      let postBody = null;
      // verify the required parameter 'X_API_KEY' is set
      if (X_API_KEY === undefined || X_API_KEY === null) {
        throw new Error("Missing the required parameter 'X_API_KEY' when calling getMemberById");
      }
      // verify the required parameter 'spaceName' is set
      if (spaceName === undefined || spaceName === null) {
        throw new Error("Missing the required parameter 'spaceName' when calling getMemberById");
      }
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling getMemberById");
      }

      let pathParams = {
        'spaceName': spaceName,
        'id': id
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
      let returnType = MemberResponse;
      return this.apiClient.callApi(
        '/api/v1/{spaceName}/members/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the getMemberByRefId operation.
     * @callback module:api/MembersApi~getMemberByRefIdCallback
     * @param {String} error Error message, if any.
     * @param {module:model/MemberResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Returns the member by requested id
     * Returns the information for a given Member Reference ID
     * @param {String} X_API_KEY Your unique API key
     * @param {String} spaceName This is the space name which is linked to the account
     * @param {String} memberRefId Reference Id of a Member
     * @param {module:api/MembersApi~getMemberByRefIdCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/MemberResponse}
     */
    getMemberByRefId(X_API_KEY, spaceName, memberRefId, callback) {
      let postBody = null;
      // verify the required parameter 'X_API_KEY' is set
      if (X_API_KEY === undefined || X_API_KEY === null) {
        throw new Error("Missing the required parameter 'X_API_KEY' when calling getMemberByRefId");
      }
      // verify the required parameter 'spaceName' is set
      if (spaceName === undefined || spaceName === null) {
        throw new Error("Missing the required parameter 'spaceName' when calling getMemberByRefId");
      }
      // verify the required parameter 'memberRefId' is set
      if (memberRefId === undefined || memberRefId === null) {
        throw new Error("Missing the required parameter 'memberRefId' when calling getMemberByRefId");
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
      let returnType = MemberResponse;
      return this.apiClient.callApi(
        '/api/v1/{spaceName}/members/reference/{memberRefId}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
