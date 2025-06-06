package com.dropbox.sign.api;

import com.dropbox.sign.ApiException;
import com.dropbox.sign.ApiClient;
import com.dropbox.sign.ApiResponse;
import com.dropbox.sign.Configuration;
import com.dropbox.sign.Pair;

import jakarta.ws.rs.core.GenericType;

import com.dropbox.sign.model.ErrorResponse;
import com.dropbox.sign.model.TeamAddMemberRequest;
import com.dropbox.sign.model.TeamCreateRequest;
import com.dropbox.sign.model.TeamGetInfoResponse;
import com.dropbox.sign.model.TeamGetResponse;
import com.dropbox.sign.model.TeamInvitesResponse;
import com.dropbox.sign.model.TeamMembersResponse;
import com.dropbox.sign.model.TeamRemoveMemberRequest;
import com.dropbox.sign.model.TeamSubTeamsResponse;
import com.dropbox.sign.model.TeamUpdateRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.12.0")
public class TeamApi {
  private ApiClient apiClient;

  public TeamApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TeamApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Add User to Team
   * Invites a user (specified using the &#x60;email_address&#x60; parameter) to your Team. If the user does not currently have a Dropbox Sign Account, a new one will be created for them. If a user is already a part of another Team, a &#x60;team_invite_failed&#x60; error will be returned.
   * @param teamAddMemberRequest  (required)
   * @param teamId The id of the team. (optional)
   * @return TeamGetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public TeamGetResponse teamAddMember(TeamAddMemberRequest teamAddMemberRequest, String teamId) throws ApiException {
    return teamAddMemberWithHttpInfo(teamAddMemberRequest, teamId).getData();
  }


  /**
   * @see TeamApi#teamAddMember(TeamAddMemberRequest, String)
   */
  public TeamGetResponse teamAddMember(TeamAddMemberRequest teamAddMemberRequest) throws ApiException {
    String teamId = null;

    return teamAddMemberWithHttpInfo(teamAddMemberRequest, teamId).getData();
  }

  /**
   * @see TeamApi#teamAddMemberWithHttpInfo(TeamAddMemberRequest, String)
   */
  public ApiResponse<TeamGetResponse> teamAddMemberWithHttpInfo(TeamAddMemberRequest teamAddMemberRequest) throws ApiException {
    String teamId = null;

    return teamAddMemberWithHttpInfo(teamAddMemberRequest, teamId);
  }


  /**
   * Add User to Team
   * Invites a user (specified using the &#x60;email_address&#x60; parameter) to your Team. If the user does not currently have a Dropbox Sign Account, a new one will be created for them. If a user is already a part of another Team, a &#x60;team_invite_failed&#x60; error will be returned.
   * @param teamAddMemberRequest  (required)
   * @param teamId The id of the team. (optional)
   * @return ApiResponse&lt;TeamGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamGetResponse> teamAddMemberWithHttpInfo(TeamAddMemberRequest teamAddMemberRequest, String teamId) throws ApiException {
    
    // Check required parameters
    if (teamAddMemberRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'teamAddMemberRequest' when calling teamAddMember");
    }

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "team_id", teamId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = teamAddMemberRequest.createFormData();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    GenericType<TeamGetResponse> localVarReturnType = new GenericType<TeamGetResponse>() {};
    return apiClient.invokeAPI(
        "TeamApi.teamAddMember",
        "/team/add_member",
        "PUT",
        localVarQueryParams,
        isFileTypeFound ? null : teamAddMemberRequest,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false
    );
  }
  /**
   * Create Team
   * Creates a new Team and makes you a member. You must not currently belong to a Team to invoke.
   * @param teamCreateRequest  (required)
   * @return TeamGetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public TeamGetResponse teamCreate(TeamCreateRequest teamCreateRequest) throws ApiException {
    return teamCreateWithHttpInfo(teamCreateRequest).getData();
  }


  /**
   * Create Team
   * Creates a new Team and makes you a member. You must not currently belong to a Team to invoke.
   * @param teamCreateRequest  (required)
   * @return ApiResponse&lt;TeamGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamGetResponse> teamCreateWithHttpInfo(TeamCreateRequest teamCreateRequest) throws ApiException {
    
    // Check required parameters
    if (teamCreateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'teamCreateRequest' when calling teamCreate");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = teamCreateRequest.createFormData();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    GenericType<TeamGetResponse> localVarReturnType = new GenericType<TeamGetResponse>() {};
    return apiClient.invokeAPI(
        "TeamApi.teamCreate",
        "/team/create",
        "POST",
        new ArrayList<>(),
        isFileTypeFound ? null : teamCreateRequest,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false
    );
  }
  /**
   * Delete Team
   * Deletes your Team. Can only be invoked when you have a Team with only one member (yourself).
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public void teamDelete() throws ApiException {
    teamDeleteWithHttpInfo();
  }


  /**
   * Delete Team
   * Deletes your Team. Can only be invoked when you have a Team with only one member (yourself).
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> teamDeleteWithHttpInfo() throws ApiException {
    
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = new HashMap<String, Object>();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    return apiClient.invokeAPI(
        "TeamApi.teamDelete",
        "/team/destroy",
        "DELETE",
        new ArrayList<>(),
        null,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        null,
        false
    );
  }
  /**
   * Get Team
   * Returns information about your Team as well as a list of its members. If you do not belong to a Team, a 404 error with an error_name of \&quot;not_found\&quot; will be returned.
   * @return TeamGetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public TeamGetResponse teamGet() throws ApiException {
    return teamGetWithHttpInfo().getData();
  }


  /**
   * Get Team
   * Returns information about your Team as well as a list of its members. If you do not belong to a Team, a 404 error with an error_name of \&quot;not_found\&quot; will be returned.
   * @return ApiResponse&lt;TeamGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamGetResponse> teamGetWithHttpInfo() throws ApiException {
    
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = new HashMap<String, Object>();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    GenericType<TeamGetResponse> localVarReturnType = new GenericType<TeamGetResponse>() {};
    return apiClient.invokeAPI(
        "TeamApi.teamGet",
        "/team",
        "GET",
        new ArrayList<>(),
        null,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false
    );
  }
  /**
   * Get Team Info
   * Provides information about a team.
   * @param teamId The id of the team. (optional)
   * @return TeamGetInfoResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public TeamGetInfoResponse teamInfo(String teamId) throws ApiException {
    return teamInfoWithHttpInfo(teamId).getData();
  }


  /**
   * @see TeamApi#teamInfo(String)
   */
  public TeamGetInfoResponse teamInfo() throws ApiException {
    String teamId = null;

    return teamInfoWithHttpInfo(teamId).getData();
  }

  /**
   * @see TeamApi#teamInfoWithHttpInfo(String)
   */
  public ApiResponse<TeamGetInfoResponse> teamInfoWithHttpInfo() throws ApiException {
    String teamId = null;

    return teamInfoWithHttpInfo(teamId);
  }


  /**
   * Get Team Info
   * Provides information about a team.
   * @param teamId The id of the team. (optional)
   * @return ApiResponse&lt;TeamGetInfoResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamGetInfoResponse> teamInfoWithHttpInfo(String teamId) throws ApiException {
    
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "team_id", teamId)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = new HashMap<String, Object>();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    GenericType<TeamGetInfoResponse> localVarReturnType = new GenericType<TeamGetInfoResponse>() {};
    return apiClient.invokeAPI(
        "TeamApi.teamInfo",
        "/team/info",
        "GET",
        localVarQueryParams,
        null,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false
    );
  }
  /**
   * List Team Invites
   * Provides a list of team invites (and their roles).
   * @param emailAddress The email address for which to display the team invites. (optional)
   * @return TeamInvitesResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public TeamInvitesResponse teamInvites(String emailAddress) throws ApiException {
    return teamInvitesWithHttpInfo(emailAddress).getData();
  }


  /**
   * @see TeamApi#teamInvites(String)
   */
  public TeamInvitesResponse teamInvites() throws ApiException {
    String emailAddress = null;

    return teamInvitesWithHttpInfo(emailAddress).getData();
  }

  /**
   * @see TeamApi#teamInvitesWithHttpInfo(String)
   */
  public ApiResponse<TeamInvitesResponse> teamInvitesWithHttpInfo() throws ApiException {
    String emailAddress = null;

    return teamInvitesWithHttpInfo(emailAddress);
  }


  /**
   * List Team Invites
   * Provides a list of team invites (and their roles).
   * @param emailAddress The email address for which to display the team invites. (optional)
   * @return ApiResponse&lt;TeamInvitesResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamInvitesResponse> teamInvitesWithHttpInfo(String emailAddress) throws ApiException {
    
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "email_address", emailAddress)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = new HashMap<String, Object>();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    GenericType<TeamInvitesResponse> localVarReturnType = new GenericType<TeamInvitesResponse>() {};
    return apiClient.invokeAPI(
        "TeamApi.teamInvites",
        "/team/invites",
        "GET",
        localVarQueryParams,
        null,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false
    );
  }
  /**
   * List Team Members
   * Provides a paginated list of members (and their roles) that belong to a given team.
   * @param teamId The id of the team that a member list is being requested from. (required)
   * @param page Which page number of the team member list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)
   * @param pageSize Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is &#x60;20&#x60;. (optional, default to 20)
   * @return TeamMembersResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public TeamMembersResponse teamMembers(String teamId, Integer page, Integer pageSize) throws ApiException {
    return teamMembersWithHttpInfo(teamId, page, pageSize).getData();
  }


  /**
   * @see TeamApi#teamMembers(String, Integer, Integer)
   */
  public TeamMembersResponse teamMembers(String teamId) throws ApiException {
    Integer page = 1;
    Integer pageSize = 20;

    return teamMembersWithHttpInfo(teamId, page, pageSize).getData();
  }

  /**
   * @see TeamApi#teamMembersWithHttpInfo(String, Integer, Integer)
   */
  public ApiResponse<TeamMembersResponse> teamMembersWithHttpInfo(String teamId) throws ApiException {
    Integer page = 1;
    Integer pageSize = 20;

    return teamMembersWithHttpInfo(teamId, page, pageSize);
  }

  /**
   * @see TeamApi#teamMembers(String, Integer, Integer)
   */
  public TeamMembersResponse teamMembers(String teamId, Integer page) throws ApiException {
    Integer pageSize = 20;

    return teamMembersWithHttpInfo(teamId, page, pageSize).getData();
  }

  /**
   * @see TeamApi#teamMembersWithHttpInfo(String, Integer, Integer)
   */
  public ApiResponse<TeamMembersResponse> teamMembersWithHttpInfo(String teamId, Integer page) throws ApiException {
    Integer pageSize = 20;

    return teamMembersWithHttpInfo(teamId, page, pageSize);
  }


  /**
   * List Team Members
   * Provides a paginated list of members (and their roles) that belong to a given team.
   * @param teamId The id of the team that a member list is being requested from. (required)
   * @param page Which page number of the team member list to return. Defaults to &#x60;1&#x60;. (optional, default to 1)
   * @param pageSize Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is &#x60;20&#x60;. (optional, default to 20)
   * @return ApiResponse&lt;TeamMembersResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamMembersResponse> teamMembersWithHttpInfo(String teamId, Integer page, Integer pageSize) throws ApiException {
    
    if (page == null) {
        page = 1;
    }
    if (pageSize == null) {
        pageSize = 20;
    }
    // Check required parameters
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling teamMembers");
    }

    // Path parameters
    String localVarPath = "/team/members/{team_id}"
            .replaceAll("\\{team_id}", apiClient.escapeString(teamId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "page", page)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = new HashMap<String, Object>();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    GenericType<TeamMembersResponse> localVarReturnType = new GenericType<TeamMembersResponse>() {};
    return apiClient.invokeAPI(
        "TeamApi.teamMembers",
        localVarPath,
        "GET",
        localVarQueryParams,
        null,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false
    );
  }
  /**
   * Remove User from Team
   * Removes the provided user Account from your Team. If the Account had an outstanding invitation to your Team, the invitation will be expired. If you choose to transfer documents from the removed Account to an Account provided in the &#x60;new_owner_email_address&#x60; parameter (available only for Enterprise plans), the response status code will be 201, which indicates that your request has been queued but not fully executed.
   * @param teamRemoveMemberRequest  (required)
   * @return TeamGetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public TeamGetResponse teamRemoveMember(TeamRemoveMemberRequest teamRemoveMemberRequest) throws ApiException {
    return teamRemoveMemberWithHttpInfo(teamRemoveMemberRequest).getData();
  }


  /**
   * Remove User from Team
   * Removes the provided user Account from your Team. If the Account had an outstanding invitation to your Team, the invitation will be expired. If you choose to transfer documents from the removed Account to an Account provided in the &#x60;new_owner_email_address&#x60; parameter (available only for Enterprise plans), the response status code will be 201, which indicates that your request has been queued but not fully executed.
   * @param teamRemoveMemberRequest  (required)
   * @return ApiResponse&lt;TeamGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 201 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamGetResponse> teamRemoveMemberWithHttpInfo(TeamRemoveMemberRequest teamRemoveMemberRequest) throws ApiException {
    
    // Check required parameters
    if (teamRemoveMemberRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'teamRemoveMemberRequest' when calling teamRemoveMember");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = teamRemoveMemberRequest.createFormData();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    GenericType<TeamGetResponse> localVarReturnType = new GenericType<TeamGetResponse>() {};
    return apiClient.invokeAPI(
        "TeamApi.teamRemoveMember",
        "/team/remove_member",
        "POST",
        new ArrayList<>(),
        isFileTypeFound ? null : teamRemoveMemberRequest,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false
    );
  }
  /**
   * List Sub Teams
   * Provides a paginated list of sub teams that belong to a given team.
   * @param teamId The id of the parent Team. (required)
   * @param page Which page number of the SubTeam List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)
   * @param pageSize Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is &#x60;20&#x60;. (optional, default to 20)
   * @return TeamSubTeamsResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public TeamSubTeamsResponse teamSubTeams(String teamId, Integer page, Integer pageSize) throws ApiException {
    return teamSubTeamsWithHttpInfo(teamId, page, pageSize).getData();
  }


  /**
   * @see TeamApi#teamSubTeams(String, Integer, Integer)
   */
  public TeamSubTeamsResponse teamSubTeams(String teamId) throws ApiException {
    Integer page = 1;
    Integer pageSize = 20;

    return teamSubTeamsWithHttpInfo(teamId, page, pageSize).getData();
  }

  /**
   * @see TeamApi#teamSubTeamsWithHttpInfo(String, Integer, Integer)
   */
  public ApiResponse<TeamSubTeamsResponse> teamSubTeamsWithHttpInfo(String teamId) throws ApiException {
    Integer page = 1;
    Integer pageSize = 20;

    return teamSubTeamsWithHttpInfo(teamId, page, pageSize);
  }

  /**
   * @see TeamApi#teamSubTeams(String, Integer, Integer)
   */
  public TeamSubTeamsResponse teamSubTeams(String teamId, Integer page) throws ApiException {
    Integer pageSize = 20;

    return teamSubTeamsWithHttpInfo(teamId, page, pageSize).getData();
  }

  /**
   * @see TeamApi#teamSubTeamsWithHttpInfo(String, Integer, Integer)
   */
  public ApiResponse<TeamSubTeamsResponse> teamSubTeamsWithHttpInfo(String teamId, Integer page) throws ApiException {
    Integer pageSize = 20;

    return teamSubTeamsWithHttpInfo(teamId, page, pageSize);
  }


  /**
   * List Sub Teams
   * Provides a paginated list of sub teams that belong to a given team.
   * @param teamId The id of the parent Team. (required)
   * @param page Which page number of the SubTeam List to return. Defaults to &#x60;1&#x60;. (optional, default to 1)
   * @param pageSize Number of objects to be returned per page. Must be between &#x60;1&#x60; and &#x60;100&#x60;. Default is &#x60;20&#x60;. (optional, default to 20)
   * @return ApiResponse&lt;TeamSubTeamsResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamSubTeamsResponse> teamSubTeamsWithHttpInfo(String teamId, Integer page, Integer pageSize) throws ApiException {
    
    if (page == null) {
        page = 1;
    }
    if (pageSize == null) {
        pageSize = 20;
    }
    // Check required parameters
    if (teamId == null) {
      throw new ApiException(400, "Missing the required parameter 'teamId' when calling teamSubTeams");
    }

    // Path parameters
    String localVarPath = "/team/sub_teams/{team_id}"
            .replaceAll("\\{team_id}", apiClient.escapeString(teamId.toString()));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "page", page)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page_size", pageSize));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = new HashMap<String, Object>();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    GenericType<TeamSubTeamsResponse> localVarReturnType = new GenericType<TeamSubTeamsResponse>() {};
    return apiClient.invokeAPI(
        "TeamApi.teamSubTeams",
        localVarPath,
        "GET",
        localVarQueryParams,
        null,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false
    );
  }
  /**
   * Update Team
   * Updates the name of your Team.
   * @param teamUpdateRequest  (required)
   * @return TeamGetResponse
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public TeamGetResponse teamUpdate(TeamUpdateRequest teamUpdateRequest) throws ApiException {
    return teamUpdateWithHttpInfo(teamUpdateRequest).getData();
  }


  /**
   * Update Team
   * Updates the name of your Team.
   * @param teamUpdateRequest  (required)
   * @return ApiResponse&lt;TeamGetResponse&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table border="1">
       <caption>Response Details</caption>
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> successful operation </td><td>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-Ratelimit-Reset -  <br>  </td></tr>
       <tr><td> 4XX </td><td> failed_operation </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<TeamGetResponse> teamUpdateWithHttpInfo(TeamUpdateRequest teamUpdateRequest) throws ApiException {
    
    // Check required parameters
    if (teamUpdateRequest == null) {
      throw new ApiException(400, "Missing the required parameter 'teamUpdateRequest' when calling teamUpdate");
    }

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    Map<String, Object> localVarFormParams = new LinkedHashMap<>();
    localVarFormParams = teamUpdateRequest.createFormData();
    boolean isFileTypeFound = !localVarFormParams.isEmpty();
    String localVarContentType = isFileTypeFound? "multipart/form-data" : apiClient.selectHeaderContentType("application/json");
    String[] localVarAuthNames = new String[] {"api_key", "oauth2"};
    GenericType<TeamGetResponse> localVarReturnType = new GenericType<TeamGetResponse>() {};
    return apiClient.invokeAPI(
        "TeamApi.teamUpdate",
        "/team",
        "PUT",
        new ArrayList<>(),
        isFileTypeFound ? null : teamUpdateRequest,
        new LinkedHashMap<>(),
        new LinkedHashMap<>(),
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType,
        false
    );
  }
}