// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    /// <summary>
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using Snowflake = Pulumi.Snowflake;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var db = new Snowflake.Database("db");
    /// 
    ///     var sourceFailoverGroup = new Snowflake.FailoverGroup("sourceFailoverGroup", new()
    ///     {
    ///         ObjectTypes = new[]
    ///         {
    ///             "WAREHOUSES",
    ///             "DATABASES",
    ///             "INTEGRATIONS",
    ///             "ROLES",
    ///         },
    ///         AllowedAccounts = new[]
    ///         {
    ///             "&lt;account1&gt;",
    ///             "&lt;account2&gt;",
    ///         },
    ///         AllowedDatabases = new[]
    ///         {
    ///             db.Name,
    ///         },
    ///         AllowedIntegrationTypes = new[]
    ///         {
    ///             "SECURITY INTEGRATIONS",
    ///         },
    ///         ReplicationSchedule = new Snowflake.Inputs.FailoverGroupReplicationScheduleArgs
    ///         {
    ///             Cron = new Snowflake.Inputs.FailoverGroupReplicationScheduleCronArgs
    ///             {
    ///                 Expression = "0 0 10-20 * TUE,THU",
    ///                 TimeZone = "UTC",
    ///             },
    ///         },
    ///     });
    /// 
    ///     var account2 = new Snowflake.Provider("account2");
    /// 
    ///     var targetFailoverGroup = new Snowflake.FailoverGroup("targetFailoverGroup", new()
    ///     {
    ///         FromReplica = new Snowflake.Inputs.FailoverGroupFromReplicaArgs
    ///         {
    ///             OrganizationName = "...",
    ///             SourceAccountName = "...",
    ///             Name = snowflake_failover_group.Fg.Name,
    ///         },
    ///     }, new CustomResourceOptions
    ///     {
    ///         Provider = snowflake.Account2,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/failoverGroup:FailoverGroup example 'fg1'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/failoverGroup:FailoverGroup")]
    public partial class FailoverGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
        /// </summary>
        [Output("allowedAccounts")]
        public Output<ImmutableArray<string>> AllowedAccounts { get; private set; } = null!;

        /// <summary>
        /// Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        /// </summary>
        [Output("allowedDatabases")]
        public Output<ImmutableArray<string>> AllowedDatabases { get; private set; } = null!;

        /// <summary>
        /// Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        /// </summary>
        [Output("allowedIntegrationTypes")]
        public Output<ImmutableArray<string>> AllowedIntegrationTypes { get; private set; } = null!;

        /// <summary>
        /// Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        /// </summary>
        [Output("allowedShares")]
        public Output<ImmutableArray<string>> AllowedShares { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the replica to use as the source for the failover group.
        /// </summary>
        [Output("fromReplica")]
        public Output<Outputs.FailoverGroupFromReplica?> FromReplica { get; private set; } = null!;

        /// <summary>
        /// Allows replicating objects to accounts on lower editions.
        /// </summary>
        [Output("ignoreEditionCheck")]
        public Output<bool?> IgnoreEditionCheck { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        /// </summary>
        [Output("objectTypes")]
        public Output<ImmutableArray<string>> ObjectTypes { get; private set; } = null!;

        /// <summary>
        /// Specifies the schedule for refreshing secondary failover groups.
        /// </summary>
        [Output("replicationSchedule")]
        public Output<Outputs.FailoverGroupReplicationSchedule?> ReplicationSchedule { get; private set; } = null!;


        /// <summary>
        /// Create a FailoverGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public FailoverGroup(string name, FailoverGroupArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake:index/failoverGroup:FailoverGroup", name, args ?? new FailoverGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private FailoverGroup(string name, Input<string> id, FailoverGroupState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/failoverGroup:FailoverGroup", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/dirien/pulumi-snowflake",
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing FailoverGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static FailoverGroup Get(string name, Input<string> id, FailoverGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new FailoverGroup(name, id, state, options);
        }
    }

    public sealed class FailoverGroupArgs : global::Pulumi.ResourceArgs
    {
        [Input("allowedAccounts")]
        private InputList<string>? _allowedAccounts;

        /// <summary>
        /// Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
        /// </summary>
        public InputList<string> AllowedAccounts
        {
            get => _allowedAccounts ?? (_allowedAccounts = new InputList<string>());
            set => _allowedAccounts = value;
        }

        [Input("allowedDatabases")]
        private InputList<string>? _allowedDatabases;

        /// <summary>
        /// Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        /// </summary>
        public InputList<string> AllowedDatabases
        {
            get => _allowedDatabases ?? (_allowedDatabases = new InputList<string>());
            set => _allowedDatabases = value;
        }

        [Input("allowedIntegrationTypes")]
        private InputList<string>? _allowedIntegrationTypes;

        /// <summary>
        /// Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        /// </summary>
        public InputList<string> AllowedIntegrationTypes
        {
            get => _allowedIntegrationTypes ?? (_allowedIntegrationTypes = new InputList<string>());
            set => _allowedIntegrationTypes = value;
        }

        [Input("allowedShares")]
        private InputList<string>? _allowedShares;

        /// <summary>
        /// Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        /// </summary>
        public InputList<string> AllowedShares
        {
            get => _allowedShares ?? (_allowedShares = new InputList<string>());
            set => _allowedShares = value;
        }

        /// <summary>
        /// Specifies the name of the replica to use as the source for the failover group.
        /// </summary>
        [Input("fromReplica")]
        public Input<Inputs.FailoverGroupFromReplicaArgs>? FromReplica { get; set; }

        /// <summary>
        /// Allows replicating objects to accounts on lower editions.
        /// </summary>
        [Input("ignoreEditionCheck")]
        public Input<bool>? IgnoreEditionCheck { get; set; }

        /// <summary>
        /// Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("objectTypes")]
        private InputList<string>? _objectTypes;

        /// <summary>
        /// Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        /// </summary>
        public InputList<string> ObjectTypes
        {
            get => _objectTypes ?? (_objectTypes = new InputList<string>());
            set => _objectTypes = value;
        }

        /// <summary>
        /// Specifies the schedule for refreshing secondary failover groups.
        /// </summary>
        [Input("replicationSchedule")]
        public Input<Inputs.FailoverGroupReplicationScheduleArgs>? ReplicationSchedule { get; set; }

        public FailoverGroupArgs()
        {
        }
        public static new FailoverGroupArgs Empty => new FailoverGroupArgs();
    }

    public sealed class FailoverGroupState : global::Pulumi.ResourceArgs
    {
        [Input("allowedAccounts")]
        private InputList<string>? _allowedAccounts;

        /// <summary>
        /// Specifies the target account or list of target accounts to which replication and failover of specified objects from the source account is enabled. Secondary failover groups in the target accounts in this list can be promoted to serve as the primary failover group in case of failover. Expected in the form \n\n.\n\n
        /// </summary>
        public InputList<string> AllowedAccounts
        {
            get => _allowedAccounts ?? (_allowedAccounts = new InputList<string>());
            set => _allowedAccounts = value;
        }

        [Input("allowedDatabases")]
        private InputList<string>? _allowedDatabases;

        /// <summary>
        /// Specifies the database or list of databases for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include DATABASES to set this parameter.
        /// </summary>
        public InputList<string> AllowedDatabases
        {
            get => _allowedDatabases ?? (_allowedDatabases = new InputList<string>());
            set => _allowedDatabases = value;
        }

        [Input("allowedIntegrationTypes")]
        private InputList<string>? _allowedIntegrationTypes;

        /// <summary>
        /// Type(s) of integrations for which you are enabling replication and failover from the source account to the target account. This property requires that the OBJECT_TYPES list include INTEGRATIONS to set this parameter. The following integration types are supported: "SECURITY INTEGRATIONS", "API INTEGRATIONS"
        /// </summary>
        public InputList<string> AllowedIntegrationTypes
        {
            get => _allowedIntegrationTypes ?? (_allowedIntegrationTypes = new InputList<string>());
            set => _allowedIntegrationTypes = value;
        }

        [Input("allowedShares")]
        private InputList<string>? _allowedShares;

        /// <summary>
        /// Specifies the share or list of shares for which you are enabling replication and failover from the source account to the target account. The OBJECT_TYPES list must include SHARES to set this parameter.
        /// </summary>
        public InputList<string> AllowedShares
        {
            get => _allowedShares ?? (_allowedShares = new InputList<string>());
            set => _allowedShares = value;
        }

        /// <summary>
        /// Specifies the name of the replica to use as the source for the failover group.
        /// </summary>
        [Input("fromReplica")]
        public Input<Inputs.FailoverGroupFromReplicaGetArgs>? FromReplica { get; set; }

        /// <summary>
        /// Allows replicating objects to accounts on lower editions.
        /// </summary>
        [Input("ignoreEditionCheck")]
        public Input<bool>? IgnoreEditionCheck { get; set; }

        /// <summary>
        /// Specifies the identifier for the failover group. The identifier must start with an alphabetic character and cannot contain spaces or special characters unless the identifier string is enclosed in double quotes (e.g. "My object"). Identifiers enclosed in double quotes are also case-sensitive.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("objectTypes")]
        private InputList<string>? _objectTypes;

        /// <summary>
        /// Type(s) of objects for which you are enabling replication and failover from the source account to the target account. The following object types are supported: "ACCOUNT PARAMETERS", "DATABASES", "INTEGRATIONS", "NETWORK POLICIES", "RESOURCE MONITORS", "ROLES", "SHARES", "USERS", "WAREHOUSES"
        /// </summary>
        public InputList<string> ObjectTypes
        {
            get => _objectTypes ?? (_objectTypes = new InputList<string>());
            set => _objectTypes = value;
        }

        /// <summary>
        /// Specifies the schedule for refreshing secondary failover groups.
        /// </summary>
        [Input("replicationSchedule")]
        public Input<Inputs.FailoverGroupReplicationScheduleGetArgs>? ReplicationSchedule { get; set; }

        public FailoverGroupState()
        {
        }
        public static new FailoverGroupState Empty => new FailoverGroupState();
    }
}
