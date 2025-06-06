# dropbox-sign

Dropbox Sign v3 API


## Migrating from legacy SDK

This SDK is generated from our officially maintained [OpenAPI spec](https://github.com/hellosign/hellosign-openapi/blob/main/openapi.yaml).
We've made important updates that introduce new functionality and create feature parity between the Dropbox Sign API and the SDK.
However, some of these changes are considered "breaking" in the sense that they'll require you to update your existing code in order to continue using the SDK.
Please refer to this [migration guide](https://developers.hellosign.com/docs/sdks/java/migration-guide/) for more information.

## Version & Requirements
This is version 2.x of the Java SDK. It depends on Jakarta EE and Jersey 3.

If your project has not been updated for Jakarta or Jersey 3, you should use the [V1 SDK](https://github.com/hellosign/dropbox-sign-java/tree/v1),
which uses Jersey 2 & supports compatibility with Java EEs javax namespace.

Both versions will receive updates so use whichever your application prefers.

## Contributing

This repo is no longer accepting new issues or Pull Requests. All issues or
Pull Requests *must* be opened against the
[hellosign/hellosign-openapi](https://github.com/hellosign/hellosign-openapi) repo!

### Changes to the SDK code

You must make SDK code changes in the mustache file within the `templates`
directory that corresponds to the file you want updated.

We use [OpenAPI Generator](https://openapi-generator.tech/) to automatically
generate this SDK from the OAS, using the template files.

### Building

You must have `docker` (or `podman` linked to `docker`) installed. Highly
recommended to use
[rootless docker](https://docs.docker.com/engine/security/rootless/).

Run the following and everything is done for you:

```shell
./run-build
```

*Attention*: Any changes you have made to the SDK code that you have not made
to the OAS file and/or the mustache template files _will be lost_ when you run
this command.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.dropbox.sign</groupId>
  <artifactId>dropbox-sign</artifactId>
  <version>2.5.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'dropbox-sign' jar has been published to maven central.
    mavenLocal()       // Needed if the 'dropbox-sign' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.dropbox.sign:dropbox-sign:2.5.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/dropbox-sign-2.5.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:


```java
package com.dropbox.sign_sandbox;

import com.dropbox.sign.ApiException;
import com.dropbox.sign.Configuration;
import com.dropbox.sign.api.*;
import com.dropbox.sign.auth.*;
import com.dropbox.sign.JSON;
import com.dropbox.sign.model.*;

import java.io.File;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AccountCreateExample
{
    public static void main(String[] args)
    {
        var config = Configuration.getDefaultApiClient();
        ((HttpBasicAuth) config.getAuthentication("api_key")).setUsername("YOUR_API_KEY");
        // ((HttpBearerAuth) config.getAuthentication("oauth2")).setBearerToken("YOUR_ACCESS_TOKEN");

        var accountCreateRequest = new AccountCreateRequest();
        accountCreateRequest.emailAddress("newuser@dropboxsign.com");

        try
        {
            var response = new AccountApi(config).accountCreate(
                accountCreateRequest
            );

            System.out.println(response);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#accountCreate");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```



## Documentation for API Endpoints

All URIs are relative to *https://api.hellosign.com/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AccountApi* | [**accountCreate**](docs/AccountApi.md#accountCreate) | **POST** /account/create | Create Account
*AccountApi* | [**accountGet**](docs/AccountApi.md#accountGet) | **GET** /account | Get Account
*AccountApi* | [**accountUpdate**](docs/AccountApi.md#accountUpdate) | **PUT** /account | Update Account
*AccountApi* | [**accountVerify**](docs/AccountApi.md#accountVerify) | **POST** /account/verify | Verify Account
*ApiAppApi* | [**apiAppCreate**](docs/ApiAppApi.md#apiAppCreate) | **POST** /api_app | Create API App
*ApiAppApi* | [**apiAppDelete**](docs/ApiAppApi.md#apiAppDelete) | **DELETE** /api_app/{client_id} | Delete API App
*ApiAppApi* | [**apiAppGet**](docs/ApiAppApi.md#apiAppGet) | **GET** /api_app/{client_id} | Get API App
*ApiAppApi* | [**apiAppList**](docs/ApiAppApi.md#apiAppList) | **GET** /api_app/list | List API Apps
*ApiAppApi* | [**apiAppUpdate**](docs/ApiAppApi.md#apiAppUpdate) | **PUT** /api_app/{client_id} | Update API App
*BulkSendJobApi* | [**bulkSendJobGet**](docs/BulkSendJobApi.md#bulkSendJobGet) | **GET** /bulk_send_job/{bulk_send_job_id} | Get Bulk Send Job
*BulkSendJobApi* | [**bulkSendJobList**](docs/BulkSendJobApi.md#bulkSendJobList) | **GET** /bulk_send_job/list | List Bulk Send Jobs
*EmbeddedApi* | [**embeddedEditUrl**](docs/EmbeddedApi.md#embeddedEditUrl) | **POST** /embedded/edit_url/{template_id} | Get Embedded Template Edit URL
*EmbeddedApi* | [**embeddedSignUrl**](docs/EmbeddedApi.md#embeddedSignUrl) | **GET** /embedded/sign_url/{signature_id} | Get Embedded Sign URL
*FaxApi* | [**faxDelete**](docs/FaxApi.md#faxDelete) | **DELETE** /fax/{fax_id} | Delete Fax
*FaxApi* | [**faxFiles**](docs/FaxApi.md#faxFiles) | **GET** /fax/files/{fax_id} | Download Fax Files
*FaxApi* | [**faxGet**](docs/FaxApi.md#faxGet) | **GET** /fax/{fax_id} | Get Fax
*FaxApi* | [**faxList**](docs/FaxApi.md#faxList) | **GET** /fax/list | Lists Faxes
*FaxApi* | [**faxSend**](docs/FaxApi.md#faxSend) | **POST** /fax/send | Send Fax
*FaxLineApi* | [**faxLineAddUser**](docs/FaxLineApi.md#faxLineAddUser) | **PUT** /fax_line/add_user | Add Fax Line User
*FaxLineApi* | [**faxLineAreaCodeGet**](docs/FaxLineApi.md#faxLineAreaCodeGet) | **GET** /fax_line/area_codes | Get Available Fax Line Area Codes
*FaxLineApi* | [**faxLineCreate**](docs/FaxLineApi.md#faxLineCreate) | **POST** /fax_line/create | Purchase Fax Line
*FaxLineApi* | [**faxLineDelete**](docs/FaxLineApi.md#faxLineDelete) | **DELETE** /fax_line | Delete Fax Line
*FaxLineApi* | [**faxLineGet**](docs/FaxLineApi.md#faxLineGet) | **GET** /fax_line | Get Fax Line
*FaxLineApi* | [**faxLineList**](docs/FaxLineApi.md#faxLineList) | **GET** /fax_line/list | List Fax Lines
*FaxLineApi* | [**faxLineRemoveUser**](docs/FaxLineApi.md#faxLineRemoveUser) | **PUT** /fax_line/remove_user | Remove Fax Line Access
*OAuthApi* | [**oauthTokenGenerate**](docs/OAuthApi.md#oauthTokenGenerate) | **POST** /oauth/token | OAuth Token Generate
*OAuthApi* | [**oauthTokenRefresh**](docs/OAuthApi.md#oauthTokenRefresh) | **POST** /oauth/token?refresh | OAuth Token Refresh
*ReportApi* | [**reportCreate**](docs/ReportApi.md#reportCreate) | **POST** /report/create | Create Report
*SignatureRequestApi* | [**signatureRequestBulkCreateEmbeddedWithTemplate**](docs/SignatureRequestApi.md#signatureRequestBulkCreateEmbeddedWithTemplate) | **POST** /signature_request/bulk_create_embedded_with_template | Embedded Bulk Send with Template
*SignatureRequestApi* | [**signatureRequestBulkSendWithTemplate**](docs/SignatureRequestApi.md#signatureRequestBulkSendWithTemplate) | **POST** /signature_request/bulk_send_with_template | Bulk Send with Template
*SignatureRequestApi* | [**signatureRequestCancel**](docs/SignatureRequestApi.md#signatureRequestCancel) | **POST** /signature_request/cancel/{signature_request_id} | Cancel Incomplete Signature Request
*SignatureRequestApi* | [**signatureRequestCreateEmbedded**](docs/SignatureRequestApi.md#signatureRequestCreateEmbedded) | **POST** /signature_request/create_embedded | Create Embedded Signature Request
*SignatureRequestApi* | [**signatureRequestCreateEmbeddedWithTemplate**](docs/SignatureRequestApi.md#signatureRequestCreateEmbeddedWithTemplate) | **POST** /signature_request/create_embedded_with_template | Create Embedded Signature Request with Template
*SignatureRequestApi* | [**signatureRequestEdit**](docs/SignatureRequestApi.md#signatureRequestEdit) | **PUT** /signature_request/edit/{signature_request_id} | Edit Signature Request
*SignatureRequestApi* | [**signatureRequestEditEmbedded**](docs/SignatureRequestApi.md#signatureRequestEditEmbedded) | **PUT** /signature_request/edit_embedded/{signature_request_id} | Edit Embedded Signature Request
*SignatureRequestApi* | [**signatureRequestEditEmbeddedWithTemplate**](docs/SignatureRequestApi.md#signatureRequestEditEmbeddedWithTemplate) | **PUT** /signature_request/edit_embedded_with_template/{signature_request_id} | Edit Embedded Signature Request with Template
*SignatureRequestApi* | [**signatureRequestEditWithTemplate**](docs/SignatureRequestApi.md#signatureRequestEditWithTemplate) | **PUT** /signature_request/edit_with_template/{signature_request_id} | Edit Signature Request With Template
*SignatureRequestApi* | [**signatureRequestFiles**](docs/SignatureRequestApi.md#signatureRequestFiles) | **GET** /signature_request/files/{signature_request_id} | Download Files
*SignatureRequestApi* | [**signatureRequestFilesAsDataUri**](docs/SignatureRequestApi.md#signatureRequestFilesAsDataUri) | **GET** /signature_request/files_as_data_uri/{signature_request_id} | Download Files as Data Uri
*SignatureRequestApi* | [**signatureRequestFilesAsFileUrl**](docs/SignatureRequestApi.md#signatureRequestFilesAsFileUrl) | **GET** /signature_request/files_as_file_url/{signature_request_id} | Download Files as File Url
*SignatureRequestApi* | [**signatureRequestGet**](docs/SignatureRequestApi.md#signatureRequestGet) | **GET** /signature_request/{signature_request_id} | Get Signature Request
*SignatureRequestApi* | [**signatureRequestList**](docs/SignatureRequestApi.md#signatureRequestList) | **GET** /signature_request/list | List Signature Requests
*SignatureRequestApi* | [**signatureRequestReleaseHold**](docs/SignatureRequestApi.md#signatureRequestReleaseHold) | **POST** /signature_request/release_hold/{signature_request_id} | Release On-Hold Signature Request
*SignatureRequestApi* | [**signatureRequestRemind**](docs/SignatureRequestApi.md#signatureRequestRemind) | **POST** /signature_request/remind/{signature_request_id} | Send Request Reminder
*SignatureRequestApi* | [**signatureRequestRemove**](docs/SignatureRequestApi.md#signatureRequestRemove) | **POST** /signature_request/remove/{signature_request_id} | Remove Signature Request Access
*SignatureRequestApi* | [**signatureRequestSend**](docs/SignatureRequestApi.md#signatureRequestSend) | **POST** /signature_request/send | Send Signature Request
*SignatureRequestApi* | [**signatureRequestSendWithTemplate**](docs/SignatureRequestApi.md#signatureRequestSendWithTemplate) | **POST** /signature_request/send_with_template | Send with Template
*SignatureRequestApi* | [**signatureRequestUpdate**](docs/SignatureRequestApi.md#signatureRequestUpdate) | **POST** /signature_request/update/{signature_request_id} | Update Signature Request
*TeamApi* | [**teamAddMember**](docs/TeamApi.md#teamAddMember) | **PUT** /team/add_member | Add User to Team
*TeamApi* | [**teamCreate**](docs/TeamApi.md#teamCreate) | **POST** /team/create | Create Team
*TeamApi* | [**teamDelete**](docs/TeamApi.md#teamDelete) | **DELETE** /team/destroy | Delete Team
*TeamApi* | [**teamGet**](docs/TeamApi.md#teamGet) | **GET** /team | Get Team
*TeamApi* | [**teamInfo**](docs/TeamApi.md#teamInfo) | **GET** /team/info | Get Team Info
*TeamApi* | [**teamInvites**](docs/TeamApi.md#teamInvites) | **GET** /team/invites | List Team Invites
*TeamApi* | [**teamMembers**](docs/TeamApi.md#teamMembers) | **GET** /team/members/{team_id} | List Team Members
*TeamApi* | [**teamRemoveMember**](docs/TeamApi.md#teamRemoveMember) | **POST** /team/remove_member | Remove User from Team
*TeamApi* | [**teamSubTeams**](docs/TeamApi.md#teamSubTeams) | **GET** /team/sub_teams/{team_id} | List Sub Teams
*TeamApi* | [**teamUpdate**](docs/TeamApi.md#teamUpdate) | **PUT** /team | Update Team
*TemplateApi* | [**templateAddUser**](docs/TemplateApi.md#templateAddUser) | **POST** /template/add_user/{template_id} | Add User to Template
*TemplateApi* | [**templateCreate**](docs/TemplateApi.md#templateCreate) | **POST** /template/create | Create Template
*TemplateApi* | [**templateCreateEmbeddedDraft**](docs/TemplateApi.md#templateCreateEmbeddedDraft) | **POST** /template/create_embedded_draft | Create Embedded Template Draft
*TemplateApi* | [**templateDelete**](docs/TemplateApi.md#templateDelete) | **POST** /template/delete/{template_id} | Delete Template
*TemplateApi* | [**templateFiles**](docs/TemplateApi.md#templateFiles) | **GET** /template/files/{template_id} | Get Template Files
*TemplateApi* | [**templateFilesAsDataUri**](docs/TemplateApi.md#templateFilesAsDataUri) | **GET** /template/files_as_data_uri/{template_id} | Get Template Files as Data Uri
*TemplateApi* | [**templateFilesAsFileUrl**](docs/TemplateApi.md#templateFilesAsFileUrl) | **GET** /template/files_as_file_url/{template_id} | Get Template Files as File Url
*TemplateApi* | [**templateGet**](docs/TemplateApi.md#templateGet) | **GET** /template/{template_id} | Get Template
*TemplateApi* | [**templateList**](docs/TemplateApi.md#templateList) | **GET** /template/list | List Templates
*TemplateApi* | [**templateRemoveUser**](docs/TemplateApi.md#templateRemoveUser) | **POST** /template/remove_user/{template_id} | Remove User from Template
*TemplateApi* | [**templateUpdateFiles**](docs/TemplateApi.md#templateUpdateFiles) | **POST** /template/update_files/{template_id} | Update Template Files
*UnclaimedDraftApi* | [**unclaimedDraftCreate**](docs/UnclaimedDraftApi.md#unclaimedDraftCreate) | **POST** /unclaimed_draft/create | Create Unclaimed Draft
*UnclaimedDraftApi* | [**unclaimedDraftCreateEmbedded**](docs/UnclaimedDraftApi.md#unclaimedDraftCreateEmbedded) | **POST** /unclaimed_draft/create_embedded | Create Embedded Unclaimed Draft
*UnclaimedDraftApi* | [**unclaimedDraftCreateEmbeddedWithTemplate**](docs/UnclaimedDraftApi.md#unclaimedDraftCreateEmbeddedWithTemplate) | **POST** /unclaimed_draft/create_embedded_with_template | Create Embedded Unclaimed Draft with Template
*UnclaimedDraftApi* | [**unclaimedDraftEditAndResend**](docs/UnclaimedDraftApi.md#unclaimedDraftEditAndResend) | **POST** /unclaimed_draft/edit_and_resend/{signature_request_id} | Edit and Resend Unclaimed Draft


## Documentation for Models

 - [AccountCreateRequest](docs/AccountCreateRequest.md)
 - [AccountCreateResponse](docs/AccountCreateResponse.md)
 - [AccountGetResponse](docs/AccountGetResponse.md)
 - [AccountResponse](docs/AccountResponse.md)
 - [AccountResponseQuotas](docs/AccountResponseQuotas.md)
 - [AccountResponseUsage](docs/AccountResponseUsage.md)
 - [AccountUpdateRequest](docs/AccountUpdateRequest.md)
 - [AccountVerifyRequest](docs/AccountVerifyRequest.md)
 - [AccountVerifyResponse](docs/AccountVerifyResponse.md)
 - [AccountVerifyResponseAccount](docs/AccountVerifyResponseAccount.md)
 - [ApiAppCreateRequest](docs/ApiAppCreateRequest.md)
 - [ApiAppGetResponse](docs/ApiAppGetResponse.md)
 - [ApiAppListResponse](docs/ApiAppListResponse.md)
 - [ApiAppResponse](docs/ApiAppResponse.md)
 - [ApiAppResponseOAuth](docs/ApiAppResponseOAuth.md)
 - [ApiAppResponseOptions](docs/ApiAppResponseOptions.md)
 - [ApiAppResponseOwnerAccount](docs/ApiAppResponseOwnerAccount.md)
 - [ApiAppResponseWhiteLabelingOptions](docs/ApiAppResponseWhiteLabelingOptions.md)
 - [ApiAppUpdateRequest](docs/ApiAppUpdateRequest.md)
 - [BulkSendJobGetResponse](docs/BulkSendJobGetResponse.md)
 - [BulkSendJobGetResponseSignatureRequests](docs/BulkSendJobGetResponseSignatureRequests.md)
 - [BulkSendJobListResponse](docs/BulkSendJobListResponse.md)
 - [BulkSendJobResponse](docs/BulkSendJobResponse.md)
 - [BulkSendJobSendResponse](docs/BulkSendJobSendResponse.md)
 - [EmbeddedEditUrlRequest](docs/EmbeddedEditUrlRequest.md)
 - [EmbeddedEditUrlResponse](docs/EmbeddedEditUrlResponse.md)
 - [EmbeddedEditUrlResponseEmbedded](docs/EmbeddedEditUrlResponseEmbedded.md)
 - [EmbeddedSignUrlResponse](docs/EmbeddedSignUrlResponse.md)
 - [EmbeddedSignUrlResponseEmbedded](docs/EmbeddedSignUrlResponseEmbedded.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorResponseError](docs/ErrorResponseError.md)
 - [EventCallbackRequest](docs/EventCallbackRequest.md)
 - [EventCallbackRequestEvent](docs/EventCallbackRequestEvent.md)
 - [EventCallbackRequestEventMetadata](docs/EventCallbackRequestEventMetadata.md)
 - [FaxGetResponse](docs/FaxGetResponse.md)
 - [FaxLineAddUserRequest](docs/FaxLineAddUserRequest.md)
 - [FaxLineAreaCodeGetCountryEnum](docs/FaxLineAreaCodeGetCountryEnum.md)
 - [FaxLineAreaCodeGetProvinceEnum](docs/FaxLineAreaCodeGetProvinceEnum.md)
 - [FaxLineAreaCodeGetResponse](docs/FaxLineAreaCodeGetResponse.md)
 - [FaxLineAreaCodeGetStateEnum](docs/FaxLineAreaCodeGetStateEnum.md)
 - [FaxLineCreateRequest](docs/FaxLineCreateRequest.md)
 - [FaxLineDeleteRequest](docs/FaxLineDeleteRequest.md)
 - [FaxLineListResponse](docs/FaxLineListResponse.md)
 - [FaxLineRemoveUserRequest](docs/FaxLineRemoveUserRequest.md)
 - [FaxLineResponse](docs/FaxLineResponse.md)
 - [FaxLineResponseFaxLine](docs/FaxLineResponseFaxLine.md)
 - [FaxListResponse](docs/FaxListResponse.md)
 - [FaxResponse](docs/FaxResponse.md)
 - [FaxResponseTransmission](docs/FaxResponseTransmission.md)
 - [FaxSendRequest](docs/FaxSendRequest.md)
 - [FileResponse](docs/FileResponse.md)
 - [FileResponseDataUri](docs/FileResponseDataUri.md)
 - [ListInfoResponse](docs/ListInfoResponse.md)
 - [OAuthTokenGenerateRequest](docs/OAuthTokenGenerateRequest.md)
 - [OAuthTokenRefreshRequest](docs/OAuthTokenRefreshRequest.md)
 - [OAuthTokenResponse](docs/OAuthTokenResponse.md)
 - [ReportCreateRequest](docs/ReportCreateRequest.md)
 - [ReportCreateResponse](docs/ReportCreateResponse.md)
 - [ReportResponse](docs/ReportResponse.md)
 - [SignatureRequestBulkCreateEmbeddedWithTemplateRequest](docs/SignatureRequestBulkCreateEmbeddedWithTemplateRequest.md)
 - [SignatureRequestBulkSendWithTemplateRequest](docs/SignatureRequestBulkSendWithTemplateRequest.md)
 - [SignatureRequestCreateEmbeddedRequest](docs/SignatureRequestCreateEmbeddedRequest.md)
 - [SignatureRequestCreateEmbeddedWithTemplateRequest](docs/SignatureRequestCreateEmbeddedWithTemplateRequest.md)
 - [SignatureRequestEditEmbeddedRequest](docs/SignatureRequestEditEmbeddedRequest.md)
 - [SignatureRequestEditEmbeddedWithTemplateRequest](docs/SignatureRequestEditEmbeddedWithTemplateRequest.md)
 - [SignatureRequestEditRequest](docs/SignatureRequestEditRequest.md)
 - [SignatureRequestEditWithTemplateRequest](docs/SignatureRequestEditWithTemplateRequest.md)
 - [SignatureRequestGetResponse](docs/SignatureRequestGetResponse.md)
 - [SignatureRequestListResponse](docs/SignatureRequestListResponse.md)
 - [SignatureRequestRemindRequest](docs/SignatureRequestRemindRequest.md)
 - [SignatureRequestResponse](docs/SignatureRequestResponse.md)
 - [SignatureRequestResponseAttachment](docs/SignatureRequestResponseAttachment.md)
 - [SignatureRequestResponseCustomFieldBase](docs/SignatureRequestResponseCustomFieldBase.md)
 - [SignatureRequestResponseCustomFieldCheckbox](docs/SignatureRequestResponseCustomFieldCheckbox.md)
 - [SignatureRequestResponseCustomFieldText](docs/SignatureRequestResponseCustomFieldText.md)
 - [SignatureRequestResponseCustomFieldTypeEnum](docs/SignatureRequestResponseCustomFieldTypeEnum.md)
 - [SignatureRequestResponseDataBase](docs/SignatureRequestResponseDataBase.md)
 - [SignatureRequestResponseDataTypeEnum](docs/SignatureRequestResponseDataTypeEnum.md)
 - [SignatureRequestResponseDataValueCheckbox](docs/SignatureRequestResponseDataValueCheckbox.md)
 - [SignatureRequestResponseDataValueCheckboxMerge](docs/SignatureRequestResponseDataValueCheckboxMerge.md)
 - [SignatureRequestResponseDataValueDateSigned](docs/SignatureRequestResponseDataValueDateSigned.md)
 - [SignatureRequestResponseDataValueDropdown](docs/SignatureRequestResponseDataValueDropdown.md)
 - [SignatureRequestResponseDataValueInitials](docs/SignatureRequestResponseDataValueInitials.md)
 - [SignatureRequestResponseDataValueRadio](docs/SignatureRequestResponseDataValueRadio.md)
 - [SignatureRequestResponseDataValueSignature](docs/SignatureRequestResponseDataValueSignature.md)
 - [SignatureRequestResponseDataValueText](docs/SignatureRequestResponseDataValueText.md)
 - [SignatureRequestResponseDataValueTextMerge](docs/SignatureRequestResponseDataValueTextMerge.md)
 - [SignatureRequestResponseSignatures](docs/SignatureRequestResponseSignatures.md)
 - [SignatureRequestSendRequest](docs/SignatureRequestSendRequest.md)
 - [SignatureRequestSendWithTemplateRequest](docs/SignatureRequestSendWithTemplateRequest.md)
 - [SignatureRequestUpdateRequest](docs/SignatureRequestUpdateRequest.md)
 - [SubAttachment](docs/SubAttachment.md)
 - [SubBulkSignerList](docs/SubBulkSignerList.md)
 - [SubBulkSignerListCustomField](docs/SubBulkSignerListCustomField.md)
 - [SubCC](docs/SubCC.md)
 - [SubCustomField](docs/SubCustomField.md)
 - [SubEditorOptions](docs/SubEditorOptions.md)
 - [SubFieldOptions](docs/SubFieldOptions.md)
 - [SubFormFieldGroup](docs/SubFormFieldGroup.md)
 - [SubFormFieldRule](docs/SubFormFieldRule.md)
 - [SubFormFieldRuleAction](docs/SubFormFieldRuleAction.md)
 - [SubFormFieldRuleTrigger](docs/SubFormFieldRuleTrigger.md)
 - [SubFormFieldsPerDocumentBase](docs/SubFormFieldsPerDocumentBase.md)
 - [SubFormFieldsPerDocumentCheckbox](docs/SubFormFieldsPerDocumentCheckbox.md)
 - [SubFormFieldsPerDocumentCheckboxMerge](docs/SubFormFieldsPerDocumentCheckboxMerge.md)
 - [SubFormFieldsPerDocumentDateSigned](docs/SubFormFieldsPerDocumentDateSigned.md)
 - [SubFormFieldsPerDocumentDropdown](docs/SubFormFieldsPerDocumentDropdown.md)
 - [SubFormFieldsPerDocumentFontEnum](docs/SubFormFieldsPerDocumentFontEnum.md)
 - [SubFormFieldsPerDocumentHyperlink](docs/SubFormFieldsPerDocumentHyperlink.md)
 - [SubFormFieldsPerDocumentInitials](docs/SubFormFieldsPerDocumentInitials.md)
 - [SubFormFieldsPerDocumentRadio](docs/SubFormFieldsPerDocumentRadio.md)
 - [SubFormFieldsPerDocumentSignature](docs/SubFormFieldsPerDocumentSignature.md)
 - [SubFormFieldsPerDocumentText](docs/SubFormFieldsPerDocumentText.md)
 - [SubFormFieldsPerDocumentTextMerge](docs/SubFormFieldsPerDocumentTextMerge.md)
 - [SubFormFieldsPerDocumentTypeEnum](docs/SubFormFieldsPerDocumentTypeEnum.md)
 - [SubMergeField](docs/SubMergeField.md)
 - [SubOAuth](docs/SubOAuth.md)
 - [SubOptions](docs/SubOptions.md)
 - [SubSignatureRequestGroupedSigners](docs/SubSignatureRequestGroupedSigners.md)
 - [SubSignatureRequestSigner](docs/SubSignatureRequestSigner.md)
 - [SubSignatureRequestTemplateSigner](docs/SubSignatureRequestTemplateSigner.md)
 - [SubSigningOptions](docs/SubSigningOptions.md)
 - [SubTeamResponse](docs/SubTeamResponse.md)
 - [SubTemplateRole](docs/SubTemplateRole.md)
 - [SubUnclaimedDraftSigner](docs/SubUnclaimedDraftSigner.md)
 - [SubUnclaimedDraftTemplateSigner](docs/SubUnclaimedDraftTemplateSigner.md)
 - [SubWhiteLabelingOptions](docs/SubWhiteLabelingOptions.md)
 - [TeamAddMemberRequest](docs/TeamAddMemberRequest.md)
 - [TeamCreateRequest](docs/TeamCreateRequest.md)
 - [TeamGetInfoResponse](docs/TeamGetInfoResponse.md)
 - [TeamGetResponse](docs/TeamGetResponse.md)
 - [TeamInfoResponse](docs/TeamInfoResponse.md)
 - [TeamInviteResponse](docs/TeamInviteResponse.md)
 - [TeamInvitesResponse](docs/TeamInvitesResponse.md)
 - [TeamMemberResponse](docs/TeamMemberResponse.md)
 - [TeamMembersResponse](docs/TeamMembersResponse.md)
 - [TeamParentResponse](docs/TeamParentResponse.md)
 - [TeamRemoveMemberRequest](docs/TeamRemoveMemberRequest.md)
 - [TeamResponse](docs/TeamResponse.md)
 - [TeamSubTeamsResponse](docs/TeamSubTeamsResponse.md)
 - [TeamUpdateRequest](docs/TeamUpdateRequest.md)
 - [TemplateAddUserRequest](docs/TemplateAddUserRequest.md)
 - [TemplateCreateEmbeddedDraftRequest](docs/TemplateCreateEmbeddedDraftRequest.md)
 - [TemplateCreateEmbeddedDraftResponse](docs/TemplateCreateEmbeddedDraftResponse.md)
 - [TemplateCreateEmbeddedDraftResponseTemplate](docs/TemplateCreateEmbeddedDraftResponseTemplate.md)
 - [TemplateCreateRequest](docs/TemplateCreateRequest.md)
 - [TemplateCreateResponse](docs/TemplateCreateResponse.md)
 - [TemplateCreateResponseTemplate](docs/TemplateCreateResponseTemplate.md)
 - [TemplateEditResponse](docs/TemplateEditResponse.md)
 - [TemplateGetResponse](docs/TemplateGetResponse.md)
 - [TemplateListResponse](docs/TemplateListResponse.md)
 - [TemplateRemoveUserRequest](docs/TemplateRemoveUserRequest.md)
 - [TemplateResponse](docs/TemplateResponse.md)
 - [TemplateResponseAccount](docs/TemplateResponseAccount.md)
 - [TemplateResponseAccountQuota](docs/TemplateResponseAccountQuota.md)
 - [TemplateResponseCCRole](docs/TemplateResponseCCRole.md)
 - [TemplateResponseDocument](docs/TemplateResponseDocument.md)
 - [TemplateResponseDocumentCustomFieldBase](docs/TemplateResponseDocumentCustomFieldBase.md)
 - [TemplateResponseDocumentCustomFieldCheckbox](docs/TemplateResponseDocumentCustomFieldCheckbox.md)
 - [TemplateResponseDocumentCustomFieldText](docs/TemplateResponseDocumentCustomFieldText.md)
 - [TemplateResponseDocumentFieldGroup](docs/TemplateResponseDocumentFieldGroup.md)
 - [TemplateResponseDocumentFieldGroupRule](docs/TemplateResponseDocumentFieldGroupRule.md)
 - [TemplateResponseDocumentFormFieldBase](docs/TemplateResponseDocumentFormFieldBase.md)
 - [TemplateResponseDocumentFormFieldCheckbox](docs/TemplateResponseDocumentFormFieldCheckbox.md)
 - [TemplateResponseDocumentFormFieldDateSigned](docs/TemplateResponseDocumentFormFieldDateSigned.md)
 - [TemplateResponseDocumentFormFieldDropdown](docs/TemplateResponseDocumentFormFieldDropdown.md)
 - [TemplateResponseDocumentFormFieldHyperlink](docs/TemplateResponseDocumentFormFieldHyperlink.md)
 - [TemplateResponseDocumentFormFieldInitials](docs/TemplateResponseDocumentFormFieldInitials.md)
 - [TemplateResponseDocumentFormFieldRadio](docs/TemplateResponseDocumentFormFieldRadio.md)
 - [TemplateResponseDocumentFormFieldSignature](docs/TemplateResponseDocumentFormFieldSignature.md)
 - [TemplateResponseDocumentFormFieldText](docs/TemplateResponseDocumentFormFieldText.md)
 - [TemplateResponseDocumentStaticFieldBase](docs/TemplateResponseDocumentStaticFieldBase.md)
 - [TemplateResponseDocumentStaticFieldCheckbox](docs/TemplateResponseDocumentStaticFieldCheckbox.md)
 - [TemplateResponseDocumentStaticFieldDateSigned](docs/TemplateResponseDocumentStaticFieldDateSigned.md)
 - [TemplateResponseDocumentStaticFieldDropdown](docs/TemplateResponseDocumentStaticFieldDropdown.md)
 - [TemplateResponseDocumentStaticFieldHyperlink](docs/TemplateResponseDocumentStaticFieldHyperlink.md)
 - [TemplateResponseDocumentStaticFieldInitials](docs/TemplateResponseDocumentStaticFieldInitials.md)
 - [TemplateResponseDocumentStaticFieldRadio](docs/TemplateResponseDocumentStaticFieldRadio.md)
 - [TemplateResponseDocumentStaticFieldSignature](docs/TemplateResponseDocumentStaticFieldSignature.md)
 - [TemplateResponseDocumentStaticFieldText](docs/TemplateResponseDocumentStaticFieldText.md)
 - [TemplateResponseFieldAvgTextLength](docs/TemplateResponseFieldAvgTextLength.md)
 - [TemplateResponseSignerRole](docs/TemplateResponseSignerRole.md)
 - [TemplateUpdateFilesRequest](docs/TemplateUpdateFilesRequest.md)
 - [TemplateUpdateFilesResponse](docs/TemplateUpdateFilesResponse.md)
 - [TemplateUpdateFilesResponseTemplate](docs/TemplateUpdateFilesResponseTemplate.md)
 - [UnclaimedDraftCreateEmbeddedRequest](docs/UnclaimedDraftCreateEmbeddedRequest.md)
 - [UnclaimedDraftCreateEmbeddedWithTemplateRequest](docs/UnclaimedDraftCreateEmbeddedWithTemplateRequest.md)
 - [UnclaimedDraftCreateRequest](docs/UnclaimedDraftCreateRequest.md)
 - [UnclaimedDraftCreateResponse](docs/UnclaimedDraftCreateResponse.md)
 - [UnclaimedDraftEditAndResendRequest](docs/UnclaimedDraftEditAndResendRequest.md)
 - [UnclaimedDraftResponse](docs/UnclaimedDraftResponse.md)
 - [WarningResponse](docs/WarningResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="api_key"></a>
### api_key


- **Type**: HTTP basic authentication

<a id="oauth2"></a>
### oauth2


- **Type**: HTTP Bearer Token authentication (JWT)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

apisupport@hellosign.com


## About this package

This Java package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `3.0.0`
    - Package version: `2.5.0`
- Build package: `org.openapitools.codegen.languages.JavaClientCodegen`


# Working on this SDK

This section includes documentation about how to generate the SDK in case you want to make a contribution.

## Building the SDK with Docker

Run `./run-build`

## Installation / Deployment

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.
