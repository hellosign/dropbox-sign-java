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
import com.dropbox.sign.model.SubCC;
import com.dropbox.sign.model.SubCustomField;
import com.dropbox.sign.model.SubSignatureRequestTemplateSigner;
import com.dropbox.sign.model.SubSigningOptions;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dropbox.sign.JSON;


import com.dropbox.sign.ApiException;
/**
 * SignatureRequestCreateEmbeddedWithTemplateRequest
 */
@JsonPropertyOrder({
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_TEMPLATE_IDS,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_CLIENT_ID,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_SIGNERS,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_ALLOW_DECLINE,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_CCS,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_CUSTOM_FIELDS,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_FILES,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_FILE_URLS,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_MESSAGE,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_METADATA,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_SIGNING_OPTIONS,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_SUBJECT,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_TEST_MODE,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_TITLE,
    SignatureRequestCreateEmbeddedWithTemplateRequest.JSON_PROPERTY_POPULATE_AUTO_FILL_FIELDS
})
@JsonIgnoreProperties(ignoreUnknown=true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SignatureRequestCreateEmbeddedWithTemplateRequest {
  public static final String JSON_PROPERTY_TEMPLATE_IDS = "template_ids";
  private List<String> templateIds = new ArrayList<>();

  public static final String JSON_PROPERTY_CLIENT_ID = "client_id";
  private String clientId;

  public static final String JSON_PROPERTY_SIGNERS = "signers";
  private List<SubSignatureRequestTemplateSigner> signers = new ArrayList<>();

  public static final String JSON_PROPERTY_ALLOW_DECLINE = "allow_decline";
  private Boolean allowDecline = false;

  public static final String JSON_PROPERTY_CCS = "ccs";
  private List<SubCC> ccs = null;

  public static final String JSON_PROPERTY_CUSTOM_FIELDS = "custom_fields";
  private List<SubCustomField> customFields = null;

  public static final String JSON_PROPERTY_FILES = "files";
  private List<File> files = null;

  public static final String JSON_PROPERTY_FILE_URLS = "file_urls";
  private List<String> fileUrls = null;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, Object> metadata = null;

  public static final String JSON_PROPERTY_SIGNING_OPTIONS = "signing_options";
  private SubSigningOptions signingOptions;

  public static final String JSON_PROPERTY_SUBJECT = "subject";
  private String subject;

  public static final String JSON_PROPERTY_TEST_MODE = "test_mode";
  private Boolean testMode = false;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_POPULATE_AUTO_FILL_FIELDS = "populate_auto_fill_fields";
  private Boolean populateAutoFillFields = false;

  public SignatureRequestCreateEmbeddedWithTemplateRequest() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SignatureRequestCreateEmbeddedWithTemplateRequest init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SignatureRequestCreateEmbeddedWithTemplateRequest.class);
  }

  public SignatureRequestCreateEmbeddedWithTemplateRequest templateIds(List<String> templateIds) {
    this.templateIds = templateIds;
    return this;
  }

  public SignatureRequestCreateEmbeddedWithTemplateRequest addTemplateIdsItem(String templateIdsItem) {
    this.templateIds.add(templateIdsItem);
    return this;
  }

   /**
   * Use &#x60;template_ids&#x60; to create a SignatureRequest from one or more templates, in the order in which the template will be used.
   * @return templateIds
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Use `template_ids` to create a SignatureRequest from one or more templates, in the order in which the template will be used.")
  @JsonProperty(JSON_PROPERTY_TEMPLATE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTemplateIds() {
    return templateIds;
  }


  @JsonProperty(JSON_PROPERTY_TEMPLATE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTemplateIds(List<String> templateIds) {
    this.templateIds = templateIds;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client id of the app you&#39;re using to create this embedded signature request. Used for security purposes.
   * @return clientId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Client id of the app you're using to create this embedded signature request. Used for security purposes.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest signers(List<SubSignatureRequestTemplateSigner> signers) {
    this.signers = signers;
    return this;
  }

  public SignatureRequestCreateEmbeddedWithTemplateRequest addSignersItem(SubSignatureRequestTemplateSigner signersItem) {
    this.signers.add(signersItem);
    return this;
  }

   /**
   * Add Signers to your Templated-based Signature Request.
   * @return signers
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Add Signers to your Templated-based Signature Request.")
  @JsonProperty(JSON_PROPERTY_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<SubSignatureRequestTemplateSigner> getSigners() {
    return signers;
  }


  @JsonProperty(JSON_PROPERTY_SIGNERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSigners(List<SubSignatureRequestTemplateSigner> signers) {
    this.signers = signers;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest allowDecline(Boolean allowDecline) {
    this.allowDecline = allowDecline;
    return this;
  }

   /**
   * Allows signers to decline to sign a document if &#x60;true&#x60;. Defaults to &#x60;false&#x60;.
   * @return allowDecline
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allows signers to decline to sign a document if `true`. Defaults to `false`.")
  @JsonProperty(JSON_PROPERTY_ALLOW_DECLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getAllowDecline() {
    return allowDecline;
  }


  @JsonProperty(JSON_PROPERTY_ALLOW_DECLINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAllowDecline(Boolean allowDecline) {
    this.allowDecline = allowDecline;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest ccs(List<SubCC> ccs) {
    this.ccs = ccs;
    return this;
  }

  public SignatureRequestCreateEmbeddedWithTemplateRequest addCcsItem(SubCC ccsItem) {
    if (this.ccs == null) {
      this.ccs = new ArrayList<>();
    }
    this.ccs.add(ccsItem);
    return this;
  }

   /**
   * Add CC email recipients. Required when a CC role exists for the Template.
   * @return ccs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Add CC email recipients. Required when a CC role exists for the Template.")
  @JsonProperty(JSON_PROPERTY_CCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubCC> getCcs() {
    return ccs;
  }


  @JsonProperty(JSON_PROPERTY_CCS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCcs(List<SubCC> ccs) {
    this.ccs = ccs;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest customFields(List<SubCustomField> customFields) {
    this.customFields = customFields;
    return this;
  }

  public SignatureRequestCreateEmbeddedWithTemplateRequest addCustomFieldsItem(SubCustomField customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new ArrayList<>();
    }
    this.customFields.add(customFieldsItem);
    return this;
  }

   /**
   * An array defining values and options for custom fields. Required when a custom field exists in the Template.
   * @return customFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "An array defining values and options for custom fields. Required when a custom field exists in the Template.")
  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubCustomField> getCustomFields() {
    return customFields;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOM_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomFields(List<SubCustomField> customFields) {
    this.customFields = customFields;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest files(List<File> files) {
    this.files = files;
    return this;
  }

  public SignatureRequestCreateEmbeddedWithTemplateRequest addFilesItem(File filesItem) {
    if (this.files == null) {
      this.files = new ArrayList<>();
    }
    this.files.add(filesItem);
    return this;
  }

   /**
   * Use &#x60;files[]&#x60; to indicate the uploaded file(s) to send for signature.  This endpoint requires either **files** or **file_urls[]**, but not both.
   * @return files
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use `files[]` to indicate the uploaded file(s) to send for signature.  This endpoint requires either **files** or **file_urls[]**, but not both.")
  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<File> getFiles() {
    return files;
  }


  @JsonProperty(JSON_PROPERTY_FILES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiles(List<File> files) {
    this.files = files;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest fileUrls(List<String> fileUrls) {
    this.fileUrls = fileUrls;
    return this;
  }

  public SignatureRequestCreateEmbeddedWithTemplateRequest addFileUrlsItem(String fileUrlsItem) {
    if (this.fileUrls == null) {
      this.fileUrls = new ArrayList<>();
    }
    this.fileUrls.add(fileUrlsItem);
    return this;
  }

   /**
   * Use &#x60;file_urls[]&#x60; to have Dropbox Sign download the file(s) to send for signature.  This endpoint requires either **files** or **file_urls[]**, but not both.
   * @return fileUrls
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Use `file_urls[]` to have Dropbox Sign download the file(s) to send for signature.  This endpoint requires either **files** or **file_urls[]**, but not both.")
  @JsonProperty(JSON_PROPERTY_FILE_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFileUrls() {
    return fileUrls;
  }


  @JsonProperty(JSON_PROPERTY_FILE_URLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFileUrls(List<String> fileUrls) {
    this.fileUrls = fileUrls;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest message(String message) {
    this.message = message;
    return this;
  }

   /**
   * The custom message in the email that will be sent to the signers.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The custom message in the email that will be sent to the signers.")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest metadata(Map<String, Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SignatureRequestCreateEmbeddedWithTemplateRequest putMetadataItem(String key, Object metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

   /**
   * Key-value data that should be attached to the signature request. This metadata is included in all API responses and events involving the signature request. For example, use the metadata field to store a signer&#39;s order number for look up when receiving events for the signature request.  Each request can include up to 10 metadata keys (or 50 nested metadata keys), with key names up to 40 characters long and values up to 1000 characters long.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Key-value data that should be attached to the signature request. This metadata is included in all API responses and events involving the signature request. For example, use the metadata field to store a signer's order number for look up when receiving events for the signature request.  Each request can include up to 10 metadata keys (or 50 nested metadata keys), with key names up to 40 characters long and values up to 1000 characters long.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, Object> getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(content = JsonInclude.Include.ALWAYS, value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(Map<String, Object> metadata) {
    this.metadata = metadata;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest signingOptions(SubSigningOptions signingOptions) {
    this.signingOptions = signingOptions;
    return this;
  }

   /**
   * Get signingOptions
   * @return signingOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubSigningOptions getSigningOptions() {
    return signingOptions;
  }


  @JsonProperty(JSON_PROPERTY_SIGNING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSigningOptions(SubSigningOptions signingOptions) {
    this.signingOptions = signingOptions;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject in the email that will be sent to the signers.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subject in the email that will be sent to the signers.")
  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubject() {
    return subject;
  }


  @JsonProperty(JSON_PROPERTY_SUBJECT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubject(String subject) {
    this.subject = subject;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest testMode(Boolean testMode) {
    this.testMode = testMode;
    return this;
  }

   /**
   * Whether this is a test, the signature request will not be legally binding if set to &#x60;true&#x60;. Defaults to &#x60;false&#x60;.
   * @return testMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this is a test, the signature request will not be legally binding if set to `true`. Defaults to `false`.")
  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTestMode() {
    return testMode;
  }


  @JsonProperty(JSON_PROPERTY_TEST_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTestMode(Boolean testMode) {
    this.testMode = testMode;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title you want to assign to the SignatureRequest.
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The title you want to assign to the SignatureRequest.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTitle(String title) {
    this.title = title;
  }


  public SignatureRequestCreateEmbeddedWithTemplateRequest populateAutoFillFields(Boolean populateAutoFillFields) {
    this.populateAutoFillFields = populateAutoFillFields;
    return this;
  }

   /**
   * Controls whether [auto fill fields](https://faq.hellosign.com/hc/en-us/articles/360051467511-Auto-Fill-Fields) can automatically populate a signer&#39;s information during signing.  ⚠️ **Note** ⚠️: Keep your signer&#39;s information safe by ensuring that the _signer on your signature request is the intended party_ before using this feature.
   * @return populateAutoFillFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Controls whether [auto fill fields](https://faq.hellosign.com/hc/en-us/articles/360051467511-Auto-Fill-Fields) can automatically populate a signer's information during signing.  ⚠️ **Note** ⚠️: Keep your signer's information safe by ensuring that the _signer on your signature request is the intended party_ before using this feature.")
  @JsonProperty(JSON_PROPERTY_POPULATE_AUTO_FILL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPopulateAutoFillFields() {
    return populateAutoFillFields;
  }


  @JsonProperty(JSON_PROPERTY_POPULATE_AUTO_FILL_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPopulateAutoFillFields(Boolean populateAutoFillFields) {
    this.populateAutoFillFields = populateAutoFillFields;
  }


  /**
   * Return true if this SignatureRequestCreateEmbeddedWithTemplateRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SignatureRequestCreateEmbeddedWithTemplateRequest signatureRequestCreateEmbeddedWithTemplateRequest = (SignatureRequestCreateEmbeddedWithTemplateRequest) o;
    return Objects.equals(this.templateIds, signatureRequestCreateEmbeddedWithTemplateRequest.templateIds) &&
        Objects.equals(this.clientId, signatureRequestCreateEmbeddedWithTemplateRequest.clientId) &&
        Objects.equals(this.signers, signatureRequestCreateEmbeddedWithTemplateRequest.signers) &&
        Objects.equals(this.allowDecline, signatureRequestCreateEmbeddedWithTemplateRequest.allowDecline) &&
        Objects.equals(this.ccs, signatureRequestCreateEmbeddedWithTemplateRequest.ccs) &&
        Objects.equals(this.customFields, signatureRequestCreateEmbeddedWithTemplateRequest.customFields) &&
        Objects.equals(this.files, signatureRequestCreateEmbeddedWithTemplateRequest.files) &&
        Objects.equals(this.fileUrls, signatureRequestCreateEmbeddedWithTemplateRequest.fileUrls) &&
        Objects.equals(this.message, signatureRequestCreateEmbeddedWithTemplateRequest.message) &&
        Objects.equals(this.metadata, signatureRequestCreateEmbeddedWithTemplateRequest.metadata) &&
        Objects.equals(this.signingOptions, signatureRequestCreateEmbeddedWithTemplateRequest.signingOptions) &&
        Objects.equals(this.subject, signatureRequestCreateEmbeddedWithTemplateRequest.subject) &&
        Objects.equals(this.testMode, signatureRequestCreateEmbeddedWithTemplateRequest.testMode) &&
        Objects.equals(this.title, signatureRequestCreateEmbeddedWithTemplateRequest.title) &&
        Objects.equals(this.populateAutoFillFields, signatureRequestCreateEmbeddedWithTemplateRequest.populateAutoFillFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateIds, clientId, signers, allowDecline, ccs, customFields, files, fileUrls, message, metadata, signingOptions, subject, testMode, title, populateAutoFillFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SignatureRequestCreateEmbeddedWithTemplateRequest {\n");
    sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    signers: ").append(toIndentedString(signers)).append("\n");
    sb.append("    allowDecline: ").append(toIndentedString(allowDecline)).append("\n");
    sb.append("    ccs: ").append(toIndentedString(ccs)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    fileUrls: ").append(toIndentedString(fileUrls)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    signingOptions: ").append(toIndentedString(signingOptions)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    testMode: ").append(toIndentedString(testMode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    populateAutoFillFields: ").append(toIndentedString(populateAutoFillFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (templateIds != null) {
        if (isFileTypeOrListOfFiles(templateIds)) {
            fileTypeFound = true;
        }

        if (templateIds.getClass().equals(java.io.File.class) ||
            templateIds.getClass().equals(Integer.class) ||
            templateIds.getClass().equals(String.class) ||
            templateIds.getClass().isEnum()) {
            map.put("template_ids", templateIds);
        } else if (isListOfFile(templateIds)) {
            for(int i = 0; i< getListSize(templateIds); i++) {
                map.put("template_ids[" + i + "]", getFromList(templateIds, i));
            }
        }
        else {
            map.put("template_ids", JSON.getDefault().getMapper().writeValueAsString(templateIds));
        }
    }
    if (clientId != null) {
        if (isFileTypeOrListOfFiles(clientId)) {
            fileTypeFound = true;
        }

        if (clientId.getClass().equals(java.io.File.class) ||
            clientId.getClass().equals(Integer.class) ||
            clientId.getClass().equals(String.class) ||
            clientId.getClass().isEnum()) {
            map.put("client_id", clientId);
        } else if (isListOfFile(clientId)) {
            for(int i = 0; i< getListSize(clientId); i++) {
                map.put("client_id[" + i + "]", getFromList(clientId, i));
            }
        }
        else {
            map.put("client_id", JSON.getDefault().getMapper().writeValueAsString(clientId));
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
    if (allowDecline != null) {
        if (isFileTypeOrListOfFiles(allowDecline)) {
            fileTypeFound = true;
        }

        if (allowDecline.getClass().equals(java.io.File.class) ||
            allowDecline.getClass().equals(Integer.class) ||
            allowDecline.getClass().equals(String.class) ||
            allowDecline.getClass().isEnum()) {
            map.put("allow_decline", allowDecline);
        } else if (isListOfFile(allowDecline)) {
            for(int i = 0; i< getListSize(allowDecline); i++) {
                map.put("allow_decline[" + i + "]", getFromList(allowDecline, i));
            }
        }
        else {
            map.put("allow_decline", JSON.getDefault().getMapper().writeValueAsString(allowDecline));
        }
    }
    if (ccs != null) {
        if (isFileTypeOrListOfFiles(ccs)) {
            fileTypeFound = true;
        }

        if (ccs.getClass().equals(java.io.File.class) ||
            ccs.getClass().equals(Integer.class) ||
            ccs.getClass().equals(String.class) ||
            ccs.getClass().isEnum()) {
            map.put("ccs", ccs);
        } else if (isListOfFile(ccs)) {
            for(int i = 0; i< getListSize(ccs); i++) {
                map.put("ccs[" + i + "]", getFromList(ccs, i));
            }
        }
        else {
            map.put("ccs", JSON.getDefault().getMapper().writeValueAsString(ccs));
        }
    }
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
    if (files != null) {
        if (isFileTypeOrListOfFiles(files)) {
            fileTypeFound = true;
        }

        if (files.getClass().equals(java.io.File.class) ||
            files.getClass().equals(Integer.class) ||
            files.getClass().equals(String.class) ||
            files.getClass().isEnum()) {
            map.put("files", files);
        } else if (isListOfFile(files)) {
            for(int i = 0; i< getListSize(files); i++) {
                map.put("files[" + i + "]", getFromList(files, i));
            }
        }
        else {
            map.put("files", JSON.getDefault().getMapper().writeValueAsString(files));
        }
    }
    if (fileUrls != null) {
        if (isFileTypeOrListOfFiles(fileUrls)) {
            fileTypeFound = true;
        }

        if (fileUrls.getClass().equals(java.io.File.class) ||
            fileUrls.getClass().equals(Integer.class) ||
            fileUrls.getClass().equals(String.class) ||
            fileUrls.getClass().isEnum()) {
            map.put("file_urls", fileUrls);
        } else if (isListOfFile(fileUrls)) {
            for(int i = 0; i< getListSize(fileUrls); i++) {
                map.put("file_urls[" + i + "]", getFromList(fileUrls, i));
            }
        }
        else {
            map.put("file_urls", JSON.getDefault().getMapper().writeValueAsString(fileUrls));
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
    if (signingOptions != null) {
        if (isFileTypeOrListOfFiles(signingOptions)) {
            fileTypeFound = true;
        }

        if (signingOptions.getClass().equals(java.io.File.class) ||
            signingOptions.getClass().equals(Integer.class) ||
            signingOptions.getClass().equals(String.class) ||
            signingOptions.getClass().isEnum()) {
            map.put("signing_options", signingOptions);
        } else if (isListOfFile(signingOptions)) {
            for(int i = 0; i< getListSize(signingOptions); i++) {
                map.put("signing_options[" + i + "]", getFromList(signingOptions, i));
            }
        }
        else {
            map.put("signing_options", JSON.getDefault().getMapper().writeValueAsString(signingOptions));
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
    if (testMode != null) {
        if (isFileTypeOrListOfFiles(testMode)) {
            fileTypeFound = true;
        }

        if (testMode.getClass().equals(java.io.File.class) ||
            testMode.getClass().equals(Integer.class) ||
            testMode.getClass().equals(String.class) ||
            testMode.getClass().isEnum()) {
            map.put("test_mode", testMode);
        } else if (isListOfFile(testMode)) {
            for(int i = 0; i< getListSize(testMode); i++) {
                map.put("test_mode[" + i + "]", getFromList(testMode, i));
            }
        }
        else {
            map.put("test_mode", JSON.getDefault().getMapper().writeValueAsString(testMode));
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
    if (populateAutoFillFields != null) {
        if (isFileTypeOrListOfFiles(populateAutoFillFields)) {
            fileTypeFound = true;
        }

        if (populateAutoFillFields.getClass().equals(java.io.File.class) ||
            populateAutoFillFields.getClass().equals(Integer.class) ||
            populateAutoFillFields.getClass().equals(String.class) ||
            populateAutoFillFields.getClass().isEnum()) {
            map.put("populate_auto_fill_fields", populateAutoFillFields);
        } else if (isListOfFile(populateAutoFillFields)) {
            for(int i = 0; i< getListSize(populateAutoFillFields); i++) {
                map.put("populate_auto_fill_fields[" + i + "]", getFromList(populateAutoFillFields, i));
            }
        }
        else {
            map.put("populate_auto_fill_fields", JSON.getDefault().getMapper().writeValueAsString(populateAutoFillFields));
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

