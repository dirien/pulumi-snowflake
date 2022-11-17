// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetPipesPipe {
    private String comment;
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    private String database;
    private String integration;
    private String name;
    /**
     * @return The schema from which to return the pipes from.
     * 
     */
    private String schema;

    private GetPipesPipe() {}
    public String comment() {
        return this.comment;
    }
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public String database() {
        return this.database;
    }
    public String integration() {
        return this.integration;
    }
    public String name() {
        return this.name;
    }
    /**
     * @return The schema from which to return the pipes from.
     * 
     */
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipesPipe defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String database;
        private String integration;
        private String name;
        private String schema;
        public Builder() {}
        public Builder(GetPipesPipe defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.database = defaults.database;
    	      this.integration = defaults.integration;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        @CustomType.Setter
        public Builder integration(String integration) {
            this.integration = Objects.requireNonNull(integration);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public GetPipesPipe build() {
            final var o = new GetPipesPipe();
            o.comment = comment;
            o.database = database;
            o.integration = integration;
            o.name = name;
            o.schema = schema;
            return o;
        }
    }
}