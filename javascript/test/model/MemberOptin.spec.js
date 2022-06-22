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
    instance = new @ZiqniTechGatewayApiClient.MemberOptin();
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

  describe('MemberOptin', function() {
    it('should create an instance of MemberOptin', function() {
      // uncomment below and update the code to test MemberOptin
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be.a(@ZiqniTechGatewayApiClient.MemberOptin);
    });

    it('should have the property accountId (base name: "accountId")', function() {
      // uncomment below and update the code to test the property accountId
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

    it('should have the property memberId (base name: "memberId")', function() {
      // uncomment below and update the code to test the property memberId
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

    it('should have the property participationId (base name: "participationId")', function() {
      // uncomment below and update the code to test the property participationId
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

    it('should have the property value (base name: "value")', function() {
      // uncomment below and update the code to test the property value
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

    it('should have the property bestScores (base name: "bestScores")', function() {
      // uncomment below and update the code to test the property bestScores
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

    it('should have the property timestamp (base name: "timestamp")', function() {
      // uncomment below and update the code to test the property timestamp
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

    it('should have the property updateCount (base name: "updateCount")', function() {
      // uncomment below and update the code to test the property updateCount
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

    it('should have the property markerTimeStamp (base name: "markerTimeStamp")', function() {
      // uncomment below and update the code to test the property markerTimeStamp
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

    it('should have the property goalReached (base name: "goalReached")', function() {
      // uncomment below and update the code to test the property goalReached
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

    it('should have the property statusCode (base name: "statusCode")', function() {
      // uncomment below and update the code to test the property statusCode
      //var instance = new @ZiqniTechGatewayApiClient.MemberOptin();
      //expect(instance).to.be();
    });

  });

}));