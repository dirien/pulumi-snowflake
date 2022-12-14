// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetDatabases(ctx *pulumi.Context, opts ...pulumi.InvokeOption) (*GetDatabasesResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetDatabasesResult
	err := ctx.Invoke("snowflake:index/getDatabases:getDatabases", nil, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of values returned by getDatabases.
type GetDatabasesResult struct {
	// Snowflake databases
	Databases []GetDatabasesDatabase `pulumi:"databases"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
}
