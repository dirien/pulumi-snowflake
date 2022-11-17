// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OauthIntegrationState extends com.pulumi.resources.ResourceArgs {

    public static final OauthIntegrationState Empty = new OauthIntegrationState();

    /**
     * List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
     * 
     */
    @Import(name="blockedRolesLists")
    private @Nullable Output<List<String>> blockedRolesLists;

    /**
     * @return List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
     * 
     */
    public Optional<Output<List<String>>> blockedRolesLists() {
        return Optional.ofNullable(this.blockedRolesLists);
    }

    /**
     * Specifies a comment for the OAuth integration.
     * 
     */
    @Import(name="comment")
    private @Nullable Output<String> comment;

    /**
     * @return Specifies a comment for the OAuth integration.
     * 
     */
    public Optional<Output<String>> comment() {
        return Optional.ofNullable(this.comment);
    }

    /**
     * Date and time when the OAuth integration was created.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return Date and time when the OAuth integration was created.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * Specifies whether this OAuth integration is enabled or disabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether this OAuth integration is enabled or disabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the OAuth client type.
     * 
     */
    @Import(name="oauthClient")
    private @Nullable Output<String> oauthClient;

    /**
     * @return Specifies the OAuth client type.
     * 
     */
    public Optional<Output<String>> oauthClient() {
        return Optional.ofNullable(this.oauthClient);
    }

    /**
     * Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
     * 
     */
    @Import(name="oauthIssueRefreshTokens")
    private @Nullable Output<Boolean> oauthIssueRefreshTokens;

    /**
     * @return Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
     * 
     */
    public Optional<Output<Boolean>> oauthIssueRefreshTokens() {
        return Optional.ofNullable(this.oauthIssueRefreshTokens);
    }

    /**
     * Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     * 
     */
    @Import(name="oauthRedirectUri")
    private @Nullable Output<String> oauthRedirectUri;

    /**
     * @return Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
     * 
     */
    public Optional<Output<String>> oauthRedirectUri() {
        return Optional.ofNullable(this.oauthRedirectUri);
    }

    /**
     * Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     * 
     */
    @Import(name="oauthRefreshTokenValidity")
    private @Nullable Output<Integer> oauthRefreshTokenValidity;

    /**
     * @return Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
     * 
     */
    public Optional<Output<Integer>> oauthRefreshTokenValidity() {
        return Optional.ofNullable(this.oauthRefreshTokenValidity);
    }

    /**
     * Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
     * 
     */
    @Import(name="oauthUseSecondaryRoles")
    private @Nullable Output<String> oauthUseSecondaryRoles;

    /**
     * @return Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
     * 
     */
    public Optional<Output<String>> oauthUseSecondaryRoles() {
        return Optional.ofNullable(this.oauthUseSecondaryRoles);
    }

    private OauthIntegrationState() {}

    private OauthIntegrationState(OauthIntegrationState $) {
        this.blockedRolesLists = $.blockedRolesLists;
        this.comment = $.comment;
        this.createdOn = $.createdOn;
        this.enabled = $.enabled;
        this.name = $.name;
        this.oauthClient = $.oauthClient;
        this.oauthIssueRefreshTokens = $.oauthIssueRefreshTokens;
        this.oauthRedirectUri = $.oauthRedirectUri;
        this.oauthRefreshTokenValidity = $.oauthRefreshTokenValidity;
        this.oauthUseSecondaryRoles = $.oauthUseSecondaryRoles;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OauthIntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OauthIntegrationState $;

        public Builder() {
            $ = new OauthIntegrationState();
        }

        public Builder(OauthIntegrationState defaults) {
            $ = new OauthIntegrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param blockedRolesLists List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
         * 
         * @return builder
         * 
         */
        public Builder blockedRolesLists(@Nullable Output<List<String>> blockedRolesLists) {
            $.blockedRolesLists = blockedRolesLists;
            return this;
        }

        /**
         * @param blockedRolesLists List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
         * 
         * @return builder
         * 
         */
        public Builder blockedRolesLists(List<String> blockedRolesLists) {
            return blockedRolesLists(Output.of(blockedRolesLists));
        }

        /**
         * @param blockedRolesLists List of roles that a user cannot explicitly consent to using after authenticating. Do not include ACCOUNTADMIN, ORGADMIN or SECURITYADMIN as they are already implicitly enforced and will cause in-place updates.
         * 
         * @return builder
         * 
         */
        public Builder blockedRolesLists(String... blockedRolesLists) {
            return blockedRolesLists(List.of(blockedRolesLists));
        }

        /**
         * @param comment Specifies a comment for the OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder comment(@Nullable Output<String> comment) {
            $.comment = comment;
            return this;
        }

        /**
         * @param comment Specifies a comment for the OAuth integration.
         * 
         * @return builder
         * 
         */
        public Builder comment(String comment) {
            return comment(Output.of(comment));
        }

        /**
         * @param createdOn Date and time when the OAuth integration was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn Date and time when the OAuth integration was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param enabled Specifies whether this OAuth integration is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether this OAuth integration is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the OAuth integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param oauthClient Specifies the OAuth client type.
         * 
         * @return builder
         * 
         */
        public Builder oauthClient(@Nullable Output<String> oauthClient) {
            $.oauthClient = oauthClient;
            return this;
        }

        /**
         * @param oauthClient Specifies the OAuth client type.
         * 
         * @return builder
         * 
         */
        public Builder oauthClient(String oauthClient) {
            return oauthClient(Output.of(oauthClient));
        }

        /**
         * @param oauthIssueRefreshTokens Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
         * 
         * @return builder
         * 
         */
        public Builder oauthIssueRefreshTokens(@Nullable Output<Boolean> oauthIssueRefreshTokens) {
            $.oauthIssueRefreshTokens = oauthIssueRefreshTokens;
            return this;
        }

        /**
         * @param oauthIssueRefreshTokens Specifies whether to allow the client to exchange a refresh token for an access token when the current access token has expired.
         * 
         * @return builder
         * 
         */
        public Builder oauthIssueRefreshTokens(Boolean oauthIssueRefreshTokens) {
            return oauthIssueRefreshTokens(Output.of(oauthIssueRefreshTokens));
        }

        /**
         * @param oauthRedirectUri Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
         * 
         * @return builder
         * 
         */
        public Builder oauthRedirectUri(@Nullable Output<String> oauthRedirectUri) {
            $.oauthRedirectUri = oauthRedirectUri;
            return this;
        }

        /**
         * @param oauthRedirectUri Specifies the client URI. After a user is authenticated, the web browser is redirected to this URI.
         * 
         * @return builder
         * 
         */
        public Builder oauthRedirectUri(String oauthRedirectUri) {
            return oauthRedirectUri(Output.of(oauthRedirectUri));
        }

        /**
         * @param oauthRefreshTokenValidity Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshTokenValidity(@Nullable Output<Integer> oauthRefreshTokenValidity) {
            $.oauthRefreshTokenValidity = oauthRefreshTokenValidity;
            return this;
        }

        /**
         * @param oauthRefreshTokenValidity Specifies how long refresh tokens should be valid (in seconds). OAUTH*ISSUE*REFRESH_TOKENS must be set to TRUE.
         * 
         * @return builder
         * 
         */
        public Builder oauthRefreshTokenValidity(Integer oauthRefreshTokenValidity) {
            return oauthRefreshTokenValidity(Output.of(oauthRefreshTokenValidity));
        }

        /**
         * @param oauthUseSecondaryRoles Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
         * 
         * @return builder
         * 
         */
        public Builder oauthUseSecondaryRoles(@Nullable Output<String> oauthUseSecondaryRoles) {
            $.oauthUseSecondaryRoles = oauthUseSecondaryRoles;
            return this;
        }

        /**
         * @param oauthUseSecondaryRoles Specifies whether default secondary roles set in the user properties are activated by default in the session being opened.
         * 
         * @return builder
         * 
         */
        public Builder oauthUseSecondaryRoles(String oauthUseSecondaryRoles) {
            return oauthUseSecondaryRoles(Output.of(oauthUseSecondaryRoles));
        }

        public OauthIntegrationState build() {
            return $;
        }
    }

}
