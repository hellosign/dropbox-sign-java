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
import com.dropbox.sign.model.TemplateResponseDocumentFormFieldBase;
import com.dropbox.sign.model.TemplateResponseFieldAvgTextLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dropbox.sign.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.dropbox.sign.ApiException;
/**
 * This class extends &#x60;TemplateResponseDocumentFormFieldBase&#x60;
 */
@JsonPropertyOrder({
  TemplateResponseDocumentFormFieldText.JSON_PROPERTY_TYPE,
  TemplateResponseDocumentFormFieldText.JSON_PROPERTY_AVG_TEXT_LENGTH,
  TemplateResponseDocumentFormFieldText.JSON_PROPERTY_IS_MULTILINE,
  TemplateResponseDocumentFormFieldText.JSON_PROPERTY_ORIGINAL_FONT_SIZE,
  TemplateResponseDocumentFormFieldText.JSON_PROPERTY_FONT_FAMILY,
  TemplateResponseDocumentFormFieldText.JSON_PROPERTY_VALIDATION_TYPE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(
  allowSetters = true, // allows the type to be set during deserialization
  ignoreUnknown = true
)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)

public class TemplateResponseDocumentFormFieldText extends TemplateResponseDocumentFormFieldBase {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "text";

  public static final String JSON_PROPERTY_AVG_TEXT_LENGTH = "avg_text_length";
  private TemplateResponseFieldAvgTextLength avgTextLength;

  public static final String JSON_PROPERTY_IS_MULTILINE = "isMultiline";
  private Boolean isMultiline;

  public static final String JSON_PROPERTY_ORIGINAL_FONT_SIZE = "originalFontSize";
  private Integer originalFontSize;

  public static final String JSON_PROPERTY_FONT_FAMILY = "fontFamily";
  private String fontFamily;

  /**
   * Each text field may contain a &#x60;validation_type&#x60; parameter. Check out the list of [validation types](https://faq.hellosign.com/hc/en-us/articles/217115577) to learn more about the possible values.
   */
  public enum ValidationTypeEnum {
    NUMBERS_ONLY("numbers_only"),
    
    LETTERS_ONLY("letters_only"),
    
    PHONE_NUMBER("phone_number"),
    
    BANK_ROUTING_NUMBER("bank_routing_number"),
    
    BANK_ACCOUNT_NUMBER("bank_account_number"),
    
    EMAIL_ADDRESS("email_address"),
    
    ZIP_CODE("zip_code"),
    
    SOCIAL_SECURITY_NUMBER("social_security_number"),
    
    EMPLOYER_IDENTIFICATION_NUMBER("employer_identification_number"),
    
    CUSTOM_REGEX("custom_regex");

    private String value;

    ValidationTypeEnum(String value) {
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
    public static ValidationTypeEnum fromValue(String value) {
      for (ValidationTypeEnum b : ValidationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      return null;
    }
  }

  public static final String JSON_PROPERTY_VALIDATION_TYPE = "validation_type";
  private ValidationTypeEnum validationType;

  public TemplateResponseDocumentFormFieldText() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public TemplateResponseDocumentFormFieldText init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, TemplateResponseDocumentFormFieldText.class);
  }

  static public TemplateResponseDocumentFormFieldText init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      TemplateResponseDocumentFormFieldText.class
    );
  }

  public TemplateResponseDocumentFormFieldText type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of this form field. See [field types](/api/reference/constants/#field-types).  * Text Field uses &#x60;TemplateResponseDocumentFormFieldText&#x60; * Dropdown Field uses &#x60;TemplateResponseDocumentFormFieldDropdown&#x60; * Hyperlink Field uses &#x60;TemplateResponseDocumentFormFieldHyperlink&#x60; * Checkbox Field uses &#x60;TemplateResponseDocumentFormFieldCheckbox&#x60; * Radio Field uses &#x60;TemplateResponseDocumentFormFieldRadio&#x60; * Signature Field uses &#x60;TemplateResponseDocumentFormFieldSignature&#x60; * Date Signed Field uses &#x60;TemplateResponseDocumentFormFieldDateSigned&#x60; * Initials Field uses &#x60;TemplateResponseDocumentFormFieldInitials&#x60;
   * @return type
   */
  @jakarta.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(String type) {
    this.type = type;
  }


  public TemplateResponseDocumentFormFieldText avgTextLength(TemplateResponseFieldAvgTextLength avgTextLength) {
    this.avgTextLength = avgTextLength;
    return this;
  }

  /**
   * Get avgTextLength
   * @return avgTextLength
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AVG_TEXT_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TemplateResponseFieldAvgTextLength getAvgTextLength() {
    return avgTextLength;
  }


  @JsonProperty(JSON_PROPERTY_AVG_TEXT_LENGTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvgTextLength(TemplateResponseFieldAvgTextLength avgTextLength) {
    this.avgTextLength = avgTextLength;
  }


  public TemplateResponseDocumentFormFieldText isMultiline(Boolean isMultiline) {
    this.isMultiline = isMultiline;
    return this;
  }

  /**
   * Whether this form field is multiline text.
   * @return isMultiline
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MULTILINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMultiline() {
    return isMultiline;
  }


  @JsonProperty(JSON_PROPERTY_IS_MULTILINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMultiline(Boolean isMultiline) {
    this.isMultiline = isMultiline;
  }


  public TemplateResponseDocumentFormFieldText originalFontSize(Integer originalFontSize) {
    this.originalFontSize = originalFontSize;
    return this;
  }

  /**
   * Original font size used in this form field&#39;s text.
   * @return originalFontSize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGINAL_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOriginalFontSize() {
    return originalFontSize;
  }


  @JsonProperty(JSON_PROPERTY_ORIGINAL_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginalFontSize(Integer originalFontSize) {
    this.originalFontSize = originalFontSize;
  }


  public TemplateResponseDocumentFormFieldText fontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

  /**
   * Font family used in this form field&#39;s text.
   * @return fontFamily
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFontFamily() {
    return fontFamily;
  }


  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFontFamily(String fontFamily) {
    this.fontFamily = fontFamily;
  }


  public TemplateResponseDocumentFormFieldText validationType(ValidationTypeEnum validationType) {
    this.validationType = validationType;
    return this;
  }

  /**
   * Each text field may contain a &#x60;validation_type&#x60; parameter. Check out the list of [validation types](https://faq.hellosign.com/hc/en-us/articles/217115577) to learn more about the possible values.
   * @return validationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VALIDATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ValidationTypeEnum getValidationType() {
    return validationType;
  }


  @JsonProperty(JSON_PROPERTY_VALIDATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setValidationType(ValidationTypeEnum validationType) {
    this.validationType = validationType;
  }


  /**
   * Return true if this TemplateResponseDocumentFormFieldText object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDocumentFormFieldText templateResponseDocumentFormFieldText = (TemplateResponseDocumentFormFieldText) o;
    return Objects.equals(this.type, templateResponseDocumentFormFieldText.type) &&
        Objects.equals(this.avgTextLength, templateResponseDocumentFormFieldText.avgTextLength) &&
        Objects.equals(this.isMultiline, templateResponseDocumentFormFieldText.isMultiline) &&
        Objects.equals(this.originalFontSize, templateResponseDocumentFormFieldText.originalFontSize) &&
        Objects.equals(this.fontFamily, templateResponseDocumentFormFieldText.fontFamily) &&
        Objects.equals(this.validationType, templateResponseDocumentFormFieldText.validationType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, avgTextLength, isMultiline, originalFontSize, fontFamily, validationType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDocumentFormFieldText {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    avgTextLength: ").append(toIndentedString(avgTextLength)).append("\n");
    sb.append("    isMultiline: ").append(toIndentedString(isMultiline)).append("\n");
    sb.append("    originalFontSize: ").append(toIndentedString(originalFontSize)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    validationType: ").append(toIndentedString(validationType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
     map.putAll(super.createFormData());
    try {
    if (type != null) {
        if (isFileTypeOrListOfFiles(type)) {
            fileTypeFound = true;
        }

        if (type.getClass().equals(java.io.File.class) ||
            type.getClass().equals(Integer.class) ||
            type.getClass().equals(String.class) ||
            type.getClass().isEnum()) {
            map.put("type", type);
        } else if (isListOfFile(type)) {
            for(int i = 0; i< getListSize(type); i++) {
                map.put("type[" + i + "]", getFromList(type, i));
            }
        }
        else {
            map.put("type", JSON.getDefault().getMapper().writeValueAsString(type));
        }
    }
    if (avgTextLength != null) {
        if (isFileTypeOrListOfFiles(avgTextLength)) {
            fileTypeFound = true;
        }

        if (avgTextLength.getClass().equals(java.io.File.class) ||
            avgTextLength.getClass().equals(Integer.class) ||
            avgTextLength.getClass().equals(String.class) ||
            avgTextLength.getClass().isEnum()) {
            map.put("avg_text_length", avgTextLength);
        } else if (isListOfFile(avgTextLength)) {
            for(int i = 0; i< getListSize(avgTextLength); i++) {
                map.put("avg_text_length[" + i + "]", getFromList(avgTextLength, i));
            }
        }
        else {
            map.put("avg_text_length", JSON.getDefault().getMapper().writeValueAsString(avgTextLength));
        }
    }
    if (isMultiline != null) {
        if (isFileTypeOrListOfFiles(isMultiline)) {
            fileTypeFound = true;
        }

        if (isMultiline.getClass().equals(java.io.File.class) ||
            isMultiline.getClass().equals(Integer.class) ||
            isMultiline.getClass().equals(String.class) ||
            isMultiline.getClass().isEnum()) {
            map.put("isMultiline", isMultiline);
        } else if (isListOfFile(isMultiline)) {
            for(int i = 0; i< getListSize(isMultiline); i++) {
                map.put("isMultiline[" + i + "]", getFromList(isMultiline, i));
            }
        }
        else {
            map.put("isMultiline", JSON.getDefault().getMapper().writeValueAsString(isMultiline));
        }
    }
    if (originalFontSize != null) {
        if (isFileTypeOrListOfFiles(originalFontSize)) {
            fileTypeFound = true;
        }

        if (originalFontSize.getClass().equals(java.io.File.class) ||
            originalFontSize.getClass().equals(Integer.class) ||
            originalFontSize.getClass().equals(String.class) ||
            originalFontSize.getClass().isEnum()) {
            map.put("originalFontSize", originalFontSize);
        } else if (isListOfFile(originalFontSize)) {
            for(int i = 0; i< getListSize(originalFontSize); i++) {
                map.put("originalFontSize[" + i + "]", getFromList(originalFontSize, i));
            }
        }
        else {
            map.put("originalFontSize", JSON.getDefault().getMapper().writeValueAsString(originalFontSize));
        }
    }
    if (fontFamily != null) {
        if (isFileTypeOrListOfFiles(fontFamily)) {
            fileTypeFound = true;
        }

        if (fontFamily.getClass().equals(java.io.File.class) ||
            fontFamily.getClass().equals(Integer.class) ||
            fontFamily.getClass().equals(String.class) ||
            fontFamily.getClass().isEnum()) {
            map.put("fontFamily", fontFamily);
        } else if (isListOfFile(fontFamily)) {
            for(int i = 0; i< getListSize(fontFamily); i++) {
                map.put("fontFamily[" + i + "]", getFromList(fontFamily, i));
            }
        }
        else {
            map.put("fontFamily", JSON.getDefault().getMapper().writeValueAsString(fontFamily));
        }
    }
    if (validationType != null) {
        if (isFileTypeOrListOfFiles(validationType)) {
            fileTypeFound = true;
        }

        if (validationType.getClass().equals(java.io.File.class) ||
            validationType.getClass().equals(Integer.class) ||
            validationType.getClass().equals(String.class) ||
            validationType.getClass().isEnum()) {
            map.put("validation_type", validationType);
        } else if (isListOfFile(validationType)) {
            for(int i = 0; i< getListSize(validationType); i++) {
                map.put("validation_type[" + i + "]", getFromList(validationType, i));
            }
        }
        else {
            map.put("validation_type", JSON.getDefault().getMapper().writeValueAsString(validationType));
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

  static {
    // Initialize and register the discriminator mappings.
    Map<String, Class<?>> mappings = new HashMap<>();
    mappings.put("TemplateResponseDocumentFormFieldText", TemplateResponseDocumentFormFieldText.class);
    JSON.registerDiscriminator(TemplateResponseDocumentFormFieldText.class, "type", mappings);
  }
}

