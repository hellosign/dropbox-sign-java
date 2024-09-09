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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.dropbox.sign.JSON;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;


import com.dropbox.sign.ApiException;
/**
 * OAuthTokenRefreshRequest
 */
@JsonPropertyOrder({
  OAuthTokenRefreshRequest.JSON_PROPERTY_GRANT_TYPE,
  OAuthTokenRefreshRequest.JSON_PROPERTY_REFRESH_TOKEN
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class OAuthTokenRefreshRequest {
  public static final String JSON_PROPERTY_GRANT_TYPE = "grant_type";
  private String grantType = "refresh_token";

  public static final String JSON_PROPERTY_REFRESH_TOKEN = "refresh_token";
  private String refreshToken;

  public OAuthTokenRefreshRequest() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public OAuthTokenRefreshRequest init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, OAuthTokenRefreshRequest.class);
  }

  static public OAuthTokenRefreshRequest init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      OAuthTokenRefreshRequest.class
    );
  }

  public OAuthTokenRefreshRequest grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * When refreshing an existing token use &#x60;refresh_token&#x60;.
   * @return grantType
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_GRANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGrantType() {
    return grantType;
  }


  @JsonProperty(JSON_PROPERTY_GRANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }


  public OAuthTokenRefreshRequest refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * The token provided when you got the expired access token.
   * @return refreshToken
   */
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRefreshToken() {
    return refreshToken;
  }


  @JsonProperty(JSON_PROPERTY_REFRESH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }


  /**
   * Return true if this OAuthTokenRefreshRequest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OAuthTokenRefreshRequest oauthTokenRefreshRequest = (OAuthTokenRefreshRequest) o;
    return Objects.equals(this.grantType, oauthTokenRefreshRequest.grantType) &&
        Objects.equals(this.refreshToken, oauthTokenRefreshRequest.refreshToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(grantType, refreshToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OAuthTokenRefreshRequest {\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (grantType != null) {
        if (isFileTypeOrListOfFiles(grantType)) {
            fileTypeFound = true;
        }

        if (grantType.getClass().equals(java.io.File.class) ||
            grantType.getClass().equals(Integer.class) ||
            grantType.getClass().equals(String.class) ||
            grantType.getClass().isEnum()) {
            map.put("grant_type", grantType);
        } else if (isListOfFile(grantType)) {
            for(int i = 0; i< getListSize(grantType); i++) {
                map.put("grant_type[" + i + "]", getFromList(grantType, i));
            }
        }
        else {
            map.put("grant_type", JSON.getDefault().getMapper().writeValueAsString(grantType));
        }
    }
    if (refreshToken != null) {
        if (isFileTypeOrListOfFiles(refreshToken)) {
            fileTypeFound = true;
        }

        if (refreshToken.getClass().equals(java.io.File.class) ||
            refreshToken.getClass().equals(Integer.class) ||
            refreshToken.getClass().equals(String.class) ||
            refreshToken.getClass().isEnum()) {
            map.put("refresh_token", refreshToken);
        } else if (isListOfFile(refreshToken)) {
            for(int i = 0; i< getListSize(refreshToken); i++) {
                map.put("refresh_token[" + i + "]", getFromList(refreshToken, i));
            }
        }
        else {
            map.put("refresh_token", JSON.getDefault().getMapper().writeValueAsString(refreshToken));
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

}

