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
 * TemplateAddUserRequest
 */
@JsonPropertyOrder({
  TemplateAddUserRequest.JSON_PROPERTY_ACCOUNT_ID,
  TemplateAddUserRequest.JSON_PROPERTY_EMAIL_ADDRESS,
  TemplateAddUserRequest.JSON_PROPERTY_SKIP_NOTIFICATION
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TemplateAddUserRequest {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public static final String JSON_PROPERTY_SKIP_NOTIFICATION = "skip_notification";
  private Boolean skipNotification = false;

  public TemplateAddUserRequest() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public TemplateAddUserRequest init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, TemplateAddUserRequest.class);
  }

  static public TemplateAddUserRequest init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      TemplateAddUserRequest.class
    );
  }

  public TemplateAddUserRequest accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The id of the Account to give access to the Template. **NOTE:** The account id prevails if email address is also provided.
   * @return accountId
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The id of the Account to give access to the Template. **NOTE:** The account id prevails if email address is also provided.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TemplateAddUserRequest emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address of the Account to give access to the Template. **NOTE:** The account id prevails if it is also provided.
   * @return emailAddress
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The email address of the Account to give access to the Template. **NOTE:** The account id prevails if it is also provided.")
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public TemplateAddUserRequest skipNotification(Boolean skipNotification) {
    this.skipNotification = skipNotification;
    return this;
  }

   /**
   * If set to &#x60;true&#x60;, the user does not receive an email notification when a template has been shared with them. Defaults to &#x60;false&#x60;.
   * @return skipNotification
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "If set to `true`, the user does not receive an email notification when a template has been shared with them. Defaults to `false`.")
  @JsonProperty(JSON_PROPERTY_SKIP_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSkipNotification() {
    return skipNotification;
  }


  @JsonProperty(JSON_PROPERTY_SKIP_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSkipNotification(Boolean skipNotification) {
    this.skipNotification = skipNotification;
  }


  /**
   * Return true if this TemplateAddUserRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateAddUserRequest templateAddUserRequest = (TemplateAddUserRequest) o;
    return Objects.equals(this.accountId, templateAddUserRequest.accountId) &&
        Objects.equals(this.emailAddress, templateAddUserRequest.emailAddress) &&
        Objects.equals(this.skipNotification, templateAddUserRequest.skipNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, emailAddress, skipNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateAddUserRequest {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    skipNotification: ").append(toIndentedString(skipNotification)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (accountId != null) {
        if (isFileTypeOrListOfFiles(accountId)) {
            fileTypeFound = true;
        }

        if (accountId.getClass().equals(java.io.File.class) ||
            accountId.getClass().equals(Integer.class) ||
            accountId.getClass().equals(String.class) ||
            accountId.getClass().isEnum()) {
            map.put("account_id", accountId);
        } else if (isListOfFile(accountId)) {
            for(int i = 0; i< getListSize(accountId); i++) {
                map.put("account_id[" + i + "]", getFromList(accountId, i));
            }
        }
        else {
            map.put("account_id", JSON.getDefault().getMapper().writeValueAsString(accountId));
        }
    }
    if (emailAddress != null) {
        if (isFileTypeOrListOfFiles(emailAddress)) {
            fileTypeFound = true;
        }

        if (emailAddress.getClass().equals(java.io.File.class) ||
            emailAddress.getClass().equals(Integer.class) ||
            emailAddress.getClass().equals(String.class) ||
            emailAddress.getClass().isEnum()) {
            map.put("email_address", emailAddress);
        } else if (isListOfFile(emailAddress)) {
            for(int i = 0; i< getListSize(emailAddress); i++) {
                map.put("email_address[" + i + "]", getFromList(emailAddress, i));
            }
        }
        else {
            map.put("email_address", JSON.getDefault().getMapper().writeValueAsString(emailAddress));
        }
    }
    if (skipNotification != null) {
        if (isFileTypeOrListOfFiles(skipNotification)) {
            fileTypeFound = true;
        }

        if (skipNotification.getClass().equals(java.io.File.class) ||
            skipNotification.getClass().equals(Integer.class) ||
            skipNotification.getClass().equals(String.class) ||
            skipNotification.getClass().isEnum()) {
            map.put("skip_notification", skipNotification);
        } else if (isListOfFile(skipNotification)) {
            for(int i = 0; i< getListSize(skipNotification); i++) {
                map.put("skip_notification[" + i + "]", getFromList(skipNotification, i));
            }
        }
        else {
            map.put("skip_notification", JSON.getDefault().getMapper().writeValueAsString(skipNotification));
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

