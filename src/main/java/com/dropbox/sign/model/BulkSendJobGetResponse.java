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
import com.dropbox.sign.model.BulkSendJobGetResponseSignatureRequests;
import com.dropbox.sign.model.BulkSendJobResponse;
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
 * BulkSendJobGetResponse
 */
@JsonPropertyOrder({
  BulkSendJobGetResponse.JSON_PROPERTY_BULK_SEND_JOB,
  BulkSendJobGetResponse.JSON_PROPERTY_LIST_INFO,
  BulkSendJobGetResponse.JSON_PROPERTY_SIGNATURE_REQUESTS,
  BulkSendJobGetResponse.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class BulkSendJobGetResponse {
  public static final String JSON_PROPERTY_BULK_SEND_JOB = "bulk_send_job";
  @jakarta.annotation.Nonnull
  private BulkSendJobResponse bulkSendJob;

  public static final String JSON_PROPERTY_LIST_INFO = "list_info";
  @jakarta.annotation.Nonnull
  private ListInfoResponse listInfo;

  public static final String JSON_PROPERTY_SIGNATURE_REQUESTS = "signature_requests";
  @jakarta.annotation.Nonnull
  private List<BulkSendJobGetResponseSignatureRequests> signatureRequests = new ArrayList<>();

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  @jakarta.annotation.Nullable
  private List<WarningResponse> warnings = null;

  public BulkSendJobGetResponse() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public BulkSendJobGetResponse init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, BulkSendJobGetResponse.class);
  }

  static public BulkSendJobGetResponse init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      BulkSendJobGetResponse.class
    );
  }

  public BulkSendJobGetResponse bulkSendJob(@jakarta.annotation.Nonnull BulkSendJobResponse bulkSendJob) {
    this.bulkSendJob = bulkSendJob;
    return this;
  }

  /**
   * Get bulkSendJob
   * @return bulkSendJob
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BULK_SEND_JOB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BulkSendJobResponse getBulkSendJob() {
    return bulkSendJob;
  }


  @JsonProperty(JSON_PROPERTY_BULK_SEND_JOB)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBulkSendJob(@jakarta.annotation.Nonnull BulkSendJobResponse bulkSendJob) {
    this.bulkSendJob = bulkSendJob;
  }


  public BulkSendJobGetResponse listInfo(@jakarta.annotation.Nonnull ListInfoResponse listInfo) {
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


  public BulkSendJobGetResponse signatureRequests(@jakarta.annotation.Nonnull List<BulkSendJobGetResponseSignatureRequests> signatureRequests) {
    this.signatureRequests = signatureRequests;
    return this;
  }

  public BulkSendJobGetResponse addSignatureRequestsItem(BulkSendJobGetResponseSignatureRequests signatureRequestsItem) {
    if (this.signatureRequests == null) {
      this.signatureRequests = new ArrayList<>();
    }
    this.signatureRequests.add(signatureRequestsItem);
    return this;
  }

  /**
   * Contains information about the Signature Requests sent in bulk.
   * @return signatureRequests
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<BulkSendJobGetResponseSignatureRequests> getSignatureRequests() {
    return signatureRequests;
  }


  @JsonProperty(JSON_PROPERTY_SIGNATURE_REQUESTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSignatureRequests(@jakarta.annotation.Nonnull List<BulkSendJobGetResponseSignatureRequests> signatureRequests) {
    this.signatureRequests = signatureRequests;
  }


  public BulkSendJobGetResponse warnings(@jakarta.annotation.Nullable List<WarningResponse> warnings) {
    this.warnings = warnings;
    return this;
  }

  public BulkSendJobGetResponse addWarningsItem(WarningResponse warningsItem) {
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
  public void setWarnings(@jakarta.annotation.Nullable List<WarningResponse> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this BulkSendJobGetResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkSendJobGetResponse bulkSendJobGetResponse = (BulkSendJobGetResponse) o;
    return Objects.equals(this.bulkSendJob, bulkSendJobGetResponse.bulkSendJob) &&
        Objects.equals(this.listInfo, bulkSendJobGetResponse.listInfo) &&
        Objects.equals(this.signatureRequests, bulkSendJobGetResponse.signatureRequests) &&
        Objects.equals(this.warnings, bulkSendJobGetResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkSendJob, listInfo, signatureRequests, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkSendJobGetResponse {\n");
    sb.append("    bulkSendJob: ").append(toIndentedString(bulkSendJob)).append("\n");
    sb.append("    listInfo: ").append(toIndentedString(listInfo)).append("\n");
    sb.append("    signatureRequests: ").append(toIndentedString(signatureRequests)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (bulkSendJob != null) {
        if (isFileTypeOrListOfFiles(bulkSendJob)) {
            fileTypeFound = true;
        }

        if (bulkSendJob.getClass().equals(java.io.File.class) ||
            bulkSendJob.getClass().equals(Integer.class) ||
            bulkSendJob.getClass().equals(String.class) ||
            bulkSendJob.getClass().isEnum()) {
            map.put("bulk_send_job", bulkSendJob);
        } else if (isListOfFile(bulkSendJob)) {
            for(int i = 0; i< getListSize(bulkSendJob); i++) {
                map.put("bulk_send_job[" + i + "]", getFromList(bulkSendJob, i));
            }
        }
        else {
            map.put("bulk_send_job", JSON.getDefault().getMapper().writeValueAsString(bulkSendJob));
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

