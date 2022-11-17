// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserGrantArgs extends com.pulumi.resources.ResourceArgs {

    public static final UserGrantArgs Empty = new UserGrantArgs();

    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    @Import(name="enableMultipleGrants")
    private @Nullable Output<Boolean> enableMultipleGrants;

    /**
     * @return When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    public Optional<Output<Boolean>> enableMultipleGrants() {
        return Optional.ofNullable(this.enableMultipleGrants);
    }

    /**
     * The privilege to grant on the user.
     * 
     */
    @Import(name="privilege", required=true)
    private Output<String> privilege;

    /**
     * @return The privilege to grant on the user.
     * 
     */
    public Output<String> privilege() {
        return this.privilege;
    }

    /**
     * Grants privilege to these roles.
     * 
     */
    @Import(name="roles")
    private @Nullable Output<List<String>> roles;

    /**
     * @return Grants privilege to these roles.
     * 
     */
    public Optional<Output<List<String>>> roles() {
        return Optional.ofNullable(this.roles);
    }

    /**
     * The name of the user on which to grant privileges.
     * 
     */
    @Import(name="userName", required=true)
    private Output<String> userName;

    /**
     * @return The name of the user on which to grant privileges.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    @Import(name="withGrantOption")
    private @Nullable Output<Boolean> withGrantOption;

    /**
     * @return When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    public Optional<Output<Boolean>> withGrantOption() {
        return Optional.ofNullable(this.withGrantOption);
    }

    private UserGrantArgs() {}

    private UserGrantArgs(UserGrantArgs $) {
        this.enableMultipleGrants = $.enableMultipleGrants;
        this.privilege = $.privilege;
        this.roles = $.roles;
        this.userName = $.userName;
        this.withGrantOption = $.withGrantOption;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserGrantArgs $;

        public Builder() {
            $ = new UserGrantArgs();
        }

        public Builder(UserGrantArgs defaults) {
            $ = new UserGrantArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableMultipleGrants When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
         * grants applied to roles and objects outside Terraform.
         * 
         * @return builder
         * 
         */
        public Builder enableMultipleGrants(@Nullable Output<Boolean> enableMultipleGrants) {
            $.enableMultipleGrants = enableMultipleGrants;
            return this;
        }

        /**
         * @param enableMultipleGrants When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
         * grants applied to roles and objects outside Terraform.
         * 
         * @return builder
         * 
         */
        public Builder enableMultipleGrants(Boolean enableMultipleGrants) {
            return enableMultipleGrants(Output.of(enableMultipleGrants));
        }

        /**
         * @param privilege The privilege to grant on the user.
         * 
         * @return builder
         * 
         */
        public Builder privilege(Output<String> privilege) {
            $.privilege = privilege;
            return this;
        }

        /**
         * @param privilege The privilege to grant on the user.
         * 
         * @return builder
         * 
         */
        public Builder privilege(String privilege) {
            return privilege(Output.of(privilege));
        }

        /**
         * @param roles Grants privilege to these roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(@Nullable Output<List<String>> roles) {
            $.roles = roles;
            return this;
        }

        /**
         * @param roles Grants privilege to these roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(List<String> roles) {
            return roles(Output.of(roles));
        }

        /**
         * @param roles Grants privilege to these roles.
         * 
         * @return builder
         * 
         */
        public Builder roles(String... roles) {
            return roles(List.of(roles));
        }

        /**
         * @param userName The name of the user on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder userName(Output<String> userName) {
            $.userName = userName;
            return this;
        }

        /**
         * @param userName The name of the user on which to grant privileges.
         * 
         * @return builder
         * 
         */
        public Builder userName(String userName) {
            return userName(Output.of(userName));
        }

        /**
         * @param withGrantOption When this is set to true, allows the recipient role to grant the privileges to other roles.
         * 
         * @return builder
         * 
         */
        public Builder withGrantOption(@Nullable Output<Boolean> withGrantOption) {
            $.withGrantOption = withGrantOption;
            return this;
        }

        /**
         * @param withGrantOption When this is set to true, allows the recipient role to grant the privileges to other roles.
         * 
         * @return builder
         * 
         */
        public Builder withGrantOption(Boolean withGrantOption) {
            return withGrantOption(Output.of(withGrantOption));
        }

        public UserGrantArgs build() {
            $.privilege = Objects.requireNonNull($.privilege, "expected parameter 'privilege' to be non-null");
            $.userName = Objects.requireNonNull($.userName, "expected parameter 'userName' to be non-null");
            return $;
        }
    }

}