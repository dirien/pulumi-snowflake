// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSystemGetPrivatelinkConfigResult {
    /**
     * @return The name of your Snowflake account.
     * 
     */
    private String accountName;
    /**
     * @return The URL used to connect to Snowflake through AWS PrivateLink or Azure Private Link.
     * 
     */
    private String accountUrl;
    /**
     * @return The AWS VPCE ID for your account.
     * 
     */
    private String awsVpceId;
    /**
     * @return The Azure Private Link Service ID for your account.
     * 
     */
    private String azurePlsId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The OCSP URL corresponding to your Snowflake account that uses AWS PrivateLink or Azure Private Link.
     * 
     */
    private String ocspUrl;

    private GetSystemGetPrivatelinkConfigResult() {}
    /**
     * @return The name of your Snowflake account.
     * 
     */
    public String accountName() {
        return this.accountName;
    }
    /**
     * @return The URL used to connect to Snowflake through AWS PrivateLink or Azure Private Link.
     * 
     */
    public String accountUrl() {
        return this.accountUrl;
    }
    /**
     * @return The AWS VPCE ID for your account.
     * 
     */
    public String awsVpceId() {
        return this.awsVpceId;
    }
    /**
     * @return The Azure Private Link Service ID for your account.
     * 
     */
    public String azurePlsId() {
        return this.azurePlsId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The OCSP URL corresponding to your Snowflake account that uses AWS PrivateLink or Azure Private Link.
     * 
     */
    public String ocspUrl() {
        return this.ocspUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemGetPrivatelinkConfigResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountName;
        private String accountUrl;
        private String awsVpceId;
        private String azurePlsId;
        private String id;
        private String ocspUrl;
        public Builder() {}
        public Builder(GetSystemGetPrivatelinkConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.accountUrl = defaults.accountUrl;
    	      this.awsVpceId = defaults.awsVpceId;
    	      this.azurePlsId = defaults.azurePlsId;
    	      this.id = defaults.id;
    	      this.ocspUrl = defaults.ocspUrl;
        }

        @CustomType.Setter
        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        @CustomType.Setter
        public Builder accountUrl(String accountUrl) {
            this.accountUrl = Objects.requireNonNull(accountUrl);
            return this;
        }
        @CustomType.Setter
        public Builder awsVpceId(String awsVpceId) {
            this.awsVpceId = Objects.requireNonNull(awsVpceId);
            return this;
        }
        @CustomType.Setter
        public Builder azurePlsId(String azurePlsId) {
            this.azurePlsId = Objects.requireNonNull(azurePlsId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder ocspUrl(String ocspUrl) {
            this.ocspUrl = Objects.requireNonNull(ocspUrl);
            return this;
        }
        public GetSystemGetPrivatelinkConfigResult build() {
            final var o = new GetSystemGetPrivatelinkConfigResult();
            o.accountName = accountName;
            o.accountUrl = accountUrl;
            o.awsVpceId = awsVpceId;
            o.azurePlsId = azurePlsId;
            o.id = id;
            o.ocspUrl = ocspUrl;
            return o;
        }
    }
}
