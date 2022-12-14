// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TablePrimaryKey {
    /**
     * @return Columns to use in primary key
     * 
     */
    private List<String> keys;
    /**
     * @return Name of constraint
     * 
     */
    private @Nullable String name;

    private TablePrimaryKey() {}
    /**
     * @return Columns to use in primary key
     * 
     */
    public List<String> keys() {
        return this.keys;
    }
    /**
     * @return Name of constraint
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TablePrimaryKey defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> keys;
        private @Nullable String name;
        public Builder() {}
        public Builder(TablePrimaryKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keys = defaults.keys;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder keys(List<String> keys) {
            this.keys = Objects.requireNonNull(keys);
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public TablePrimaryKey build() {
            final var o = new TablePrimaryKey();
            o.keys = keys;
            o.name = name;
            return o;
        }
    }
}
