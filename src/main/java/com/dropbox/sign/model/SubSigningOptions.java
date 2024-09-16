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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * This allows the requester to specify the types allowed for creating a signature. **NOTE:** If
 * &#x60;signing_options&#x60; are not defined in the request, the allowed types will default to
 * those specified in the account settings.
 */
@JsonPropertyOrder({
    SubSigningOptions.JSON_PROPERTY_DEFAULT_TYPE,
    SubSigningOptions.JSON_PROPERTY_DRAW,
    SubSigningOptions.JSON_PROPERTY_PHONE,
    SubSigningOptions.JSON_PROPERTY_TYPE,
    SubSigningOptions.JSON_PROPERTY_UPLOAD
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubSigningOptions {
    /** The default type shown (limited to the listed types) */
    public enum DefaultTypeEnum {
        DRAW("draw"),

        PHONE("phone"),

        TYPE("type"),

        UPLOAD("upload");

        private String value;

        DefaultTypeEnum(String value) {
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
        public static DefaultTypeEnum fromValue(String value) {
            for (DefaultTypeEnum b : DefaultTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_DEFAULT_TYPE = "default_type";
    private DefaultTypeEnum defaultType;

    public static final String JSON_PROPERTY_DRAW = "draw";
    private Boolean draw = false;

    public static final String JSON_PROPERTY_PHONE = "phone";
    private Boolean phone = false;

    public static final String JSON_PROPERTY_TYPE = "type";
    private Boolean type = false;

    public static final String JSON_PROPERTY_UPLOAD = "upload";
    private Boolean upload = false;

    public SubSigningOptions() {}

    /**
     * Attempt to instantiate and hydrate a new instance of this class
     *
     * @param jsonData String of JSON data representing target object
     */
    public static SubSigningOptions init(String jsonData) throws Exception {
        return new ObjectMapper().readValue(jsonData, SubSigningOptions.class);
    }

    public static SubSigningOptions init(HashMap data) throws Exception {
        return new ObjectMapper()
                .readValue(new ObjectMapper().writeValueAsString(data), SubSigningOptions.class);
    }

    public SubSigningOptions defaultType(DefaultTypeEnum defaultType) {
        this.defaultType = defaultType;
        return this;
    }

    /**
     * The default type shown (limited to the listed types)
     *
     * @return defaultType
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DEFAULT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public DefaultTypeEnum getDefaultType() {
        return defaultType;
    }

    @JsonProperty(JSON_PROPERTY_DEFAULT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDefaultType(DefaultTypeEnum defaultType) {
        this.defaultType = defaultType;
    }

    public SubSigningOptions draw(Boolean draw) {
        this.draw = draw;
        return this;
    }

    /**
     * Allows drawing the signature
     *
     * @return draw
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_DRAW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getDraw() {
        return draw;
    }

    @JsonProperty(JSON_PROPERTY_DRAW)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDraw(Boolean draw) {
        this.draw = draw;
    }

    public SubSigningOptions phone(Boolean phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Allows using a smartphone to email the signature
     *
     * @return phone
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getPhone() {
        return phone;
    }

    @JsonProperty(JSON_PROPERTY_PHONE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPhone(Boolean phone) {
        this.phone = phone;
    }

    public SubSigningOptions type(Boolean type) {
        this.type = type;
        return this;
    }

    /**
     * Allows typing the signature
     *
     * @return type
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setType(Boolean type) {
        this.type = type;
    }

    public SubSigningOptions upload(Boolean upload) {
        this.upload = upload;
        return this;
    }

    /**
     * Allows uploading the signature
     *
     * @return upload
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_UPLOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getUpload() {
        return upload;
    }

    @JsonProperty(JSON_PROPERTY_UPLOAD)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUpload(Boolean upload) {
        this.upload = upload;
    }

    /** Return true if this SubSigningOptions object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SubSigningOptions subSigningOptions = (SubSigningOptions) o;
        return Objects.equals(this.defaultType, subSigningOptions.defaultType)
                && Objects.equals(this.draw, subSigningOptions.draw)
                && Objects.equals(this.phone, subSigningOptions.phone)
                && Objects.equals(this.type, subSigningOptions.type)
                && Objects.equals(this.upload, subSigningOptions.upload);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultType, draw, phone, type, upload);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubSigningOptions {\n");
        sb.append("    defaultType: ").append(toIndentedString(defaultType)).append("\n");
        sb.append("    draw: ").append(toIndentedString(draw)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    upload: ").append(toIndentedString(upload)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public Map<String, Object> createFormData() throws ApiException {
        Map<String, Object> map = new HashMap<>();
        boolean fileTypeFound = false;
        try {
            if (defaultType != null) {
                if (isFileTypeOrListOfFiles(defaultType)) {
                    fileTypeFound = true;
                }

                if (defaultType.getClass().equals(java.io.File.class)
                        || defaultType.getClass().equals(Integer.class)
                        || defaultType.getClass().equals(String.class)
                        || defaultType.getClass().isEnum()) {
                    map.put("default_type", defaultType);
                } else if (isListOfFile(defaultType)) {
                    for (int i = 0; i < getListSize(defaultType); i++) {
                        map.put("default_type[" + i + "]", getFromList(defaultType, i));
                    }
                } else {
                    map.put(
                            "default_type",
                            JSON.getDefault().getMapper().writeValueAsString(defaultType));
                }
            }
            if (draw != null) {
                if (isFileTypeOrListOfFiles(draw)) {
                    fileTypeFound = true;
                }

                if (draw.getClass().equals(java.io.File.class)
                        || draw.getClass().equals(Integer.class)
                        || draw.getClass().equals(String.class)
                        || draw.getClass().isEnum()) {
                    map.put("draw", draw);
                } else if (isListOfFile(draw)) {
                    for (int i = 0; i < getListSize(draw); i++) {
                        map.put("draw[" + i + "]", getFromList(draw, i));
                    }
                } else {
                    map.put("draw", JSON.getDefault().getMapper().writeValueAsString(draw));
                }
            }
            if (phone != null) {
                if (isFileTypeOrListOfFiles(phone)) {
                    fileTypeFound = true;
                }

                if (phone.getClass().equals(java.io.File.class)
                        || phone.getClass().equals(Integer.class)
                        || phone.getClass().equals(String.class)
                        || phone.getClass().isEnum()) {
                    map.put("phone", phone);
                } else if (isListOfFile(phone)) {
                    for (int i = 0; i < getListSize(phone); i++) {
                        map.put("phone[" + i + "]", getFromList(phone, i));
                    }
                } else {
                    map.put("phone", JSON.getDefault().getMapper().writeValueAsString(phone));
                }
            }
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
            if (upload != null) {
                if (isFileTypeOrListOfFiles(upload)) {
                    fileTypeFound = true;
                }

                if (upload.getClass().equals(java.io.File.class)
                        || upload.getClass().equals(Integer.class)
                        || upload.getClass().equals(String.class)
                        || upload.getClass().isEnum()) {
                    map.put("upload", upload);
                } else if (isListOfFile(upload)) {
                    for (int i = 0; i < getListSize(upload); i++) {
                        map.put("upload[" + i + "]", getFromList(upload, i));
                    }
                } else {
                    map.put("upload", JSON.getDefault().getMapper().writeValueAsString(upload));
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
}
