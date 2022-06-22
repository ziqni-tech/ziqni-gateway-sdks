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
import com.ziqni.gateway.client.model.DependantOn;
import com.ziqni.gateway.client.model.Product;
import com.ziqni.gateway.client.model.Reward;
import com.ziqni.gateway.client.model.RuleSet;
import com.ziqni.gateway.client.model.Scheduling;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Achievement
 */
@JsonPropertyOrder({
  Achievement.JSON_PROPERTY_NAME,
  Achievement.JSON_PROPERTY_SCHEDULING,
  Achievement.JSON_PROPERTY_DEPENDANT_ON,
  Achievement.JSON_PROPERTY_DESCRIPTION,
  Achievement.JSON_PROPERTY_ICON,
  Achievement.JSON_PROPERTY_REWARDS,
  Achievement.JSON_PROPERTY_DEPRECATED,
  Achievement.JSON_PROPERTY_PRODUCTS,
  Achievement.JSON_PROPERTY_RULE_SETS,
  Achievement.JSON_PROPERTY_ACHIEVEMENT_LIVE_STATUS,
  Achievement.JSON_PROPERTY_INITIAL_STATE,
  Achievement.JSON_PROPERTY_ID,
  Achievement.JSON_PROPERTY_CATEGORY,
  Achievement.JSON_PROPERTY_METADATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Achievement {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SCHEDULING = "scheduling";
  private Scheduling scheduling;

  public static final String JSON_PROPERTY_DEPENDANT_ON = "dependantOn";
  private List<DependantOn> dependantOn = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_REWARDS = "rewards";
  private List<Reward> rewards = null;

  public static final String JSON_PROPERTY_DEPRECATED = "deprecated";
  private Boolean deprecated;

  public static final String JSON_PROPERTY_PRODUCTS = "products";
  private List<Product> products = null;

  public static final String JSON_PROPERTY_RULE_SETS = "ruleSets";
  private List<RuleSet> ruleSets = null;

  public static final String JSON_PROPERTY_ACHIEVEMENT_LIVE_STATUS = "achievementLiveStatus";
  private String achievementLiveStatus;

  public static final String JSON_PROPERTY_INITIAL_STATE = "initialState";
  private Integer initialState;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private List<String> category = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private List<Object> metadata = null;


  public Achievement name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public Achievement scheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Scheduling getScheduling() {
    return scheduling;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduling(Scheduling scheduling) {
    this.scheduling = scheduling;
  }


  public Achievement dependantOn(List<DependantOn> dependantOn) {
    this.dependantOn = dependantOn;
    return this;
  }

  public Achievement addDependantOnItem(DependantOn dependantOnItem) {
    if (this.dependantOn == null) {
      this.dependantOn = new ArrayList<>();
    }
    this.dependantOn.add(dependantOnItem);
    return this;
  }

   /**
   * Get dependantOn
   * @return dependantOn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPENDANT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DependantOn> getDependantOn() {
    return dependantOn;
  }


  @JsonProperty(JSON_PROPERTY_DEPENDANT_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDependantOn(List<DependantOn> dependantOn) {
    this.dependantOn = dependantOn;
  }


  public Achievement description(String description) {
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


  public Achievement icon(String icon) {
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIcon() {
    return icon;
  }


  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIcon(String icon) {
    this.icon = icon;
  }


  public Achievement rewards(List<Reward> rewards) {
    this.rewards = rewards;
    return this;
  }

  public Achievement addRewardsItem(Reward rewardsItem) {
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


  public Achievement deprecated(Boolean deprecated) {
    this.deprecated = deprecated;
    return this;
  }

   /**
   * Get deprecated
   * @return deprecated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPRECATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDeprecated() {
    return deprecated;
  }


  @JsonProperty(JSON_PROPERTY_DEPRECATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeprecated(Boolean deprecated) {
    this.deprecated = deprecated;
  }


  public Achievement products(List<Product> products) {
    this.products = products;
    return this;
  }

  public Achievement addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Product> getProducts() {
    return products;
  }


  @JsonProperty(JSON_PROPERTY_PRODUCTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProducts(List<Product> products) {
    this.products = products;
  }


  public Achievement ruleSets(List<RuleSet> ruleSets) {
    this.ruleSets = ruleSets;
    return this;
  }

  public Achievement addRuleSetsItem(RuleSet ruleSetsItem) {
    if (this.ruleSets == null) {
      this.ruleSets = new ArrayList<>();
    }
    this.ruleSets.add(ruleSetsItem);
    return this;
  }

   /**
   * Get ruleSets
   * @return ruleSets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULE_SETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RuleSet> getRuleSets() {
    return ruleSets;
  }


  @JsonProperty(JSON_PROPERTY_RULE_SETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRuleSets(List<RuleSet> ruleSets) {
    this.ruleSets = ruleSets;
  }


  public Achievement achievementLiveStatus(String achievementLiveStatus) {
    this.achievementLiveStatus = achievementLiveStatus;
    return this;
  }

   /**
   * Get achievementLiveStatus
   * @return achievementLiveStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACHIEVEMENT_LIVE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAchievementLiveStatus() {
    return achievementLiveStatus;
  }


  @JsonProperty(JSON_PROPERTY_ACHIEVEMENT_LIVE_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAchievementLiveStatus(String achievementLiveStatus) {
    this.achievementLiveStatus = achievementLiveStatus;
  }


  public Achievement initialState(Integer initialState) {
    this.initialState = initialState;
    return this;
  }

   /**
   * Get initialState
   * @return initialState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INITIAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInitialState() {
    return initialState;
  }


  @JsonProperty(JSON_PROPERTY_INITIAL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitialState(Integer initialState) {
    this.initialState = initialState;
  }


  public Achievement id(String id) {
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


  public Achievement category(List<String> category) {
    this.category = category;
    return this;
  }

  public Achievement addCategoryItem(String categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCategory(List<String> category) {
    this.category = category;
  }


  public Achievement metadata(List<Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public Achievement addMetadataItem(Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new ArrayList<>();
    }
    this.metadata.add(metadataItem);
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(List<Object> metadata) {
    this.metadata = metadata;
  }


  /**
   * Return true if this Achievement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Achievement achievement = (Achievement) o;
    return Objects.equals(this.name, achievement.name) &&
        Objects.equals(this.scheduling, achievement.scheduling) &&
        Objects.equals(this.dependantOn, achievement.dependantOn) &&
        Objects.equals(this.description, achievement.description) &&
        Objects.equals(this.icon, achievement.icon) &&
        Objects.equals(this.rewards, achievement.rewards) &&
        Objects.equals(this.deprecated, achievement.deprecated) &&
        Objects.equals(this.products, achievement.products) &&
        Objects.equals(this.ruleSets, achievement.ruleSets) &&
        Objects.equals(this.achievementLiveStatus, achievement.achievementLiveStatus) &&
        Objects.equals(this.initialState, achievement.initialState) &&
        Objects.equals(this.id, achievement.id) &&
        Objects.equals(this.category, achievement.category) &&
        Objects.equals(this.metadata, achievement.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, scheduling, dependantOn, description, icon, rewards, deprecated, products, ruleSets, achievementLiveStatus, initialState, id, category, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Achievement {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("    dependantOn: ").append(toIndentedString(dependantOn)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    rewards: ").append(toIndentedString(rewards)).append("\n");
    sb.append("    deprecated: ").append(toIndentedString(deprecated)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
    sb.append("    achievementLiveStatus: ").append(toIndentedString(achievementLiveStatus)).append("\n");
    sb.append("    initialState: ").append(toIndentedString(initialState)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
