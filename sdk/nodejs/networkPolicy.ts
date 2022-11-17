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
 * const policy = new snowflake.NetworkPolicy("policy", {
 *     allowedIpLists: ["192.168.0.100/24"],
 *     blockedIpLists: ["192.168.0.101"],
 *     comment: "A policy.",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import snowflake:index/networkPolicy:NetworkPolicy example policyname
 * ```
 */
export class NetworkPolicy extends pulumi.CustomResource {
    /**
     * Get an existing NetworkPolicy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: NetworkPolicyState, opts?: pulumi.CustomResourceOptions): NetworkPolicy {
        return new NetworkPolicy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/networkPolicy:NetworkPolicy';

    /**
     * Returns true if the given object is an instance of NetworkPolicy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is NetworkPolicy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === NetworkPolicy.__pulumiType;
    }

    /**
     * Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account
     */
    public readonly allowedIpLists!: pulumi.Output<string[]>;
    /**
     * Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account\n\n\n\n**Do not** add `0.0.0.0/0` to `blockedIpList`
     */
    public readonly blockedIpLists!: pulumi.Output<string[] | undefined>;
    /**
     * Specifies a comment for the network policy.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a NetworkPolicy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: NetworkPolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: NetworkPolicyArgs | NetworkPolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as NetworkPolicyState | undefined;
            resourceInputs["allowedIpLists"] = state ? state.allowedIpLists : undefined;
            resourceInputs["blockedIpLists"] = state ? state.blockedIpLists : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as NetworkPolicyArgs | undefined;
            if ((!args || args.allowedIpLists === undefined) && !opts.urn) {
                throw new Error("Missing required property 'allowedIpLists'");
            }
            resourceInputs["allowedIpLists"] = args ? args.allowedIpLists : undefined;
            resourceInputs["blockedIpLists"] = args ? args.blockedIpLists : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(NetworkPolicy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering NetworkPolicy resources.
 */
export interface NetworkPolicyState {
    /**
     * Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account
     */
    allowedIpLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account\n\n\n\n**Do not** add `0.0.0.0/0` to `blockedIpList`
     */
    blockedIpLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the network policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a NetworkPolicy resource.
 */
export interface NetworkPolicyArgs {
    /**
     * Specifies one or more IPv4 addresses (CIDR notation) that are allowed access to your Snowflake account
     */
    allowedIpLists: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies one or more IPv4 addresses (CIDR notation) that are denied access to your Snowflake account\n\n\n\n**Do not** add `0.0.0.0/0` to `blockedIpList`
     */
    blockedIpLists?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies a comment for the network policy.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the network policy; must be unique for the account in which the network policy is created.
     */
    name?: pulumi.Input<string>;
}