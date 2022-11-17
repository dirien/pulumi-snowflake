// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake
{
    public static class GetCurrentAccount
    {
        public static Task<GetCurrentAccountResult> InvokeAsync(InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetCurrentAccountResult>("snowflake:index/getCurrentAccount:getCurrentAccount", InvokeArgs.Empty, options.WithDefaults());
    }


    [OutputType]
    public sealed class GetCurrentAccountResult
    {
        /// <summary>
        /// The Snowflake Account ID; as returned by CURRENT_ACCOUNT().
        /// </summary>
        public readonly string Account;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The Snowflake Region; as returned by CURRENT_REGION()
        /// </summary>
        public readonly string Region;
        /// <summary>
        /// The Snowflake URL.
        /// </summary>
        public readonly string Url;

        [OutputConstructor]
        private GetCurrentAccountResult(
            string account,

            string id,

            string region,

            string url)
        {
            Account = account;
            Id = id;
            Region = region;
            Url = url;
        }
    }
}