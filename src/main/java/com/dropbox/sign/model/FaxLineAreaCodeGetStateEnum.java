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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/** Gets or Sets FaxLineAreaCodeGetStateEnum */
public enum FaxLineAreaCodeGetStateEnum {
    AK("AK"),

    AL("AL"),

    AR("AR"),

    AZ("AZ"),

    CA("CA"),

    CO("CO"),

    CT("CT"),

    DC("DC"),

    DE("DE"),

    FL("FL"),

    GA("GA"),

    HI("HI"),

    IA("IA"),

    ID("ID"),

    IL("IL"),

    IN("IN"),

    KS("KS"),

    KY("KY"),

    LA("LA"),

    MA("MA"),

    MD("MD"),

    ME("ME"),

    MI("MI"),

    MN("MN"),

    MO("MO"),

    MS("MS"),

    MT("MT"),

    NC("NC"),

    ND("ND"),

    NE("NE"),

    NH("NH"),

    NJ("NJ"),

    NM("NM"),

    NV("NV"),

    NY("NY"),

    OH("OH"),

    OK("OK"),

    OR("OR"),

    PA("PA"),

    RI("RI"),

    SC("SC"),

    SD("SD"),

    TN("TN"),

    TX("TX"),

    UT("UT"),

    VA("VA"),

    VT("VT"),

    WA("WA"),

    WI("WI"),

    WV("WV"),

    WY("WY");

    private String value;

    FaxLineAreaCodeGetStateEnum(String value) {
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
    public static FaxLineAreaCodeGetStateEnum fromValue(String value) {
        for (FaxLineAreaCodeGetStateEnum b : FaxLineAreaCodeGetStateEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}
