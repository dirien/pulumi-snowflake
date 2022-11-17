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
 * const current = pulumi.output(snowflake.getMaterializedViews({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * }));
 * ```
 */
export function getMaterializedViews(args: GetMaterializedViewsArgs, opts?: pulumi.InvokeOptions): Promise<GetMaterializedViewsResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("snowflake:index/getMaterializedViews:getMaterializedViews", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getMaterializedViews.
 */
export interface GetMaterializedViewsArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: string;
    /**
     * The schema from which to return the views from.
     */
    schema: string;
}

/**
 * A collection of values returned by getMaterializedViews.
 */
export interface GetMaterializedViewsResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The views in the schema
     */
    readonly materializedViews: outputs.GetMaterializedViewsMaterializedView[];
    /**
     * The schema from which to return the views from.
     */
    readonly schema: string;
}

export function getMaterializedViewsOutput(args: GetMaterializedViewsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMaterializedViewsResult> {
    return pulumi.output(args).apply(a => getMaterializedViews(a, opts))
}

/**
 * A collection of arguments for invoking getMaterializedViews.
 */
export interface GetMaterializedViewsOutputArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: pulumi.Input<string>;
    /**
     * The schema from which to return the views from.
     */
    schema: pulumi.Input<string>;
}