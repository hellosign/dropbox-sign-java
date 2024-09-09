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
import com.dropbox.sign.model.EmbeddedEditUrlResponseEmbedded;
import com.dropbox.sign.model.WarningResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dropbox.sign.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.dropbox.sign.ApiException;
/**
 * EmbeddedEditUrlResponse
 */
@JsonPropertyOrder({
  EmbeddedEditUrlResponse.JSON_PROPERTY_EMBEDDED,
  EmbeddedEditUrlResponse.JSON_PROPERTY_WARNINGS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class EmbeddedEditUrlResponse {
  public static final String JSON_PROPERTY_EMBEDDED = "embedded";
  private EmbeddedEditUrlResponseEmbedded embedded;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<WarningResponse> warnings = null;

  public EmbeddedEditUrlResponse() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public EmbeddedEditUrlResponse init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, EmbeddedEditUrlResponse.class);
  }

  static public EmbeddedEditUrlResponse init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      EmbeddedEditUrlResponse.class
    );
  }

  public EmbeddedEditUrlResponse embedded(EmbeddedEditUrlResponseEmbedded embedded) {
    this.embedded = embedded;
    return this;
  }

  /**
   * Get embedded
   * @return embedded
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public EmbeddedEditUrlResponseEmbedded getEmbedded() {
    return embedded;
  }


  @JsonProperty(JSON_PROPERTY_EMBEDDED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmbedded(EmbeddedEditUrlResponseEmbedded embedded) {
    this.embedded = embedded;
  }


  public EmbeddedEditUrlResponse warnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
    return this;
  }

  public EmbeddedEditUrlResponse addWarningsItem(WarningResponse warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * A list of warnings.
   * @return warnings
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WarningResponse> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this EmbeddedEditUrlResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmbeddedEditUrlResponse embeddedEditUrlResponse = (EmbeddedEditUrlResponse) o;
    return Objects.equals(this.embedded, embeddedEditUrlResponse.embedded) &&
        Objects.equals(this.warnings, embeddedEditUrlResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embedded, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmbeddedEditUrlResponse {\n");
    sb.append("    embedded: ").append(toIndentedString(embedded)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (embedded != null) {
        if (isFileTypeOrListOfFiles(embedded)) {
            fileTypeFound = true;
        }

        if (embedded.getClass().equals(java.io.File.class) ||
            embedded.getClass().equals(Integer.class) ||
            embedded.getClass().equals(String.class) ||
            embedded.getClass().isEnum()) {
            map.put("embedded", embedded);
        } else if (isListOfFile(embedded)) {
            for(int i = 0; i< getListSize(embedded); i++) {
                map.put("embedded[" + i + "]", getFromList(embedded, i));
            }
        }
        else {
            map.put("embedded", JSON.getDefault().getMapper().writeValueAsString(embedded));
        }
    }
    if (warnings != null) {
        if (isFileTypeOrListOfFiles(warnings)) {
            fileTypeFound = true;
        }

        if (warnings.getClass().equals(java.io.File.class) ||
            warnings.getClass().equals(Integer.class) ||
            warnings.getClass().equals(String.class) ||
            warnings.getClass().isEnum()) {
            map.put("warnings", warnings);
        } else if (isListOfFile(warnings)) {
            for(int i = 0; i< getListSize(warnings); i++) {
                map.put("warnings[" + i + "]", getFromList(warnings, i));
            }
        }
        else {
            map.put("warnings", JSON.getDefault().getMapper().writeValueAsString(warnings));
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

