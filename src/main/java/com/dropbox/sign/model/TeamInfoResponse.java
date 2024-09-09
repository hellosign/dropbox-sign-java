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
import com.dropbox.sign.model.TeamParentResponse;
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
 * TeamInfoResponse
 */
@JsonPropertyOrder({
  TeamInfoResponse.JSON_PROPERTY_TEAM_ID,
  TeamInfoResponse.JSON_PROPERTY_TEAM_PARENT,
  TeamInfoResponse.JSON_PROPERTY_NAME,
  TeamInfoResponse.JSON_PROPERTY_NUM_MEMBERS,
  TeamInfoResponse.JSON_PROPERTY_NUM_SUB_TEAMS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class TeamInfoResponse {
  public static final String JSON_PROPERTY_TEAM_ID = "team_id";
  private String teamId;

  public static final String JSON_PROPERTY_TEAM_PARENT = "team_parent";
  private TeamParentResponse teamParent;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUM_MEMBERS = "num_members";
  private Integer numMembers;

  public static final String JSON_PROPERTY_NUM_SUB_TEAMS = "num_sub_teams";
  private Integer numSubTeams;

  public TeamInfoResponse() { 
  }

  /**
   * Attempt to instantiate and hydrate a new instance of this class
   * @param jsonData String of JSON data representing target object
   */
  static public TeamInfoResponse init(String jsonData) throws Exception {
    return new ObjectMapper().readValue(jsonData, TeamInfoResponse.class);
  }

  static public TeamInfoResponse init(HashMap data) throws Exception {
    return new ObjectMapper().readValue(
      new ObjectMapper().writeValueAsString(data),
      TeamInfoResponse.class
    );
  }

  public TeamInfoResponse teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

  /**
   * The id of a team
   * @return teamId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTeamId() {
    return teamId;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }


  public TeamInfoResponse teamParent(TeamParentResponse teamParent) {
    this.teamParent = teamParent;
    return this;
  }

  /**
   * Get teamParent
   * @return teamParent
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TeamParentResponse getTeamParent() {
    return teamParent;
  }


  @JsonProperty(JSON_PROPERTY_TEAM_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTeamParent(TeamParentResponse teamParent) {
    this.teamParent = teamParent;
  }


  public TeamInfoResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of a team
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TeamInfoResponse numMembers(Integer numMembers) {
    this.numMembers = numMembers;
    return this;
  }

  /**
   * Number of members within a team
   * @return numMembers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumMembers() {
    return numMembers;
  }


  @JsonProperty(JSON_PROPERTY_NUM_MEMBERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumMembers(Integer numMembers) {
    this.numMembers = numMembers;
  }


  public TeamInfoResponse numSubTeams(Integer numSubTeams) {
    this.numSubTeams = numSubTeams;
    return this;
  }

  /**
   * Number of sub teams within a team
   * @return numSubTeams
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_SUB_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getNumSubTeams() {
    return numSubTeams;
  }


  @JsonProperty(JSON_PROPERTY_NUM_SUB_TEAMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumSubTeams(Integer numSubTeams) {
    this.numSubTeams = numSubTeams;
  }


  /**
   * Return true if this TeamInfoResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamInfoResponse teamInfoResponse = (TeamInfoResponse) o;
    return Objects.equals(this.teamId, teamInfoResponse.teamId) &&
        Objects.equals(this.teamParent, teamInfoResponse.teamParent) &&
        Objects.equals(this.name, teamInfoResponse.name) &&
        Objects.equals(this.numMembers, teamInfoResponse.numMembers) &&
        Objects.equals(this.numSubTeams, teamInfoResponse.numSubTeams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, teamParent, name, numMembers, numSubTeams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamInfoResponse {\n");
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    teamParent: ").append(toIndentedString(teamParent)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numMembers: ").append(toIndentedString(numMembers)).append("\n");
    sb.append("    numSubTeams: ").append(toIndentedString(numSubTeams)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  public Map<String, Object> createFormData() throws ApiException {
    Map<String, Object> map = new HashMap<>();
    boolean fileTypeFound = false;
    try {
    if (teamId != null) {
        if (isFileTypeOrListOfFiles(teamId)) {
            fileTypeFound = true;
        }

        if (teamId.getClass().equals(java.io.File.class) ||
            teamId.getClass().equals(Integer.class) ||
            teamId.getClass().equals(String.class) ||
            teamId.getClass().isEnum()) {
            map.put("team_id", teamId);
        } else if (isListOfFile(teamId)) {
            for(int i = 0; i< getListSize(teamId); i++) {
                map.put("team_id[" + i + "]", getFromList(teamId, i));
            }
        }
        else {
            map.put("team_id", JSON.getDefault().getMapper().writeValueAsString(teamId));
        }
    }
    if (teamParent != null) {
        if (isFileTypeOrListOfFiles(teamParent)) {
            fileTypeFound = true;
        }

        if (teamParent.getClass().equals(java.io.File.class) ||
            teamParent.getClass().equals(Integer.class) ||
            teamParent.getClass().equals(String.class) ||
            teamParent.getClass().isEnum()) {
            map.put("team_parent", teamParent);
        } else if (isListOfFile(teamParent)) {
            for(int i = 0; i< getListSize(teamParent); i++) {
                map.put("team_parent[" + i + "]", getFromList(teamParent, i));
            }
        }
        else {
            map.put("team_parent", JSON.getDefault().getMapper().writeValueAsString(teamParent));
        }
    }
    if (name != null) {
        if (isFileTypeOrListOfFiles(name)) {
            fileTypeFound = true;
        }

        if (name.getClass().equals(java.io.File.class) ||
            name.getClass().equals(Integer.class) ||
            name.getClass().equals(String.class) ||
            name.getClass().isEnum()) {
            map.put("name", name);
        } else if (isListOfFile(name)) {
            for(int i = 0; i< getListSize(name); i++) {
                map.put("name[" + i + "]", getFromList(name, i));
            }
        }
        else {
            map.put("name", JSON.getDefault().getMapper().writeValueAsString(name));
        }
    }
    if (numMembers != null) {
        if (isFileTypeOrListOfFiles(numMembers)) {
            fileTypeFound = true;
        }

        if (numMembers.getClass().equals(java.io.File.class) ||
            numMembers.getClass().equals(Integer.class) ||
            numMembers.getClass().equals(String.class) ||
            numMembers.getClass().isEnum()) {
            map.put("num_members", numMembers);
        } else if (isListOfFile(numMembers)) {
            for(int i = 0; i< getListSize(numMembers); i++) {
                map.put("num_members[" + i + "]", getFromList(numMembers, i));
            }
        }
        else {
            map.put("num_members", JSON.getDefault().getMapper().writeValueAsString(numMembers));
        }
    }
    if (numSubTeams != null) {
        if (isFileTypeOrListOfFiles(numSubTeams)) {
            fileTypeFound = true;
        }

        if (numSubTeams.getClass().equals(java.io.File.class) ||
            numSubTeams.getClass().equals(Integer.class) ||
            numSubTeams.getClass().equals(String.class) ||
            numSubTeams.getClass().isEnum()) {
            map.put("num_sub_teams", numSubTeams);
        } else if (isListOfFile(numSubTeams)) {
            for(int i = 0; i< getListSize(numSubTeams); i++) {
                map.put("num_sub_teams[" + i + "]", getFromList(numSubTeams, i));
            }
        }
        else {
            map.put("num_sub_teams", JSON.getDefault().getMapper().writeValueAsString(numSubTeams));
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

