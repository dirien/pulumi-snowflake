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
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/managedAccount:ManagedAccount example name
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/managedAccount:ManagedAccount")]
    public partial class ManagedAccount : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Identifier, as well as login name, for the initial user in the managed account. This user serves as the account administrator for the account.
        /// </summary>
        [Output("adminName")]
        public Output<string> AdminName { get; private set; } = null!;

        /// <summary>
        /// Password for the initial user in the managed account.
        /// </summary>
        [Output("adminPassword")]
        public Output<string> AdminPassword { get; private set; } = null!;

        /// <summary>
        /// Cloud in which the managed account is located.
        /// </summary>
        [Output("cloud")]
        public Output<string> Cloud { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the managed account.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Date and time when the managed account was created.
        /// </summary>
        [Output("createdOn")]
        public Output<string> CreatedOn { get; private set; } = null!;

        /// <summary>
        /// Display name of the managed account.
        /// </summary>
        [Output("locator")]
        public Output<string> Locator { get; private set; } = null!;

        /// <summary>
        /// Identifier for the managed account; must be unique for your account.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Snowflake Region in which the managed account is located.
        /// </summary>
        [Output("region")]
        public Output<string> Region { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of managed account.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// URL for accessing the managed account, particularly through the web interface.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a ManagedAccount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ManagedAccount(string name, ManagedAccountArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/managedAccount:ManagedAccount", name, args ?? new ManagedAccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ManagedAccount(string name, Input<string> id, ManagedAccountState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/managedAccount:ManagedAccount", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                PluginDownloadURL = "github://api.github.com/dirien/pulumi-snowflake",
                AdditionalSecretOutputs =
                {
                    "adminPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ManagedAccount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ManagedAccount Get(string name, Input<string> id, ManagedAccountState? state = null, CustomResourceOptions? options = null)
        {
            return new ManagedAccount(name, id, state, options);
        }
    }

    public sealed class ManagedAccountArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier, as well as login name, for the initial user in the managed account. This user serves as the account administrator for the account.
        /// </summary>
        [Input("adminName", required: true)]
        public Input<string> AdminName { get; set; } = null!;

        [Input("adminPassword", required: true)]
        private Input<string>? _adminPassword;

        /// <summary>
        /// Password for the initial user in the managed account.
        /// </summary>
        public Input<string>? AdminPassword
        {
            get => _adminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies a comment for the managed account.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Identifier for the managed account; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Specifies the type of managed account.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ManagedAccountArgs()
        {
        }
        public static new ManagedAccountArgs Empty => new ManagedAccountArgs();
    }

    public sealed class ManagedAccountState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Identifier, as well as login name, for the initial user in the managed account. This user serves as the account administrator for the account.
        /// </summary>
        [Input("adminName")]
        public Input<string>? AdminName { get; set; }

        [Input("adminPassword")]
        private Input<string>? _adminPassword;

        /// <summary>
        /// Password for the initial user in the managed account.
        /// </summary>
        public Input<string>? AdminPassword
        {
            get => _adminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _adminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Cloud in which the managed account is located.
        /// </summary>
        [Input("cloud")]
        public Input<string>? Cloud { get; set; }

        /// <summary>
        /// Specifies a comment for the managed account.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Date and time when the managed account was created.
        /// </summary>
        [Input("createdOn")]
        public Input<string>? CreatedOn { get; set; }

        /// <summary>
        /// Display name of the managed account.
        /// </summary>
        [Input("locator")]
        public Input<string>? Locator { get; set; }

        /// <summary>
        /// Identifier for the managed account; must be unique for your account.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Snowflake Region in which the managed account is located.
        /// </summary>
        [Input("region")]
        public Input<string>? Region { get; set; }

        /// <summary>
        /// Specifies the type of managed account.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// URL for accessing the managed account, particularly through the web interface.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public ManagedAccountState()
        {
        }
        public static new ManagedAccountState Empty => new ManagedAccountState();
    }
}