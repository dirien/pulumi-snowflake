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
 * const task = new snowflake.Task("task", {
 *     comment: "my task",
 *     database: "database",
 *     schema: "schema",
 *     warehouse: "warehouse",
 *     schedule: "10 MINUTE",
 *     sqlStatement: "select * from foo;",
 *     sessionParameters: {
 *         foo: "bar",
 *     },
 *     userTaskTimeoutMs: 10000,
 *     afters: "preceding_task",
 *     when: "foo AND bar",
 *     enabled: true,
 * });
 * const serverlessTask = new snowflake.Task("serverlessTask", {
 *     comment: "my serverless task",
 *     database: "db",
 *     schema: "schema",
 *     schedule: "10 MINUTE",
 *     sqlStatement: "select * from foo;",
 *     sessionParameters: {
 *         foo: "bar",
 *     },
 *     userTaskTimeoutMs: 10000,
 *     userTaskManagedInitialWarehouseSize: "XSMALL",
 *     afters: [task.name],
 *     when: "foo AND bar",
 *     enabled: true,
 * });
 * const testTask = new snowflake.Task("testTask", {
 *     comment: "task with allow_overlapping_execution",
 *     database: "database",
 *     schema: "schema",
 *     sqlStatement: "select 1 as c;",
 *     allowOverlappingExecution: true,
 *     enabled: true,
 * });
 * ```
 *
 * ## Import
 *
 * format is database name | schema name | task name
 *
 * ```sh
 *  $ pulumi import snowflake:index/task:Task example 'dbName|schemaName|taskName'
 * ```
 */
export class Task extends pulumi.CustomResource {
    /**
     * Get an existing Task resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: TaskState, opts?: pulumi.CustomResourceOptions): Task {
        return new Task(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/task:Task';

    /**
     * Returns true if the given object is an instance of Task.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Task {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Task.__pulumiType;
    }

    /**
     * Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
     */
    public readonly afters!: pulumi.Output<string[] | undefined>;
    /**
     * By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
     */
    public readonly allowOverlappingExecution!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies a comment for the task.
     */
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * The database in which to create the task.
     */
    public readonly database!: pulumi.Output<string>;
    /**
     * Specifies if the task should be started (enabled) after creation or should remain suspended (default).
     */
    public readonly enabled!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the name of the notification integration used for error notifications.
     */
    public readonly errorIntegration!: pulumi.Output<string | undefined>;
    /**
     * Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
     */
    public readonly schedule!: pulumi.Output<string | undefined>;
    /**
     * The schema in which to create the task.
     */
    public readonly schema!: pulumi.Output<string>;
    /**
     * Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
     */
    public readonly sessionParameters!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Any single SQL statement, or a call to a stored procedure, executed when the task runs.
     */
    public readonly sqlStatement!: pulumi.Output<string>;
    /**
     * Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
     */
    public readonly userTaskManagedInitialWarehouseSize!: pulumi.Output<string | undefined>;
    /**
     * Specifies the time limit on a single run of the task before it times out (in milliseconds).
     */
    public readonly userTaskTimeoutMs!: pulumi.Output<number | undefined>;
    /**
     * The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
     */
    public readonly warehouse!: pulumi.Output<string | undefined>;
    /**
     * Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
     */
    public readonly when!: pulumi.Output<string | undefined>;

    /**
     * Create a Task resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: TaskArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: TaskArgs | TaskState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as TaskState | undefined;
            resourceInputs["afters"] = state ? state.afters : undefined;
            resourceInputs["allowOverlappingExecution"] = state ? state.allowOverlappingExecution : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["database"] = state ? state.database : undefined;
            resourceInputs["enabled"] = state ? state.enabled : undefined;
            resourceInputs["errorIntegration"] = state ? state.errorIntegration : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["schedule"] = state ? state.schedule : undefined;
            resourceInputs["schema"] = state ? state.schema : undefined;
            resourceInputs["sessionParameters"] = state ? state.sessionParameters : undefined;
            resourceInputs["sqlStatement"] = state ? state.sqlStatement : undefined;
            resourceInputs["userTaskManagedInitialWarehouseSize"] = state ? state.userTaskManagedInitialWarehouseSize : undefined;
            resourceInputs["userTaskTimeoutMs"] = state ? state.userTaskTimeoutMs : undefined;
            resourceInputs["warehouse"] = state ? state.warehouse : undefined;
            resourceInputs["when"] = state ? state.when : undefined;
        } else {
            const args = argsOrState as TaskArgs | undefined;
            if ((!args || args.database === undefined) && !opts.urn) {
                throw new Error("Missing required property 'database'");
            }
            if ((!args || args.schema === undefined) && !opts.urn) {
                throw new Error("Missing required property 'schema'");
            }
            if ((!args || args.sqlStatement === undefined) && !opts.urn) {
                throw new Error("Missing required property 'sqlStatement'");
            }
            resourceInputs["afters"] = args ? args.afters : undefined;
            resourceInputs["allowOverlappingExecution"] = args ? args.allowOverlappingExecution : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["database"] = args ? args.database : undefined;
            resourceInputs["enabled"] = args ? args.enabled : undefined;
            resourceInputs["errorIntegration"] = args ? args.errorIntegration : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["schedule"] = args ? args.schedule : undefined;
            resourceInputs["schema"] = args ? args.schema : undefined;
            resourceInputs["sessionParameters"] = args ? args.sessionParameters : undefined;
            resourceInputs["sqlStatement"] = args ? args.sqlStatement : undefined;
            resourceInputs["userTaskManagedInitialWarehouseSize"] = args ? args.userTaskManagedInitialWarehouseSize : undefined;
            resourceInputs["userTaskTimeoutMs"] = args ? args.userTaskTimeoutMs : undefined;
            resourceInputs["warehouse"] = args ? args.warehouse : undefined;
            resourceInputs["when"] = args ? args.when : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Task.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Task resources.
 */
export interface TaskState {
    /**
     * Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
     */
    afters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
     */
    allowOverlappingExecution?: pulumi.Input<boolean>;
    /**
     * Specifies a comment for the task.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the task.
     */
    database?: pulumi.Input<string>;
    /**
     * Specifies if the task should be started (enabled) after creation or should remain suspended (default).
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the notification integration used for error notifications.
     */
    errorIntegration?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
     */
    name?: pulumi.Input<string>;
    /**
     * The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
     */
    schedule?: pulumi.Input<string>;
    /**
     * The schema in which to create the task.
     */
    schema?: pulumi.Input<string>;
    /**
     * Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
     */
    sessionParameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Any single SQL statement, or a call to a stored procedure, executed when the task runs.
     */
    sqlStatement?: pulumi.Input<string>;
    /**
     * Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
     */
    userTaskManagedInitialWarehouseSize?: pulumi.Input<string>;
    /**
     * Specifies the time limit on a single run of the task before it times out (in milliseconds).
     */
    userTaskTimeoutMs?: pulumi.Input<number>;
    /**
     * The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
     */
    warehouse?: pulumi.Input<string>;
    /**
     * Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
     */
    when?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Task resource.
 */
export interface TaskArgs {
    /**
     * Specifies one or more predecessor tasks for the current task. Use this option to create a DAG of tasks or add this task to an existing DAG. A DAG is a series of tasks that starts with a scheduled root task and is linked together by dependencies.
     */
    afters?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * By default, Snowflake ensures that only one instance of a particular DAG is allowed to run at a time, setting the parameter value to TRUE permits DAG runs to overlap.
     */
    allowOverlappingExecution?: pulumi.Input<boolean>;
    /**
     * Specifies a comment for the task.
     */
    comment?: pulumi.Input<string>;
    /**
     * The database in which to create the task.
     */
    database: pulumi.Input<string>;
    /**
     * Specifies if the task should be started (enabled) after creation or should remain suspended (default).
     */
    enabled?: pulumi.Input<boolean>;
    /**
     * Specifies the name of the notification integration used for error notifications.
     */
    errorIntegration?: pulumi.Input<string>;
    /**
     * Specifies the identifier for the task; must be unique for the database and schema in which the task is created.
     */
    name?: pulumi.Input<string>;
    /**
     * The schedule for periodically running the task. This can be a cron or interval in minutes. (Conflict with after)
     */
    schedule?: pulumi.Input<string>;
    /**
     * The schema in which to create the task.
     */
    schema: pulumi.Input<string>;
    /**
     * Specifies session parameters to set for the session when the task runs. A task supports all session parameters.
     */
    sessionParameters?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Any single SQL statement, or a call to a stored procedure, executed when the task runs.
     */
    sqlStatement: pulumi.Input<string>;
    /**
     * Specifies the size of the compute resources to provision for the first run of the task, before a task history is available for Snowflake to determine an ideal size. Once a task has successfully completed a few runs, Snowflake ignores this parameter setting. (Conflicts with warehouse)
     */
    userTaskManagedInitialWarehouseSize?: pulumi.Input<string>;
    /**
     * Specifies the time limit on a single run of the task before it times out (in milliseconds).
     */
    userTaskTimeoutMs?: pulumi.Input<number>;
    /**
     * The warehouse the task will use. Omit this parameter to use Snowflake-managed compute resources for runs of this task. (Conflicts with user*task*managed*initial*warehouse_size)
     */
    warehouse?: pulumi.Input<string>;
    /**
     * Specifies a Boolean SQL expression; multiple conditions joined with AND/OR are supported.
     */
    when?: pulumi.Input<string>;
}
