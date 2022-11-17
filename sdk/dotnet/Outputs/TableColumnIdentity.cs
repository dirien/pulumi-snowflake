// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Snowflake.Outputs
{

    [OutputType]
    public sealed class TableColumnIdentity
    {
        public readonly int? StartNum;
        public readonly int? StepNum;

        [OutputConstructor]
        private TableColumnIdentity(
            int? startNum,

            int? stepNum)
        {
            StartNum = startNum;
            StepNum = stepNum;
        }
    }
}