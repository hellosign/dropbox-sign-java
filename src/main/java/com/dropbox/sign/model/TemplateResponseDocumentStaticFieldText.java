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

import com.dropbox.sign.ApiException;
import com.dropbox.sign.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** This class extends &#x60;TemplateResponseDocumentStaticFieldBase&#x60; */
@JsonPropertyOrder({TemplateResponseDocumentStaticFieldText.JSON_PROPERTY_TYPE})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(
        allowSetters = true, // allows the type to be set during deserialization
        ignoreUnknown = true)
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true)
public class TemplateResponseDocumentStaticFieldText
        extends TemplateResponseDocumentStaticFieldBase {
    public static final String JSON_PROPERTY_TYPE = "type";
    private String type = "text";

    public TemplateResponseDocumentStaticFieldText() {}

    /**
     * Attempt to instantiate and hydrate a new instance of this class
     *
     * @param jsonData String of JSON data representing target object
     */
    public static TemplateResponseDocumentStaticFieldText init(String jsonData) throws Exception {
        return new ObjectMapper()
                .readValue(jsonData, TemplateResponseDocumentStaticFieldText.class);
    }

    public static TemplateResponseDocumentStaticFieldText init(HashMap data) throws Exception {
        return new ObjectMapper()
                .readValue(
                        new ObjectMapper().writeValueAsString(data),
                        TemplateResponseDocumentStaticFieldText.class);
    }

    public TemplateResponseDocumentStaticFieldText type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of this static field. See [field types](/api/reference/constants/#field-types). *
     * Text Field uses &#x60;TemplateResponseDocumentStaticFieldText&#x60; * Dropdown Field uses
     * &#x60;TemplateResponseDocumentStaticFieldDropdown&#x60; * Hyperlink Field uses
     * &#x60;TemplateResponseDocumentStaticFieldHyperlink&#x60; * Checkbox Field uses
     * &#x60;TemplateResponseDocumentStaticFieldCheckbox&#x60; * Radio Field uses
     * &#x60;TemplateResponseDocumentStaticFieldRadio&#x60; * Signature Field uses
     * &#x60;TemplateResponseDocumentStaticFieldSignature&#x60; * Date Signed Field uses
     * &#x60;TemplateResponseDocumentStaticFieldDateSigned&#x60; * Initials Field uses
     * &#x60;TemplateResponseDocumentStaticFieldInitials&#x60;
     *
     * @return type
     */
    @javax.annotation.Nonnull
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

    /** Return true if this TemplateResponseDocumentStaticFieldText object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateResponseDocumentStaticFieldText templateResponseDocumentStaticFieldText =
                (TemplateResponseDocumentStaticFieldText) o;
        return Objects.equals(this.type, templateResponseDocumentStaticFieldText.type)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateResponseDocumentStaticFieldText {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

                if (type.getClass().equals(java.io.File.class)
                        || type.getClass().equals(Integer.class)
                        || type.getClass().equals(String.class)
                        || type.getClass().isEnum()) {
                    map.put("type", type);
                } else if (isListOfFile(type)) {
                    for (int i = 0; i < getListSize(type); i++) {
                        map.put("type[" + i + "]", getFromList(type, i));
                    }
                } else {
                    map.put("type", JSON.getDefault().getMapper().writeValueAsString(type));
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
        return obj instanceof java.util.List
                && !isListEmpty(obj)
                && getFromList(obj, 0) instanceof java.io.File;
    }

    private boolean isListEmpty(Object obj) throws Exception {
        return (boolean)
                Class.forName(java.util.List.class.getName()).getMethod("isEmpty").invoke(obj);
    }

    private Object getFromList(Object obj, int index) throws Exception {
        return Class.forName(java.util.List.class.getName())
                .getMethod("get", int.class)
                .invoke(obj, index);
    }

    private int getListSize(Object obj) throws Exception {
        return (int) Class.forName(java.util.List.class.getName()).getMethod("size").invoke(obj);
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        mappings.put(
                "TemplateResponseDocumentStaticFieldText",
                TemplateResponseDocumentStaticFieldText.class);
        JSON.registerDiscriminator(TemplateResponseDocumentStaticFieldText.class, "type", mappings);
    }
}
