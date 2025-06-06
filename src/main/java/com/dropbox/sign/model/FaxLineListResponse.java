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
import com.dropbox.sign.model.FaxLineResponseFaxLine;
import com.dropbox.sign.model.ListInfoResponse;
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
 * FaxLineListResponse
 */
@JsonPropertyOrder({
  FaxLineListResponse.JSON_PROPERTY_LIST_INFO,
  FaxLineListResponse.JSON_PROPERTY_FAX_LINES,
  FaxLineListResponse.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class FaxLineListResponse {
  public static final String JSON_PROPERTY_LIST_INFO = "list_info";
  @jakarta.annotation.Nonnull
  private ListInfoResponse listInfo;

  public static final String JSON_PROPERTY_FAX_LINES = "fax_lines";
  @jakarta.annotation.Nonnull
  private List<FaxLineResponseFaxLine> faxLines = new ArrayList<>();

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  @jakarta.annotation.Nullable
  private WarningResponse warnings;

  public FaxLineListResponse() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public FaxLineListResponse init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, FaxLineListResponse.class);
  }

  static public FaxLineListResponse init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      FaxLineListResponse.class
    );
  }

  public FaxLineListResponse listInfo(@jakarta.annotation.Nonnull ListInfoResponse listInfo) {
    this.listInfo = listInfo;
    return this;
  }

  /**
   * Get listInfo
   * @return listInfo
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_LIST_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ListInfoResponse getListInfo() {
    return listInfo;
  }


  @JsonProperty(JSON_PROPERTY_LIST_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setListInfo(@jakarta.annotation.Nonnull ListInfoResponse listInfo) {
    this.listInfo = listInfo;
  }


  public FaxLineListResponse faxLines(@jakarta.annotation.Nonnull List<FaxLineResponseFaxLine> faxLines) {
    this.faxLines = faxLines;
    return this;
  }

  public FaxLineListResponse addFaxLinesItem(FaxLineResponseFaxLine faxLinesItem) {
    if (this.faxLines == null) {
      this.faxLines = new ArrayList<>();
    }
    this.faxLines.add(faxLinesItem);
    return this;
  }

  /**
   * Get faxLines
   * @return faxLines
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FAX_LINES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FaxLineResponseFaxLine> getFaxLines() {
    return faxLines;
  }


  @JsonProperty(JSON_PROPERTY_FAX_LINES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFaxLines(@jakarta.annotation.Nonnull List<FaxLineResponseFaxLine> faxLines) {
    this.faxLines = faxLines;
  }


  public FaxLineListResponse warnings(@jakarta.annotation.Nullable WarningResponse warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * Get warnings
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public WarningResponse getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(@jakarta.annotation.Nullable WarningResponse warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this FaxLineListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaxLineListResponse faxLineListResponse = (FaxLineListResponse) o;
    return Objects.equals(this.listInfo, faxLineListResponse.listInfo) &&
        Objects.equals(this.faxLines, faxLineListResponse.faxLines) &&
        Objects.equals(this.warnings, faxLineListResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listInfo, faxLines, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxLineListResponse {\n");
    sb.append("    listInfo: ").append(toIndentedString(listInfo)).append("\n");
    sb.append("    faxLines: ").append(toIndentedString(faxLines)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (listInfo != null) {
        if (isFileTypeOrListOfFiles(listInfo)) {
            fileTypeFound = true;
        }

        if (listInfo.getClass().equals(java.io.File.class) ||
            listInfo.getClass().equals(Integer.class) ||
            listInfo.getClass().equals(String.class) ||
            listInfo.getClass().isEnum()) {
            map.put("list_info", listInfo);
        } else if (isListOfFile(listInfo)) {
            for(int i = 0; i< getListSize(listInfo); i++) {
                map.put("list_info[" + i + "]", getFromList(listInfo, i));
            }
        }
        else {
            map.put("list_info", JSON.getDefault().getMapper().writeValueAsString(listInfo));
        }
    }
    if (faxLines != null) {
        if (isFileTypeOrListOfFiles(faxLines)) {
            fileTypeFound = true;
        }

        if (faxLines.getClass().equals(java.io.File.class) ||
            faxLines.getClass().equals(Integer.class) ||
            faxLines.getClass().equals(String.class) ||
            faxLines.getClass().isEnum()) {
            map.put("fax_lines", faxLines);
        } else if (isListOfFile(faxLines)) {
            for(int i = 0; i< getListSize(faxLines); i++) {
                map.put("fax_lines[" + i + "]", getFromList(faxLines, i));
            }
        }
        else {
            map.put("fax_lines", JSON.getDefault().getMapper().writeValueAsString(faxLines));
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

