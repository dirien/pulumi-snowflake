// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiIntegrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApiIntegrationArgs Empty = new ApiIntegrationArgs();

    /**
     * Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
     * 
     */
    @Import(name="apiAllowedPrefixes", required=true)
    private Output<List<String>> apiAllowedPrefixes;

    /**
     * @return Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
     * 
     */
    public Output<List<String>> apiAllowedPrefixes() {
        return this.apiAllowedPrefixes;
    }

    /**
     * ARN of a cloud platform role.
     * 
     */
    @Import(name="apiAwsRoleArn")
    private @Nullable Output<String> apiAwsRoleArn;

    /**
     * @return ARN of a cloud platform role.
     * 
     */
    public Optional<Output<String>> apiAwsRoleArn() {
        return Optional.ofNullable(this.apiAwsRoleArn);
    }

    /**
     * Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
     * 
     */
    @Import(name="apiBlockedPrefixes")
    private @Nullable Output<List<String>> apiBlockedPrefixes;

    /**
     * @return Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
     * 
     */
    public Optional<Output<List<String>>> apiBlockedPrefixes() {
        return Optional.ofNullable(this.apiBlockedPrefixes);
    }

    /**
     * Specifies the HTTPS proxy service type.
     * 
     */
    @Import(name="apiProvider", required=true)
    private Output<String> apiProvider;

    /**
     * @return Specifies the HTTPS proxy service type.
     * 
     */
    public Output<String> apiProvider() {
        return this.apiProvider;
    }

    /**
     * The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
     * 
     */
    @Import(name="azureAdApplicationId")
    private @Nullable Output<String> azureAdApplicationId;

    /**
     * @return The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
     * 
     */
    public Optional<Output<String>> azureAdApplicationId() {
        return Optional.ofNullable(this.azureAdApplicationId);
    }

    /**
     * Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
     * 
     */
    @Import(name="azureTenantId")
    private @Nullable Output<String> azureTenantId;

    /**
     * @return Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
     * 
     */
    public Optional<Output<String>> azureTenantId() {
        return Optional.ofNullable(this.azureTenantId);
    }

    /**
     * Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    private ApiIntegrationArgs() {}

    private ApiIntegrationArgs(ApiIntegrationArgs $) {
        this.apiAllowedPrefixes = $.apiAllowedPrefixes;
        this.apiAwsRoleArn = $.apiAwsRoleArn;
        this.apiBlockedPrefixes = $.apiBlockedPrefixes;
        this.apiProvider = $.apiProvider;
        this.azureAdApplicationId = $.azureAdApplicationId;
        this.azureTenantId = $.azureTenantId;
        this.enabled = $.enabled;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApiIntegrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiIntegrationArgs $;

        public Builder() {
            $ = new ApiIntegrationArgs();
        }

        public Builder(ApiIntegrationArgs defaults) {
            $ = new ApiIntegrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiAllowedPrefixes Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
         * 
         * @return builder
         * 
         */
        public Builder apiAllowedPrefixes(Output<List<String>> apiAllowedPrefixes) {
            $.apiAllowedPrefixes = apiAllowedPrefixes;
            return this;
        }

        /**
         * @param apiAllowedPrefixes Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
         * 
         * @return builder
         * 
         */
        public Builder apiAllowedPrefixes(List<String> apiAllowedPrefixes) {
            return apiAllowedPrefixes(Output.of(apiAllowedPrefixes));
        }

        /**
         * @param apiAllowedPrefixes Explicitly limits external functions that use the integration to reference one or more HTTPS proxy service endpoints and resources within those proxies.
         * 
         * @return builder
         * 
         */
        public Builder apiAllowedPrefixes(String... apiAllowedPrefixes) {
            return apiAllowedPrefixes(List.of(apiAllowedPrefixes));
        }

        /**
         * @param apiAwsRoleArn ARN of a cloud platform role.
         * 
         * @return builder
         * 
         */
        public Builder apiAwsRoleArn(@Nullable Output<String> apiAwsRoleArn) {
            $.apiAwsRoleArn = apiAwsRoleArn;
            return this;
        }

        /**
         * @param apiAwsRoleArn ARN of a cloud platform role.
         * 
         * @return builder
         * 
         */
        public Builder apiAwsRoleArn(String apiAwsRoleArn) {
            return apiAwsRoleArn(Output.of(apiAwsRoleArn));
        }

        /**
         * @param apiBlockedPrefixes Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder apiBlockedPrefixes(@Nullable Output<List<String>> apiBlockedPrefixes) {
            $.apiBlockedPrefixes = apiBlockedPrefixes;
            return this;
        }

        /**
         * @param apiBlockedPrefixes Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder apiBlockedPrefixes(List<String> apiBlockedPrefixes) {
            return apiBlockedPrefixes(Output.of(apiBlockedPrefixes));
        }

        /**
         * @param apiBlockedPrefixes Lists the endpoints and resources in the HTTPS proxy service that are not allowed to be called from Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder apiBlockedPrefixes(String... apiBlockedPrefixes) {
            return apiBlockedPrefixes(List.of(apiBlockedPrefixes));
        }

        /**
         * @param apiProvider Specifies the HTTPS proxy service type.
         * 
         * @return builder
         * 
         */
        public Builder apiProvider(Output<String> apiProvider) {
            $.apiProvider = apiProvider;
            return this;
        }

        /**
         * @param apiProvider Specifies the HTTPS proxy service type.
         * 
         * @return builder
         * 
         */
        public Builder apiProvider(String apiProvider) {
            return apiProvider(Output.of(apiProvider));
        }

        /**
         * @param azureAdApplicationId The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
         * 
         * @return builder
         * 
         */
        public Builder azureAdApplicationId(@Nullable Output<String> azureAdApplicationId) {
            $.azureAdApplicationId = azureAdApplicationId;
            return this;
        }

        /**
         * @param azureAdApplicationId The &#39;Application (client) id&#39; of the Azure AD app for your remote service.
         * 
         * @return builder
         * 
         */
        public Builder azureAdApplicationId(String azureAdApplicationId) {
            return azureAdApplicationId(Output.of(azureAdApplicationId));
        }

        /**
         * @param azureTenantId Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
         * 
         * @return builder
         * 
         */
        public Builder azureTenantId(@Nullable Output<String> azureTenantId) {
            $.azureTenantId = azureTenantId;
            return this;
        }

        /**
         * @param azureTenantId Specifies the ID for your Office 365 tenant that all Azure API Management instances belong to.
         * 
         * @return builder
         * 
         */
        public Builder azureTenantId(String azureTenantId) {
            return azureTenantId(Output.of(azureTenantId));
        }

        /**
         * @param enabled Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether this API integration is enabled or disabled. If the API integration is disabled, any external function that relies on it will not work.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the API integration. This name follows the rules for Object Identifiers. The name should be unique among api integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public ApiIntegrationArgs build() {
            $.apiAllowedPrefixes = Objects.requireNonNull($.apiAllowedPrefixes, "expected parameter 'apiAllowedPrefixes' to be non-null");
            $.apiProvider = Objects.requireNonNull($.apiProvider, "expected parameter 'apiProvider' to be non-null");
            return $;
        }
    }

}
