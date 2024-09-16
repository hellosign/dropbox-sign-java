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
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** FileResponseDataUri */
@JsonPropertyOrder({FileResponseDataUri.JSON_PROPERTY_DATA_URI})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FileResponseDataUri {
    public static final String JSON_PROPERTY_DATA_URI = "data_uri";
    private String dataUri;

    public FileResponseDataUri() {}

    /**
     * Attempt to instantiate and hydrate a new instance of this class
     *
     * @param jsonData String of JSON data representing target object
     */
    public static FileResponseDataUri init(String jsonData) throws Exception {
        return new ObjectMapper().readValue(jsonData, FileResponseDataUri.class);
    }

    public static FileResponseDataUri init(HashMap data) throws Exception {
        return new ObjectMapper()
                .readValue(new ObjectMapper().writeValueAsString(data), FileResponseDataUri.class);
    }

    public FileResponseDataUri dataUri(String dataUri) {
        this.dataUri = dataUri;
        return this;
    }

    /**
     * File as base64 encoded string.
     *
     * @return dataUri
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_DATA_URI)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDataUri() {
        return dataUri;
    }

    @JsonProperty(JSON_PROPERTY_DATA_URI)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDataUri(String dataUri) {
        this.dataUri = dataUri;
    }

    /** Return true if this FileResponseDataUri object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FileResponseDataUri fileResponseDataUri = (FileResponseDataUri) o;
        return Objects.equals(this.dataUri, fileResponseDataUri.dataUri);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataUri);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileResponseDataUri {\n");
        sb.append("    dataUri: ").append(toIndentedString(dataUri)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public Map<String, Object> createFormData() throws ApiException {
        Map<String, Object> map = new HashMap<>();
        boolean fileTypeFound = false;
        try {
            if (dataUri != null) {
                if (isFileTypeOrListOfFiles(dataUri)) {
                    fileTypeFound = true;
                }

                if (dataUri.getClass().equals(java.io.File.class)
                        || dataUri.getClass().equals(Integer.class)
                        || dataUri.getClass().equals(String.class)
                        || dataUri.getClass().isEnum()) {
                    map.put("data_uri", dataUri);
                } else if (isListOfFile(dataUri)) {
                    for (int i = 0; i < getListSize(dataUri); i++) {
                        map.put("data_uri[" + i + "]", getFromList(dataUri, i));
                    }
                } else {
                    map.put("data_uri", JSON.getDefault().getMapper().writeValueAsString(dataUri));
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
