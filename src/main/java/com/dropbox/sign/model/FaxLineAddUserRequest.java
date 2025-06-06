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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dropbox.sign.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.dropbox.sign.ApiException;
/**
 * FaxLineAddUserRequest
 */
@JsonPropertyOrder({
  FaxLineAddUserRequest.JSON_PROPERTY_NUMBER,
  FaxLineAddUserRequest.JSON_PROPERTY_ACCOUNT_ID,
  FaxLineAddUserRequest.JSON_PROPERTY_EMAIL_ADDRESS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class FaxLineAddUserRequest {
  public static final String JSON_PROPERTY_NUMBER = "number";
  @jakarta.annotation.Nonnull
  private String number;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  @jakarta.annotation.Nullable
  private String accountId;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  @jakarta.annotation.Nullable
  private String emailAddress;

  public FaxLineAddUserRequest() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public FaxLineAddUserRequest init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, FaxLineAddUserRequest.class);
  }

  static public FaxLineAddUserRequest init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      FaxLineAddUserRequest.class
    );
  }

  public FaxLineAddUserRequest number(@jakarta.annotation.Nonnull String number) {
    this.number = number;
    return this;
  }

  /**
   * The Fax Line number
   * @return number
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getNumber() {
    return number;
  }


  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNumber(@jakarta.annotation.Nonnull String number) {
    this.number = number;
  }


  public FaxLineAddUserRequest accountId(@jakarta.annotation.Nullable String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Account ID
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(@jakarta.annotation.Nullable String accountId) {
    this.accountId = accountId;
  }


  public FaxLineAddUserRequest emailAddress(@jakarta.annotation.Nullable String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * Email address
   * @return emailAddress
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailAddress(@jakarta.annotation.Nullable String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Return true if this FaxLineAddUserRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaxLineAddUserRequest faxLineAddUserRequest = (FaxLineAddUserRequest) o;
    return Objects.equals(this.number, faxLineAddUserRequest.number) &&
        Objects.equals(this.accountId, faxLineAddUserRequest.accountId) &&
        Objects.equals(this.emailAddress, faxLineAddUserRequest.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, accountId, emailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxLineAddUserRequest {\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (number != null) {
        if (isFileTypeOrListOfFiles(number)) {
            fileTypeFound = true;
        }

        if (number.getClass().equals(java.io.File.class) ||
            number.getClass().equals(Integer.class) ||
            number.getClass().equals(String.class) ||
            number.getClass().isEnum()) {
            map.put("number", number);
        } else if (isListOfFile(number)) {
            for(int i = 0; i< getListSize(number); i++) {
                map.put("number[" + i + "]", getFromList(number, i));
            }
        }
        else {
            map.put("number", JSON.getDefault().getMapper().writeValueAsString(number));
        }
    }
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

