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
import com.dropbox.sign.model.ListInfoResponse;
import com.dropbox.sign.model.SubTeamResponse;
import com.dropbox.sign.model.WarningResponse;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.dropbox.sign.JSON;


import com.dropbox.sign.ApiException;
/**
 * TeamSubTeamsResponse
 */
@JsonPropertyOrder({
    TeamSubTeamsResponse.JSON_PROPERTY_SUB_TEAMS,
    TeamSubTeamsResponse.JSON_PROPERTY_LIST_INFO,
    TeamSubTeamsResponse.JSON_PROPERTY_WARNINGS
})
@JsonIgnoreProperties(ignoreUnknown=true)
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class TeamSubTeamsResponse {
  public static final String JSON_PROPERTY_SUB_TEAMS = "sub_teams";
  private List<SubTeamResponse> subTeams = null;

  public static final String JSON_PROPERTY_LIST_INFO = "list_info";
  private ListInfoResponse listInfo;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<WarningResponse> warnings = null;

  public TeamSubTeamsResponse() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public TeamSubTeamsResponse init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, TeamSubTeamsResponse.class);
  }

  public TeamSubTeamsResponse subTeams(List<SubTeamResponse> subTeams) {
    this.subTeams = subTeams;
    return this;
  }

  public TeamSubTeamsResponse addSubTeamsItem(SubTeamResponse subTeamsItem) {
    if (this.subTeams == null) {
      this.subTeams = new ArrayList<>();
    }
    this.subTeams.add(subTeamsItem);
    return this;
  }

   /**
   * Contains a list with sub teams.
   * @return subTeams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contains a list with sub teams.")
  @JsonProperty(JSON_PROPERTY_SUB_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SubTeamResponse> getSubTeams() {
    return subTeams;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubTeams(List<SubTeamResponse> subTeams) {
    this.subTeams = subTeams;
  }


  public TeamSubTeamsResponse listInfo(ListInfoResponse listInfo) {
    this.listInfo = listInfo;
    return this;
  }

   /**
   * Get listInfo
   * @return listInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LIST_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ListInfoResponse getListInfo() {
    return listInfo;
  }


  @JsonProperty(JSON_PROPERTY_LIST_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setListInfo(ListInfoResponse listInfo) {
    this.listInfo = listInfo;
  }


  public TeamSubTeamsResponse warnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
    return this;
  }

  public TeamSubTeamsResponse addWarningsItem(WarningResponse warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Get warnings
   * @return warnings
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<WarningResponse> getWarnings() {
    return warnings;
  }


  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWarnings(List<WarningResponse> warnings) {
    this.warnings = warnings;
  }


  /**
   * Return true if this TeamSubTeamsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamSubTeamsResponse teamSubTeamsResponse = (TeamSubTeamsResponse) o;
    return Objects.equals(this.subTeams, teamSubTeamsResponse.subTeams) &&
        Objects.equals(this.listInfo, teamSubTeamsResponse.listInfo) &&
        Objects.equals(this.warnings, teamSubTeamsResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subTeams, listInfo, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamSubTeamsResponse {\n");
    sb.append("    subTeams: ").append(toIndentedString(subTeams)).append("\n");
    sb.append("    listInfo: ").append(toIndentedString(listInfo)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (subTeams != null) {
        if (isFileTypeOrListOfFiles(subTeams)) {
            fileTypeFound = true;
        }

        if (subTeams.getClass().equals(java.io.File.class) ||
            subTeams.getClass().equals(Integer.class) ||
            subTeams.getClass().equals(String.class) ||
            subTeams.getClass().isEnum()) {
            map.put("sub_teams", subTeams);
        } else if (isListOfFile(subTeams)) {
            for(int i = 0; i< getListSize(subTeams); i++) {
                map.put("sub_teams[" + i + "]", getFromList(subTeams, i));
            }
        }
        else {
            map.put("sub_teams", JSON.getDefault().getMapper().writeValueAsString(subTeams));
        }
    }
    if (listInfo != null) {
        if (isFileTypeOrListOfFiles(listInfo)) {
            fileTypeFound = true;
        }

        if (listInfo.getClass().equals(java.io.File.class) ||
            listInfo.getClass().equals(Integer.class) ||
            listInfo.getClass().equals(String.class) ||
            listInfo.getClass().isEnum()) {
            map.put("list_info", listInfo);
        } else if (isListOfFile(listInfo)) {
            for(int i = 0; i< getListSize(listInfo); i++) {
                map.put("list_info[" + i + "]", getFromList(listInfo, i));
            }
        }
        else {
            map.put("list_info", JSON.getDefault().getMapper().writeValueAsString(listInfo));
        }
    }
    if (warnings != null) {
        if (isFileTypeOrListOfFiles(warnings)) {
            fileTypeFound = true;
        }

        if (warnings.getClass().equals(java.io.File.class) ||
            warnings.getClass().equals(Integer.class) ||
            warnings.getClass().equals(String.class) ||
            warnings.getClass().isEnum()) {
            map.put("warnings", warnings);
        } else if (isListOfFile(warnings)) {
            for(int i = 0; i< getListSize(warnings); i++) {
                map.put("warnings[" + i + "]", getFromList(warnings, i));
            }
        }
        else {
            map.put("warnings", JSON.getDefault().getMapper().writeValueAsString(warnings));
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
