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

import ApiClient from '../ApiClient';
import Error from './Error';
import MemberAchievement from './MemberAchievement';
import ResponseMeta from './ResponseMeta';

/**
 * The MemberAchievementResponse model module.
 * @module model/MemberAchievementResponse
 * @version 0.0.1
 */
class MemberAchievementResponse {
    /**
     * Constructs a new <code>MemberAchievementResponse</code>.
     * @alias module:model/MemberAchievementResponse
     */
    constructor() { 
        
        MemberAchievementResponse.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>MemberAchievementResponse</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/MemberAchievementResponse} obj Optional instance to populate.
     * @return {module:model/MemberAchievementResponse} The populated <code>MemberAchievementResponse</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new MemberAchievementResponse();

            if (data.hasOwnProperty('meta')) {
                obj['meta'] = ResponseMeta.constructFromObject(data['meta']);
            }
            if (data.hasOwnProperty('data')) {
                obj['data'] = ApiClient.convertToType(data['data'], [MemberAchievement]);
            }
            if (data.hasOwnProperty('errors')) {
                obj['errors'] = ApiClient.convertToType(data['errors'], [Error]);
            }
        }
        return obj;
    }


}

/**
 * @member {module:model/ResponseMeta} meta
 */
MemberAchievementResponse.prototype['meta'] = undefined;

/**
 * @member {Array.<module:model/MemberAchievement>} data
 */
MemberAchievementResponse.prototype['data'] = undefined;

/**
 * @member {Array.<module:model/Error>} errors
 */
MemberAchievementResponse.prototype['errors'] = undefined;






export default MemberAchievementResponse;
