// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Inputs
{

    public sealed class TableColumnIdentityArgs : global::Pulumi.ResourceArgs
    {
        [Input("startNum")]
        public Input<int>? StartNum { get; set; }

        [Input("stepNum")]
        public Input<int>? StepNum { get; set; }

        public TableColumnIdentityArgs()
        {
        }
        public static new TableColumnIdentityArgs Empty => new TableColumnIdentityArgs();
    }
}