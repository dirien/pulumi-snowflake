// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScimIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScimIntegrationArgs Empty = new ScimIntegrationArgs();

    /**
     * Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
     * 
     */
    @Import(name="networkPolicy")
    private @Nullable Output<String> networkPolicy;

    /**
     * @return Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
     * 
     */
    public Optional<Output<String>> networkPolicy() {
        return Optional.ofNullable(this.networkPolicy);
    }

    /**
     * Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
     * 
     */
    @Import(name="provisionerRole", required=true)
    private Output<String> provisionerRole;

    /**
     * @return Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
     * 
     */
    public Output<String> provisionerRole() {
        return this.provisionerRole;
    }

    /**
     * Specifies the client type for the scim integration
     * 
     */
    @Import(name="scimClient", required=true)
    private Output<String> scimClient;

    /**
     * @return Specifies the client type for the scim integration
     * 
     */
    public Output<String> scimClient() {
        return this.scimClient;
    }

    private ScimIntegrationArgs() {}

    private ScimIntegrationArgs(ScimIntegrationArgs $) {
        this.name = $.name;
        this.networkPolicy = $.networkPolicy;
        this.provisionerRole = $.provisionerRole;
        this.scimClient = $.scimClient;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScimIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScimIntegrationArgs $;

        public Builder() {
            $ = new ScimIntegrationArgs();
        }

        public Builder(ScimIntegrationArgs defaults) {
            $ = new ScimIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the SCIM integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param networkPolicy Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicy(@Nullable Output<String> networkPolicy) {
            $.networkPolicy = networkPolicy;
            return this;
        }

        /**
         * @param networkPolicy Specifies an existing network policy active for your account. The network policy restricts the list of user IP addresses when exchanging an authorization code for an access or refresh token and when using a refresh token to obtain a new access token. If this parameter is not set, the network policy for the account (if any) is used instead.
         * 
         * @return builder
         * 
         */
        public Builder networkPolicy(String networkPolicy) {
            return networkPolicy(Output.of(networkPolicy));
        }

        /**
         * @param provisionerRole Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
         * 
         * @return builder
         * 
         */
        public Builder provisionerRole(Output<String> provisionerRole) {
            $.provisionerRole = provisionerRole;
            return this;
        }

        /**
         * @param provisionerRole Specify the SCIM role in Snowflake that owns any users and roles that are imported from the identity provider into Snowflake using SCIM.
         * 
         * @return builder
         * 
         */
        public Builder provisionerRole(String provisionerRole) {
            return provisionerRole(Output.of(provisionerRole));
        }

        /**
         * @param scimClient Specifies the client type for the scim integration
         * 
         * @return builder
         * 
         */
        public Builder scimClient(Output<String> scimClient) {
            $.scimClient = scimClient;
            return this;
        }

        /**
         * @param scimClient Specifies the client type for the scim integration
         * 
         * @return builder
         * 
         */
        public Builder scimClient(String scimClient) {
            return scimClient(Output.of(scimClient));
        }

        public ScimIntegrationArgs build() {
            $.provisionerRole = Objects.requireNonNull($.provisionerRole, "expected parameter 'provisionerRole' to be non-null");
            $.scimClient = Objects.requireNonNull($.scimClient, "expected parameter 'scimClient' to be non-null");
            return $;
        }
    }

}
