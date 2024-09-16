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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** ReportCreateRequest */
@JsonPropertyOrder({
    ReportCreateRequest.JSON_PROPERTY_END_DATE,
    ReportCreateRequest.JSON_PROPERTY_REPORT_TYPE,
    ReportCreateRequest.JSON_PROPERTY_START_DATE
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReportCreateRequest {
    public static final String JSON_PROPERTY_END_DATE = "end_date";
    private String endDate;

    /** Gets or Sets reportType */
    public enum ReportTypeEnum {
        USER_ACTIVITY("user_activity"),

        DOCUMENT_STATUS("document_status");

        private String value;

        ReportTypeEnum(String value) {
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
        public static ReportTypeEnum fromValue(String value) {
            for (ReportTypeEnum b : ReportTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_REPORT_TYPE = "report_type";
    private List<ReportTypeEnum> reportType = new ArrayList<>();

    public static final String JSON_PROPERTY_START_DATE = "start_date";
    private String startDate;

    public ReportCreateRequest() {}

    /**
     * Attempt to instantiate and hydrate a new instance of this class
     *
     * @param jsonData String of JSON data representing target object
     */
    public static ReportCreateRequest init(String jsonData) throws Exception {
        return new ObjectMapper().readValue(jsonData, ReportCreateRequest.class);
    }

    public static ReportCreateRequest init(HashMap data) throws Exception {
        return new ObjectMapper()
                .readValue(new ObjectMapper().writeValueAsString(data), ReportCreateRequest.class);
    }

    public ReportCreateRequest endDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * The (inclusive) end date for the report data in &#x60;MM/DD/YYYY&#x60; format.
     *
     * @return endDate
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_END_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getEndDate() {
        return endDate;
    }

    @JsonProperty(JSON_PROPERTY_END_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public ReportCreateRequest reportType(List<ReportTypeEnum> reportType) {
        this.reportType = reportType;
        return this;
    }

    public ReportCreateRequest addReportTypeItem(ReportTypeEnum reportTypeItem) {
        if (this.reportType == null) {
            this.reportType = new ArrayList<>();
        }
        this.reportType.add(reportTypeItem);
        return this;
    }

    /**
     * The type(s) of the report you are requesting. Allowed values are &#x60;user_activity&#x60;
     * and &#x60;document_status&#x60;. User activity reports contain list of all users and their
     * activity during the specified date range. Document status report contain a list of signature
     * requests created in the specified time range (and their status).
     *
     * @return reportType
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<ReportTypeEnum> getReportType() {
        return reportType;
    }

    @JsonProperty(JSON_PROPERTY_REPORT_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setReportType(List<ReportTypeEnum> reportType) {
        this.reportType = reportType;
    }

    public ReportCreateRequest startDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The (inclusive) start date for the report data in &#x60;MM/DD/YYYY&#x60; format.
     *
     * @return startDate
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_START_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty(JSON_PROPERTY_START_DATE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /** Return true if this ReportCreateRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReportCreateRequest reportCreateRequest = (ReportCreateRequest) o;
        return Objects.equals(this.endDate, reportCreateRequest.endDate)
                && Objects.equals(this.reportType, reportCreateRequest.reportType)
                && Objects.equals(this.startDate, reportCreateRequest.startDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endDate, reportType, startDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReportCreateRequest {\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public Map<String, Object> createFormData() throws ApiException {
        Map<String, Object> map = new HashMap<>();
        boolean fileTypeFound = false;
        try {
            if (endDate != null) {
                if (isFileTypeOrListOfFiles(endDate)) {
                    fileTypeFound = true;
                }

                if (endDate.getClass().equals(java.io.File.class)
                        || endDate.getClass().equals(Integer.class)
                        || endDate.getClass().equals(String.class)
                        || endDate.getClass().isEnum()) {
                    map.put("end_date", endDate);
                } else if (isListOfFile(endDate)) {
                    for (int i = 0; i < getListSize(endDate); i++) {
                        map.put("end_date[" + i + "]", getFromList(endDate, i));
                    }
                } else {
                    map.put("end_date", JSON.getDefault().getMapper().writeValueAsString(endDate));
                }
            }
            if (reportType != null) {
                if (isFileTypeOrListOfFiles(reportType)) {
                    fileTypeFound = true;
                }

                if (reportType.getClass().equals(java.io.File.class)
                        || reportType.getClass().equals(Integer.class)
                        || reportType.getClass().equals(String.class)
                        || reportType.getClass().isEnum()) {
                    map.put("report_type", reportType);
                } else if (isListOfFile(reportType)) {
                    for (int i = 0; i < getListSize(reportType); i++) {
                        map.put("report_type[" + i + "]", getFromList(reportType, i));
                    }
                } else {
                    map.put(
                            "report_type",
                            JSON.getDefault().getMapper().writeValueAsString(reportType));
                }
            }
            if (startDate != null) {
                if (isFileTypeOrListOfFiles(startDate)) {
                    fileTypeFound = true;
                }

                if (startDate.getClass().equals(java.io.File.class)
                        || startDate.getClass().equals(Integer.class)
                        || startDate.getClass().equals(String.class)
                        || startDate.getClass().isEnum()) {
                    map.put("start_date", startDate);
                } else if (isListOfFile(startDate)) {
                    for (int i = 0; i < getListSize(startDate); i++) {
                        map.put("start_date[" + i + "]", getFromList(startDate, i));
                    }
                } else {
                    map.put(
                            "start_date",
                            JSON.getDefault().getMapper().writeValueAsString(startDate));
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
