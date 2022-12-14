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
    public sealed class GetStreamsStreamResult
    {
        public readonly string Comment;
        /// <summary>
        /// The database from which to return the streams from.
        /// </summary>
        public readonly string Database;
        public readonly string Name;
        /// <summary>
        /// The schema from which to return the streams from.
        /// </summary>
        public readonly string Schema;
        public readonly string Table;

        [OutputConstructor]
        private GetStreamsStreamResult(
            string comment,

            string database,

            string name,

            string schema,

            string table)
        {
            Comment = comment;
            Database = database;
            Name = name;
            Schema = schema;
            Table = table;
        }
    }
}
