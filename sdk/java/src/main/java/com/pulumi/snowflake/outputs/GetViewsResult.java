// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetViewsView;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetViewsResult {
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
     * @return The schema from which to return the views from.
     * 
     */
    private String schema;
    /**
     * @return The views in the schema
     * 
     */
    private List<GetViewsView> views;

    private GetViewsResult() {}
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
     * @return The schema from which to return the views from.
     * 
     */
    public String schema() {
        return this.schema;
    }
    /**
     * @return The views in the schema
     * 
     */
    public List<GetViewsView> views() {
        return this.views;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetViewsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String database;
        private String id;
        private String schema;
        private List<GetViewsView> views;
        public Builder() {}
        public Builder(GetViewsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.id = defaults.id;
    	      this.schema = defaults.schema;
    	      this.views = defaults.views;
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
        public Builder schema(String schema) {
            this.schema = Objects.requireNonNull(schema);
            return this;
        }
        @CustomType.Setter
        public Builder views(List<GetViewsView> views) {
            this.views = Objects.requireNonNull(views);
            return this;
        }
        public Builder views(GetViewsView... views) {
            return views(List.of(views));
        }
        public GetViewsResult build() {
            final var o = new GetViewsResult();
            o.database = database;
            o.id = id;
            o.schema = schema;
            o.views = views;
            return o;
        }
    }
}
