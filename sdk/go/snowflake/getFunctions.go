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
//			_, err = snowflake.GetFunctions(ctx, &GetFunctionsArgs{
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
func GetFunctions(ctx *pulumi.Context, args *GetFunctionsArgs, opts ...pulumi.InvokeOption) (*GetFunctionsResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetFunctionsResult
	err := ctx.Invoke("snowflake:index/getFunctions:getFunctions", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getFunctions.
type GetFunctionsArgs struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The schema from which to return the functions from.
	Schema string `pulumi:"schema"`
}

// A collection of values returned by getFunctions.
type GetFunctionsResult struct {
	// The database from which to return the schemas from.
	Database string `pulumi:"database"`
	// The functions in the schema
	Functions []GetFunctionsFunction `pulumi:"functions"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// The schema from which to return the functions from.
	Schema string `pulumi:"schema"`
}

func GetFunctionsOutput(ctx *pulumi.Context, args GetFunctionsOutputArgs, opts ...pulumi.InvokeOption) GetFunctionsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetFunctionsResult, error) {
			args := v.(GetFunctionsArgs)
			r, err := GetFunctions(ctx, &args, opts...)
			var s GetFunctionsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetFunctionsResultOutput)
}

// A collection of arguments for invoking getFunctions.
type GetFunctionsOutputArgs struct {
	// The database from which to return the schemas from.
	Database pulumi.StringInput `pulumi:"database"`
	// The schema from which to return the functions from.
	Schema pulumi.StringInput `pulumi:"schema"`
}

func (GetFunctionsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFunctionsArgs)(nil)).Elem()
}

// A collection of values returned by getFunctions.
type GetFunctionsResultOutput struct{ *pulumi.OutputState }

func (GetFunctionsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetFunctionsResult)(nil)).Elem()
}

func (o GetFunctionsResultOutput) ToGetFunctionsResultOutput() GetFunctionsResultOutput {
	return o
}

func (o GetFunctionsResultOutput) ToGetFunctionsResultOutputWithContext(ctx context.Context) GetFunctionsResultOutput {
	return o
}

// The database from which to return the schemas from.
func (o GetFunctionsResultOutput) Database() pulumi.StringOutput {
	return o.ApplyT(func(v GetFunctionsResult) string { return v.Database }).(pulumi.StringOutput)
}

// The functions in the schema
func (o GetFunctionsResultOutput) Functions() GetFunctionsFunctionArrayOutput {
	return o.ApplyT(func(v GetFunctionsResult) []GetFunctionsFunction { return v.Functions }).(GetFunctionsFunctionArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetFunctionsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetFunctionsResult) string { return v.Id }).(pulumi.StringOutput)
}

// The schema from which to return the functions from.
func (o GetFunctionsResultOutput) Schema() pulumi.StringOutput {
	return o.ApplyT(func(v GetFunctionsResult) string { return v.Schema }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetFunctionsResultOutput{})
}