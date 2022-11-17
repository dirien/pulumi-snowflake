// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TableColumnDefault {
    private @Nullable String constant;
    private @Nullable String expression;
    private @Nullable String sequence;

    private TableColumnDefault() {}
    public Optional<String> constant() {
        return Optional.ofNullable(this.constant);
    }
    public Optional<String> expression() {
        return Optional.ofNullable(this.expression);
    }
    public Optional<String> sequence() {
        return Optional.ofNullable(this.sequence);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableColumnDefault defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String constant;
        private @Nullable String expression;
        private @Nullable String sequence;
        public Builder() {}
        public Builder(TableColumnDefault defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.constant = defaults.constant;
    	      this.expression = defaults.expression;
    	      this.sequence = defaults.sequence;
        }

        @CustomType.Setter
        public Builder constant(@Nullable String constant) {
            this.constant = constant;
            return this;
        }
        @CustomType.Setter
        public Builder expression(@Nullable String expression) {
            this.expression = expression;
            return this;
        }
        @CustomType.Setter
        public Builder sequence(@Nullable String sequence) {
            this.sequence = sequence;
            return this;
        }
        public TableColumnDefault build() {
            final var o = new TableColumnDefault();
            o.constant = constant;
            o.expression = expression;
            o.sequence = sequence;
            return o;
        }
    }
}
