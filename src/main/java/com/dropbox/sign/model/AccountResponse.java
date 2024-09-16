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

/** AccountResponse */
@JsonPropertyOrder({
    AccountResponse.JSON_PROPERTY_ACCOUNT_ID,
    AccountResponse.JSON_PROPERTY_EMAIL_ADDRESS,
    AccountResponse.JSON_PROPERTY_IS_LOCKED,
    AccountResponse.JSON_PROPERTY_IS_PAID_HS,
    AccountResponse.JSON_PROPERTY_IS_PAID_HF,
    AccountResponse.JSON_PROPERTY_QUOTAS,
    AccountResponse.JSON_PROPERTY_CALLBACK_URL,
    AccountResponse.JSON_PROPERTY_ROLE_CODE,
    AccountResponse.JSON_PROPERTY_TEAM_ID,
    AccountResponse.JSON_PROPERTY_LOCALE,
    AccountResponse.JSON_PROPERTY_USAGE
})
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.8.0")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AccountResponse {
    public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
    private String accountId;

    public static final String JSON_PROPERTY_EMAIL_ADDRESS = "email_address";
    private String emailAddress;

    public static final String JSON_PROPERTY_IS_LOCKED = "is_locked";
    private Boolean isLocked;

    public static final String JSON_PROPERTY_IS_PAID_HS = "is_paid_hs";
    private Boolean isPaidHs;

    public static final String JSON_PROPERTY_IS_PAID_HF = "is_paid_hf";
    private Boolean isPaidHf;

    public static final String JSON_PROPERTY_QUOTAS = "quotas";
    private AccountResponseQuotas quotas;

    public static final String JSON_PROPERTY_CALLBACK_URL = "callback_url";
    private String callbackUrl;

    public static final String JSON_PROPERTY_ROLE_CODE = "role_code";
    private String roleCode;

    public static final String JSON_PROPERTY_TEAM_ID = "team_id";
    private String teamId;

    public static final String JSON_PROPERTY_LOCALE = "locale";
    private String locale;

    public static final String JSON_PROPERTY_USAGE = "usage";
    private AccountResponseUsage usage;

    public AccountResponse() {}

    /**
     * Attempt to instantiate and hydrate a new instance of this class
     *
     * @param jsonData String of JSON data representing target object
     */
    public static AccountResponse init(String jsonData) throws Exception {
        return new ObjectMapper().readValue(jsonData, AccountResponse.class);
    }

    public static AccountResponse init(HashMap data) throws Exception {
        return new ObjectMapper()
                .readValue(new ObjectMapper().writeValueAsString(data), AccountResponse.class);
    }

    public AccountResponse accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * The ID of the Account
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

    public AccountResponse emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    /**
     * The email address associated with the Account.
     *
     * @return emailAddress
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getEmailAddress() {
        return emailAddress;
    }

    @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public AccountResponse isLocked(Boolean isLocked) {
        this.isLocked = isLocked;
        return this;
    }

    /**
     * Returns &#x60;true&#x60; if the user has been locked out of their account by a team admin.
     *
     * @return isLocked
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_IS_LOCKED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsLocked() {
        return isLocked;
    }

    @JsonProperty(JSON_PROPERTY_IS_LOCKED)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    public AccountResponse isPaidHs(Boolean isPaidHs) {
        this.isPaidHs = isPaidHs;
        return this;
    }

    /**
     * Returns &#x60;true&#x60; if the user has a paid Dropbox Sign account.
     *
     * @return isPaidHs
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_IS_PAID_HS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsPaidHs() {
        return isPaidHs;
    }

    @JsonProperty(JSON_PROPERTY_IS_PAID_HS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsPaidHs(Boolean isPaidHs) {
        this.isPaidHs = isPaidHs;
    }

    public AccountResponse isPaidHf(Boolean isPaidHf) {
        this.isPaidHf = isPaidHf;
        return this;
    }

    /**
     * Returns &#x60;true&#x60; if the user has a paid HelloFax account.
     *
     * @return isPaidHf
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_IS_PAID_HF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsPaidHf() {
        return isPaidHf;
    }

    @JsonProperty(JSON_PROPERTY_IS_PAID_HF)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsPaidHf(Boolean isPaidHf) {
        this.isPaidHf = isPaidHf;
    }

    public AccountResponse quotas(AccountResponseQuotas quotas) {
        this.quotas = quotas;
        return this;
    }

    /**
     * Get quotas
     *
     * @return quotas
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_QUOTAS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AccountResponseQuotas getQuotas() {
        return quotas;
    }

    @JsonProperty(JSON_PROPERTY_QUOTAS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQuotas(AccountResponseQuotas quotas) {
        this.quotas = quotas;
    }

    public AccountResponse callbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }

    /**
     * The URL that Dropbox Sign events will &#x60;POST&#x60; to.
     *
     * @return callbackUrl
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getCallbackUrl() {
        return callbackUrl;
    }

    @JsonProperty(JSON_PROPERTY_CALLBACK_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public AccountResponse roleCode(String roleCode) {
        this.roleCode = roleCode;
        return this;
    }

    /**
     * The membership role for the team.
     *
     * @return roleCode
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_ROLE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRoleCode() {
        return roleCode;
    }

    @JsonProperty(JSON_PROPERTY_ROLE_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
    }

    public AccountResponse teamId(String teamId) {
        this.teamId = teamId;
        return this;
    }

    /**
     * The id of the team account belongs to.
     *
     * @return teamId
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_TEAM_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty(JSON_PROPERTY_TEAM_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public AccountResponse locale(String locale) {
        this.locale = locale;
        return this;
    }

    /**
     * The locale used in this Account. Check out the list of [supported
     * locales](/api/reference/constants/#supported-locales) to learn more about the possible
     * values.
     *
     * @return locale
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_LOCALE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getLocale() {
        return locale;
    }

    @JsonProperty(JSON_PROPERTY_LOCALE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLocale(String locale) {
        this.locale = locale;
    }

    public AccountResponse usage(AccountResponseUsage usage) {
        this.usage = usage;
        return this;
    }

    /**
     * Get usage
     *
     * @return usage
     */
    @javax.annotation.Nullable @JsonProperty(JSON_PROPERTY_USAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public AccountResponseUsage getUsage() {
        return usage;
    }

    @JsonProperty(JSON_PROPERTY_USAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUsage(AccountResponseUsage usage) {
        this.usage = usage;
    }

    /** Return true if this AccountResponse object is equal to o. */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountResponse accountResponse = (AccountResponse) o;
        return Objects.equals(this.accountId, accountResponse.accountId)
                && Objects.equals(this.emailAddress, accountResponse.emailAddress)
                && Objects.equals(this.isLocked, accountResponse.isLocked)
                && Objects.equals(this.isPaidHs, accountResponse.isPaidHs)
                && Objects.equals(this.isPaidHf, accountResponse.isPaidHf)
                && Objects.equals(this.quotas, accountResponse.quotas)
                && Objects.equals(this.callbackUrl, accountResponse.callbackUrl)
                && Objects.equals(this.roleCode, accountResponse.roleCode)
                && Objects.equals(this.teamId, accountResponse.teamId)
                && Objects.equals(this.locale, accountResponse.locale)
                && Objects.equals(this.usage, accountResponse.usage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                accountId,
                emailAddress,
                isLocked,
                isPaidHs,
                isPaidHf,
                quotas,
                callbackUrl,
                roleCode,
                teamId,
                locale,
                usage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountResponse {\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
        sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
        sb.append("    isPaidHs: ").append(toIndentedString(isPaidHs)).append("\n");
        sb.append("    isPaidHf: ").append(toIndentedString(isPaidHf)).append("\n");
        sb.append("    quotas: ").append(toIndentedString(quotas)).append("\n");
        sb.append("    callbackUrl: ").append(toIndentedString(callbackUrl)).append("\n");
        sb.append("    roleCode: ").append(toIndentedString(roleCode)).append("\n");
        sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
        sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public Map<String, Object> createFormData() throws ApiException {
        Map<String, Object> map = new HashMap<>();
        boolean fileTypeFound = false;
        try {
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
            if (emailAddress != null) {
                if (isFileTypeOrListOfFiles(emailAddress)) {
                    fileTypeFound = true;
                }

                if (emailAddress.getClass().equals(java.io.File.class)
                        || emailAddress.getClass().equals(Integer.class)
                        || emailAddress.getClass().equals(String.class)
                        || emailAddress.getClass().isEnum()) {
                    map.put("email_address", emailAddress);
                } else if (isListOfFile(emailAddress)) {
                    for (int i = 0; i < getListSize(emailAddress); i++) {
                        map.put("email_address[" + i + "]", getFromList(emailAddress, i));
                    }
                } else {
                    map.put(
                            "email_address",
                            JSON.getDefault().getMapper().writeValueAsString(emailAddress));
                }
            }
            if (isLocked != null) {
                if (isFileTypeOrListOfFiles(isLocked)) {
                    fileTypeFound = true;
                }

                if (isLocked.getClass().equals(java.io.File.class)
                        || isLocked.getClass().equals(Integer.class)
                        || isLocked.getClass().equals(String.class)
                        || isLocked.getClass().isEnum()) {
                    map.put("is_locked", isLocked);
                } else if (isListOfFile(isLocked)) {
                    for (int i = 0; i < getListSize(isLocked); i++) {
                        map.put("is_locked[" + i + "]", getFromList(isLocked, i));
                    }
                } else {
                    map.put(
                            "is_locked",
                            JSON.getDefault().getMapper().writeValueAsString(isLocked));
                }
            }
            if (isPaidHs != null) {
                if (isFileTypeOrListOfFiles(isPaidHs)) {
                    fileTypeFound = true;
                }

                if (isPaidHs.getClass().equals(java.io.File.class)
                        || isPaidHs.getClass().equals(Integer.class)
                        || isPaidHs.getClass().equals(String.class)
                        || isPaidHs.getClass().isEnum()) {
                    map.put("is_paid_hs", isPaidHs);
                } else if (isListOfFile(isPaidHs)) {
                    for (int i = 0; i < getListSize(isPaidHs); i++) {
                        map.put("is_paid_hs[" + i + "]", getFromList(isPaidHs, i));
                    }
                } else {
                    map.put(
                            "is_paid_hs",
                            JSON.getDefault().getMapper().writeValueAsString(isPaidHs));
                }
            }
            if (isPaidHf != null) {
                if (isFileTypeOrListOfFiles(isPaidHf)) {
                    fileTypeFound = true;
                }

                if (isPaidHf.getClass().equals(java.io.File.class)
                        || isPaidHf.getClass().equals(Integer.class)
                        || isPaidHf.getClass().equals(String.class)
                        || isPaidHf.getClass().isEnum()) {
                    map.put("is_paid_hf", isPaidHf);
                } else if (isListOfFile(isPaidHf)) {
                    for (int i = 0; i < getListSize(isPaidHf); i++) {
                        map.put("is_paid_hf[" + i + "]", getFromList(isPaidHf, i));
                    }
                } else {
                    map.put(
                            "is_paid_hf",
                            JSON.getDefault().getMapper().writeValueAsString(isPaidHf));
                }
            }
            if (quotas != null) {
                if (isFileTypeOrListOfFiles(quotas)) {
                    fileTypeFound = true;
                }

                if (quotas.getClass().equals(java.io.File.class)
                        || quotas.getClass().equals(Integer.class)
                        || quotas.getClass().equals(String.class)
                        || quotas.getClass().isEnum()) {
                    map.put("quotas", quotas);
                } else if (isListOfFile(quotas)) {
                    for (int i = 0; i < getListSize(quotas); i++) {
                        map.put("quotas[" + i + "]", getFromList(quotas, i));
                    }
                } else {
                    map.put("quotas", JSON.getDefault().getMapper().writeValueAsString(quotas));
                }
            }
            if (callbackUrl != null) {
                if (isFileTypeOrListOfFiles(callbackUrl)) {
                    fileTypeFound = true;
                }

                if (callbackUrl.getClass().equals(java.io.File.class)
                        || callbackUrl.getClass().equals(Integer.class)
                        || callbackUrl.getClass().equals(String.class)
                        || callbackUrl.getClass().isEnum()) {
                    map.put("callback_url", callbackUrl);
                } else if (isListOfFile(callbackUrl)) {
                    for (int i = 0; i < getListSize(callbackUrl); i++) {
                        map.put("callback_url[" + i + "]", getFromList(callbackUrl, i));
                    }
                } else {
                    map.put(
                            "callback_url",
                            JSON.getDefault().getMapper().writeValueAsString(callbackUrl));
                }
            }
            if (roleCode != null) {
                if (isFileTypeOrListOfFiles(roleCode)) {
                    fileTypeFound = true;
                }

                if (roleCode.getClass().equals(java.io.File.class)
                        || roleCode.getClass().equals(Integer.class)
                        || roleCode.getClass().equals(String.class)
                        || roleCode.getClass().isEnum()) {
                    map.put("role_code", roleCode);
                } else if (isListOfFile(roleCode)) {
                    for (int i = 0; i < getListSize(roleCode); i++) {
                        map.put("role_code[" + i + "]", getFromList(roleCode, i));
                    }
                } else {
                    map.put(
                            "role_code",
                            JSON.getDefault().getMapper().writeValueAsString(roleCode));
                }
            }
            if (teamId != null) {
                if (isFileTypeOrListOfFiles(teamId)) {
                    fileTypeFound = true;
                }

                if (teamId.getClass().equals(java.io.File.class)
                        || teamId.getClass().equals(Integer.class)
                        || teamId.getClass().equals(String.class)
                        || teamId.getClass().isEnum()) {
                    map.put("team_id", teamId);
                } else if (isListOfFile(teamId)) {
                    for (int i = 0; i < getListSize(teamId); i++) {
                        map.put("team_id[" + i + "]", getFromList(teamId, i));
                    }
                } else {
                    map.put("team_id", JSON.getDefault().getMapper().writeValueAsString(teamId));
                }
            }
            if (locale != null) {
                if (isFileTypeOrListOfFiles(locale)) {
                    fileTypeFound = true;
                }

                if (locale.getClass().equals(java.io.File.class)
                        || locale.getClass().equals(Integer.class)
                        || locale.getClass().equals(String.class)
                        || locale.getClass().isEnum()) {
                    map.put("locale", locale);
                } else if (isListOfFile(locale)) {
                    for (int i = 0; i < getListSize(locale); i++) {
                        map.put("locale[" + i + "]", getFromList(locale, i));
                    }
                } else {
                    map.put("locale", JSON.getDefault().getMapper().writeValueAsString(locale));
                }
            }
            if (usage != null) {
                if (isFileTypeOrListOfFiles(usage)) {
                    fileTypeFound = true;
                }

                if (usage.getClass().equals(java.io.File.class)
                        || usage.getClass().equals(Integer.class)
                        || usage.getClass().equals(String.class)
                        || usage.getClass().isEnum()) {
                    map.put("usage", usage);
                } else if (isListOfFile(usage)) {
                    for (int i = 0; i < getListSize(usage); i++) {
                        map.put("usage[" + i + "]", getFromList(usage, i));
                    }
                } else {
                    map.put("usage", JSON.getDefault().getMapper().writeValueAsString(usage));
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
