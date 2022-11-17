// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetDatabasesDatabaseReplicationConfiguration;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetDatabasesDatabase {
    private String comment;
    private String createdOn;
    private Boolean isCurrent;
    private Boolean isDefault;
    private String name;
    private String options;
    private String origin;
    private String owner;
    private List<GetDatabasesDatabaseReplicationConfiguration> replicationConfigurations;
    private Integer retentionTime;

    private GetDatabasesDatabase() {}
    public String comment() {
        return this.comment;
    }
    public String createdOn() {
        return this.createdOn;
    }
    public Boolean isCurrent() {
        return this.isCurrent;
    }
    public Boolean isDefault() {
        return this.isDefault;
    }
    public String name() {
        return this.name;
    }
    public String options() {
        return this.options;
    }
    public String origin() {
        return this.origin;
    }
    public String owner() {
        return this.owner;
    }
    public List<GetDatabasesDatabaseReplicationConfiguration> replicationConfigurations() {
        return this.replicationConfigurations;
    }
    public Integer retentionTime() {
        return this.retentionTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabasesDatabase defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String createdOn;
        private Boolean isCurrent;
        private Boolean isDefault;
        private String name;
        private String options;
        private String origin;
        private String owner;
        private List<GetDatabasesDatabaseReplicationConfiguration> replicationConfigurations;
        private Integer retentionTime;
        public Builder() {}
        public Builder(GetDatabasesDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.createdOn = defaults.createdOn;
    	      this.isCurrent = defaults.isCurrent;
    	      this.isDefault = defaults.isDefault;
    	      this.name = defaults.name;
    	      this.options = defaults.options;
    	      this.origin = defaults.origin;
    	      this.owner = defaults.owner;
    	      this.replicationConfigurations = defaults.replicationConfigurations;
    	      this.retentionTime = defaults.retentionTime;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder createdOn(String createdOn) {
            this.createdOn = Objects.requireNonNull(createdOn);
            return this;
        }
        @CustomType.Setter
        public Builder isCurrent(Boolean isCurrent) {
            this.isCurrent = Objects.requireNonNull(isCurrent);
            return this;
        }
        @CustomType.Setter
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = Objects.requireNonNull(isDefault);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder options(String options) {
            this.options = Objects.requireNonNull(options);
            return this;
        }
        @CustomType.Setter
        public Builder origin(String origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }
        @CustomType.Setter
        public Builder owner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        @CustomType.Setter
        public Builder replicationConfigurations(List<GetDatabasesDatabaseReplicationConfiguration> replicationConfigurations) {
            this.replicationConfigurations = Objects.requireNonNull(replicationConfigurations);
            return this;
        }
        public Builder replicationConfigurations(GetDatabasesDatabaseReplicationConfiguration... replicationConfigurations) {
            return replicationConfigurations(List.of(replicationConfigurations));
        }
        @CustomType.Setter
        public Builder retentionTime(Integer retentionTime) {
            this.retentionTime = Objects.requireNonNull(retentionTime);
            return this;
        }
        public GetDatabasesDatabase build() {
            final var o = new GetDatabasesDatabase();
            o.comment = comment;
            o.createdOn = createdOn;
            o.isCurrent = isCurrent;
            o.isDefault = isDefault;
            o.name = name;
            o.options = options;
            o.origin = origin;
            o.owner = owner;
            o.replicationConfigurations = replicationConfigurations;
            o.retentionTime = retentionTime;
            return o;
        }
    }
}