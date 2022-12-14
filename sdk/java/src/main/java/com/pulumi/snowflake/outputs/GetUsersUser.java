// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUsersUser {
    private String comment;
    private String defaultNamespace;
    private String defaultRole;
    private List<String> defaultSecondaryRoles;
    private String defaultWarehouse;
    private Boolean disabled;
    private String displayName;
    private String email;
    private String firstName;
    private Boolean hasRsaPublicKey;
    private String lastName;
    private String loginName;
    private String name;

    private GetUsersUser() {}
    public String comment() {
        return this.comment;
    }
    public String defaultNamespace() {
        return this.defaultNamespace;
    }
    public String defaultRole() {
        return this.defaultRole;
    }
    public List<String> defaultSecondaryRoles() {
        return this.defaultSecondaryRoles;
    }
    public String defaultWarehouse() {
        return this.defaultWarehouse;
    }
    public Boolean disabled() {
        return this.disabled;
    }
    public String displayName() {
        return this.displayName;
    }
    public String email() {
        return this.email;
    }
    public String firstName() {
        return this.firstName;
    }
    public Boolean hasRsaPublicKey() {
        return this.hasRsaPublicKey;
    }
    public String lastName() {
        return this.lastName;
    }
    public String loginName() {
        return this.loginName;
    }
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersUser defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String comment;
        private String defaultNamespace;
        private String defaultRole;
        private List<String> defaultSecondaryRoles;
        private String defaultWarehouse;
        private Boolean disabled;
        private String displayName;
        private String email;
        private String firstName;
        private Boolean hasRsaPublicKey;
        private String lastName;
        private String loginName;
        private String name;
        public Builder() {}
        public Builder(GetUsersUser defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.defaultNamespace = defaults.defaultNamespace;
    	      this.defaultRole = defaults.defaultRole;
    	      this.defaultSecondaryRoles = defaults.defaultSecondaryRoles;
    	      this.defaultWarehouse = defaults.defaultWarehouse;
    	      this.disabled = defaults.disabled;
    	      this.displayName = defaults.displayName;
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.hasRsaPublicKey = defaults.hasRsaPublicKey;
    	      this.lastName = defaults.lastName;
    	      this.loginName = defaults.loginName;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder comment(String comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }
        @CustomType.Setter
        public Builder defaultNamespace(String defaultNamespace) {
            this.defaultNamespace = Objects.requireNonNull(defaultNamespace);
            return this;
        }
        @CustomType.Setter
        public Builder defaultRole(String defaultRole) {
            this.defaultRole = Objects.requireNonNull(defaultRole);
            return this;
        }
        @CustomType.Setter
        public Builder defaultSecondaryRoles(List<String> defaultSecondaryRoles) {
            this.defaultSecondaryRoles = Objects.requireNonNull(defaultSecondaryRoles);
            return this;
        }
        public Builder defaultSecondaryRoles(String... defaultSecondaryRoles) {
            return defaultSecondaryRoles(List.of(defaultSecondaryRoles));
        }
        @CustomType.Setter
        public Builder defaultWarehouse(String defaultWarehouse) {
            this.defaultWarehouse = Objects.requireNonNull(defaultWarehouse);
            return this;
        }
        @CustomType.Setter
        public Builder disabled(Boolean disabled) {
            this.disabled = Objects.requireNonNull(disabled);
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder firstName(String firstName) {
            this.firstName = Objects.requireNonNull(firstName);
            return this;
        }
        @CustomType.Setter
        public Builder hasRsaPublicKey(Boolean hasRsaPublicKey) {
            this.hasRsaPublicKey = Objects.requireNonNull(hasRsaPublicKey);
            return this;
        }
        @CustomType.Setter
        public Builder lastName(String lastName) {
            this.lastName = Objects.requireNonNull(lastName);
            return this;
        }
        @CustomType.Setter
        public Builder loginName(String loginName) {
            this.loginName = Objects.requireNonNull(loginName);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetUsersUser build() {
            final var o = new GetUsersUser();
            o.comment = comment;
            o.defaultNamespace = defaultNamespace;
            o.defaultRole = defaultRole;
            o.defaultSecondaryRoles = defaultSecondaryRoles;
            o.defaultWarehouse = defaultWarehouse;
            o.disabled = disabled;
            o.displayName = displayName;
            o.email = email;
            o.firstName = firstName;
            o.hasRsaPublicKey = hasRsaPublicKey;
            o.lastName = lastName;
            o.loginName = loginName;
            o.name = name;
            return o;
        }
    }
}
