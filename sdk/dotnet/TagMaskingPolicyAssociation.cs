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
    /// format is tag database name | tag schema name | tag name | masking policy database | masking policy schema | masking policy name
    /// 
    /// ```sh
    ///  $ pulumi import snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation example 'tag_db|tag_schema|tag_name|mp_db|mp_schema|mp_name'
    /// ```
    /// </summary>
    [SnowflakeResourceType("snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation")]
    public partial class TagMaskingPolicyAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The resource id of the masking policy
        /// </summary>
        [Output("maskingPolicyId")]
        public Output<string> MaskingPolicyId { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        /// </summary>
        [Output("tagId")]
        public Output<string> TagId { get; private set; } = null!;


        /// <summary>
        /// Create a TagMaskingPolicyAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TagMaskingPolicyAssociation(string name, TagMaskingPolicyAssociationArgs args, CustomResourceOptions? options = null)
            : base("snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation", name, args ?? new TagMaskingPolicyAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TagMaskingPolicyAssociation(string name, Input<string> id, TagMaskingPolicyAssociationState? state = null, CustomResourceOptions? options = null)
            : base("snowflake:index/tagMaskingPolicyAssociation:TagMaskingPolicyAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TagMaskingPolicyAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TagMaskingPolicyAssociation Get(string name, Input<string> id, TagMaskingPolicyAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new TagMaskingPolicyAssociation(name, id, state, options);
        }
    }

    public sealed class TagMaskingPolicyAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource id of the masking policy
        /// </summary>
        [Input("maskingPolicyId", required: true)]
        public Input<string> MaskingPolicyId { get; set; } = null!;

        /// <summary>
        /// Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        /// </summary>
        [Input("tagId", required: true)]
        public Input<string> TagId { get; set; } = null!;

        public TagMaskingPolicyAssociationArgs()
        {
        }
        public static new TagMaskingPolicyAssociationArgs Empty => new TagMaskingPolicyAssociationArgs();
    }

    public sealed class TagMaskingPolicyAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The resource id of the masking policy
        /// </summary>
        [Input("maskingPolicyId")]
        public Input<string>? MaskingPolicyId { get; set; }

        /// <summary>
        /// Specifies the identifier for the tag. Note: format must follow: "databaseName"."schemaName"."tagName" or "databaseName.schemaName.tagName" or "databaseName|schemaName.tagName" (snowflake_tag.tag.id)
        /// </summary>
        [Input("tagId")]
        public Input<string>? TagId { get; set; }

        public TagMaskingPolicyAssociationState()
        {
        }
        public static new TagMaskingPolicyAssociationState Empty => new TagMaskingPolicyAssociationState();
    }
}
