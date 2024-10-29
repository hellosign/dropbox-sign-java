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

/** FaxResponseTransmission */
@JsonPropertyOrder({
    FaxResponseTransmission.JSON_PROPERTY_RECIPIENT,
    FaxResponseTransmission.JSON_PROPERTY_SENDER,
    FaxResponseTransmission.JSON_PROPERTY_STATUS_CODE,
    FaxResponseTransmission.JSON_PROPERTY_SENT_AT
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FaxResponseTransmission {
    public static final String JSON_PROPERTY_RECIPIENT = "recipient";
    private String recipient;

    public static final String JSON_PROPERTY_SENDER = "sender";
    private String sender;

    /** Fax Transmission Status Code */
    public enum StatusCodeEnum {
        SUCCESS("success"),

        TRANSMITTING("transmitting"),

        ERROR_COULD_NOT_FAX("error_could_not_fax"),

        ERROR_UNKNOWN("error_unknown"),

        ERROR_BUSY("error_busy"),

        ERROR_NO_ANSWER("error_no_answer"),

        ERROR_DISCONNECTED("error_disconnected"),

        ERROR_BAD_DESTINATION("error_bad_destination");

        private String value;

        StatusCodeEnum(String value) {
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
        public static StatusCodeEnum fromValue(String value) {
            for (StatusCodeEnum b : StatusCodeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_STATUS_CODE = "status_code";
    private StatusCodeEnum statusCode;

    public static final String JSON_PROPERTY_SENT_AT = "sent_at";
    private Integer sentAt;

    public FaxResponseTransmission() {}

    /**
     * Attempt to instantiate and hydrate a new instance of this class
     *
     * @param jsonData String of JSON data representing target object
     */
    public static FaxResponseTransmission init(String jsonData) throws Exception {
        return new ObjectMapper().readValue(jsonData, FaxResponseTransmission.class);
    }

    public static FaxResponseTransmission init(HashMap data) throws Exception {
        return new ObjectMapper()
                .readValue(
                        new ObjectMapper().writeValueAsString(data), FaxResponseTransmission.class);
    }

    public FaxResponseTransmission recipient(String recipient) {
        this.recipient = recipient;
        return this;
    }

    /**
     * Fax Transmission Recipient
     *
     * @return recipient
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_RECIPIENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getRecipient() {
        return recipient;
    }

    @JsonProperty(JSON_PROPERTY_RECIPIENT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public FaxResponseTransmission sender(String sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Fax Transmission Sender
     *
     * @return sender
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_SENDER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getSender() {
        return sender;
    }

    @JsonProperty(JSON_PROPERTY_SENDER)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setSender(String sender) {
        this.sender = sender;
    }

    public FaxResponseTransmission statusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Fax Transmission Status Code
     *
     * @return statusCode
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public StatusCodeEnum getStatusCode() {
        return statusCode;
    }

    @JsonProperty(JSON_PROPERTY_STATUS_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStatusCode(StatusCodeEnum statusCode) {
        this.statusCode = statusCode;
    }

    public FaxResponseTransmission sentAt(Integer sentAt) {
        this.sentAt = sentAt;
        return this;
    }

    /**
     * Fax Transmission Sent Timestamp
     *
     * @return sentAt
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_SENT_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getSentAt() {
        return sentAt;
    }

    @JsonProperty(JSON_PROPERTY_SENT_AT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSentAt(Integer sentAt) {
        this.sentAt = sentAt;
    }

    /** Return true if this FaxResponseTransmission object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaxResponseTransmission faxResponseTransmission = (FaxResponseTransmission) o;
        return Objects.equals(this.recipient, faxResponseTransmission.recipient)
                && Objects.equals(this.sender, faxResponseTransmission.sender)
                && Objects.equals(this.statusCode, faxResponseTransmission.statusCode)
                && Objects.equals(this.sentAt, faxResponseTransmission.sentAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipient, sender, statusCode, sentAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaxResponseTransmission {\n");
        sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    sentAt: ").append(toIndentedString(sentAt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public Map<String, Object> createFormData() throws ApiException {
        Map<String, Object> map = new HashMap<>();
        boolean fileTypeFound = false;
        try {
            if (recipient != null) {
                if (isFileTypeOrListOfFiles(recipient)) {
                    fileTypeFound = true;
                }

                if (recipient.getClass().equals(java.io.File.class)
                        || recipient.getClass().equals(Integer.class)
                        || recipient.getClass().equals(String.class)
                        || recipient.getClass().isEnum()) {
                    map.put("recipient", recipient);
                } else if (isListOfFile(recipient)) {
                    for (int i = 0; i < getListSize(recipient); i++) {
                        map.put("recipient[" + i + "]", getFromList(recipient, i));
                    }
                } else {
                    map.put(
                            "recipient",
                            JSON.getDefault().getMapper().writeValueAsString(recipient));
                }
            }
            if (sender != null) {
                if (isFileTypeOrListOfFiles(sender)) {
                    fileTypeFound = true;
                }

                if (sender.getClass().equals(java.io.File.class)
                        || sender.getClass().equals(Integer.class)
                        || sender.getClass().equals(String.class)
                        || sender.getClass().isEnum()) {
                    map.put("sender", sender);
                } else if (isListOfFile(sender)) {
                    for (int i = 0; i < getListSize(sender); i++) {
                        map.put("sender[" + i + "]", getFromList(sender, i));
                    }
                } else {
                    map.put("sender", JSON.getDefault().getMapper().writeValueAsString(sender));
                }
            }
            if (statusCode != null) {
                if (isFileTypeOrListOfFiles(statusCode)) {
                    fileTypeFound = true;
                }

                if (statusCode.getClass().equals(java.io.File.class)
                        || statusCode.getClass().equals(Integer.class)
                        || statusCode.getClass().equals(String.class)
                        || statusCode.getClass().isEnum()) {
                    map.put("status_code", statusCode);
                } else if (isListOfFile(statusCode)) {
                    for (int i = 0; i < getListSize(statusCode); i++) {
                        map.put("status_code[" + i + "]", getFromList(statusCode, i));
                    }
                } else {
                    map.put(
                            "status_code",
                            JSON.getDefault().getMapper().writeValueAsString(statusCode));
                }
            }
            if (sentAt != null) {
                if (isFileTypeOrListOfFiles(sentAt)) {
                    fileTypeFound = true;
                }

                if (sentAt.getClass().equals(java.io.File.class)
                        || sentAt.getClass().equals(Integer.class)
                        || sentAt.getClass().equals(String.class)
                        || sentAt.getClass().isEnum()) {
                    map.put("sent_at", sentAt);
                } else if (isListOfFile(sentAt)) {
                    for (int i = 0; i < getListSize(sentAt); i++) {
                        map.put("sent_at[" + i + "]", getFromList(sentAt, i));
                    }
                } else {
                    map.put("sent_at", JSON.getDefault().getMapper().writeValueAsString(sentAt));
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
