/*
 * Dropbox Sign API
 * Dropbox Sign v3 API
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: apisupport@hellosign.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.dropbox.sign.model;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dropbox.sign.JSON;


import com.dropbox.sign.ApiException;
/**
 * The rule used to validate checkboxes in the form field group. See [checkbox field grouping](/api/reference/constants/#checkbox-field-grouping).
 */
@ApiModel(description = "The rule used to validate checkboxes in the form field group. See [checkbox field grouping](/api/reference/constants/#checkbox-field-grouping).")
@JsonPropertyOrder({
  TemplateResponseDocumentFieldGroupRule.JSON_PROPERTY_REQUIREMENT,
  TemplateResponseDocumentFieldGroupRule.JSON_PROPERTY_GROUP_LABEL
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateResponseDocumentFieldGroupRule {
  public static final String JSON_PROPERTY_REQUIREMENT = "requirement";
  private String requirement;

  public static final String JSON_PROPERTY_GROUP_LABEL = "groupLabel";
  private String groupLabel;

  public TemplateResponseDocumentFieldGroupRule() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public TemplateResponseDocumentFieldGroupRule init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, TemplateResponseDocumentFieldGroupRule.class);
  }

  static public TemplateResponseDocumentFieldGroupRule init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      TemplateResponseDocumentFieldGroupRule.class
    );
  }

  public TemplateResponseDocumentFieldGroupRule requirement(String requirement) {
    this.requirement = requirement;
    return this;
  }

   /**
   * Examples: &#x60;require_0-1&#x60; &#x60;require_1&#x60; &#x60;require_1-ormore&#x60;  - Check out the list of [acceptable &#x60;requirement&#x60; checkbox type values](/api/reference/constants/#checkbox-field-grouping). - Check out the list of [acceptable &#x60;requirement&#x60; radio type fields](/api/reference/constants/#radio-field-grouping). - Radio groups require **at least** two fields per group.
   * @return requirement
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Examples: `require_0-1` `require_1` `require_1-ormore`  - Check out the list of [acceptable `requirement` checkbox type values](/api/reference/constants/#checkbox-field-grouping). - Check out the list of [acceptable `requirement` radio type fields](/api/reference/constants/#radio-field-grouping). - Radio groups require **at least** two fields per group.")
  @JsonProperty(JSON_PROPERTY_REQUIREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequirement() {
    return requirement;
  }


  @JsonProperty(JSON_PROPERTY_REQUIREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequirement(String requirement) {
    this.requirement = requirement;
  }


  public TemplateResponseDocumentFieldGroupRule groupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
    return this;
  }

   /**
   * Name of the group
   * @return groupLabel
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Name of the group")
  @JsonProperty(JSON_PROPERTY_GROUP_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupLabel() {
    return groupLabel;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_LABEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupLabel(String groupLabel) {
    this.groupLabel = groupLabel;
  }


  /**
   * Return true if this TemplateResponseDocumentFieldGroupRule object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDocumentFieldGroupRule templateResponseDocumentFieldGroupRule = (TemplateResponseDocumentFieldGroupRule) o;
    return Objects.equals(this.requirement, templateResponseDocumentFieldGroupRule.requirement) &&
        Objects.equals(this.groupLabel, templateResponseDocumentFieldGroupRule.groupLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requirement, groupLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDocumentFieldGroupRule {\n");
    sb.append("    requirement: ").append(toIndentedString(requirement)).append("\n");
    sb.append("    groupLabel: ").append(toIndentedString(groupLabel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (requirement != null) {
        if (isFileTypeOrListOfFiles(requirement)) {
            fileTypeFound = true;
        }

        if (requirement.getClass().equals(java.io.File.class) ||
            requirement.getClass().equals(Integer.class) ||
            requirement.getClass().equals(String.class) ||
            requirement.getClass().isEnum()) {
            map.put("requirement", requirement);
        } else if (isListOfFile(requirement)) {
            for(int i = 0; i< getListSize(requirement); i++) {
                map.put("requirement[" + i + "]", getFromList(requirement, i));
            }
        }
        else {
            map.put("requirement", JSON.getDefault().getMapper().writeValueAsString(requirement));
        }
    }
    if (groupLabel != null) {
        if (isFileTypeOrListOfFiles(groupLabel)) {
            fileTypeFound = true;
        }

        if (groupLabel.getClass().equals(java.io.File.class) ||
            groupLabel.getClass().equals(Integer.class) ||
            groupLabel.getClass().equals(String.class) ||
            groupLabel.getClass().isEnum()) {
            map.put("groupLabel", groupLabel);
        } else if (isListOfFile(groupLabel)) {
            for(int i = 0; i< getListSize(groupLabel); i++) {
                map.put("groupLabel[" + i + "]", getFromList(groupLabel, i));
            }
        }
        else {
            map.put("groupLabel", JSON.getDefault().getMapper().writeValueAsString(groupLabel));
        }
    }
    } catch (Exception e) {
        throw new ApiException(e);
    }

    return fileTypeFound ? map : new HashMap<>();
  }

  private boolean isFileTypeOrListOfFiles(Object obj) throws Exception {
    return obj.getClass().equals(java.io.File.class) || isListOfFile(obj);
  }

  private boolean isListOfFile(Object obj) throws Exception {
      return obj instanceof java.util.List && !isListEmpty(obj) && getFromList(obj, 0) instanceof java.io.File;
  }

  private boolean isListEmpty(Object obj) throws Exception {
    return (boolean) Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
  }

  private Object getFromList(Object obj, int index) throws Exception {
    return Class.forName(java.util.List.class.getName()).getMethod("get", int.class).invoke(obj, index);
  }

  private int getListSize(Object obj) throws Exception {
    return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
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

