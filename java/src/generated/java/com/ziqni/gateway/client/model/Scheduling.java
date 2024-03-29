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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Scheduling
 */
@JsonPropertyOrder({
  Scheduling.JSON_PROPERTY_SCHEDULE_TYPE,
  Scheduling.JSON_PROPERTY_SCHEDULE_OCCURRENCES_LIMIT,
  Scheduling.JSON_PROPERTY_EVERY,
  Scheduling.JSON_PROPERTY_START_DATE,
  Scheduling.JSON_PROPERTY_END_DATE,
  Scheduling.JSON_PROPERTY_ONLY_AGGREGATE_ON_ACTIVE_DAYS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Scheduling {
  public static final String JSON_PROPERTY_SCHEDULE_TYPE = "scheduleType";
  private String scheduleType;

  public static final String JSON_PROPERTY_SCHEDULE_OCCURRENCES_LIMIT = "scheduleOccurrencesLimit";
  private Integer scheduleOccurrencesLimit;

  public static final String JSON_PROPERTY_EVERY = "every";
  private List<String> every = null;

  public static final String JSON_PROPERTY_START_DATE = "startDate";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_END_DATE = "endDate";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_ONLY_AGGREGATE_ON_ACTIVE_DAYS = "onlyAggregateOnActiveDays";
  private Boolean onlyAggregateOnActiveDays;


  public Scheduling scheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScheduleType() {
    return scheduleType;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleType(String scheduleType) {
    this.scheduleType = scheduleType;
  }


  public Scheduling scheduleOccurrencesLimit(Integer scheduleOccurrencesLimit) {
    this.scheduleOccurrencesLimit = scheduleOccurrencesLimit;
    return this;
  }

   /**
   * Get scheduleOccurrencesLimit
   * @return scheduleOccurrencesLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_OCCURRENCES_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScheduleOccurrencesLimit() {
    return scheduleOccurrencesLimit;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_OCCURRENCES_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleOccurrencesLimit(Integer scheduleOccurrencesLimit) {
    this.scheduleOccurrencesLimit = scheduleOccurrencesLimit;
  }


  public Scheduling every(List<String> every) {
    this.every = every;
    return this;
  }

  public Scheduling addEveryItem(String everyItem) {
    if (this.every == null) {
      this.every = new ArrayList<>();
    }
    this.every.add(everyItem);
    return this;
  }

   /**
   * Get every
   * @return every
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEvery() {
    return every;
  }


  @JsonProperty(JSON_PROPERTY_EVERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEvery(List<String> every) {
    this.every = every;
  }


  public Scheduling startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Get startDate
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public Scheduling endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * Get endDate
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getEndDate() {
    return endDate;
  }


  @JsonProperty(JSON_PROPERTY_END_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }


  public Scheduling onlyAggregateOnActiveDays(Boolean onlyAggregateOnActiveDays) {
    this.onlyAggregateOnActiveDays = onlyAggregateOnActiveDays;
    return this;
  }

   /**
   * Get onlyAggregateOnActiveDays
   * @return onlyAggregateOnActiveDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ONLY_AGGREGATE_ON_ACTIVE_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyAggregateOnActiveDays() {
    return onlyAggregateOnActiveDays;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_AGGREGATE_ON_ACTIVE_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyAggregateOnActiveDays(Boolean onlyAggregateOnActiveDays) {
    this.onlyAggregateOnActiveDays = onlyAggregateOnActiveDays;
  }


  /**
   * Return true if this Scheduling object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Scheduling scheduling = (Scheduling) o;
    return Objects.equals(this.scheduleType, scheduling.scheduleType) &&
        Objects.equals(this.scheduleOccurrencesLimit, scheduling.scheduleOccurrencesLimit) &&
        Objects.equals(this.every, scheduling.every) &&
        Objects.equals(this.startDate, scheduling.startDate) &&
        Objects.equals(this.endDate, scheduling.endDate) &&
        Objects.equals(this.onlyAggregateOnActiveDays, scheduling.onlyAggregateOnActiveDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleType, scheduleOccurrencesLimit, every, startDate, endDate, onlyAggregateOnActiveDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Scheduling {\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    scheduleOccurrencesLimit: ").append(toIndentedString(scheduleOccurrencesLimit)).append("\n");
    sb.append("    every: ").append(toIndentedString(every)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    onlyAggregateOnActiveDays: ").append(toIndentedString(onlyAggregateOnActiveDays)).append("\n");
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

