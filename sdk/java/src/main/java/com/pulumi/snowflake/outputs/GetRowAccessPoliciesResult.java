// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetRowAccessPoliciesRowAccessPolicy;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRowAccessPoliciesResult {
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    private String database;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The row access policy in the schema
     * 
     */
    private List<GetRowAccessPoliciesRowAccessPolicy> rowAccessPolicies;
    /**
     * @return The schema from which to return the row access policyfrom.
     * 
     */
    private String schema;

    private GetRowAccessPoliciesResult() {}
    /**
     * @return The database from which to return the schemas from.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The row access policy in the schema
     * 
     */
    public List<GetRowAccessPoliciesRowAccessPolicy> rowAccessPolicies() {
        return this.rowAccessPolicies;
    }
    /**
     * @return The schema from which to return the row access policyfrom.
     * 
     */
    public String schema() {
        return this.schema;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRowAccessPoliciesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private String id;
        private List<GetRowAccessPoliciesRowAccessPolicy> rowAccessPolicies;
        private String schema;
        public Builder() {}
        public Builder(GetRowAccessPoliciesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.rowAccessPolicies = defaults.rowAccessPolicies;
    	      this.schema = defaults.schema;
        }

        @CustomType.Setter
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder rowAccessPolicies(List<GetRowAccessPoliciesRowAccessPolicy> rowAccessPolicies) {
            this.rowAccessPolicies = Objects.requireNonNull(rowAccessPolicies);
            return this;
        }
        public Builder rowAccessPolicies(GetRowAccessPoliciesRowAccessPolicy... rowAccessPolicies) {
            return rowAccessPolicies(List.of(rowAccessPolicies));
        }
        @CustomType.Setter
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        public GetRowAccessPoliciesResult build() {
            final var o = new GetRowAccessPoliciesResult();
            o.database = database;
            o.id = id;
            o.rowAccessPolicies = rowAccessPolicies;
            o.schema = schema;
            return o;
        }
    }
}
