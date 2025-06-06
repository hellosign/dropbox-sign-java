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
import com.dropbox.sign.model.FaxResponseTransmission;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dropbox.sign.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.dropbox.sign.ApiException;
/**
 * FaxResponse
 */
@JsonPropertyOrder({
  FaxResponse.JSON_PROPERTY_FAX_ID,
  FaxResponse.JSON_PROPERTY_TITLE,
  FaxResponse.JSON_PROPERTY_ORIGINAL_TITLE,
  FaxResponse.JSON_PROPERTY_METADATA,
  FaxResponse.JSON_PROPERTY_CREATED_AT,
  FaxResponse.JSON_PROPERTY_SENDER,
  FaxResponse.JSON_PROPERTY_FILES_URL,
  FaxResponse.JSON_PROPERTY_TRANSMISSIONS,
  FaxResponse.JSON_PROPERTY_SUBJECT,
  FaxResponse.JSON_PROPERTY_MESSAGE,
  FaxResponse.JSON_PROPERTY_FINAL_COPY_URI
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class FaxResponse {
  public static final String JSON_PROPERTY_FAX_ID = "fax_id";
  @jakarta.annotation.Nonnull
  private String faxId;

  public static final String JSON_PROPERTY_TITLE = "title";
  @jakarta.annotation.Nonnull
  private String title;

  public static final String JSON_PROPERTY_ORIGINAL_TITLE = "original_title";
  @jakarta.annotation.Nonnull
  private String originalTitle;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  @jakarta.annotation.Nonnull
  private Map<String, Object> metadata = new HashMap<>();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  @jakarta.annotation.Nonnull
  private Integer createdAt;

  public static final String JSON_PROPERTY_SENDER = "sender";
  @jakarta.annotation.Nonnull
  private String sender;

  public static final String JSON_PROPERTY_FILES_URL = "files_url";
  @jakarta.annotation.Nonnull
  private String filesUrl;

  public static final String JSON_PROPERTY_TRANSMISSIONS = "transmissions";
  @jakarta.annotation.Nonnull
  private List<FaxResponseTransmission> transmissions = new ArrayList<>();

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  @jakarta.annotation.Nullable
  private String subject;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  @jakarta.annotation.Nullable
  private String message;

  public static final String JSON_PROPERTY_FINAL_COPY_URI = "final_copy_uri";
  @jakarta.annotation.Nullable
  private String finalCopyUri;

  public FaxResponse() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public FaxResponse init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, FaxResponse.class);
  }

  static public FaxResponse init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      FaxResponse.class
    );
  }

  public FaxResponse faxId(@jakarta.annotation.Nonnull String faxId) {
    this.faxId = faxId;
    return this;
  }

  /**
   * Fax ID
   * @return faxId
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FAX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFaxId() {
    return faxId;
  }


  @JsonProperty(JSON_PROPERTY_FAX_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFaxId(@jakarta.annotation.Nonnull String faxId) {
    this.faxId = faxId;
  }


  public FaxResponse title(@jakarta.annotation.Nonnull String title) {
    this.title = title;
    return this;
  }

  /**
   * Fax Title
   * @return title
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(@jakarta.annotation.Nonnull String title) {
    this.title = title;
  }


  public FaxResponse originalTitle(@jakarta.annotation.Nonnull String originalTitle) {
    this.originalTitle = originalTitle;
    return this;
  }

  /**
   * Fax Original Title
   * @return originalTitle
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ORIGINAL_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOriginalTitle() {
    return originalTitle;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOriginalTitle(@jakarta.annotation.Nonnull String originalTitle) {
    this.originalTitle = originalTitle;
  }


  public FaxResponse metadata(@jakarta.annotation.Nonnull Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public FaxResponse putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Fax Metadata
   * @return metadata
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.ALWAYS)
  public void setMetadata(@jakarta.annotation.Nonnull Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public FaxResponse createdAt(@jakarta.annotation.Nonnull Integer createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Fax Created At Timestamp
   * @return createdAt
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(@jakarta.annotation.Nonnull Integer createdAt) {
    this.createdAt = createdAt;
  }


  public FaxResponse sender(@jakarta.annotation.Nonnull String sender) {
    this.sender = sender;
    return this;
  }

  /**
   * Fax Sender Email
   * @return sender
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSender() {
    return sender;
  }


  @JsonProperty(JSON_PROPERTY_SENDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSender(@jakarta.annotation.Nonnull String sender) {
    this.sender = sender;
  }


  public FaxResponse filesUrl(@jakarta.annotation.Nonnull String filesUrl) {
    this.filesUrl = filesUrl;
    return this;
  }

  /**
   * Fax Files URL
   * @return filesUrl
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_FILES_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFilesUrl() {
    return filesUrl;
  }


  @JsonProperty(JSON_PROPERTY_FILES_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFilesUrl(@jakarta.annotation.Nonnull String filesUrl) {
    this.filesUrl = filesUrl;
  }


  public FaxResponse transmissions(@jakarta.annotation.Nonnull List<FaxResponseTransmission> transmissions) {
    this.transmissions = transmissions;
    return this;
  }

  public FaxResponse addTransmissionsItem(FaxResponseTransmission transmissionsItem) {
    if (this.transmissions == null) {
      this.transmissions = new ArrayList<>();
    }
    this.transmissions.add(transmissionsItem);
    return this;
  }

  /**
   * Fax Transmissions List
   * @return transmissions
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TRANSMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<FaxResponseTransmission> getTransmissions() {
    return transmissions;
  }


  @JsonProperty(JSON_PROPERTY_TRANSMISSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTransmissions(@jakarta.annotation.Nonnull List<FaxResponseTransmission> transmissions) {
    this.transmissions = transmissions;
  }


  public FaxResponse subject(@jakarta.annotation.Nullable String subject) {
    this.subject = subject;
    return this;
  }

  /**
   * Fax Subject
   * @return subject
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(@jakarta.annotation.Nullable String subject) {
    this.subject = subject;
  }


  public FaxResponse message(@jakarta.annotation.Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Fax Message
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(@jakarta.annotation.Nullable String message) {
    this.message = message;
  }


  public FaxResponse finalCopyUri(@jakarta.annotation.Nullable String finalCopyUri) {
    this.finalCopyUri = finalCopyUri;
    return this;
  }

  /**
   * The path where the completed document can be downloaded
   * @return finalCopyUri
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FINAL_COPY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFinalCopyUri() {
    return finalCopyUri;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_COPY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFinalCopyUri(@jakarta.annotation.Nullable String finalCopyUri) {
    this.finalCopyUri = finalCopyUri;
  }


  /**
   * Return true if this FaxResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaxResponse faxResponse = (FaxResponse) o;
    return Objects.equals(this.faxId, faxResponse.faxId) &&
        Objects.equals(this.title, faxResponse.title) &&
        Objects.equals(this.originalTitle, faxResponse.originalTitle) &&
        Objects.equals(this.metadata, faxResponse.metadata) &&
        Objects.equals(this.createdAt, faxResponse.createdAt) &&
        Objects.equals(this.sender, faxResponse.sender) &&
        Objects.equals(this.filesUrl, faxResponse.filesUrl) &&
        Objects.equals(this.transmissions, faxResponse.transmissions) &&
        Objects.equals(this.subject, faxResponse.subject) &&
        Objects.equals(this.message, faxResponse.message) &&
        Objects.equals(this.finalCopyUri, faxResponse.finalCopyUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(faxId, title, originalTitle, metadata, createdAt, sender, filesUrl, transmissions, subject, message, finalCopyUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxResponse {\n");
    sb.append("    faxId: ").append(toIndentedString(faxId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    originalTitle: ").append(toIndentedString(originalTitle)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
    sb.append("    filesUrl: ").append(toIndentedString(filesUrl)).append("\n");
    sb.append("    transmissions: ").append(toIndentedString(transmissions)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    finalCopyUri: ").append(toIndentedString(finalCopyUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (faxId != null) {
        if (isFileTypeOrListOfFiles(faxId)) {
            fileTypeFound = true;
        }

        if (faxId.getClass().equals(java.io.File.class) ||
            faxId.getClass().equals(Integer.class) ||
            faxId.getClass().equals(String.class) ||
            faxId.getClass().isEnum()) {
            map.put("fax_id", faxId);
        } else if (isListOfFile(faxId)) {
            for(int i = 0; i< getListSize(faxId); i++) {
                map.put("fax_id[" + i + "]", getFromList(faxId, i));
            }
        }
        else {
            map.put("fax_id", JSON.getDefault().getMapper().writeValueAsString(faxId));
        }
    }
    if (title != null) {
        if (isFileTypeOrListOfFiles(title)) {
            fileTypeFound = true;
        }

        if (title.getClass().equals(java.io.File.class) ||
            title.getClass().equals(Integer.class) ||
            title.getClass().equals(String.class) ||
            title.getClass().isEnum()) {
            map.put("title", title);
        } else if (isListOfFile(title)) {
            for(int i = 0; i< getListSize(title); i++) {
                map.put("title[" + i + "]", getFromList(title, i));
            }
        }
        else {
            map.put("title", JSON.getDefault().getMapper().writeValueAsString(title));
        }
    }
    if (originalTitle != null) {
        if (isFileTypeOrListOfFiles(originalTitle)) {
            fileTypeFound = true;
        }

        if (originalTitle.getClass().equals(java.io.File.class) ||
            originalTitle.getClass().equals(Integer.class) ||
            originalTitle.getClass().equals(String.class) ||
            originalTitle.getClass().isEnum()) {
            map.put("original_title", originalTitle);
        } else if (isListOfFile(originalTitle)) {
            for(int i = 0; i< getListSize(originalTitle); i++) {
                map.put("original_title[" + i + "]", getFromList(originalTitle, i));
            }
        }
        else {
            map.put("original_title", JSON.getDefault().getMapper().writeValueAsString(originalTitle));
        }
    }
    if (metadata != null) {
        if (isFileTypeOrListOfFiles(metadata)) {
            fileTypeFound = true;
        }

        if (metadata.getClass().equals(java.io.File.class) ||
            metadata.getClass().equals(Integer.class) ||
            metadata.getClass().equals(String.class) ||
            metadata.getClass().isEnum()) {
            map.put("metadata", metadata);
        } else if (isListOfFile(metadata)) {
            for(int i = 0; i< getListSize(metadata); i++) {
                map.put("metadata[" + i + "]", getFromList(metadata, i));
            }
        }
        else {
            map.put("metadata", JSON.getDefault().getMapper().writeValueAsString(metadata));
        }
    }
    if (createdAt != null) {
        if (isFileTypeOrListOfFiles(createdAt)) {
            fileTypeFound = true;
        }

        if (createdAt.getClass().equals(java.io.File.class) ||
            createdAt.getClass().equals(Integer.class) ||
            createdAt.getClass().equals(String.class) ||
            createdAt.getClass().isEnum()) {
            map.put("created_at", createdAt);
        } else if (isListOfFile(createdAt)) {
            for(int i = 0; i< getListSize(createdAt); i++) {
                map.put("created_at[" + i + "]", getFromList(createdAt, i));
            }
        }
        else {
            map.put("created_at", JSON.getDefault().getMapper().writeValueAsString(createdAt));
        }
    }
    if (sender != null) {
        if (isFileTypeOrListOfFiles(sender)) {
            fileTypeFound = true;
        }

        if (sender.getClass().equals(java.io.File.class) ||
            sender.getClass().equals(Integer.class) ||
            sender.getClass().equals(String.class) ||
            sender.getClass().isEnum()) {
            map.put("sender", sender);
        } else if (isListOfFile(sender)) {
            for(int i = 0; i< getListSize(sender); i++) {
                map.put("sender[" + i + "]", getFromList(sender, i));
            }
        }
        else {
            map.put("sender", JSON.getDefault().getMapper().writeValueAsString(sender));
        }
    }
    if (filesUrl != null) {
        if (isFileTypeOrListOfFiles(filesUrl)) {
            fileTypeFound = true;
        }

        if (filesUrl.getClass().equals(java.io.File.class) ||
            filesUrl.getClass().equals(Integer.class) ||
            filesUrl.getClass().equals(String.class) ||
            filesUrl.getClass().isEnum()) {
            map.put("files_url", filesUrl);
        } else if (isListOfFile(filesUrl)) {
            for(int i = 0; i< getListSize(filesUrl); i++) {
                map.put("files_url[" + i + "]", getFromList(filesUrl, i));
            }
        }
        else {
            map.put("files_url", JSON.getDefault().getMapper().writeValueAsString(filesUrl));
        }
    }
    if (transmissions != null) {
        if (isFileTypeOrListOfFiles(transmissions)) {
            fileTypeFound = true;
        }

        if (transmissions.getClass().equals(java.io.File.class) ||
            transmissions.getClass().equals(Integer.class) ||
            transmissions.getClass().equals(String.class) ||
            transmissions.getClass().isEnum()) {
            map.put("transmissions", transmissions);
        } else if (isListOfFile(transmissions)) {
            for(int i = 0; i< getListSize(transmissions); i++) {
                map.put("transmissions[" + i + "]", getFromList(transmissions, i));
            }
        }
        else {
            map.put("transmissions", JSON.getDefault().getMapper().writeValueAsString(transmissions));
        }
    }
    if (subject != null) {
        if (isFileTypeOrListOfFiles(subject)) {
            fileTypeFound = true;
        }

        if (subject.getClass().equals(java.io.File.class) ||
            subject.getClass().equals(Integer.class) ||
            subject.getClass().equals(String.class) ||
            subject.getClass().isEnum()) {
            map.put("subject", subject);
        } else if (isListOfFile(subject)) {
            for(int i = 0; i< getListSize(subject); i++) {
                map.put("subject[" + i + "]", getFromList(subject, i));
            }
        }
        else {
            map.put("subject", JSON.getDefault().getMapper().writeValueAsString(subject));
        }
    }
    if (message != null) {
        if (isFileTypeOrListOfFiles(message)) {
            fileTypeFound = true;
        }

        if (message.getClass().equals(java.io.File.class) ||
            message.getClass().equals(Integer.class) ||
            message.getClass().equals(String.class) ||
            message.getClass().isEnum()) {
            map.put("message", message);
        } else if (isListOfFile(message)) {
            for(int i = 0; i< getListSize(message); i++) {
                map.put("message[" + i + "]", getFromList(message, i));
            }
        }
        else {
            map.put("message", JSON.getDefault().getMapper().writeValueAsString(message));
        }
    }
    if (finalCopyUri != null) {
        if (isFileTypeOrListOfFiles(finalCopyUri)) {
            fileTypeFound = true;
        }

        if (finalCopyUri.getClass().equals(java.io.File.class) ||
            finalCopyUri.getClass().equals(Integer.class) ||
            finalCopyUri.getClass().equals(String.class) ||
            finalCopyUri.getClass().isEnum()) {
            map.put("final_copy_uri", finalCopyUri);
        } else if (isListOfFile(finalCopyUri)) {
            for(int i = 0; i< getListSize(finalCopyUri); i++) {
                map.put("final_copy_uri[" + i + "]", getFromList(finalCopyUri, i));
            }
        }
        else {
            map.put("final_copy_uri", JSON.getDefault().getMapper().writeValueAsString(finalCopyUri));
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

