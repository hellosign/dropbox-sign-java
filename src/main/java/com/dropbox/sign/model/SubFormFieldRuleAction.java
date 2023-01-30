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
 * SubFormFieldRuleAction
 */
@JsonPropertyOrder({
    SubFormFieldRuleAction.JSON_PROPERTY_HIDDEN,
    SubFormFieldRuleAction.JSON_PROPERTY_TYPE,
    SubFormFieldRuleAction.JSON_PROPERTY_FIELD_ID,
    SubFormFieldRuleAction.JSON_PROPERTY_GROUP_ID
})
@JsonIgnoreProperties(ignoreUnknown=true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubFormFieldRuleAction {
  public static final String JSON_PROPERTY_HIDDEN = "hidden";
  private Boolean hidden;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    FIELD_VISIBILITY("change-field-visibility"),
    
    GROUP_VISIBILITY("change-group-visibility");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_FIELD_ID = "field_id";
  private String fieldId;

  public static final String JSON_PROPERTY_GROUP_ID = "group_id";
  private String groupId;

  public SubFormFieldRuleAction() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SubFormFieldRuleAction init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SubFormFieldRuleAction.class);
  }

  public SubFormFieldRuleAction hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * &#x60;true&#x60; to hide the target field when rule is satisfied, otherwise &#x60;false&#x60;.
   * @return hidden
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "`true` to hide the target field when rule is satisfied, otherwise `false`.")
  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getHidden() {
    return hidden;
  }


  @JsonProperty(JSON_PROPERTY_HIDDEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  public SubFormFieldRuleAction type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public SubFormFieldRuleAction fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

   /**
   * **field_id** or **group_id** is required, but not both.  Must reference the &#x60;api_id&#x60; of an existing field defined within &#x60;form_fields_per_document&#x60;.  Cannot use with &#x60;group_id&#x60;. Trigger and action fields must belong to the same signer.
   * @return fieldId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**field_id** or **group_id** is required, but not both.  Must reference the `api_id` of an existing field defined within `form_fields_per_document`.  Cannot use with `group_id`. Trigger and action fields must belong to the same signer.")
  @JsonProperty(JSON_PROPERTY_FIELD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFieldId() {
    return fieldId;
  }


  @JsonProperty(JSON_PROPERTY_FIELD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }


  public SubFormFieldRuleAction groupId(String groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * **group_id** or **field_id** is required, but not both.  Must reference the ID of an existing group defined within &#x60;form_field_groups&#x60;.  Cannot use with &#x60;field_id&#x60;. Trigger and action fields and groups must belong to the same signer.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "**group_id** or **field_id** is required, but not both.  Must reference the ID of an existing group defined within `form_field_groups`.  Cannot use with `field_id`. Trigger and action fields and groups must belong to the same signer.")
  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroupId() {
    return groupId;
  }


  @JsonProperty(JSON_PROPERTY_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  /**
   * Return true if this SubFormFieldRuleAction object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubFormFieldRuleAction subFormFieldRuleAction = (SubFormFieldRuleAction) o;
    return Objects.equals(this.hidden, subFormFieldRuleAction.hidden) &&
        Objects.equals(this.type, subFormFieldRuleAction.type) &&
        Objects.equals(this.fieldId, subFormFieldRuleAction.fieldId) &&
        Objects.equals(this.groupId, subFormFieldRuleAction.groupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hidden, type, fieldId, groupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubFormFieldRuleAction {\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (hidden != null) {
        if (isFileTypeOrListOfFiles(hidden)) {
            fileTypeFound = true;
        }

        if (hidden.getClass().equals(java.io.File.class) ||
            hidden.getClass().equals(Integer.class) ||
            hidden.getClass().equals(String.class) ||
            hidden.getClass().isEnum()) {
            map.put("hidden", hidden);
        } else if (isListOfFile(hidden)) {
            for(int i = 0; i< getListSize(hidden); i++) {
                map.put("hidden[" + i + "]", getFromList(hidden, i));
            }
        }
        else {
            map.put("hidden", JSON.getDefault().getMapper().writeValueAsString(hidden));
        }
    }
    if (type != null) {
        if (isFileTypeOrListOfFiles(type)) {
            fileTypeFound = true;
        }

        if (type.getClass().equals(java.io.File.class) ||
            type.getClass().equals(Integer.class) ||
            type.getClass().equals(String.class) ||
            type.getClass().isEnum()) {
            map.put("type", type);
        } else if (isListOfFile(type)) {
            for(int i = 0; i< getListSize(type); i++) {
                map.put("type[" + i + "]", getFromList(type, i));
            }
        }
        else {
            map.put("type", JSON.getDefault().getMapper().writeValueAsString(type));
        }
    }
    if (fieldId != null) {
        if (isFileTypeOrListOfFiles(fieldId)) {
            fileTypeFound = true;
        }

        if (fieldId.getClass().equals(java.io.File.class) ||
            fieldId.getClass().equals(Integer.class) ||
            fieldId.getClass().equals(String.class) ||
            fieldId.getClass().isEnum()) {
            map.put("field_id", fieldId);
        } else if (isListOfFile(fieldId)) {
            for(int i = 0; i< getListSize(fieldId); i++) {
                map.put("field_id[" + i + "]", getFromList(fieldId, i));
            }
        }
        else {
            map.put("field_id", JSON.getDefault().getMapper().writeValueAsString(fieldId));
        }
    }
    if (groupId != null) {
        if (isFileTypeOrListOfFiles(groupId)) {
            fileTypeFound = true;
        }

        if (groupId.getClass().equals(java.io.File.class) ||
            groupId.getClass().equals(Integer.class) ||
            groupId.getClass().equals(String.class) ||
            groupId.getClass().isEnum()) {
            map.put("group_id", groupId);
        } else if (isListOfFile(groupId)) {
            for(int i = 0; i< getListSize(groupId); i++) {
                map.put("group_id[" + i + "]", getFromList(groupId, i));
            }
        }
        else {
            map.put("group_id", JSON.getDefault().getMapper().writeValueAsString(groupId));
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

