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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * MemberOptin
 */
@JsonPropertyOrder({
  MemberOptin.JSON_PROPERTY_ACCOUNT_ID,
  MemberOptin.JSON_PROPERTY_MEMBER_ID,
  MemberOptin.JSON_PROPERTY_PARTICIPATION_ID,
  MemberOptin.JSON_PROPERTY_VALUE,
  MemberOptin.JSON_PROPERTY_BEST_SCORES,
  MemberOptin.JSON_PROPERTY_TIMESTAMP,
  MemberOptin.JSON_PROPERTY_UPDATE_COUNT,
  MemberOptin.JSON_PROPERTY_MARKER_TIME_STAMP,
  MemberOptin.JSON_PROPERTY_GOAL_REACHED,
  MemberOptin.JSON_PROPERTY_STATUS_CODE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MemberOptin {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_MEMBER_ID = "memberId";
  private String memberId;

  public static final String JSON_PROPERTY_PARTICIPATION_ID = "participationId";
  private String participationId;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_BEST_SCORES = "bestScores";
  private List<Double> bestScores = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public static final String JSON_PROPERTY_UPDATE_COUNT = "updateCount";
  private Integer updateCount;

  public static final String JSON_PROPERTY_MARKER_TIME_STAMP = "markerTimeStamp";
  private Long markerTimeStamp;

  public static final String JSON_PROPERTY_GOAL_REACHED = "goalReached";
  private Boolean goalReached;

  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;


  public MemberOptin accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * Get accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public MemberOptin memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Get memberId
   * @return memberId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMemberId() {
    return memberId;
  }


  @JsonProperty(JSON_PROPERTY_MEMBER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  public MemberOptin participationId(String participationId) {
    this.participationId = participationId;
    return this;
  }

   /**
   * Get participationId
   * @return participationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTICIPATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getParticipationId() {
    return participationId;
  }


  @JsonProperty(JSON_PROPERTY_PARTICIPATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setParticipationId(String participationId) {
    this.participationId = participationId;
  }


  public MemberOptin value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValue(Double value) {
    this.value = value;
  }


  public MemberOptin bestScores(List<Double> bestScores) {
    this.bestScores = bestScores;
    return this;
  }

  public MemberOptin addBestScoresItem(Double bestScoresItem) {
    if (this.bestScores == null) {
      this.bestScores = new ArrayList<>();
    }
    this.bestScores.add(bestScoresItem);
    return this;
  }

   /**
   * Get bestScores
   * @return bestScores
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BEST_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Double> getBestScores() {
    return bestScores;
  }


  @JsonProperty(JSON_PROPERTY_BEST_SCORES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBestScores(List<Double> bestScores) {
    this.bestScores = bestScores;
  }


  public MemberOptin timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  public MemberOptin updateCount(Integer updateCount) {
    this.updateCount = updateCount;
    return this;
  }

   /**
   * Get updateCount
   * @return updateCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_UPDATE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getUpdateCount() {
    return updateCount;
  }


  @JsonProperty(JSON_PROPERTY_UPDATE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdateCount(Integer updateCount) {
    this.updateCount = updateCount;
  }


  public MemberOptin markerTimeStamp(Long markerTimeStamp) {
    this.markerTimeStamp = markerTimeStamp;
    return this;
  }

   /**
   * Get markerTimeStamp
   * @return markerTimeStamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKER_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getMarkerTimeStamp() {
    return markerTimeStamp;
  }


  @JsonProperty(JSON_PROPERTY_MARKER_TIME_STAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkerTimeStamp(Long markerTimeStamp) {
    this.markerTimeStamp = markerTimeStamp;
  }


  public MemberOptin goalReached(Boolean goalReached) {
    this.goalReached = goalReached;
    return this;
  }

   /**
   * Get goalReached
   * @return goalReached
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GOAL_REACHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getGoalReached() {
    return goalReached;
  }


  @JsonProperty(JSON_PROPERTY_GOAL_REACHED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoalReached(Boolean goalReached) {
    this.goalReached = goalReached;
  }


  public MemberOptin statusCode(Integer statusCode) {
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStatusCode() {
    return statusCode;
  }


  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatusCode(Integer statusCode) {
    this.statusCode = statusCode;
  }


  /**
   * Return true if this MemberOptin object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberOptin memberOptin = (MemberOptin) o;
    return Objects.equals(this.accountId, memberOptin.accountId) &&
        Objects.equals(this.memberId, memberOptin.memberId) &&
        Objects.equals(this.participationId, memberOptin.participationId) &&
        Objects.equals(this.value, memberOptin.value) &&
        Objects.equals(this.bestScores, memberOptin.bestScores) &&
        Objects.equals(this.timestamp, memberOptin.timestamp) &&
        Objects.equals(this.updateCount, memberOptin.updateCount) &&
        Objects.equals(this.markerTimeStamp, memberOptin.markerTimeStamp) &&
        Objects.equals(this.goalReached, memberOptin.goalReached) &&
        Objects.equals(this.statusCode, memberOptin.statusCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, memberId, participationId, value, bestScores, timestamp, updateCount, markerTimeStamp, goalReached, statusCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberOptin {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    participationId: ").append(toIndentedString(participationId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    bestScores: ").append(toIndentedString(bestScores)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    updateCount: ").append(toIndentedString(updateCount)).append("\n");
    sb.append("    markerTimeStamp: ").append(toIndentedString(markerTimeStamp)).append("\n");
    sb.append("    goalReached: ").append(toIndentedString(goalReached)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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

