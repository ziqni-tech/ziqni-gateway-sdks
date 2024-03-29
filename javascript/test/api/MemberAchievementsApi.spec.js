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
    instance = new @ZiqniTechGatewayApiClient.MemberAchievementsApi();
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

  describe('MemberAchievementsApi', function() {
    describe('getAchievementByIdAndMemberId', function() {
      it('should call getAchievementByIdAndMemberId successfully', function(done) {
        //uncomment below and update the code to test getAchievementByIdAndMemberId
        //instance.getAchievementByIdAndMemberId(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAchievementByIdAndMemberRefId', function() {
      it('should call getAchievementByIdAndMemberRefId successfully', function(done) {
        //uncomment below and update the code to test getAchievementByIdAndMemberRefId
        //instance.getAchievementByIdAndMemberRefId(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAchievementsByMemberId', function() {
      it('should call getAchievementsByMemberId successfully', function(done) {
        //uncomment below and update the code to test getAchievementsByMemberId
        //instance.getAchievementsByMemberId(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getAchievementsByMemberRefId', function() {
      it('should call getAchievementsByMemberRefId successfully', function(done) {
        //uncomment below and update the code to test getAchievementsByMemberRefId
        //instance.getAchievementsByMemberRefId(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getIssuedAchievementsByMemberId', function() {
      it('should call getIssuedAchievementsByMemberId successfully', function(done) {
        //uncomment below and update the code to test getIssuedAchievementsByMemberId
        //instance.getIssuedAchievementsByMemberId(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('getIssuedAchievementsByMemberRefId', function() {
      it('should call getIssuedAchievementsByMemberRefId successfully', function(done) {
        //uncomment below and update the code to test getIssuedAchievementsByMemberRefId
        //instance.getIssuedAchievementsByMemberRefId(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
