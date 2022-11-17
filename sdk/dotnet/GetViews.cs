// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetViews
    {
        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var current = Snowflake.GetViews.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetViewsResult> InvokeAsync(GetViewsArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetViewsResult>("snowflake:index/getViews:getViews", args ?? new GetViewsArgs(), options.WithDefaults());

        /// <summary>
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using Snowflake = Pulumi.Snowflake;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var current = Snowflake.GetViews.Invoke(new()
        ///     {
        ///         Database = "MYDB",
        ///         Schema = "MYSCHEMA",
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetViewsResult> Invoke(GetViewsInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetViewsResult>("snowflake:index/getViews:getViews", args ?? new GetViewsInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetViewsArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public string Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the views from.
        /// </summary>
        [Input("schema", required: true)]
        public string Schema { get; set; } = null!;

        public GetViewsArgs()
        {
        }
        public static new GetViewsArgs Empty => new GetViewsArgs();
    }

    public sealed class GetViewsInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        [Input("database", required: true)]
        public Input<string> Database { get; set; } = null!;

        /// <summary>
        /// The schema from which to return the views from.
        /// </summary>
        [Input("schema", required: true)]
        public Input<string> Schema { get; set; } = null!;

        public GetViewsInvokeArgs()
        {
        }
        public static new GetViewsInvokeArgs Empty => new GetViewsInvokeArgs();
    }


    [OutputType]
    public sealed class GetViewsResult
    {
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        public readonly string Database;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The schema from which to return the views from.
        /// </summary>
        public readonly string Schema;
        /// <summary>
        /// The views in the schema
        /// </summary>
        public readonly ImmutableArray<Outputs.GetViewsViewResult> Views;

        [OutputConstructor]
        private GetViewsResult(
            string database,

            string id,

            string schema,

            ImmutableArray<Outputs.GetViewsViewResult> views)
        {
            Database = database;
            Id = id;
            Schema = schema;
            Views = views;
        }
    }
}