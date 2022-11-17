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
    ///     var test = new Snowflake.Share("test", new()
    ///     {
    ///         Accounts = new[]
    ///         {
    ///             "organizationName.accountName",
    ///         },
    ///         Comment = "cool comment",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/share:Share example name
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/share:Share")]
    public partial class Share : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A list of accounts to be added to the share. Values should not be the account locator, but in the form of 'organization*name.account*name
        /// </summary>
        [Output("accounts")]
        public Output<ImmutableArray<string>> Accounts { get; private set; } = null!;

        /// <summary>
        /// Specifies a comment for the managed account.
        /// </summary>
        [Output("comment")]
        public Output<string?> Comment { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the share; must be unique for the account in which the share is created.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a Share resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Share(string name, ShareArgs? args = null, CustomResourceOptions? options = null)
            : base("snowflake:index/share:Share", name, args ?? new ShareArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Share(string name, Input<string> id, ShareState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/share:Share", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Share resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Share Get(string name, Input<string> id, ShareState? state = null, CustomResourceOptions? options = null)
        {
            return new Share(name, id, state, options);
        }
    }

    public sealed class ShareArgs : global::Pulumi.ResourceArgs
    {
        [Input("accounts")]
        private InputList<string>? _accounts;

        /// <summary>
        /// A list of accounts to be added to the share. Values should not be the account locator, but in the form of 'organization*name.account*name
        /// </summary>
        public InputList<string> Accounts
        {
            get => _accounts ?? (_accounts = new InputList<string>());
            set => _accounts = value;
        }

        /// <summary>
        /// Specifies a comment for the managed account.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the identifier for the share; must be unique for the account in which the share is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ShareArgs()
        {
        }
        public static new ShareArgs Empty => new ShareArgs();
    }

    public sealed class ShareState : global::Pulumi.ResourceArgs
    {
        [Input("accounts")]
        private InputList<string>? _accounts;

        /// <summary>
        /// A list of accounts to be added to the share. Values should not be the account locator, but in the form of 'organization*name.account*name
        /// </summary>
        public InputList<string> Accounts
        {
            get => _accounts ?? (_accounts = new InputList<string>());
            set => _accounts = value;
        }

        /// <summary>
        /// Specifies a comment for the managed account.
        /// </summary>
        [Input("comment")]
        public Input<string>? Comment { get; set; }

        /// <summary>
        /// Specifies the identifier for the share; must be unique for the account in which the share is created.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ShareState()
        {
        }
        public static new ShareState Empty => new ShareState();
    }
}
