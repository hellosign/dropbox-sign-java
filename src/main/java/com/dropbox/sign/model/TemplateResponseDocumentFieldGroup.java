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
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.dropbox.sign.model.TemplateResponseDocumentFieldGroupRule;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dropbox.sign.JSON;


import com.dropbox.sign.ApiException;
/**
 * TemplateResponseDocumentFieldGroup
 */
@JsonPropertyOrder({
    TemplateResponseDocumentFieldGroup.JSON_PROPERTY_NAME,
    TemplateResponseDocumentFieldGroup.JSON_PROPERTY_RULE
})
@JsonIgnoreProperties(ignoreUnknown=true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateResponseDocumentFieldGroup {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE = "rule";
  private TemplateResponseDocumentFieldGroupRule rule;

  public TemplateResponseDocumentFieldGroup() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public TemplateResponseDocumentFieldGroup init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, TemplateResponseDocumentFieldGroup.class);
  }

  static public TemplateResponseDocumentFieldGroup init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      TemplateResponseDocumentFieldGroup.class
    );
  }

  public TemplateResponseDocumentFieldGroup name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the form field group.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the form field group.")
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


  public TemplateResponseDocumentFieldGroup rule(TemplateResponseDocumentFieldGroupRule rule) {
    this.rule = rule;
    return this;
  }

   /**
   * Get rule
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TemplateResponseDocumentFieldGroupRule getRule() {
    return rule;
  }


  @JsonProperty(JSON_PROPERTY_RULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRule(TemplateResponseDocumentFieldGroupRule rule) {
    this.rule = rule;
  }


  /**
   * Return true if this TemplateResponseDocumentFieldGroup object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDocumentFieldGroup templateResponseDocumentFieldGroup = (TemplateResponseDocumentFieldGroup) o;
    return Objects.equals(this.name, templateResponseDocumentFieldGroup.name) &&
        Objects.equals(this.rule, templateResponseDocumentFieldGroup.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, rule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDocumentFieldGroup {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ||
            name.getClass().isEnum()) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name[" + i + "]", getFromList(name, i));
            }
        }
        else {
            map.put("name", JSON.getDefault().getMapper().writeValueAsString(name));
        }
    }
    if (rule != null) {
        if (isFileTypeOrListOfFiles(rule)) {
            fileTypeFound = true;
        }

        if (rule.getClass().equals(java.io.File.class) ||
            rule.getClass().equals(Integer.class) ||
            rule.getClass().equals(String.class) ||
            rule.getClass().isEnum()) {
            map.put("rule", rule);
        } else if (isListOfFile(rule)) {
            for(int i = 0; i< getListSize(rule); i++) {
                map.put("rule[" + i + "]", getFromList(rule, i));
            }
        }
        else {
            map.put("rule", JSON.getDefault().getMapper().writeValueAsString(rule));
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

