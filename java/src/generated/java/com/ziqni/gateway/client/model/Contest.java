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
import com.ziqni.gateway.client.model.Reward;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Contest
 */
@JsonPropertyOrder({
  Contest.JSON_PROPERTY_STATUS_CODE,
  Contest.JSON_PROPERTY_NUMBER,
  Contest.JSON_PROPERTY_ACTUAL_START,
  Contest.JSON_PROPERTY_ACTUAL_END,
  Contest.JSON_PROPERTY_ENTRANS_FROM_CONTEST,
  Contest.JSON_PROPERTY_DESCRIPTION,
  Contest.JSON_PROPERTY_LABEL,
  Contest.JSON_PROPERTY_JSON_CLASS,
  Contest.JSON_PROPERTY_REWARDS,
  Contest.JSON_PROPERTY_SCHEDULED_START,
  Contest.JSON_PROPERTY_ID,
  Contest.JSON_PROPERTY_TERMS_CONDITIONS,
  Contest.JSON_PROPERTY_STATUS,
  Contest.JSON_PROPERTY_SCHEDULED_END,
  Contest.JSON_PROPERTY_ROUND,
  Contest.JSON_PROPERTY_COMPETITION_ID,
  Contest.JSON_PROPERTY_ROUND_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Contest {
  public static final String JSON_PROPERTY_STATUS_CODE = "statusCode";
  private Integer statusCode;

  public static final String JSON_PROPERTY_NUMBER = "number";
  private Integer number;

  public static final String JSON_PROPERTY_ACTUAL_START = "actualStart";
  private OffsetDateTime actualStart;

  public static final String JSON_PROPERTY_ACTUAL_END = "actualEnd";
  private OffsetDateTime actualEnd;

  public static final String JSON_PROPERTY_ENTRANS_FROM_CONTEST = "entransFromContest";
  private List<String> entransFromContest = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABEL = "label";
  private String label;

  public static final String JSON_PROPERTY_JSON_CLASS = "jsonClass";
  private String jsonClass;

  public static final String JSON_PROPERTY_REWARDS = "rewards";
  private List<Reward> rewards = null;

  public static final String JSON_PROPERTY_SCHEDULED_START = "scheduledStart";
  private OffsetDateTime scheduledStart;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TERMS_CONDITIONS = "termsConditions";
  private String termsConditions;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_SCHEDULED_END = "scheduledEnd";
  private OffsetDateTime scheduledEnd;

  public static final String JSON_PROPERTY_ROUND = "round";
  private Integer round;

  public static final String JSON_PROPERTY_COMPETITION_ID = "competitionId";
  private String competitionId;

  public static final String JSON_PROPERTY_ROUND_TYPE = "roundType";
  private String roundType;


  public Contest statusCode(Integer statusCode) {
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


  public Contest number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumber(Integer number) {
    this.number = number;
  }


  public Contest actualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
    return this;
  }

   /**
   * Get actualStart
   * @return actualStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTUAL_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActualStart() {
    return actualStart;
  }


  @JsonProperty(JSON_PROPERTY_ACTUAL_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActualStart(OffsetDateTime actualStart) {
    this.actualStart = actualStart;
  }


  public Contest actualEnd(OffsetDateTime actualEnd) {
    this.actualEnd = actualEnd;
    return this;
  }

   /**
   * Get actualEnd
   * @return actualEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTUAL_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getActualEnd() {
    return actualEnd;
  }


  @JsonProperty(JSON_PROPERTY_ACTUAL_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActualEnd(OffsetDateTime actualEnd) {
    this.actualEnd = actualEnd;
  }


  public Contest entransFromContest(List<String> entransFromContest) {
    this.entransFromContest = entransFromContest;
    return this;
  }

  public Contest addEntransFromContestItem(String entransFromContestItem) {
    if (this.entransFromContest == null) {
      this.entransFromContest = new ArrayList<>();
    }
    this.entransFromContest.add(entransFromContestItem);
    return this;
  }

   /**
   * Get entransFromContest
   * @return entransFromContest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTRANS_FROM_CONTEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEntransFromContest() {
    return entransFromContest;
  }


  @JsonProperty(JSON_PROPERTY_ENTRANS_FROM_CONTEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntransFromContest(List<String> entransFromContest) {
    this.entransFromContest = entransFromContest;
  }


  public Contest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public Contest label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLabel() {
    return label;
  }


  @JsonProperty(JSON_PROPERTY_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabel(String label) {
    this.label = label;
  }


  public Contest jsonClass(String jsonClass) {
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


  public Contest rewards(List<Reward> rewards) {
    this.rewards = rewards;
    return this;
  }

  public Contest addRewardsItem(Reward rewardsItem) {
    if (this.rewards == null) {
      this.rewards = new ArrayList<>();
    }
    this.rewards.add(rewardsItem);
    return this;
  }

   /**
   * Get rewards
   * @return rewards
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Reward> getRewards() {
    return rewards;
  }


  @JsonProperty(JSON_PROPERTY_REWARDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRewards(List<Reward> rewards) {
    this.rewards = rewards;
  }


  public Contest scheduledStart(OffsetDateTime scheduledStart) {
    this.scheduledStart = scheduledStart;
    return this;
  }

   /**
   * Get scheduledStart
   * @return scheduledStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getScheduledStart() {
    return scheduledStart;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledStart(OffsetDateTime scheduledStart) {
    this.scheduledStart = scheduledStart;
  }


  public Contest id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(String id) {
    this.id = id;
  }


  public Contest termsConditions(String termsConditions) {
    this.termsConditions = termsConditions;
    return this;
  }

   /**
   * Get termsConditions
   * @return termsConditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TERMS_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTermsConditions() {
    return termsConditions;
  }


  @JsonProperty(JSON_PROPERTY_TERMS_CONDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTermsConditions(String termsConditions) {
    this.termsConditions = termsConditions;
  }


  public Contest status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public Contest scheduledEnd(OffsetDateTime scheduledEnd) {
    this.scheduledEnd = scheduledEnd;
    return this;
  }

   /**
   * Get scheduledEnd
   * @return scheduledEnd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULED_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getScheduledEnd() {
    return scheduledEnd;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULED_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduledEnd(OffsetDateTime scheduledEnd) {
    this.scheduledEnd = scheduledEnd;
  }


  public Contest round(Integer round) {
    this.round = round;
    return this;
  }

   /**
   * Get round
   * @return round
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRound() {
    return round;
  }


  @JsonProperty(JSON_PROPERTY_ROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRound(Integer round) {
    this.round = round;
  }


  public Contest competitionId(String competitionId) {
    this.competitionId = competitionId;
    return this;
  }

   /**
   * Get competitionId
   * @return competitionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPETITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompetitionId() {
    return competitionId;
  }


  @JsonProperty(JSON_PROPERTY_COMPETITION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompetitionId(String competitionId) {
    this.competitionId = competitionId;
  }


  public Contest roundType(String roundType) {
    this.roundType = roundType;
    return this;
  }

   /**
   * Get roundType
   * @return roundType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROUND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoundType() {
    return roundType;
  }


  @JsonProperty(JSON_PROPERTY_ROUND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoundType(String roundType) {
    this.roundType = roundType;
  }


  /**
   * Return true if this Contest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contest contest = (Contest) o;
    return Objects.equals(this.statusCode, contest.statusCode) &&
        Objects.equals(this.number, contest.number) &&
        Objects.equals(this.actualStart, contest.actualStart) &&
        Objects.equals(this.actualEnd, contest.actualEnd) &&
        Objects.equals(this.entransFromContest, contest.entransFromContest) &&
        Objects.equals(this.description, contest.description) &&
        Objects.equals(this.label, contest.label) &&
        Objects.equals(this.jsonClass, contest.jsonClass) &&
        Objects.equals(this.rewards, contest.rewards) &&
        Objects.equals(this.scheduledStart, contest.scheduledStart) &&
        Objects.equals(this.id, contest.id) &&
        Objects.equals(this.termsConditions, contest.termsConditions) &&
        Objects.equals(this.status, contest.status) &&
        Objects.equals(this.scheduledEnd, contest.scheduledEnd) &&
        Objects.equals(this.round, contest.round) &&
        Objects.equals(this.competitionId, contest.competitionId) &&
        Objects.equals(this.roundType, contest.roundType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, number, actualStart, actualEnd, entransFromContest, description, label, jsonClass, rewards, scheduledStart, id, termsConditions, status, scheduledEnd, round, competitionId, roundType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contest {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    actualStart: ").append(toIndentedString(actualStart)).append("\n");
    sb.append("    actualEnd: ").append(toIndentedString(actualEnd)).append("\n");
    sb.append("    entransFromContest: ").append(toIndentedString(entransFromContest)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    jsonClass: ").append(toIndentedString(jsonClass)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    scheduledStart: ").append(toIndentedString(scheduledStart)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    termsConditions: ").append(toIndentedString(termsConditions)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    scheduledEnd: ").append(toIndentedString(scheduledEnd)).append("\n");
    sb.append("    round: ").append(toIndentedString(round)).append("\n");
    sb.append("    competitionId: ").append(toIndentedString(competitionId)).append("\n");
    sb.append("    roundType: ").append(toIndentedString(roundType)).append("\n");
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

