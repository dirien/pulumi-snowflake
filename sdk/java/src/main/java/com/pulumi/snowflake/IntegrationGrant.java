// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.snowflake.IntegrationGrantArgs;
import com.pulumi.snowflake.Utilities;
import com.pulumi.snowflake.inputs.IntegrationGrantState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.snowflake.IntegrationGrant;
 * import com.pulumi.snowflake.IntegrationGrantArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var grant = new IntegrationGrant(&#34;grant&#34;, IntegrationGrantArgs.builder()        
 *             .integrationName(&#34;integration&#34;)
 *             .privilege(&#34;USAGE&#34;)
 *             .roles(            
 *                 &#34;role1&#34;,
 *                 &#34;role2&#34;)
 *             .withGrantOption(false)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * format is integration name ||| privilege | true/false for with_grant_option
 * 
 * ```sh
 *  $ pulumi import snowflake:index/integrationGrant:IntegrationGrant example &#39;intName|||USAGE|true&#39;
 * ```
 * 
 */
@ResourceType(type="snowflake:index/integrationGrant:IntegrationGrant")
public class IntegrationGrant extends com.pulumi.resources.CustomResource {
    /**
     * When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    @Export(name="enableMultipleGrants", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableMultipleGrants;

    /**
     * @return When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
     * grants applied to roles and objects outside Terraform.
     * 
     */
    public Output<Optional<Boolean>> enableMultipleGrants() {
        return Codegen.optional(this.enableMultipleGrants);
    }
    /**
     * Identifier for the integration; must be unique for your account.
     * 
     */
    @Export(name="integrationName", refs={String.class}, tree="[0]")
    private Output<String> integrationName;

    /**
     * @return Identifier for the integration; must be unique for your account.
     * 
     */
    public Output<String> integrationName() {
        return this.integrationName;
    }
    /**
     * The privilege to grant on the integration.
     * 
     */
    @Export(name="privilege", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> privilege;

    /**
     * @return The privilege to grant on the integration.
     * 
     */
    public Output<Optional<String>> privilege() {
        return Codegen.optional(this.privilege);
    }
    /**
     * Grants privilege to these roles.
     * 
     */
    @Export(name="roles", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> roles;

    /**
     * @return Grants privilege to these roles.
     * 
     */
    public Output<Optional<List<String>>> roles() {
        return Codegen.optional(this.roles);
    }
    /**
     * When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    @Export(name="withGrantOption", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> withGrantOption;

    /**
     * @return When this is set to true, allows the recipient role to grant the privileges to other roles.
     * 
     */
    public Output<Optional<Boolean>> withGrantOption() {
        return Codegen.optional(this.withGrantOption);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IntegrationGrant(String name) {
        this(name, IntegrationGrantArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IntegrationGrant(String name, IntegrationGrantArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IntegrationGrant(String name, IntegrationGrantArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/integrationGrant:IntegrationGrant", name, args == null ? IntegrationGrantArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IntegrationGrant(String name, Output<String> id, @Nullable IntegrationGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("snowflake:index/integrationGrant:IntegrationGrant", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static IntegrationGrant get(String name, Output<String> id, @Nullable IntegrationGrantState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IntegrationGrant(name, id, state, options);
    }
}
