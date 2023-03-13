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
import com.dropbox.sign.model.TemplateResponseDocumentFormFieldCheckbox;
import com.dropbox.sign.model.TemplateResponseDocumentFormFieldDateSigned;
import com.dropbox.sign.model.TemplateResponseDocumentFormFieldDropdown;
import com.dropbox.sign.model.TemplateResponseDocumentFormFieldHyperlink;
import com.dropbox.sign.model.TemplateResponseDocumentFormFieldInitials;
import com.dropbox.sign.model.TemplateResponseDocumentFormFieldRadio;
import com.dropbox.sign.model.TemplateResponseDocumentFormFieldSignature;
import com.dropbox.sign.model.TemplateResponseDocumentFormFieldText;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dropbox.sign.JSON;


import com.dropbox.sign.ApiException;
/**
 * An array of Form Field objects containing the name and type of each named field.
 */
@ApiModel(description = "An array of Form Field objects containing the name and type of each named field.")
@JsonPropertyOrder({
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_TYPE,
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_API_ID,
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_NAME,
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_SIGNER,
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_X,
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_Y,
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_WIDTH,
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_HEIGHT,
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_REQUIRED,
    TemplateResponseDocumentFormFieldBase.JSON_PROPERTY_GROUP
})
@JsonIgnoreProperties(ignoreUnknown=true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldCheckbox.class, name = "TemplateResponseDocumentFormFieldCheckbox"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldDateSigned.class, name = "TemplateResponseDocumentFormFieldDateSigned"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldDropdown.class, name = "TemplateResponseDocumentFormFieldDropdown"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldHyperlink.class, name = "TemplateResponseDocumentFormFieldHyperlink"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldInitials.class, name = "TemplateResponseDocumentFormFieldInitials"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldRadio.class, name = "TemplateResponseDocumentFormFieldRadio"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldSignature.class, name = "TemplateResponseDocumentFormFieldSignature"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldText.class, name = "TemplateResponseDocumentFormFieldText"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldCheckbox.class, name = "checkbox"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldDateSigned.class, name = "date_signed"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldDropdown.class, name = "dropdown"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldHyperlink.class, name = "hyperlink"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldInitials.class, name = "initials"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldRadio.class, name = "radio"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldSignature.class, name = "signature"),
  @JsonSubTypes.Type(value = TemplateResponseDocumentFormFieldText.class, name = "text"),
})

public class TemplateResponseDocumentFormFieldBase {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_API_ID = "api_id";
  private String apiId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SIGNER = "signer";
  private String signer;

  public static final String JSON_PROPERTY_X = "x";
  private Integer x;

  public static final String JSON_PROPERTY_Y = "y";
  private Integer y;

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Integer width;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Integer height;

  public static final String JSON_PROPERTY_REQUIRED = "required";
  private Boolean required;

  public static final String JSON_PROPERTY_GROUP = "group";
  private String group;

