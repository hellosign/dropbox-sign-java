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

/** FaxLineCreateRequest */
@JsonPropertyOrder({
    FaxLineCreateRequest.JSON_PROPERTY_AREA_CODE,
    FaxLineCreateRequest.JSON_PROPERTY_COUNTRY,
    FaxLineCreateRequest.JSON_PROPERTY_CITY,
    FaxLineCreateRequest.JSON_PROPERTY_ACCOUNT_ID
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown = true)
public class FaxLineCreateRequest {
    public static final String JSON_PROPERTY_AREA_CODE = "area_code";
    private Integer areaCode;

    /** Country */
    public enum CountryEnum {
        CA("CA"),

        US("US"),

        UK("UK");

        private String value;

        CountryEnum(String value) {
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
        public static CountryEnum fromValue(String value) {
            for (CountryEnum b : CountryEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    public static final String JSON_PROPERTY_COUNTRY = "country";
    private CountryEnum country;

    public static final String JSON_PROPERTY_CITY = "city";
    private String city;

    public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
    private String accountId;

    public FaxLineCreateRequest() {}

    /**
     * Attempt to instantiate and hydrate a new instance of this class
     *
     * @param jsonData String of JSON data representing target object
     */
    public static FaxLineCreateRequest init(String jsonData) throws Exception {
        return new ObjectMapper().readValue(jsonData, FaxLineCreateRequest.class);
    }

    public static FaxLineCreateRequest init(HashMap data) throws Exception {
        return new ObjectMapper()
                .readValue(new ObjectMapper().writeValueAsString(data), FaxLineCreateRequest.class);
    }

    public FaxLineCreateRequest areaCode(Integer areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Area code
     *
     * @return areaCode
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_AREA_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getAreaCode() {
        return areaCode;
    }

    @JsonProperty(JSON_PROPERTY_AREA_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setAreaCode(Integer areaCode) {
        this.areaCode = areaCode;
    }

    public FaxLineCreateRequest country(CountryEnum country) {
        this.country = country;
        return this;
    }

    /**
     * Country
     *
     * @return country
     */
    @javax.annotation.Nonnull
    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public CountryEnum getCountry() {
        return country;
    }

    @JsonProperty(JSON_PROPERTY_COUNTRY)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCountry(CountryEnum country) {
        this.country = country;
    }

    public FaxLineCreateRequest city(String city) {
        this.city = city;
        return this;
    }

    /**
     * City
     *
     * @return city
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCity() {
        return city;
    }

    @JsonProperty(JSON_PROPERTY_CITY)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCity(String city) {
        this.city = city;
    }

    public FaxLineCreateRequest accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * Account ID
     *
     * @return accountId
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /** Return true if this FaxLineCreateRequest object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FaxLineCreateRequest faxLineCreateRequest = (FaxLineCreateRequest) o;
        return Objects.equals(this.areaCode, faxLineCreateRequest.areaCode)
                && Objects.equals(this.country, faxLineCreateRequest.country)
                && Objects.equals(this.city, faxLineCreateRequest.city)
                && Objects.equals(this.accountId, faxLineCreateRequest.accountId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, country, city, accountId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FaxLineCreateRequest {\n");
        sb.append("    areaCode: ").append(toIndentedString(areaCode)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public Map<String, Object> createFormData() throws ApiException {
        Map<String, Object> map = new HashMap<>();
        boolean fileTypeFound = false;
        try {
            if (areaCode != null) {
                if (isFileTypeOrListOfFiles(areaCode)) {
                    fileTypeFound = true;
                }

                if (areaCode.getClass().equals(java.io.File.class)
                        || areaCode.getClass().equals(Integer.class)
                        || areaCode.getClass().equals(String.class)
                        || areaCode.getClass().isEnum()) {
                    map.put("area_code", areaCode);
                } else if (isListOfFile(areaCode)) {
                    for (int i = 0; i < getListSize(areaCode); i++) {
                        map.put("area_code[" + i + "]", getFromList(areaCode, i));
                    }
                } else {
                    map.put(
                            "area_code",
                            JSON.getDefault().getMapper().writeValueAsString(areaCode));
                }
            }
            if (country != null) {
                if (isFileTypeOrListOfFiles(country)) {
                    fileTypeFound = true;
                }

                if (country.getClass().equals(java.io.File.class)
                        || country.getClass().equals(Integer.class)
                        || country.getClass().equals(String.class)
                        || country.getClass().isEnum()) {
                    map.put("country", country);
                } else if (isListOfFile(country)) {
                    for (int i = 0; i < getListSize(country); i++) {
                        map.put("country[" + i + "]", getFromList(country, i));
                    }
                } else {
                    map.put("country", JSON.getDefault().getMapper().writeValueAsString(country));
                }
            }
            if (city != null) {
                if (isFileTypeOrListOfFiles(city)) {
                    fileTypeFound = true;
                }

                if (city.getClass().equals(java.io.File.class)
                        || city.getClass().equals(Integer.class)
                        || city.getClass().equals(String.class)
                        || city.getClass().isEnum()) {
                    map.put("city", city);
                } else if (isListOfFile(city)) {
                    for (int i = 0; i < getListSize(city); i++) {
                        map.put("city[" + i + "]", getFromList(city, i));
                    }
                } else {
                    map.put("city", JSON.getDefault().getMapper().writeValueAsString(city));
                }
            }
            if (accountId != null) {
                if (isFileTypeOrListOfFiles(accountId)) {
                    fileTypeFound = true;
                }

                if (accountId.getClass().equals(java.io.File.class)
                        || accountId.getClass().equals(Integer.class)
                        || accountId.getClass().equals(String.class)
                        || accountId.getClass().isEnum()) {
                    map.put("account_id", accountId);
                } else if (isListOfFile(accountId)) {
                    for (int i = 0; i < getListSize(accountId); i++) {
                        map.put("account_id[" + i + "]", getFromList(accountId, i));
                    }
                } else {
                    map.put(
                            "account_id",
                            JSON.getDefault().getMapper().writeValueAsString(accountId));
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
