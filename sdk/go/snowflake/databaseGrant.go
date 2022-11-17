// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
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
//			_, err := snowflake.NewDatabaseGrant(ctx, "grant", &snowflake.DatabaseGrantArgs{
//				DatabaseName: pulumi.String("database"),
//				Privilege:    pulumi.String("USAGE"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				Shares: pulumi.StringArray{
//					pulumi.String("share1"),
//					pulumi.String("share2"),
//				},
//				WithGrantOption: pulumi.Bool(false),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// format is database name | | | privilege | true/false for with_grant_option
//
// ```sh
//
//	$ pulumi import snowflake:index/databaseGrant:DatabaseGrant example 'databaseName|||USAGE|false'
//
// ```
type DatabaseGrant struct {
	pulumi.CustomResourceState

	// The name of the database on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the database.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// Grants privilege to these shares.
	Shares pulumi.StringArrayOutput `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewDatabaseGrant registers a new resource with the given unique name, arguments, and options.
func NewDatabaseGrant(ctx *pulumi.Context,
	name string, args *DatabaseGrantArgs, opts ...pulumi.ResourceOption) (*DatabaseGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource DatabaseGrant
	err := ctx.RegisterResource("snowflake:index/databaseGrant:DatabaseGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetDatabaseGrant gets an existing DatabaseGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetDatabaseGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *DatabaseGrantState, opts ...pulumi.ResourceOption) (*DatabaseGrant, error) {
	var resource DatabaseGrant
	err := ctx.ReadResource("snowflake:index/databaseGrant:DatabaseGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering DatabaseGrant resources.
type databaseGrantState struct {
	// The name of the database on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the database.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// Grants privilege to these shares.
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type DatabaseGrantState struct {
	// The name of the database on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the database.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// Grants privilege to these shares.
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (DatabaseGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseGrantState)(nil)).Elem()
}

type databaseGrantArgs struct {
	// The name of the database on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// The privilege to grant on the database.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// Grants privilege to these shares.
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a DatabaseGrant resource.
type DatabaseGrantArgs struct {
	// The name of the database on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// The privilege to grant on the database.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// Grants privilege to these shares.
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (DatabaseGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*databaseGrantArgs)(nil)).Elem()
}

type DatabaseGrantInput interface {
	pulumi.Input

	ToDatabaseGrantOutput() DatabaseGrantOutput
	ToDatabaseGrantOutputWithContext(ctx context.Context) DatabaseGrantOutput
}

func (*DatabaseGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseGrant)(nil)).Elem()
}

func (i *DatabaseGrant) ToDatabaseGrantOutput() DatabaseGrantOutput {
	return i.ToDatabaseGrantOutputWithContext(context.Background())
}

func (i *DatabaseGrant) ToDatabaseGrantOutputWithContext(ctx context.Context) DatabaseGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseGrantOutput)
}

// DatabaseGrantArrayInput is an input type that accepts DatabaseGrantArray and DatabaseGrantArrayOutput values.
// You can construct a concrete instance of `DatabaseGrantArrayInput` via:
//
//	DatabaseGrantArray{ DatabaseGrantArgs{...} }
type DatabaseGrantArrayInput interface {
	pulumi.Input

	ToDatabaseGrantArrayOutput() DatabaseGrantArrayOutput
	ToDatabaseGrantArrayOutputWithContext(context.Context) DatabaseGrantArrayOutput
}

type DatabaseGrantArray []DatabaseGrantInput

func (DatabaseGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseGrant)(nil)).Elem()
}

func (i DatabaseGrantArray) ToDatabaseGrantArrayOutput() DatabaseGrantArrayOutput {
	return i.ToDatabaseGrantArrayOutputWithContext(context.Background())
}

func (i DatabaseGrantArray) ToDatabaseGrantArrayOutputWithContext(ctx context.Context) DatabaseGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseGrantArrayOutput)
}

// DatabaseGrantMapInput is an input type that accepts DatabaseGrantMap and DatabaseGrantMapOutput values.
// You can construct a concrete instance of `DatabaseGrantMapInput` via:
//
//	DatabaseGrantMap{ "key": DatabaseGrantArgs{...} }
type DatabaseGrantMapInput interface {
	pulumi.Input

	ToDatabaseGrantMapOutput() DatabaseGrantMapOutput
	ToDatabaseGrantMapOutputWithContext(context.Context) DatabaseGrantMapOutput
}

type DatabaseGrantMap map[string]DatabaseGrantInput

func (DatabaseGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseGrant)(nil)).Elem()
}

func (i DatabaseGrantMap) ToDatabaseGrantMapOutput() DatabaseGrantMapOutput {
	return i.ToDatabaseGrantMapOutputWithContext(context.Background())
}

func (i DatabaseGrantMap) ToDatabaseGrantMapOutputWithContext(ctx context.Context) DatabaseGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(DatabaseGrantMapOutput)
}

type DatabaseGrantOutput struct{ *pulumi.OutputState }

func (DatabaseGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**DatabaseGrant)(nil)).Elem()
}

func (o DatabaseGrantOutput) ToDatabaseGrantOutput() DatabaseGrantOutput {
	return o
}

func (o DatabaseGrantOutput) ToDatabaseGrantOutputWithContext(ctx context.Context) DatabaseGrantOutput {
	return o
}

// The name of the database on which to grant privileges.
func (o DatabaseGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *DatabaseGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o DatabaseGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DatabaseGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the database.
func (o DatabaseGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *DatabaseGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o DatabaseGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DatabaseGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// Grants privilege to these shares.
func (o DatabaseGrantOutput) Shares() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *DatabaseGrant) pulumi.StringArrayOutput { return v.Shares }).(pulumi.StringArrayOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o DatabaseGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *DatabaseGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type DatabaseGrantArrayOutput struct{ *pulumi.OutputState }

func (DatabaseGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*DatabaseGrant)(nil)).Elem()
}

func (o DatabaseGrantArrayOutput) ToDatabaseGrantArrayOutput() DatabaseGrantArrayOutput {
	return o
}

func (o DatabaseGrantArrayOutput) ToDatabaseGrantArrayOutputWithContext(ctx context.Context) DatabaseGrantArrayOutput {
	return o
}

func (o DatabaseGrantArrayOutput) Index(i pulumi.IntInput) DatabaseGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *DatabaseGrant {
		return vs[0].([]*DatabaseGrant)[vs[1].(int)]
	}).(DatabaseGrantOutput)
}

type DatabaseGrantMapOutput struct{ *pulumi.OutputState }

func (DatabaseGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*DatabaseGrant)(nil)).Elem()
}

func (o DatabaseGrantMapOutput) ToDatabaseGrantMapOutput() DatabaseGrantMapOutput {
	return o
}

func (o DatabaseGrantMapOutput) ToDatabaseGrantMapOutputWithContext(ctx context.Context) DatabaseGrantMapOutput {
	return o
}

func (o DatabaseGrantMapOutput) MapIndex(k pulumi.StringInput) DatabaseGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *DatabaseGrant {
		return vs[0].(map[string]*DatabaseGrant)[vs[1].(string)]
	}).(DatabaseGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseGrantInput)(nil)).Elem(), &DatabaseGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseGrantArrayInput)(nil)).Elem(), DatabaseGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*DatabaseGrantMapInput)(nil)).Elem(), DatabaseGrantMap{})
	pulumi.RegisterOutputType(DatabaseGrantOutput{})
	pulumi.RegisterOutputType(DatabaseGrantArrayOutput{})
	pulumi.RegisterOutputType(DatabaseGrantMapOutput{})
}
