// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FailoverGroupReplicationScheduleCron {
    private String expression;
    private String timeZone;

    private FailoverGroupReplicationScheduleCron() {}
    public String expression() {
        return this.expression;
    }
    public String timeZone() {
        return this.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FailoverGroupReplicationScheduleCron defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String expression;
        private String timeZone;
        public Builder() {}
        public Builder(FailoverGroupReplicationScheduleCron defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.timeZone = defaults.timeZone;
        }

        @CustomType.Setter
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }
        @CustomType.Setter
        public Builder timeZone(String timeZone) {
            this.timeZone = Objects.requireNonNull(timeZone);
            return this;
        }
        public FailoverGroupReplicationScheduleCron build() {
            final var o = new FailoverGroupReplicationScheduleCron();
            o.expression = expression;
            o.timeZone = timeZone;
            return o;
        }
    }
}