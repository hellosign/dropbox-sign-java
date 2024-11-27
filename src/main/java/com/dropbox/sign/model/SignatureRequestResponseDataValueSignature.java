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

/** SignatureRequestResponseDataValueSignature */
@JsonPropertyOrder({
    SignatureRequestResponseDataValueSignature.JSON_PROPERTY_TYPE,
    SignatureRequestResponseDataValueSignature.JSON_PROPERTY_VALUE,
    SignatureRequestResponseDataValueSignature.JSON_PROPERTY_IS_SIGNED
})
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
public class SignatureRequestResponseDataValueSignature extends SignatureRequestResponseDataBase {
    public static final String JSON_PROPERTY_TYPE = "type";
    private String type = "signature";

    public static final String JSON_PROPERTY_VALUE = "value";
    private String value;

    public static final String JSON_PROPERTY_IS_SIGNED = "is_signed";
    private Boolean isSigned;

    public SignatureRequestResponseDataValueSignature() {}

    /**
     * Attempt to instantiate and hydrate a new instance of this class
     *
     * @param jsonData String of JSON data representing target object
     */
    public static SignatureRequestResponseDataValueSignature init(String jsonData)
            throws Exception {
        return new ObjectMapper()
                .readValue(jsonData, SignatureRequestResponseDataValueSignature.class);
    }

    public static SignatureRequestResponseDataValueSignature init(HashMap data) throws Exception {
        return new ObjectMapper()
                .readValue(
                        new ObjectMapper().writeValueAsString(data),
                        SignatureRequestResponseDataValueSignature.class);
    }

    public SignatureRequestResponseDataValueSignature type(String type) {
        this.type = type;
        return this;
    }

    /**
     * A signature input field
     *
     * @return type
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(String type) {
        this.type = type;
    }

    public SignatureRequestResponseDataValueSignature value(String value) {
        this.value = value;
        return this;
    }

    /**
     * The value of the form field.
     *
     * @return value
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValue(String value) {
        this.value = value;
    }

    public SignatureRequestResponseDataValueSignature isSigned(Boolean isSigned) {
        this.isSigned = isSigned;
        return this;
    }

    /**
     * This field contains the boolean true if the field is signed.
     *
     * @return isSigned
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_IS_SIGNED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsSigned() {
        return isSigned;
    }

    @JsonProperty(JSON_PROPERTY_IS_SIGNED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsSigned(Boolean isSigned) {
        this.isSigned = isSigned;
    }

    /** Return true if this SignatureRequestResponseDataValueSignature object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SignatureRequestResponseDataValueSignature signatureRequestResponseDataValueSignature =
                (SignatureRequestResponseDataValueSignature) o;
        return Objects.equals(this.type, signatureRequestResponseDataValueSignature.type)
                && Objects.equals(this.value, signatureRequestResponseDataValueSignature.value)
                && Objects.equals(
                        this.isSigned, signatureRequestResponseDataValueSignature.isSigned)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, value, isSigned, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SignatureRequestResponseDataValueSignature {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    isSigned: ").append(toIndentedString(isSigned)).append("\n");
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
            if (value != null) {
                if (isFileTypeOrListOfFiles(value)) {
                    fileTypeFound = true;
                }

                if (value.getClass().equals(java.io.File.class)
                        || value.getClass().equals(Integer.class)
                        || value.getClass().equals(String.class)
                        || value.getClass().isEnum()) {
                    map.put("value", value);
                } else if (isListOfFile(value)) {
                    for (int i = 0; i < getListSize(value); i++) {
                        map.put("value[" + i + "]", getFromList(value, i));
                    }
                } else {
                    map.put("value", JSON.getDefault().getMapper().writeValueAsString(value));
                }
            }
            if (isSigned != null) {
                if (isFileTypeOrListOfFiles(isSigned)) {
                    fileTypeFound = true;
                }

                if (isSigned.getClass().equals(java.io.File.class)
                        || isSigned.getClass().equals(Integer.class)
                        || isSigned.getClass().equals(String.class)
                        || isSigned.getClass().isEnum()) {
                    map.put("is_signed", isSigned);
                } else if (isListOfFile(isSigned)) {
                    for (int i = 0; i < getListSize(isSigned); i++) {
                        map.put("is_signed[" + i + "]", getFromList(isSigned, i));
                    }
                } else {
                    map.put(
                            "is_signed",
                            JSON.getDefault().getMapper().writeValueAsString(isSigned));
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
                "SignatureRequestResponseDataValueSignature",
                SignatureRequestResponseDataValueSignature.class);
        JSON.registerDiscriminator(
                SignatureRequestResponseDataValueSignature.class, "type", mappings);
    }
}
