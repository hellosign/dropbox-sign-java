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
import com.dropbox.sign.model.ListInfoResponse;
import com.dropbox.sign.model.SignatureRequestResponse;
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
 * SignatureRequestListResponse
 */
@JsonPropertyOrder({
  SignatureRequestListResponse.JSON_PROPERTY_SIGNATURE_REQUESTS,
  SignatureRequestListResponse.JSON_PROPERTY_LIST_INFO,
  SignatureRequestListResponse.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class SignatureRequestListResponse {
  public static final String JSON_PROPERTY_SIGNATURE_REQUESTS = "signature_requests";
  private List<SignatureRequestResponse> signatureRequests = new ArrayList<>();

  public static final String JSON_PROPERTY_LIST_INFO = "list_info";
  private ListInfoResponse listInfo;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<WarningResponse> warnings = null;

  public SignatureRequestListResponse() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SignatureRequestListResponse init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SignatureRequestListResponse.class);
  }

  static public SignatureRequestListResponse init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      SignatureRequestListResponse.class
    );
  }

  public SignatureRequestListResponse signatureRequests(List<SignatureRequestResponse> signatureRequests) {
    this.signatureRequests = signatureRequests;
    return this;
  }

  public SignatureRequestListResponse addSignatureRequestsItem(SignatureRequestResponse signatureRequestsItem) {
    if (this.signatureRequests == null) {
      this.signatureRequests = new ArrayList<>();
    }
    this.signatureRequests.add(signatureRequestsItem);
    return this;
  }

  /**
   * Contains information about signature requests.
   * @return signatureRequests
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SignatureRequestResponse> getSignatureRequests() {
    return signatureRequests;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSignatureRequests(List<SignatureRequestResponse> signatureRequests) {
    this.signatureRequests = signatureRequests;
  }


  public SignatureRequestListResponse listInfo(ListInfoResponse listInfo) {
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
  public void setListInfo(ListInfoResponse listInfo) {
    this.listInfo = listInfo;
  }


  public SignatureRequestListResponse warnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
    return this;
  }

  public SignatureRequestListResponse addWarningsItem(WarningResponse warningsItem) {
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
  @jakarta.annotation.Nullable
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
   * Return true if this SignatureRequestListResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureRequestListResponse signatureRequestListResponse = (SignatureRequestListResponse) o;
    return Objects.equals(this.signatureRequests, signatureRequestListResponse.signatureRequests) &&
        Objects.equals(this.listInfo, signatureRequestListResponse.listInfo) &&
        Objects.equals(this.warnings, signatureRequestListResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signatureRequests, listInfo, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureRequestListResponse {\n");
    sb.append("    signatureRequests: ").append(toIndentedString(signatureRequests)).append("\n");
    sb.append("    listInfo: ").append(toIndentedString(listInfo)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (signatureRequests != null) {
        if (isFileTypeOrListOfFiles(signatureRequests)) {
            fileTypeFound = true;
        }

        if (signatureRequests.getClass().equals(java.io.File.class) ||
            signatureRequests.getClass().equals(Integer.class) ||
            signatureRequests.getClass().equals(String.class) ||
            signatureRequests.getClass().isEnum()) {
            map.put("signature_requests", signatureRequests);
        } else if (isListOfFile(signatureRequests)) {
            for(int i = 0; i< getListSize(signatureRequests); i++) {
                map.put("signature_requests[" + i + "]", getFromList(signatureRequests, i));
            }
        }
        else {
            map.put("signature_requests", JSON.getDefault().getMapper().writeValueAsString(signatureRequests));
        }
    }
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

