// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/dirien/pulumi-snowflake/sdk/go/snowflake"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err = snowflake.GetMaterializedViews(ctx, &GetMaterializedViewsArgs{
//				Database: "MYDB",
//				Schema:   "MYSCHEMA",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func GetMaterializedViews(ctx *pulumi.Context, args *GetMaterializedViewsArgs, opts ...pulumi.InvokeOption) (*GetMaterializedViewsResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetMaterializedViewsResult
	err := ctx.Invoke("snowflake:index/getMaterializedViews:getMaterializedViews", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getMaterializedViews.
type GetMaterializedViewsArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the views from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getMaterializedViews.
type GetMaterializedViewsResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The views in the schema
	MaterializedViews []GetMaterializedViewsMaterializedView `pulumi:"materializedViews"`
	// The schema from which to return the views from.
	Schema string `pulumi:"schema"`
}

func GetMaterializedViewsOutput(ctx *pulumi.Context, args GetMaterializedViewsOutputArgs, opts ...pulumi.InvokeOption) GetMaterializedViewsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetMaterializedViewsResult, error) {
			args := v.(GetMaterializedViewsArgs)
			r, err := GetMaterializedViews(ctx, &args, opts...)
			var s GetMaterializedViewsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetMaterializedViewsResultOutput)
}

// A collection of arguments for invoking getMaterializedViews.
type GetMaterializedViewsOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the views from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetMaterializedViewsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMaterializedViewsArgs)(nil)).Elem()
}

// A collection of values returned by getMaterializedViews.
type GetMaterializedViewsResultOutput struct{ *pulumi.OutputState }

func (GetMaterializedViewsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetMaterializedViewsResult)(nil)).Elem()
}

func (o GetMaterializedViewsResultOutput) ToGetMaterializedViewsResultOutput() GetMaterializedViewsResultOutput {
	return o
}

func (o GetMaterializedViewsResultOutput) ToGetMaterializedViewsResultOutputWithContext(ctx context.Context) GetMaterializedViewsResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetMaterializedViewsResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) string { return v.Database }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetMaterializedViewsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The views in the schema
func (o GetMaterializedViewsResultOutput) MaterializedViews() GetMaterializedViewsMaterializedViewArrayOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) []GetMaterializedViewsMaterializedView { return v.MaterializedViews }).(GetMaterializedViewsMaterializedViewArrayOutput)
}

// The schema from which to return the views from.
func (o GetMaterializedViewsResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetMaterializedViewsResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetMaterializedViewsResultOutput{})
}
