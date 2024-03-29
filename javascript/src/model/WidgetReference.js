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
 * The WidgetReference model module.
 * @module model/WidgetReference
 * @version 0.0.1
 */
class WidgetReference {
    /**
     * Constructs a new <code>WidgetReference</code>.
     * @alias module:model/WidgetReference
     */
    constructor() { 
        
        WidgetReference.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>WidgetReference</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/WidgetReference} obj Optional instance to populate.
     * @return {module:model/WidgetReference} The populated <code>WidgetReference</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new WidgetReference();

            if (data.hasOwnProperty('jsonClass')) {
                obj['jsonClass'] = ApiClient.convertToType(data['jsonClass'], 'String');
            }
            if (data.hasOwnProperty('key')) {
                obj['key'] = ApiClient.convertToType(data['key'], 'String');
            }
            if (data.hasOwnProperty('value')) {
                obj['value'] = ApiClient.convertToType(data['value'], 'String');
            }
            if (data.hasOwnProperty('orderNumber')) {
                obj['orderNumber'] = ApiClient.convertToType(data['orderNumber'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} jsonClass
 */
WidgetReference.prototype['jsonClass'] = undefined;

/**
 * @member {String} key
 */
WidgetReference.prototype['key'] = undefined;

/**
 * @member {String} value
 */
WidgetReference.prototype['value'] = undefined;

/**
 * @member {Number} orderNumber
 */
WidgetReference.prototype['orderNumber'] = undefined;






export default WidgetReference;

