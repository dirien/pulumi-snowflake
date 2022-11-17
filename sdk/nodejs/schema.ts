// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as snowflake from "@pulumi/snowflake";
 *
 * const schema = new snowflake.Schema("schema", {
 *     comment: "A schema.",
 *     dataRetentionDays: 1,
 *     database: "database",
 *     isManaged: false,
 *     isTransient: false,
 * });
 * ```
 *
 * ## Import
 *
 * format is dbName | schemaName
 *
 * ```sh
 *  $ pulumi import snowflake:index/schema:Schema example 'dbName|schemaName'
 * ```
 */
export class Schema extends pulumi.CustomResource {
    /**
     * Get an existing Schema resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SchemaState, opts?: pulumi.CustomResourceOptions): Schema {
        return new Schema(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/schema:Schema';

    /**
     * Returns true if the given object is an instance of Schema.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Schema {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Schema.__pulumiType;
    }

    /**
     * Specifies a comment for the schema.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
     */
    public readonly dataRetentionDays!: pulumi.Output<number | undefined>;
    /**
     * The database in which to create the schema.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
     */
    public readonly isManaged!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     */
    public readonly isTransient!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the identifier for the schema; must be unique for the database in which the schema is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    public readonly tags!: pulumi.Output<outputs.SchemaTag[] | undefined>;

    /**
     * Create a Schema resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SchemaArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SchemaArgs | SchemaState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as SchemaState | undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["dataRetentionDays"] = state ? state.dataRetentionDays : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["isManaged"] = state ? state.isManaged : undefined;
            resourceInputs["isTransient"] = state ? state.isTransient : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as SchemaArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["dataRetentionDays"] = args ? args.dataRetentionDays : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["isManaged"] = args ? args.isManaged : undefined;
            resourceInputs["isTransient"] = args ? args.isTransient : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Schema.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Schema resources.
 */
export interface SchemaState {
    /**
     * Specifies a comment for the schema.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
     */
    dataRetentionDays?: pulumi.Input<number>;
    /**
     * The database in which to create the schema.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
     */
    isManaged?: pulumi.Input<boolean>;
    /**
     * Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     */
    isTransient?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier for the schema; must be unique for the database in which the schema is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.SchemaTag>[]>;
}

/**
 * The set of arguments for constructing a Schema resource.
 */
export interface SchemaArgs {
    /**
     * Specifies a comment for the schema.
     */
    comment?: pulumi.Input<string>;
    /**
     * Specifies the number of days for which Time Travel actions (CLONE and UNDROP) can be performed on the schema, as well as specifying the default Time Travel retention time for all tables created in the schema.
     */
    dataRetentionDays?: pulumi.Input<number>;
    /**
     * The database in which to create the schema.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies a managed schema. Managed access schemas centralize privilege management with the schema owner.
     */
    isManaged?: pulumi.Input<boolean>;
    /**
     * Specifies a schema as transient. Transient schemas do not have a Fail-safe period so they do not incur additional storage costs once they leave Time Travel; however, this means they are also not protected by Fail-safe in the event of a data loss.
     */
    isTransient?: pulumi.Input<boolean>;
    /**
     * Specifies the identifier for the schema; must be unique for the database in which the schema is created.
     */
    name?: pulumi.Input<string>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.SchemaTag>[]>;
}
