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
import com.dropbox.sign.model.SubBulkSignerListCustomField;
import com.dropbox.sign.model.SubSignatureRequestTemplateSigner;
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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dropbox.sign.JSON;


import com.dropbox.sign.ApiException;
/**
 * SubBulkSignerList
 */
@JsonPropertyOrder({
    SubBulkSignerList.JSON_PROPERTY_CUSTOM_FIELDS,
    SubBulkSignerList.JSON_PROPERTY_SIGNERS
})
@JsonIgnoreProperties(ignoreUnknown=true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubBulkSignerList {
  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private List<SubBulkSignerListCustomField> customFields = null;

  public static final String JSON_PROPERTY_SIGNERS = "signers";
  private List<SubSignatureRequestTemplateSigner> signers = null;

  public SubBulkSignerList() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SubBulkSignerList init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SubBulkSignerList.class);
  }

  static public SubBulkSignerList init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      SubBulkSignerList.class
    );
  }

  public SubBulkSignerList customFields(List<SubBulkSignerListCustomField> customFields) {
    this.customFields = customFields;
    return this;
  }

  public SubBulkSignerList addCustomFieldsItem(SubBulkSignerListCustomField customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An array of custom field values.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array of custom field values.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubBulkSignerListCustomField> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(List<SubBulkSignerListCustomField> customFields) {
    this.customFields = customFields;
  }


  public SubBulkSignerList signers(List<SubSignatureRequestTemplateSigner> signers) {
    this.signers = signers;
    return this;
  }

  public SubBulkSignerList addSignersItem(SubSignatureRequestTemplateSigner signersItem) {
    if (this.signers == null) {
      this.signers = new ArrayList<>();
    }
    this.signers.add(signersItem);
    return this;
  }

   /**
   * Add Signers to your Templated-based Signature Request. Allows the requester to specify editor options when a preparing a document.  Currently only templates with a single role are supported. All signers must have the same &#x60;role&#x60; value.
   * @return signers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add Signers to your Templated-based Signature Request. Allows the requester to specify editor options when a preparing a document.  Currently only templates with a single role are supported. All signers must have the same `role` value.")
  @JsonProperty(JSON_PROPERTY_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubSignatureRequestTemplateSigner> getSigners() {
    return signers;
  }


  @JsonProperty(JSON_PROPERTY_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSigners(List<SubSignatureRequestTemplateSigner> signers) {
    this.signers = signers;
  }


  /**
   * Return true if this SubBulkSignerList object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubBulkSignerList subBulkSignerList = (SubBulkSignerList) o;
    return Objects.equals(this.customFields, subBulkSignerList.customFields) &&
        Objects.equals(this.signers, subBulkSignerList.signers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customFields, signers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubBulkSignerList {\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (customFields != null) {
        if (isFileTypeOrListOfFiles(customFields)) {
            fileTypeFound = true;
        }

        if (customFields.getClass().equals(java.io.File.class) ||
            customFields.getClass().equals(Integer.class) ||
            customFields.getClass().equals(String.class) ||
            customFields.getClass().isEnum()) {
            map.put("custom_fields", customFields);
        } else if (isListOfFile(customFields)) {
            for(int i = 0; i< getListSize(customFields); i++) {
                map.put("custom_fields[" + i + "]", getFromList(customFields, i));
            }
        }
        else {
            map.put("custom_fields", JSON.getDefault().getMapper().writeValueAsString(customFields));
        }
    }
    if (signers != null) {
        if (isFileTypeOrListOfFiles(signers)) {
            fileTypeFound = true;
        }

        if (signers.getClass().equals(java.io.File.class) ||
            signers.getClass().equals(Integer.class) ||
            signers.getClass().equals(String.class) ||
            signers.getClass().isEnum()) {
            map.put("signers", signers);
        } else if (isListOfFile(signers)) {
            for(int i = 0; i< getListSize(signers); i++) {
                map.put("signers[" + i + "]", getFromList(signers, i));
            }
        }
        else {
            map.put("signers", JSON.getDefault().getMapper().writeValueAsString(signers));
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

