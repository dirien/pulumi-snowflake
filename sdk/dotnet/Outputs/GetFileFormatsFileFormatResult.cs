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
    public sealed class GetFileFormatsFileFormatResult
    {
        public readonly string Comment;
        /// <summary>
        /// The database from which to return the schemas from.
        /// </summary>
        public readonly string Database;
        public readonly string FormatType;
        public readonly string Name;
        /// <summary>
        /// The schema from which to return the file formats from.
        /// </summary>
        public readonly string Schema;

        [OutputConstructor]
        private GetFileFormatsFileFormatResult(
            string comment,

            string database,

            string formatType,

            string name,

            string schema)
        {
            Comment = comment;
            Database = database;
            FormatType = formatType;
            Name = name;
            Schema = schema;
        }
    }
}