  public TemplateResponseDocumentFormFieldBase() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public TemplateResponseDocumentFormFieldBase init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, TemplateResponseDocumentFormFieldBase.class);
  }

  static public TemplateResponseDocumentFormFieldBase init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      TemplateResponseDocumentFormFieldBase.class
    );
  }

  public TemplateResponseDocumentFormFieldBase type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public TemplateResponseDocumentFormFieldBase apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * A unique id for the form field.
   * @return apiId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A unique id for the form field.")
  @JsonProperty(JSON_PROPERTY_API_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApiId() {
    return apiId;
  }


  @JsonProperty(JSON_PROPERTY_API_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  public TemplateResponseDocumentFormFieldBase name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the form field.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the form field.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TemplateResponseDocumentFormFieldBase signer(String signer) {
    this.signer = signer;
    return this;
  }

   /**
   * The signer of the Form Field.
   * @return signer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The signer of the Form Field.")
  @JsonProperty(JSON_PROPERTY_SIGNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSigner() {
    return signer;
  }


  @JsonProperty(JSON_PROPERTY_SIGNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSigner(String signer) {
    this.signer = signer;
  }


  public TemplateResponseDocumentFormFieldBase x(Integer x) {
    this.x = x;
    return this;
  }

   /**
   * The horizontal offset in pixels for this form field.
   * @return x
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The horizontal offset in pixels for this form field.")
  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getX() {
    return x;
  }


  @JsonProperty(JSON_PROPERTY_X)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setX(Integer x) {
    this.x = x;
  }


  public TemplateResponseDocumentFormFieldBase y(Integer y) {
    this.y = y;
    return this;
  }

   /**
   * The vertical offset in pixels for this form field.
   * @return y
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The vertical offset in pixels for this form field.")
  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getY() {
    return y;
  }


  @JsonProperty(JSON_PROPERTY_Y)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setY(Integer y) {
    this.y = y;
  }


  public TemplateResponseDocumentFormFieldBase width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * The width in pixels of this form field.
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The width in pixels of this form field.")
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWidth() {
    return width;
  }


  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWidth(Integer width) {
    this.width = width;
  }


  public TemplateResponseDocumentFormFieldBase height(Integer height) {
    this.height = height;
    return this;
  }

   /**
   * The height in pixels of this form field.
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The height in pixels of this form field.")
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHeight() {
    return height;
  }


  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHeight(Integer height) {
    this.height = height;
  }


  public TemplateResponseDocumentFormFieldBase required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Boolean showing whether or not this field is required.
   * @return required
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Boolean showing whether or not this field is required.")
  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getRequired() {
    return required;
  }


  @JsonProperty(JSON_PROPERTY_REQUIRED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequired(Boolean required) {
    this.required = required;
  }


  public TemplateResponseDocumentFormFieldBase group(String group) {
    this.group = group;
    return this;
  }

   /**
   * The name of the group this field is in. If this field is not a group, this defaults to &#x60;null&#x60; except for Radio fields.
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the group this field is in. If this field is not a group, this defaults to `null` except for Radio fields.")
  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGroup() {
    return group;
  }


  @JsonProperty(JSON_PROPERTY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroup(String group) {
    this.group = group;
  }


  /**
   * Return true if this TemplateResponseDocumentFormFieldBase object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateResponseDocumentFormFieldBase templateResponseDocumentFormFieldBase = (TemplateResponseDocumentFormFieldBase) o;
    return Objects.equals(this.type, templateResponseDocumentFormFieldBase.type) &&
        Objects.equals(this.apiId, templateResponseDocumentFormFieldBase.apiId) &&
        Objects.equals(this.name, templateResponseDocumentFormFieldBase.name) &&
        Objects.equals(this.signer, templateResponseDocumentFormFieldBase.signer) &&
        Objects.equals(this.x, templateResponseDocumentFormFieldBase.x) &&
        Objects.equals(this.y, templateResponseDocumentFormFieldBase.y) &&
        Objects.equals(this.width, templateResponseDocumentFormFieldBase.width) &&
        Objects.equals(this.height, templateResponseDocumentFormFieldBase.height) &&
        Objects.equals(this.required, templateResponseDocumentFormFieldBase.required) &&
        Objects.equals(this.group, templateResponseDocumentFormFieldBase.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, apiId, name, signer, x, y, width, height, required, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateResponseDocumentFormFieldBase {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    signer: ").append(toIndentedString(signer)).append("\n");
    sb.append("    x: ").append(toIndentedString(x)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
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
    if (apiId != null) {
        if (isFileTypeOrListOfFiles(apiId)) {
            fileTypeFound = true;
        }

        if (apiId.getClass().equals(java.io.File.class) ||
            apiId.getClass().equals(Integer.class) ||
            apiId.getClass().equals(String.class) ||
            apiId.getClass().isEnum()) {
            map.put("api_id", apiId);
        } else if (isListOfFile(apiId)) {
            for(int i = 0; i< getListSize(apiId); i++) {
                map.put("api_id[" + i + "]", getFromList(apiId, i));
            }
        }
        else {
            map.put("api_id", JSON.getDefault().getMapper().writeValueAsString(apiId));
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
    if (signer != null) {
        if (isFileTypeOrListOfFiles(signer)) {
            fileTypeFound = true;
        }

        if (signer.getClass().equals(java.io.File.class) ||
            signer.getClass().equals(Integer.class) ||
            signer.getClass().equals(String.class) ||
            signer.getClass().isEnum()) {
            map.put("signer", signer);
        } else if (isListOfFile(signer)) {
            for(int i = 0; i< getListSize(signer); i++) {
                map.put("signer[" + i + "]", getFromList(signer, i));
            }
        }
        else {
            map.put("signer", JSON.getDefault().getMapper().writeValueAsString(signer));
        }
    }
    if (x != null) {
        if (isFileTypeOrListOfFiles(x)) {
            fileTypeFound = true;
        }

        if (x.getClass().equals(java.io.File.class) ||
            x.getClass().equals(Integer.class) ||
            x.getClass().equals(String.class) ||
            x.getClass().isEnum()) {
            map.put("x", x);
        } else if (isListOfFile(x)) {
            for(int i = 0; i< getListSize(x); i++) {
                map.put("x[" + i + "]", getFromList(x, i));
            }
        }
        else {
            map.put("x", JSON.getDefault().getMapper().writeValueAsString(x));
        }
    }
    if (y != null) {
        if (isFileTypeOrListOfFiles(y)) {
            fileTypeFound = true;
        }

        if (y.getClass().equals(java.io.File.class) ||
            y.getClass().equals(Integer.class) ||
            y.getClass().equals(String.class) ||
            y.getClass().isEnum()) {
            map.put("y", y);
        } else if (isListOfFile(y)) {
            for(int i = 0; i< getListSize(y); i++) {
                map.put("y[" + i + "]", getFromList(y, i));
            }
        }
        else {
            map.put("y", JSON.getDefault().getMapper().writeValueAsString(y));
        }
    }
    if (width != null) {
        if (isFileTypeOrListOfFiles(width)) {
            fileTypeFound = true;
        }

        if (width.getClass().equals(java.io.File.class) ||
            width.getClass().equals(Integer.class) ||
            width.getClass().equals(String.class) ||
            width.getClass().isEnum()) {
            map.put("width", width);
        } else if (isListOfFile(width)) {
            for(int i = 0; i< getListSize(width); i++) {
                map.put("width[" + i + "]", getFromList(width, i));
            }
        }
        else {
            map.put("width", JSON.getDefault().getMapper().writeValueAsString(width));
        }
    }
    if (height != null) {
        if (isFileTypeOrListOfFiles(height)) {
            fileTypeFound = true;
        }

        if (height.getClass().equals(java.io.File.class) ||
            height.getClass().equals(Integer.class) ||
            height.getClass().equals(String.class) ||
            height.getClass().isEnum()) {
            map.put("height", height);
        } else if (isListOfFile(height)) {
            for(int i = 0; i< getListSize(height); i++) {
                map.put("height[" + i + "]", getFromList(height, i));
            }
        }
        else {
            map.put("height", JSON.getDefault().getMapper().writeValueAsString(height));
        }
    }
    if (required != null) {
        if (isFileTypeOrListOfFiles(required)) {
            fileTypeFound = true;
        }

        if (required.getClass().equals(java.io.File.class) ||
            required.getClass().equals(Integer.class) ||
            required.getClass().equals(String.class) ||
            required.getClass().isEnum()) {
            map.put("required", required);
        } else if (isListOfFile(required)) {
            for(int i = 0; i< getListSize(required); i++) {
                map.put("required[" + i + "]", getFromList(required, i));
            }
        }
        else {
            map.put("required", JSON.getDefault().getMapper().writeValueAsString(required));
        }
    }
    if (group != null) {
        if (isFileTypeOrListOfFiles(group)) {
            fileTypeFound = true;
        }

        if (group.getClass().equals(java.io.File.class) ||
            group.getClass().equals(Integer.class) ||
            group.getClass().equals(String.class) ||
            group.getClass().isEnum()) {
            map.put("group", group);
        } else if (isListOfFile(group)) {
            for(int i = 0; i< getListSize(group); i++) {
                map.put("group[" + i + "]", getFromList(group, i));
            }
        }
        else {
            map.put("group", JSON.getDefault().getMapper().writeValueAsString(group));
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
  Map<String, Class<?>> mappings = new HashMap<String, Class<?>>();
  mappings.put("TemplateResponseDocumentFormFieldCheckbox", TemplateResponseDocumentFormFieldCheckbox.class);
  mappings.put("TemplateResponseDocumentFormFieldDateSigned", TemplateResponseDocumentFormFieldDateSigned.class);
  mappings.put("TemplateResponseDocumentFormFieldDropdown", TemplateResponseDocumentFormFieldDropdown.class);
  mappings.put("TemplateResponseDocumentFormFieldHyperlink", TemplateResponseDocumentFormFieldHyperlink.class);
  mappings.put("TemplateResponseDocumentFormFieldInitials", TemplateResponseDocumentFormFieldInitials.class);
  mappings.put("TemplateResponseDocumentFormFieldRadio", TemplateResponseDocumentFormFieldRadio.class);
  mappings.put("TemplateResponseDocumentFormFieldSignature", TemplateResponseDocumentFormFieldSignature.class);
  mappings.put("TemplateResponseDocumentFormFieldText", TemplateResponseDocumentFormFieldText.class);
  mappings.put("checkbox", TemplateResponseDocumentFormFieldCheckbox.class);
  mappings.put("date_signed", TemplateResponseDocumentFormFieldDateSigned.class);
  mappings.put("dropdown", TemplateResponseDocumentFormFieldDropdown.class);
  mappings.put("hyperlink", TemplateResponseDocumentFormFieldHyperlink.class);
  mappings.put("initials", TemplateResponseDocumentFormFieldInitials.class);
  mappings.put("radio", TemplateResponseDocumentFormFieldRadio.class);
  mappings.put("signature", TemplateResponseDocumentFormFieldSignature.class);
  mappings.put("text", TemplateResponseDocumentFormFieldText.class);
  mappings.put("TemplateResponseDocumentFormFieldBase", TemplateResponseDocumentFormFieldBase.class);
  JSON.registerDiscriminator(TemplateResponseDocumentFormFieldBase.class, "type", mappings);
}
}

