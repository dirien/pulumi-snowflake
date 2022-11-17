// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ExternalTableColumn {
    /**
     * @return String that specifies the expression for the column. When queried, the column returns results derived from this expression.
     * 
     */
    private String as;
    /**
     * @return Column name
     * 
     */
    private String name;
    /**
     * @return Column type, e.g. VARIANT
     * 
     */
    private String type;

    private ExternalTableColumn() {}
    /**
     * @return String that specifies the expression for the column. When queried, the column returns results derived from this expression.
     * 
     */
    public String as() {
        return this.as;
    }
    /**
     * @return Column name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Column type, e.g. VARIANT
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExternalTableColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String as;
        private String name;
        private String type;
        public Builder() {}
        public Builder(ExternalTableColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.as = defaults.as;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder as(String as) {
            this.as = Objects.requireNonNull(as);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ExternalTableColumn build() {
            final var o = new ExternalTableColumn();
            o.as = as;
            o.name = name;
            o.type = type;
            return o;
        }
    }
}