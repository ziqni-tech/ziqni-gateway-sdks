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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.@ZiqniTechGatewayApiClient);
  }
}(this, function(expect, @ZiqniTechGatewayApiClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new @ZiqniTechGatewayApiClient.ResponseMeta();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('ResponseMeta', function() {
    it('should create an instance of ResponseMeta', function() {
      // uncomment below and update the code to test ResponseMeta
      //var instance = new @ZiqniTechGatewayApiClient.ResponseMeta();
      //expect(instance).to.be.a(@ZiqniTechGatewayApiClient.ResponseMeta);
    });

    it('should have the property totalRecordsFound (base name: "totalRecordsFound")', function() {
      // uncomment below and update the code to test the property totalRecordsFound
      //var instance = new @ZiqniTechGatewayApiClient.ResponseMeta();
      //expect(instance).to.be();
    });

    it('should have the property skip (base name: "skip")', function() {
      // uncomment below and update the code to test the property skip
      //var instance = new @ZiqniTechGatewayApiClient.ResponseMeta();
      //expect(instance).to.be();
    });

    it('should have the property limit (base name: "limit")', function() {
      // uncomment below and update the code to test the property limit
      //var instance = new @ZiqniTechGatewayApiClient.ResponseMeta();
      //expect(instance).to.be();
    });

    it('should have the property time (base name: "time")', function() {
      // uncomment below and update the code to test the property time
      //var instance = new @ZiqniTechGatewayApiClient.ResponseMeta();
      //expect(instance).to.be();
    });

  });

}));
