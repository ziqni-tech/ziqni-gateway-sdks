/*
 * Ziqni Gateway Services
 * These are the Gateway services to be used by customers.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@ziqni.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ziqni.gateway.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.ziqni.gateway.client.model.MainRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MainConditionSet
 */
@JsonPropertyOrder({
  MainConditionSet.JSON_PROPERTY_JSON_CLASS,
  MainConditionSet.JSON_PROPERTY_MATCH_CONDITION,
  MainConditionSet.JSON_PROPERTY_MUST_EVALUATE_TO,
  MainConditionSet.JSON_PROPERTY_RULES
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MainConditionSet {
  public static final String JSON_PROPERTY_JSON_CLASS = "jsonClass";
  private String jsonClass;

  public static final String JSON_PROPERTY_MATCH_CONDITION = "matchCondition";
  private String matchCondition;

  public static final String JSON_PROPERTY_MUST_EVALUATE_TO = "mustEvaluateTo";
  private Boolean mustEvaluateTo;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<MainRule> rules = null;


  public MainConditionSet jsonClass(String jsonClass) {
    this.jsonClass = jsonClass;
    return this;
  }

   /**
   * Get jsonClass
   * @return jsonClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_JSON_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getJsonClass() {
    return jsonClass;
  }


  @JsonProperty(JSON_PROPERTY_JSON_CLASS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setJsonClass(String jsonClass) {
    this.jsonClass = jsonClass;
  }


  public MainConditionSet matchCondition(String matchCondition) {
    this.matchCondition = matchCondition;
    return this;
  }

   /**
   * Get matchCondition
   * @return matchCondition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATCH_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMatchCondition() {
    return matchCondition;
  }


  @JsonProperty(JSON_PROPERTY_MATCH_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMatchCondition(String matchCondition) {
    this.matchCondition = matchCondition;
  }


  public MainConditionSet mustEvaluateTo(Boolean mustEvaluateTo) {
    this.mustEvaluateTo = mustEvaluateTo;
    return this;
  }

   /**
   * Get mustEvaluateTo
   * @return mustEvaluateTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MUST_EVALUATE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMustEvaluateTo() {
    return mustEvaluateTo;
  }


  @JsonProperty(JSON_PROPERTY_MUST_EVALUATE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMustEvaluateTo(Boolean mustEvaluateTo) {
    this.mustEvaluateTo = mustEvaluateTo;
  }


  public MainConditionSet rules(List<MainRule> rules) {
    this.rules = rules;
    return this;
  }

  public MainConditionSet addRulesItem(MainRule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * Get rules
   * @return rules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MainRule> getRules() {
    return rules;
  }


  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRules(List<MainRule> rules) {
    this.rules = rules;
  }


  /**
   * Return true if this MainConditionSet object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MainConditionSet mainConditionSet = (MainConditionSet) o;
    return Objects.equals(this.jsonClass, mainConditionSet.jsonClass) &&
        Objects.equals(this.matchCondition, mainConditionSet.matchCondition) &&
        Objects.equals(this.mustEvaluateTo, mainConditionSet.mustEvaluateTo) &&
        Objects.equals(this.rules, mainConditionSet.rules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonClass, matchCondition, mustEvaluateTo, rules);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MainConditionSet {\n");
    sb.append("    jsonClass: ").append(toIndentedString(jsonClass)).append("\n");
    sb.append("    matchCondition: ").append(toIndentedString(matchCondition)).append("\n");
    sb.append("    mustEvaluateTo: ").append(toIndentedString(mustEvaluateTo)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

