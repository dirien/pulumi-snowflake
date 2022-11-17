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
    public sealed class StageTag
    {
        /// <summary>
        /// Name of the database that the tag was created in.
        /// </summary>
        public readonly string? Database;
        /// <summary>
        /// Tag name, e.g. department.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Name of the schema that the tag was created in.
        /// </summary>
        public readonly string? Schema;
        /// <summary>
        /// Tag value, e.g. marketing_info.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private StageTag(
            string? database,

            string name,

            string? schema,

            string value)
        {
            Database = database;
            Name = name;
            Schema = schema;
            Value = value;
        }
    }
}
