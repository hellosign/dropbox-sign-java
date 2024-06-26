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
import com.dropbox.sign.model.SubFormFieldsPerDocumentBase;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
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
 * This class extends &#x60;SubFormFieldsPerDocumentBase&#x60;.
 */
@ApiModel(description = "This class extends `SubFormFieldsPerDocumentBase`.")
@JsonPropertyOrder({
  SubFormFieldsPerDocumentTextMerge.JSON_PROPERTY_TYPE,
  SubFormFieldsPerDocumentTextMerge.JSON_PROPERTY_FONT_FAMILY,
  SubFormFieldsPerDocumentTextMerge.JSON_PROPERTY_FONT_SIZE
})
@JsonIgnoreProperties(ignoreUnknown=true)
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)

public class SubFormFieldsPerDocumentTextMerge extends SubFormFieldsPerDocumentBase {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "text-merge";

  /**
   * Font family for the field.
   */
  public enum FontFamilyEnum {
    HELVETICA("helvetica"),
    
    ARIAL("arial"),
    
    COURIER("courier"),
    
    CALIBRI("calibri"),
    
    CAMBRIA("cambria"),
    
    GEORGIA("georgia"),
    
    TIMES("times"),
    
    TREBUCHET("trebuchet"),
    
    VERDANA("verdana"),
    
    ROBOTO("roboto"),
    
    ROBOTOMONO("robotoMono"),
    
    NOTOSANS("notoSans"),
    
    NOTOSERIF("notoSerif"),
    
    NOTOCJK_JP_REGULAR("notoCJK-JP-Regular"),
    
    NOTOHEBREW_REGULAR("notoHebrew-Regular"),
    
    NOTOSANTHAIMERGED("notoSanThaiMerged");

    private String value;

    FontFamilyEnum(String value) {
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
    public static FontFamilyEnum fromValue(String value) {
      for (FontFamilyEnum b : FontFamilyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_FONT_FAMILY = "font_family";
  private FontFamilyEnum fontFamily;

  public static final String JSON_PROPERTY_FONT_SIZE = "font_size";
  private Integer fontSize = 12;

  public SubFormFieldsPerDocumentTextMerge() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public SubFormFieldsPerDocumentTextMerge init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, SubFormFieldsPerDocumentTextMerge.class);
  }

  static public SubFormFieldsPerDocumentTextMerge init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      SubFormFieldsPerDocumentTextMerge.class
    );
  }

  public SubFormFieldsPerDocumentTextMerge type(String type) {
    this.type = type;
    return this;
  }

   /**
   * A text field that has default text set using pre-filled data. Use the &#x60;SubFormFieldsPerDocumentTextMerge&#x60; class.
   * @return type
  **/
  @jakarta.annotation.Nonnull
  @ApiModelProperty(required = true, value = "A text field that has default text set using pre-filled data. Use the `SubFormFieldsPerDocumentTextMerge` class.")
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


  public SubFormFieldsPerDocumentTextMerge fontFamily(FontFamilyEnum fontFamily) {
    this.fontFamily = fontFamily;
    return this;
  }

   /**
   * Font family for the field.
   * @return fontFamily
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "Font family for the field.")
  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FontFamilyEnum getFontFamily() {
    return fontFamily;
  }


  @JsonProperty(JSON_PROPERTY_FONT_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFontFamily(FontFamilyEnum fontFamily) {
    this.fontFamily = fontFamily;
  }


  public SubFormFieldsPerDocumentTextMerge fontSize(Integer fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * The initial px font size for the field contents. Can be any integer value between &#x60;7&#x60; and &#x60;49&#x60;.  **NOTE:** Font size may be reduced during processing in order to fit the contents within the dimensions of the field.
   * @return fontSize
  **/
  @jakarta.annotation.Nullable
  @ApiModelProperty(value = "The initial px font size for the field contents. Can be any integer value between `7` and `49`.  **NOTE:** Font size may be reduced during processing in order to fit the contents within the dimensions of the field.")
  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFontSize() {
    return fontSize;
  }


  @JsonProperty(JSON_PROPERTY_FONT_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFontSize(Integer fontSize) {
    this.fontSize = fontSize;
  }


  /**
   * Return true if this SubFormFieldsPerDocumentTextMerge object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubFormFieldsPerDocumentTextMerge subFormFieldsPerDocumentTextMerge = (SubFormFieldsPerDocumentTextMerge) o;
    return Objects.equals(this.type, subFormFieldsPerDocumentTextMerge.type) &&
        Objects.equals(this.fontFamily, subFormFieldsPerDocumentTextMerge.fontFamily) &&
        Objects.equals(this.fontSize, subFormFieldsPerDocumentTextMerge.fontSize) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, fontFamily, fontSize, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubFormFieldsPerDocumentTextMerge {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    fontFamily: ").append(toIndentedString(fontFamily)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
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
    if (fontFamily != null) {
        if (isFileTypeOrListOfFiles(fontFamily)) {
            fileTypeFound = true;
        }

        if (fontFamily.getClass().equals(java.io.File.class) ||
            fontFamily.getClass().equals(Integer.class) ||
            fontFamily.getClass().equals(String.class) ||
            fontFamily.getClass().isEnum()) {
            map.put("font_family", fontFamily);
        } else if (isListOfFile(fontFamily)) {
            for(int i = 0; i< getListSize(fontFamily); i++) {
                map.put("font_family[" + i + "]", getFromList(fontFamily, i));
            }
        }
        else {
            map.put("font_family", JSON.getDefault().getMapper().writeValueAsString(fontFamily));
        }
    }
    if (fontSize != null) {
        if (isFileTypeOrListOfFiles(fontSize)) {
            fileTypeFound = true;
        }

        if (fontSize.getClass().equals(java.io.File.class) ||
            fontSize.getClass().equals(Integer.class) ||
            fontSize.getClass().equals(String.class) ||
            fontSize.getClass().isEnum()) {
            map.put("font_size", fontSize);
        } else if (isListOfFile(fontSize)) {
            for(int i = 0; i< getListSize(fontSize); i++) {
                map.put("font_size[" + i + "]", getFromList(fontSize, i));
            }
        }
        else {
            map.put("font_size", JSON.getDefault().getMapper().writeValueAsString(fontSize));
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
    mappings.put("SubFormFieldsPerDocumentTextMerge", SubFormFieldsPerDocumentTextMerge.class);
    JSON.registerDiscriminator(SubFormFieldsPerDocumentTextMerge.class, "type", mappings);
  }
}

