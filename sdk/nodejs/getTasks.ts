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
 * const current = pulumi.output(snowflake.getTasks({
 *     database: "MYDB",
 *     schema: "MYSCHEMA",
 * }));
 * ```
 */
export function getTasks(args: GetTasksArgs, opts?: pulumi.InvokeOptions): Promise<GetTasksResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("snowflake:index/getTasks:getTasks", {
        "database": args.database,
        "schema": args.schema,
    }, opts);
}

/**
 * A collection of arguments for invoking getTasks.
 */
export interface GetTasksArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: string;
    /**
     * The schema from which to return the tasks from.
     */
    schema: string;
}

/**
 * A collection of values returned by getTasks.
 */
export interface GetTasksResult {
    /**
     * The database from which to return the schemas from.
     */
    readonly database: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The schema from which to return the tasks from.
     */
    readonly schema: string;
    /**
     * The tasks in the schema
     */
    readonly tasks: outputs.GetTasksTask[];
}

export function getTasksOutput(args: GetTasksOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetTasksResult> {
    return pulumi.output(args).apply(a => getTasks(a, opts))
}

/**
 * A collection of arguments for invoking getTasks.
 */
export interface GetTasksOutputArgs {
    /**
     * The database from which to return the schemas from.
     */
    database: pulumi.Input<string>;
    /**
     * The schema from which to return the tasks from.
     */
    schema: pulumi.Input<string>;
}