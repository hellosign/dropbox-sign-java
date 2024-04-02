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
 * SubSignatureRequestTemplateSigner
 */
@JsonPropertyOrder({
  SubSignatureRequestTemplateSigner.JSON_PROPERTY_ROLE,
  SubSignatureRequestTemplateSigner.JSON_PROPERTY_NAME,
  SubSignatureRequestTemplateSigner.JSON_PROPERTY_EMAIL_ADDRESS,
  SubSignatureRequestTemplateSigner.JSON_PROPERTY_PIN,
  SubSignatureRequestTemplateSigner.JSON_PROPERTY_SMS_PHONE_NUMBER,
  SubSignatureRequestTemplateSigner.JSON_PROPERTY_SMS_PHONE_NUMBER_TYPE
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubSignatureRequestTemplateSigner {
  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
  private String emailAddress;

  public static final String JSON_PROPERTY_PIN = "pin";
  private String pin;

  public static final String JSON_PROPERTY_SMS_PHONE_NUMBER = "sms_phone_number";
  private String smsPhoneNumber;

  /**
   * Specifies the feature used with the &#x60;sms_phone_number&#x60;. Default &#x60;authentication&#x60;.  If &#x60;authentication&#x60;, signer is sent a verification code via SMS that is required to access the document.  If &#x60;delivery&#x60;, a link to complete the signature request is delivered via SMS (_and_ email).
   */
  public enum SmsPhoneNumberTypeEnum {
    AUTHENTICATION("authentication"),
    
    DELIVERY("delivery");

    private String value;

    SmsPhoneNumberTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SmsPhoneNumberTypeEnum fromValue(String value) {
      for (SmsPhoneNumberTypeEnum b : SmsPhoneNumberTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SMS_PHONE_NUMBER_TYPE = "sms_phone_number_type";
  private SmsPhoneNumberTypeEnum smsPhoneNumberType;

  public SubSignatureRequestTemplateSigner() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SubSignatureRequestTemplateSigner init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SubSignatureRequestTemplateSigner.class);
  }

  static public SubSignatureRequestTemplateSigner init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      SubSignatureRequestTemplateSigner.class
    );
  }

  public SubSignatureRequestTemplateSigner role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Must match an existing role in chosen Template(s). It&#39;s case-sensitive.
   * @return role
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Must match an existing role in chosen Template(s). It's case-sensitive.")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(String role) {
    this.role = role;
  }


  public SubSignatureRequestTemplateSigner name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the signer.
   * @return name
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The name of the signer.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public SubSignatureRequestTemplateSigner emailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * The email address of the signer.
   * @return emailAddress
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The email address of the signer.")
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


  public SubSignatureRequestTemplateSigner pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * The 4- to 12-character access code that will secure this signer&#39;s signature page.
   * @return pin
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The 4- to 12-character access code that will secure this signer's signature page.")
  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPin() {
    return pin;
  }


  @JsonProperty(JSON_PROPERTY_PIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPin(String pin) {
    this.pin = pin;
  }


  public SubSignatureRequestTemplateSigner smsPhoneNumber(String smsPhoneNumber) {
    this.smsPhoneNumber = smsPhoneNumber;
    return this;
  }

   /**
   * An E.164 formatted phone number.  By using the feature, you agree you are responsible for obtaining a signer&#39;s consent to receive text messages from Dropbox Sign related to this signature request and confirm you have obtained such consent from all signers prior to enabling SMS delivery for this signature request. [Learn more](https://faq.hellosign.com/hc/en-us/articles/15815316468877-Dropbox-Sign-SMS-tools-add-on).  **Note**: Not available in test mode and requires a Standard plan or higher.
   * @return smsPhoneNumber
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "An E.164 formatted phone number.  By using the feature, you agree you are responsible for obtaining a signer's consent to receive text messages from Dropbox Sign related to this signature request and confirm you have obtained such consent from all signers prior to enabling SMS delivery for this signature request. [Learn more](https://faq.hellosign.com/hc/en-us/articles/15815316468877-Dropbox-Sign-SMS-tools-add-on).  **Note**: Not available in test mode and requires a Standard plan or higher.")
  @JsonProperty(JSON_PROPERTY_SMS_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSmsPhoneNumber() {
    return smsPhoneNumber;
  }


  @JsonProperty(JSON_PROPERTY_SMS_PHONE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsPhoneNumber(String smsPhoneNumber) {
    this.smsPhoneNumber = smsPhoneNumber;
  }


  public SubSignatureRequestTemplateSigner smsPhoneNumberType(SmsPhoneNumberTypeEnum smsPhoneNumberType) {
    this.smsPhoneNumberType = smsPhoneNumberType;
    return this;
  }

   /**
   * Specifies the feature used with the &#x60;sms_phone_number&#x60;. Default &#x60;authentication&#x60;.  If &#x60;authentication&#x60;, signer is sent a verification code via SMS that is required to access the document.  If &#x60;delivery&#x60;, a link to complete the signature request is delivered via SMS (_and_ email).
   * @return smsPhoneNumberType
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Specifies the feature used with the `sms_phone_number`. Default `authentication`.  If `authentication`, signer is sent a verification code via SMS that is required to access the document.  If `delivery`, a link to complete the signature request is delivered via SMS (_and_ email).")
  @JsonProperty(JSON_PROPERTY_SMS_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SmsPhoneNumberTypeEnum getSmsPhoneNumberType() {
    return smsPhoneNumberType;
  }


  @JsonProperty(JSON_PROPERTY_SMS_PHONE_NUMBER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSmsPhoneNumberType(SmsPhoneNumberTypeEnum smsPhoneNumberType) {
    this.smsPhoneNumberType = smsPhoneNumberType;
  }


  /**
   * Return true if this SubSignatureRequestTemplateSigner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubSignatureRequestTemplateSigner subSignatureRequestTemplateSigner = (SubSignatureRequestTemplateSigner) o;
    return Objects.equals(this.role, subSignatureRequestTemplateSigner.role) &&
        Objects.equals(this.name, subSignatureRequestTemplateSigner.name) &&
        Objects.equals(this.emailAddress, subSignatureRequestTemplateSigner.emailAddress) &&
        Objects.equals(this.pin, subSignatureRequestTemplateSigner.pin) &&
        Objects.equals(this.smsPhoneNumber, subSignatureRequestTemplateSigner.smsPhoneNumber) &&
        Objects.equals(this.smsPhoneNumberType, subSignatureRequestTemplateSigner.smsPhoneNumberType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, name, emailAddress, pin, smsPhoneNumber, smsPhoneNumberType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubSignatureRequestTemplateSigner {\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
    sb.append("    smsPhoneNumber: ").append(toIndentedString(smsPhoneNumber)).append("\n");
    sb.append("    smsPhoneNumberType: ").append(toIndentedString(smsPhoneNumberType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (role != null) {
        if (isFileTypeOrListOfFiles(role)) {
            fileTypeFound = true;
        }

        if (role.getClass().equals(java.io.File.class) ||
            role.getClass().equals(Integer.class) ||
            role.getClass().equals(String.class) ||
            role.getClass().isEnum()) {
            map.put("role", role);
        } else if (isListOfFile(role)) {
            for(int i = 0; i< getListSize(role); i++) {
                map.put("role[" + i + "]", getFromList(role, i));
            }
        }
        else {
            map.put("role", JSON.getDefault().getMapper().writeValueAsString(role));
        }
    }
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ||
            name.getClass().isEnum()) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name[" + i + "]", getFromList(name, i));
            }
        }
        else {
            map.put("name", JSON.getDefault().getMapper().writeValueAsString(name));
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
    if (pin != null) {
        if (isFileTypeOrListOfFiles(pin)) {
            fileTypeFound = true;
        }

        if (pin.getClass().equals(java.io.File.class) ||
            pin.getClass().equals(Integer.class) ||
            pin.getClass().equals(String.class) ||
            pin.getClass().isEnum()) {
            map.put("pin", pin);
        } else if (isListOfFile(pin)) {
            for(int i = 0; i< getListSize(pin); i++) {
                map.put("pin[" + i + "]", getFromList(pin, i));
            }
        }
        else {
            map.put("pin", JSON.getDefault().getMapper().writeValueAsString(pin));
        }
    }
    if (smsPhoneNumber != null) {
        if (isFileTypeOrListOfFiles(smsPhoneNumber)) {
            fileTypeFound = true;
        }

        if (smsPhoneNumber.getClass().equals(java.io.File.class) ||
            smsPhoneNumber.getClass().equals(Integer.class) ||
            smsPhoneNumber.getClass().equals(String.class) ||
            smsPhoneNumber.getClass().isEnum()) {
            map.put("sms_phone_number", smsPhoneNumber);
        } else if (isListOfFile(smsPhoneNumber)) {
            for(int i = 0; i< getListSize(smsPhoneNumber); i++) {
                map.put("sms_phone_number[" + i + "]", getFromList(smsPhoneNumber, i));
            }
        }
        else {
            map.put("sms_phone_number", JSON.getDefault().getMapper().writeValueAsString(smsPhoneNumber));
        }
    }
    if (smsPhoneNumberType != null) {
        if (isFileTypeOrListOfFiles(smsPhoneNumberType)) {
            fileTypeFound = true;
        }

        if (smsPhoneNumberType.getClass().equals(java.io.File.class) ||
            smsPhoneNumberType.getClass().equals(Integer.class) ||
            smsPhoneNumberType.getClass().equals(String.class) ||
            smsPhoneNumberType.getClass().isEnum()) {
            map.put("sms_phone_number_type", smsPhoneNumberType);
        } else if (isListOfFile(smsPhoneNumberType)) {
            for(int i = 0; i< getListSize(smsPhoneNumberType); i++) {
                map.put("sms_phone_number_type[" + i + "]", getFromList(smsPhoneNumberType, i));
            }
        }
        else {
            map.put("sms_phone_number_type", JSON.getDefault().getMapper().writeValueAsString(smsPhoneNumberType));
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

