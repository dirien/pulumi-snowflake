// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourceMonitorsResourceMonitor {
    private String comment;
    private String creditQuota;
    private String frequency;
    private String name;

    private GetResourceMonitorsResourceMonitor() {}
    public String comment() {
        return this.comment;
    }
    public String creditQuota() {
        return this.creditQuota;
    }
    public String frequency() {
        return this.frequency;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceMonitorsResourceMonitor defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String creditQuota;
        private String frequency;
        private String name;
        public Builder() {}
        public Builder(GetResourceMonitorsResourceMonitor defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.creditQuota = defaults.creditQuota;
    	      this.frequency = defaults.frequency;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder creditQuota(String creditQuota) {
            this.creditQuota = Objects.requireNonNull(creditQuota);
            return this;
        }
        @CustomType.Setter
        public Builder frequency(String frequency) {
            this.frequency = Objects.requireNonNull(frequency);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetResourceMonitorsResourceMonitor build() {
            final var o = new GetResourceMonitorsResourceMonitor();
            o.comment = comment;
            o.creditQuota = creditQuota;
            o.frequency = frequency;
            o.name = name;
            return o;
        }
    }
}
