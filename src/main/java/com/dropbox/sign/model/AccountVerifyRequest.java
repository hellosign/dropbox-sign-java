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
 * AccountVerifyRequest
 */
@JsonPropertyOrder({
  AccountVerifyRequest.JSON_PROPERTY_EMAIL_ADDRESS
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AccountVerifyRequest {
  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public AccountVerifyRequest() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public AccountVerifyRequest init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, AccountVerifyRequest.class);
  }

  static public AccountVerifyRequest init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      AccountVerifyRequest.class
    );
  }

  public AccountVerifyRequest emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address to run the verification for.
   * @return emailAddress
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Email address to run the verification for.")
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailAddress() {
    return emailAddress;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  /**
   * Return true if this AccountVerifyRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountVerifyRequest accountVerifyRequest = (AccountVerifyRequest) o;
    return Objects.equals(this.emailAddress, accountVerifyRequest.emailAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountVerifyRequest {\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
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

