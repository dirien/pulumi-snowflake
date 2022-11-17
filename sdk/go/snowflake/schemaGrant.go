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
//			_, err := snowflake.NewSchemaGrant(ctx, "grant", &snowflake.SchemaGrantArgs{
//				DatabaseName: pulumi.String("database"),
//				OnFuture:     pulumi.Bool(false),
//				Privilege:    pulumi.String("USAGE"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				SchemaName: pulumi.String("schema"),
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
// format is database name | schema name | | privilege | true/false for with_grant_option
//
// ```sh
//
//	$ pulumi import snowflake:index/schemaGrant:SchemaGrant example 'databaseName|schemaName||MONITOR|false'
//
// ```
type SchemaGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the schema on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// When this is set to true, apply this grant on all future schemas in the given database. The schema*name and shares fields must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future schema. Note that if "OWNERSHIP" is specified, ensure that the role that
	// terraform is using is granted access.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema on which to grant privileges.
	SchemaName pulumi.StringPtrOutput `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is unset).
	Shares pulumi.StringArrayOutput `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewSchemaGrant registers a new resource with the given unique name, arguments, and options.
func NewSchemaGrant(ctx *pulumi.Context,
	name string, args *SchemaGrantArgs, opts ...pulumi.ResourceOption) (*SchemaGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource SchemaGrant
	err := ctx.RegisterResource("snowflake:index/schemaGrant:SchemaGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSchemaGrant gets an existing SchemaGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSchemaGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SchemaGrantState, opts ...pulumi.ResourceOption) (*SchemaGrant, error) {
	var resource SchemaGrant
	err := ctx.ReadResource("snowflake:index/schemaGrant:SchemaGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SchemaGrant resources.
type schemaGrantState struct {
	// The name of the database containing the schema on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true, apply this grant on all future schemas in the given database. The schema*name and shares fields must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future schema. Note that if "OWNERSHIP" is specified, ensure that the role that
	// terraform is using is granted access.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is unset).
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type SchemaGrantState struct {
	// The name of the database containing the schema on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true, apply this grant on all future schemas in the given database. The schema*name and shares fields must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future schema. Note that if "OWNERSHIP" is specified, ensure that the role that
	// terraform is using is granted access.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if onFuture is unset).
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (SchemaGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaGrantState)(nil)).Elem()
}

type schemaGrantArgs struct {
	// The name of the database containing the schema on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true, apply this grant on all future schemas in the given database. The schema*name and shares fields must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future schema. Note that if "OWNERSHIP" is specified, ensure that the role that
	// terraform is using is granted access.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// Grants privilege to these shares (only valid if onFuture is unset).
	Shares []string `pulumi:"shares"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a SchemaGrant resource.
type SchemaGrantArgs struct {
	// The name of the database containing the schema on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true, apply this grant on all future schemas in the given database. The schema*name and shares fields must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future schema. Note that if "OWNERSHIP" is specified, ensure that the role that
	// terraform is using is granted access.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// Grants privilege to these shares (only valid if onFuture is unset).
	Shares pulumi.StringArrayInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (SchemaGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*schemaGrantArgs)(nil)).Elem()
}

type SchemaGrantInput interface {
	pulumi.Input

	ToSchemaGrantOutput() SchemaGrantOutput
	ToSchemaGrantOutputWithContext(ctx context.Context) SchemaGrantOutput
}

func (*SchemaGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaGrant)(nil)).Elem()
}

func (i *SchemaGrant) ToSchemaGrantOutput() SchemaGrantOutput {
	return i.ToSchemaGrantOutputWithContext(context.Background())
}

func (i *SchemaGrant) ToSchemaGrantOutputWithContext(ctx context.Context) SchemaGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaGrantOutput)
}

// SchemaGrantArrayInput is an input type that accepts SchemaGrantArray and SchemaGrantArrayOutput values.
// You can construct a concrete instance of `SchemaGrantArrayInput` via:
//
//	SchemaGrantArray{ SchemaGrantArgs{...} }
type SchemaGrantArrayInput interface {
	pulumi.Input

	ToSchemaGrantArrayOutput() SchemaGrantArrayOutput
	ToSchemaGrantArrayOutputWithContext(context.Context) SchemaGrantArrayOutput
}

type SchemaGrantArray []SchemaGrantInput

func (SchemaGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaGrant)(nil)).Elem()
}

func (i SchemaGrantArray) ToSchemaGrantArrayOutput() SchemaGrantArrayOutput {
	return i.ToSchemaGrantArrayOutputWithContext(context.Background())
}

func (i SchemaGrantArray) ToSchemaGrantArrayOutputWithContext(ctx context.Context) SchemaGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaGrantArrayOutput)
}

// SchemaGrantMapInput is an input type that accepts SchemaGrantMap and SchemaGrantMapOutput values.
// You can construct a concrete instance of `SchemaGrantMapInput` via:
//
//	SchemaGrantMap{ "key": SchemaGrantArgs{...} }
type SchemaGrantMapInput interface {
	pulumi.Input

	ToSchemaGrantMapOutput() SchemaGrantMapOutput
	ToSchemaGrantMapOutputWithContext(context.Context) SchemaGrantMapOutput
}

type SchemaGrantMap map[string]SchemaGrantInput

func (SchemaGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaGrant)(nil)).Elem()
}

func (i SchemaGrantMap) ToSchemaGrantMapOutput() SchemaGrantMapOutput {
	return i.ToSchemaGrantMapOutputWithContext(context.Background())
}

func (i SchemaGrantMap) ToSchemaGrantMapOutputWithContext(ctx context.Context) SchemaGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SchemaGrantMapOutput)
}

type SchemaGrantOutput struct{ *pulumi.OutputState }

func (SchemaGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SchemaGrant)(nil)).Elem()
}

func (o SchemaGrantOutput) ToSchemaGrantOutput() SchemaGrantOutput {
	return o
}

func (o SchemaGrantOutput) ToSchemaGrantOutputWithContext(ctx context.Context) SchemaGrantOutput {
	return o
}

// The name of the database containing the schema on which to grant privileges.
func (o SchemaGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *SchemaGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o SchemaGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SchemaGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// When this is set to true, apply this grant on all future schemas in the given database. The schema*name and shares fields must be unset in order to use on*future.
func (o SchemaGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SchemaGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the current or future schema. Note that if "OWNERSHIP" is specified, ensure that the role that
// terraform is using is granted access.
func (o SchemaGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchemaGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o SchemaGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SchemaGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema on which to grant privileges.
func (o SchemaGrantOutput) SchemaName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SchemaGrant) pulumi.StringPtrOutput { return v.SchemaName }).(pulumi.StringPtrOutput)
}

// Grants privilege to these shares (only valid if onFuture is unset).
func (o SchemaGrantOutput) Shares() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *SchemaGrant) pulumi.StringArrayOutput { return v.Shares }).(pulumi.StringArrayOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o SchemaGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *SchemaGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type SchemaGrantArrayOutput struct{ *pulumi.OutputState }

func (SchemaGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SchemaGrant)(nil)).Elem()
}

func (o SchemaGrantArrayOutput) ToSchemaGrantArrayOutput() SchemaGrantArrayOutput {
	return o
}

func (o SchemaGrantArrayOutput) ToSchemaGrantArrayOutputWithContext(ctx context.Context) SchemaGrantArrayOutput {
	return o
}

func (o SchemaGrantArrayOutput) Index(i pulumi.IntInput) SchemaGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SchemaGrant {
		return vs[0].([]*SchemaGrant)[vs[1].(int)]
	}).(SchemaGrantOutput)
}

type SchemaGrantMapOutput struct{ *pulumi.OutputState }

func (SchemaGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SchemaGrant)(nil)).Elem()
}

func (o SchemaGrantMapOutput) ToSchemaGrantMapOutput() SchemaGrantMapOutput {
	return o
}

func (o SchemaGrantMapOutput) ToSchemaGrantMapOutputWithContext(ctx context.Context) SchemaGrantMapOutput {
	return o
}

func (o SchemaGrantMapOutput) MapIndex(k pulumi.StringInput) SchemaGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SchemaGrant {
		return vs[0].(map[string]*SchemaGrant)[vs[1].(string)]
	}).(SchemaGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaGrantInput)(nil)).Elem(), &SchemaGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaGrantArrayInput)(nil)).Elem(), SchemaGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SchemaGrantMapInput)(nil)).Elem(), SchemaGrantMap{})
	pulumi.RegisterOutputType(SchemaGrantOutput{})
	pulumi.RegisterOutputType(SchemaGrantArrayOutput{})
	pulumi.RegisterOutputType(SchemaGrantMapOutput{})
}
