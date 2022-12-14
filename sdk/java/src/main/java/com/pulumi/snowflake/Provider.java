// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.ProviderArgs;
import com.pulumi.snowflake.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * The provider type for the snowflake package. By default, resources use package-wide configuration
 * settings, however an explicit `Provider` instance may be created and passed during resource
 * construction to achieve fine-grained programmatic control over provider settings. See the
 * [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
 * 
 */
@ResourceType(type="pulumi:providers:snowflake")
public class Provider extends com.pulumi.resources.ProviderResource {
    /**
     * The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable.
     * 
     */
    @Export(name="account", refs={String.class}, tree="[0]")
    private Output<String> account;

    /**
     * @return The name of the Snowflake account. Can also come from the `SNOWFLAKE_ACCOUNT` environment variable.
     * 
     */
    public Output<String> account() {
        return this.account;
    }
    /**
     * Supports passing in a custom host value to the snowflake go driver for use with privatelink.
     * 
     */
    @Export(name="host", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> host;

    /**
     * @return Supports passing in a custom host value to the snowflake go driver for use with privatelink.
     * 
     */
    public Output<Optional<String>> host() {
        return Codegen.optional(this.host);
    }
    /**
     * Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
     * variable.
     * 
     */
    @Export(name="oauthAccessToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthAccessToken;

    /**
     * @return Token for use with OAuth. Generating the token is left to other tools. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_refresh_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_ACCESS_TOKEN` environment
     * variable.
     * 
     */
    public Output<Optional<String>> oauthAccessToken() {
        return Codegen.optional(this.oauthAccessToken);
    }
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
     * 
     */
    @Export(name="oauthClientId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthClientId;

    /**
     * @return Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_ID` environment variable.
     * 
     */
    public Output<Optional<String>> oauthClientId() {
        return Codegen.optional(this.oauthClientId);
    }
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
     * 
     */
    @Export(name="oauthClientSecret", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthClientSecret;

    /**
     * @return Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_CLIENT_SECRET` environment variable.
     * 
     */
    public Output<Optional<String>> oauthClientSecret() {
        return Codegen.optional(this.oauthClientSecret);
    }
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
     * 
     */
    @Export(name="oauthEndpoint", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthEndpoint;

    /**
     * @return Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_ENDPOINT` environment variable.
     * 
     */
    public Output<Optional<String>> oauthEndpoint() {
        return Codegen.optional(this.oauthEndpoint);
    }
    /**
     * Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
     * 
     */
    @Export(name="oauthRedirectUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthRedirectUrl;

    /**
     * @return Required when `oauth_refresh_token` is used. Can be sourced from `SNOWFLAKE_OAUTH_REDIRECT_URL` environment variable.
     * 
     */
    public Output<Optional<String>> oauthRedirectUrl() {
        return Codegen.optional(this.oauthRedirectUrl);
    }
    /**
     * Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
     * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
     * variable.
     * 
     */
    @Export(name="oauthRefreshToken", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> oauthRefreshToken;

    /**
     * @return Token for use with OAuth. Setup and generation of the token is left to other tools. Should be used in conjunction with
     * `oauth_client_id`, `oauth_client_secret`, `oauth_endpoint`, `oauth_redirect_url`. Cannot be used with `browser_auth`,
     * `private_key_path`, `oauth_access_token` or `password`. Can be sourced from `SNOWFLAKE_OAUTH_REFRESH_TOKEN` environment
     * variable.
     * 
     */
    public Output<Optional<String>> oauthRefreshToken() {
        return Codegen.optional(this.oauthRefreshToken);
    }
    /**
     * Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be source from
     * `SNOWFLAKE_PASSWORD` environment variable.
     * 
     */
    @Export(name="password", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> password;

    /**
     * @return Password for username+password auth. Cannot be used with `browser_auth` or `private_key_path`. Can be source from
     * `SNOWFLAKE_PASSWORD` environment variable.
     * 
     */
    public Output<Optional<String>> password() {
        return Codegen.optional(this.password);
    }
    /**
     * Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be source from
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     * 
     */
    @Export(name="privateKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateKey;

    /**
     * @return Private Key for username+private-key auth. Cannot be used with `browser_auth` or `password`. Can be source from
     * `SNOWFLAKE_PRIVATE_KEY` environment variable.
     * 
     */
    public Output<Optional<String>> privateKey() {
        return Codegen.optional(this.privateKey);
    }
    /**
     * Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc
     * 
     */
    @Export(name="privateKeyPassphrase", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateKeyPassphrase;

    /**
     * @return Supports the encryption ciphers aes-128-cbc, aes-128-gcm, aes-192-cbc, aes-192-gcm, aes-256-cbc, aes-256-gcm, and
     * des-ede3-cbc
     * 
     */
    public Output<Optional<String>> privateKeyPassphrase() {
        return Codegen.optional(this.privateKeyPassphrase);
    }
    /**
     * Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
     * `password`. Can be source from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
     * 
     */
    @Export(name="privateKeyPath", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privateKeyPath;

    /**
     * @return Path to a private key for using keypair authentication. Cannot be used with `browser_auth`, `oauth_access_token` or
     * `password`. Can be source from `SNOWFLAKE_PRIVATE_KEY_PATH` environment variable.
     * 
     */
    public Output<Optional<String>> privateKeyPath() {
        return Codegen.optional(this.privateKeyPath);
    }
    /**
     * Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
     * 
     */
    @Export(name="protocol", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> protocol;

    /**
     * @return Support custom protocols to snowflake go driver. Can be sourced from `SNOWFLAKE_PROTOCOL` environment variable.
     * 
     */
    public Output<Optional<String>> protocol() {
        return Codegen.optional(this.protocol);
    }
    /**
     * [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Can be source from the
     * `SNOWFLAKE_REGION` environment variable.
     * 
     */
    @Export(name="region", refs={String.class}, tree="[0]")
    private Output<String> region;

    /**
     * @return [Snowflake region](https://docs.snowflake.com/en/user-guide/intro-regions.html) to use. Can be source from the
     * `SNOWFLAKE_REGION` environment variable.
     * 
     */
    public Output<String> region() {
        return this.region;
    }
    /**
     * Snowflake role to use for operations. If left unset, default role for user will be used. Can come from the
     * `SNOWFLAKE_ROLE` environment variable.
     * 
     */
    @Export(name="role", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> role;

    /**
     * @return Snowflake role to use for operations. If left unset, default role for user will be used. Can come from the
     * `SNOWFLAKE_ROLE` environment variable.
     * 
     */
    public Output<Optional<String>> role() {
        return Codegen.optional(this.role);
    }
    /**
     * Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable.
     * 
     */
    @Export(name="username", refs={String.class}, tree="[0]")
    private Output<String> username;

    /**
     * @return Username for username+password authentication. Can come from the `SNOWFLAKE_USER` environment variable.
     * 
     */
    public Output<String> username() {
        return this.username;
    }
    /**
     * Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
     * 
     */
    @Export(name="warehouse", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> warehouse;

    /**
     * @return Sets the default warehouse. Optional. Can be sourced from SNOWFLAKE_WAREHOUSE environment variable.
     * 
     */
    public Output<Optional<String>> warehouse() {
        return Codegen.optional(this.warehouse);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Provider(String name) {
        this(name, ProviderArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Provider(String name, ProviderArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Provider(String name, ProviderArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake", name, args == null ? ProviderArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "oauthAccessToken",
                "oauthClientId",
                "oauthClientSecret",
                "oauthEndpoint",
                "oauthRedirectUrl",
                "oauthRefreshToken",
                "password",
                "privateKey",
                "privateKeyPassphrase",
                "privateKeyPath"
            ))
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

}
