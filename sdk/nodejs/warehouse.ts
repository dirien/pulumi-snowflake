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
 * const warehouse = new snowflake.Warehouse("warehouse", {
 *     comment: "foo",
 *     warehouseSize: "small",
 * });
 * ```
 *
 * ## Import
 *
 * ```sh
 *  $ pulumi import snowflake:index/warehouse:Warehouse example warehouseName
 * ```
 */
export class Warehouse extends pulumi.CustomResource {
    /**
     * Get an existing Warehouse resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WarehouseState, opts?: pulumi.CustomResourceOptions): Warehouse {
        return new Warehouse(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'snowflake:index/warehouse:Warehouse';

    /**
     * Returns true if the given object is an instance of Warehouse.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Warehouse {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Warehouse.__pulumiType;
    }

    /**
     * Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
     */
    public readonly autoResume!: pulumi.Output<boolean>;
    /**
     * Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     */
    public readonly autoSuspend!: pulumi.Output<number>;
    public readonly comment!: pulumi.Output<string | undefined>;
    /**
     * Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources.
     */
    public readonly enableQueryAcceleration!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     */
    public readonly initiallySuspended!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the maximum number of server clusters for the warehouse.
     */
    public readonly maxClusterCount!: pulumi.Output<number>;
    /**
     * Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     */
    public readonly maxConcurrencyLevel!: pulumi.Output<number | undefined>;
    /**
     * Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     */
    public readonly minClusterCount!: pulumi.Output<number>;
    /**
     * Identifier for the virtual warehouse; must be unique for your account.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
     */
    public readonly queryAccelerationMaxScaleFactor!: pulumi.Output<number | undefined>;
    /**
     * Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
     */
    public readonly resourceMonitor!: pulumi.Output<string>;
    /**
     * Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
     */
    public readonly scalingPolicy!: pulumi.Output<string>;
    /**
     * Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     */
    public readonly statementQueuedTimeoutInSeconds!: pulumi.Output<number | undefined>;
    /**
     * Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     */
    public readonly statementTimeoutInSeconds!: pulumi.Output<number | undefined>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    public readonly tags!: pulumi.Output<outputs.WarehouseTag[] | undefined>;
    /**
     * Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
     */
    public readonly waitForProvisioning!: pulumi.Output<boolean | undefined>;
    /**
     * Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
     */
    public readonly warehouseSize!: pulumi.Output<string>;

    /**
     * Create a Warehouse resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: WarehouseArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WarehouseArgs | WarehouseState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WarehouseState | undefined;
            resourceInputs["autoResume"] = state ? state.autoResume : undefined;
            resourceInputs["autoSuspend"] = state ? state.autoSuspend : undefined;
            resourceInputs["comment"] = state ? state.comment : undefined;
            resourceInputs["enableQueryAcceleration"] = state ? state.enableQueryAcceleration : undefined;
            resourceInputs["initiallySuspended"] = state ? state.initiallySuspended : undefined;
            resourceInputs["maxClusterCount"] = state ? state.maxClusterCount : undefined;
            resourceInputs["maxConcurrencyLevel"] = state ? state.maxConcurrencyLevel : undefined;
            resourceInputs["minClusterCount"] = state ? state.minClusterCount : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["queryAccelerationMaxScaleFactor"] = state ? state.queryAccelerationMaxScaleFactor : undefined;
            resourceInputs["resourceMonitor"] = state ? state.resourceMonitor : undefined;
            resourceInputs["scalingPolicy"] = state ? state.scalingPolicy : undefined;
            resourceInputs["statementQueuedTimeoutInSeconds"] = state ? state.statementQueuedTimeoutInSeconds : undefined;
            resourceInputs["statementTimeoutInSeconds"] = state ? state.statementTimeoutInSeconds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["waitForProvisioning"] = state ? state.waitForProvisioning : undefined;
            resourceInputs["warehouseSize"] = state ? state.warehouseSize : undefined;
        } else {
            const args = argsOrState as WarehouseArgs | undefined;
            resourceInputs["autoResume"] = args ? args.autoResume : undefined;
            resourceInputs["autoSuspend"] = args ? args.autoSuspend : undefined;
            resourceInputs["comment"] = args ? args.comment : undefined;
            resourceInputs["enableQueryAcceleration"] = args ? args.enableQueryAcceleration : undefined;
            resourceInputs["initiallySuspended"] = args ? args.initiallySuspended : undefined;
            resourceInputs["maxClusterCount"] = args ? args.maxClusterCount : undefined;
            resourceInputs["maxConcurrencyLevel"] = args ? args.maxConcurrencyLevel : undefined;
            resourceInputs["minClusterCount"] = args ? args.minClusterCount : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["queryAccelerationMaxScaleFactor"] = args ? args.queryAccelerationMaxScaleFactor : undefined;
            resourceInputs["resourceMonitor"] = args ? args.resourceMonitor : undefined;
            resourceInputs["scalingPolicy"] = args ? args.scalingPolicy : undefined;
            resourceInputs["statementQueuedTimeoutInSeconds"] = args ? args.statementQueuedTimeoutInSeconds : undefined;
            resourceInputs["statementTimeoutInSeconds"] = args ? args.statementTimeoutInSeconds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["waitForProvisioning"] = args ? args.waitForProvisioning : undefined;
            resourceInputs["warehouseSize"] = args ? args.warehouseSize : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Warehouse.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Warehouse resources.
 */
export interface WarehouseState {
    /**
     * Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
     */
    autoResume?: pulumi.Input<boolean>;
    /**
     * Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     */
    autoSuspend?: pulumi.Input<number>;
    comment?: pulumi.Input<string>;
    /**
     * Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources.
     */
    enableQueryAcceleration?: pulumi.Input<boolean>;
    /**
     * Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     */
    initiallySuspended?: pulumi.Input<boolean>;
    /**
     * Specifies the maximum number of server clusters for the warehouse.
     */
    maxClusterCount?: pulumi.Input<number>;
    /**
     * Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     */
    maxConcurrencyLevel?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     */
    minClusterCount?: pulumi.Input<number>;
    /**
     * Identifier for the virtual warehouse; must be unique for your account.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
     */
    queryAccelerationMaxScaleFactor?: pulumi.Input<number>;
    /**
     * Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
     */
    resourceMonitor?: pulumi.Input<string>;
    /**
     * Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
     */
    scalingPolicy?: pulumi.Input<string>;
    /**
     * Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     */
    statementQueuedTimeoutInSeconds?: pulumi.Input<number>;
    /**
     * Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     */
    statementTimeoutInSeconds?: pulumi.Input<number>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.WarehouseTag>[]>;
    /**
     * Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
     */
    waitForProvisioning?: pulumi.Input<boolean>;
    /**
     * Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
     */
    warehouseSize?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Warehouse resource.
 */
export interface WarehouseArgs {
    /**
     * Specifies whether to automatically resume a warehouse when a SQL statement (e.g. query) is submitted to it.
     */
    autoResume?: pulumi.Input<boolean>;
    /**
     * Specifies the number of seconds of inactivity after which a warehouse is automatically suspended.
     */
    autoSuspend?: pulumi.Input<number>;
    comment?: pulumi.Input<string>;
    /**
     * Specifies whether to enable the query acceleration service for queries that rely on this warehouse for compute resources.
     */
    enableQueryAcceleration?: pulumi.Input<boolean>;
    /**
     * Specifies whether the warehouse is created initially in the ‘Suspended’ state.
     */
    initiallySuspended?: pulumi.Input<boolean>;
    /**
     * Specifies the maximum number of server clusters for the warehouse.
     */
    maxClusterCount?: pulumi.Input<number>;
    /**
     * Object parameter that specifies the concurrency level for SQL statements (i.e. queries and DML) executed by a warehouse.
     */
    maxConcurrencyLevel?: pulumi.Input<number>;
    /**
     * Specifies the minimum number of server clusters for the warehouse (only applies to multi-cluster warehouses).
     */
    minClusterCount?: pulumi.Input<number>;
    /**
     * Identifier for the virtual warehouse; must be unique for your account.
     */
    name?: pulumi.Input<string>;
    /**
     * Specifies the maximum scale factor for leasing compute resources for query acceleration. The scale factor is used as a multiplier based on warehouse size.
     */
    queryAccelerationMaxScaleFactor?: pulumi.Input<number>;
    /**
     * Specifies the name of a resource monitor that is explicitly assigned to the warehouse.
     */
    resourceMonitor?: pulumi.Input<string>;
    /**
     * Specifies the policy for automatically starting and shutting down clusters in a multi-cluster warehouse running in Auto-scale mode.
     */
    scalingPolicy?: pulumi.Input<string>;
    /**
     * Object parameter that specifies the time, in seconds, a SQL statement (query, DDL, DML, etc.) can be queued on a warehouse before it is canceled by the system.
     */
    statementQueuedTimeoutInSeconds?: pulumi.Input<number>;
    /**
     * Specifies the time, in seconds, after which a running SQL statement (query, DDL, DML, etc.) is canceled by the system
     */
    statementTimeoutInSeconds?: pulumi.Input<number>;
    /**
     * Definitions of a tag to associate with the resource.
     *
     * @deprecated Use the 'snowflake_tag_association' resource instead.
     */
    tags?: pulumi.Input<pulumi.Input<inputs.WarehouseTag>[]>;
    /**
     * Specifies whether the warehouse, after being resized, waits for all the servers to provision before executing any queued or new queries.
     */
    waitForProvisioning?: pulumi.Input<boolean>;
    /**
     * Specifies the size of the virtual warehouse. Larger warehouse sizes 5X-Large and 6X-Large are currently in preview and only available on Amazon Web Services (AWS).
     */
    warehouseSize?: pulumi.Input<string>;
}
