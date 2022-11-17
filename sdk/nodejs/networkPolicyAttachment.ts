// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const attach = new snowflake.NetworkPolicyAttachment("attach", {
 *     networkPolicyName: "policy",
 *     setForAccount: false,
 *     users: [
 *         "user1",
 *         "user2",
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment example attachment_policyname
 * ```
 */
export class NetworkPolicyAttachment extends pulumi.CustomResource {
    /**
     * Get an existing NetworkPolicyAttachment resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkPolicyAttachmentState, opts?: pulumi.CustomResourceOptions): NetworkPolicyAttachment {
        return new NetworkPolicyAttachment(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/networkPolicyAttachment:NetworkPolicyAttachment';

    /**
     * Returns true if the given object is an instance of NetworkPolicyAttachment.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkPolicyAttachment {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkPolicyAttachment.__pulumiType;
    }

    /**
     * Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     */
    public readonly networkPolicyName!: pulumi.Output<string>;
    /**
     * Specifies whether the network policy should be applied globally to your Snowflake account<br><br>**Note:** The Snowflake
     * user running `terraform apply` must be on an IP address allowed by the network policy to set that policy globally on the
     * Snowflake account.<br><br>Additionally, a Snowflake account can only have one network policy set globally at any given
     * time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If
     * multiple network policy resources have `set_for_account: true`, the final policy set on the account will be
     * non-deterministic.
     */
    public readonly setForAccount!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies which users the network policy should be attached to
     */
    public readonly users!: pulumi.Output<string[] | undefined>;

    /**
     * Create a NetworkPolicyAttachment resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkPolicyAttachmentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkPolicyAttachmentArgs | NetworkPolicyAttachmentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkPolicyAttachmentState | undefined;
            resourceInputs["networkPolicyName"] = state ? state.networkPolicyName : undefined;
            resourceInputs["setForAccount"] = state ? state.setForAccount : undefined;
            resourceInputs["users"] = state ? state.users : undefined;
        } else {
            const args = argsOrState as NetworkPolicyAttachmentArgs | undefined;
            if ((!args || args.networkPolicyName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'networkPolicyName'");
            }
            resourceInputs["networkPolicyName"] = args ? args.networkPolicyName : undefined;
            resourceInputs["setForAccount"] = args ? args.setForAccount : undefined;
            resourceInputs["users"] = args ? args.users : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkPolicyAttachment.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkPolicyAttachment resources.
 */
export interface NetworkPolicyAttachmentState {
    /**
     * Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     */
    networkPolicyName?: pulumi.Input<string>;
    /**
     * Specifies whether the network policy should be applied globally to your Snowflake account<br><br>**Note:** The Snowflake
     * user running `terraform apply` must be on an IP address allowed by the network policy to set that policy globally on the
     * Snowflake account.<br><br>Additionally, a Snowflake account can only have one network policy set globally at any given
     * time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If
     * multiple network policy resources have `set_for_account: true`, the final policy set on the account will be
     * non-deterministic.
     */
    setForAccount?: pulumi.Input<boolean>;
    /**
     * Specifies which users the network policy should be attached to
     */
    users?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a NetworkPolicyAttachment resource.
 */
export interface NetworkPolicyAttachmentArgs {
    /**
     * Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     */
    networkPolicyName: pulumi.Input<string>;
    /**
     * Specifies whether the network policy should be applied globally to your Snowflake account<br><br>**Note:** The Snowflake
     * user running `terraform apply` must be on an IP address allowed by the network policy to set that policy globally on the
     * Snowflake account.<br><br>Additionally, a Snowflake account can only have one network policy set globally at any given
     * time. This resource does not enforce one-policy-per-account, it is the user's responsibility to enforce this. If
     * multiple network policy resources have `set_for_account: true`, the final policy set on the account will be
     * non-deterministic.
     */
    setForAccount?: pulumi.Input<boolean>;
    /**
     * Specifies which users the network policy should be attached to
     */
    users?: pulumi.Input<pulumi.Input<string>[]>;
}