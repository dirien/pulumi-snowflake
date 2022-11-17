// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetUsersUser;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetUsersResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Users pattern for which to return metadata. Please refer to LIKE keyword from snowflake documentation : https://docs.snowflake.com/en/sql-reference/sql/show-users.html#parameters
     * 
     */
    private String pattern;
    /**
     * @return The users in the database
     * 
     */
    private List<GetUsersUser> users;

    private GetUsersResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Users pattern for which to return metadata. Please refer to LIKE keyword from snowflake documentation : https://docs.snowflake.com/en/sql-reference/sql/show-users.html#parameters
     * 
     */
    public String pattern() {
        return this.pattern;
    }
    /**
     * @return The users in the database
     * 
     */
    public List<GetUsersUser> users() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUsersResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private String pattern;
        private List<GetUsersUser> users;
        public Builder() {}
        public Builder(GetUsersResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.pattern = defaults.pattern;
    	      this.users = defaults.users;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder pattern(String pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }
        @CustomType.Setter
        public Builder users(List<GetUsersUser> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public Builder users(GetUsersUser... users) {
            return users(List.of(users));
        }
        public GetUsersResult build() {
            final var o = new GetUsersResult();
            o.id = id;
            o.pattern = pattern;
            o.users = users;
            return o;
        }
    }
}
