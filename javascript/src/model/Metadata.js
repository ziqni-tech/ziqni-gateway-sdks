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

/**
 * The Metadata model module.
 * @module model/Metadata
 * @version 0.0.1
 */
class Metadata {
    /**
     * Constructs a new <code>Metadata</code>.
     * @alias module:model/Metadata
     */
    constructor() { 
        
        Metadata.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Metadata</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Metadata} obj Optional instance to populate.
     * @return {module:model/Metadata} The populated <code>Metadata</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Metadata();

            if (data.hasOwnProperty('key')) {
                obj['key'] = ApiClient.convertToType(data['key'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
        }
        return obj;
    }


}

/**
 * @member {String} key
 */
Metadata.prototype['key'] = undefined;

/**
 * @member {String} value
 */
Metadata.prototype['value'] = undefined;






export default Metadata;

