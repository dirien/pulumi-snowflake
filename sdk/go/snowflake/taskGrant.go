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
//			_, err := snowflake.NewTaskGrant(ctx, "grant", &snowflake.TaskGrantArgs{
//				DatabaseName: pulumi.String("database"),
//				OnFuture:     pulumi.Bool(false),
//				Privilege:    pulumi.String("OPERATE"),
//				Roles: pulumi.StringArray{
//					pulumi.String("role1"),
//					pulumi.String("role2"),
//				},
//				SchemaName:      pulumi.String("schema"),
//				TaskName:        pulumi.String("task"),
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
// format is database name | schema name | task name | privilege | true/false for with_grant_option
//
// ```sh
//
//	$ pulumi import snowflake:index/taskGrant:TaskGrant example 'dbName|schemaName|taskName|OPERATE|false'
//
// ```
type TaskGrant struct {
	pulumi.CustomResourceState

	// The name of the database containing the current or future tasks on which to grant privileges.
	DatabaseName pulumi.StringOutput `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrOutput `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all future tasks in the given schema. When this is true and no schema*name is provided apply this grant on all future tasks in the given database. The task*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrOutput `pulumi:"onFuture"`
	// The privilege to grant on the current or future task.
	Privilege pulumi.StringPtrOutput `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles pulumi.StringArrayOutput `pulumi:"roles"`
	// The name of the schema containing the current or future tasks on which to grant privileges.
	SchemaName pulumi.StringOutput `pulumi:"schemaName"`
	// The name of the task on which to grant privileges immediately (only valid if onFuture is false).
	TaskName pulumi.StringPtrOutput `pulumi:"taskName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrOutput `pulumi:"withGrantOption"`
}

// NewTaskGrant registers a new resource with the given unique name, arguments, and options.
func NewTaskGrant(ctx *pulumi.Context,
	name string, args *TaskGrantArgs, opts ...pulumi.ResourceOption) (*TaskGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DatabaseName == nil {
		return nil, errors.New("invalid value for required argument 'DatabaseName'")
	}
	if args.SchemaName == nil {
		return nil, errors.New("invalid value for required argument 'SchemaName'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource TaskGrant
	err := ctx.RegisterResource("snowflake:index/taskGrant:TaskGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTaskGrant gets an existing TaskGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTaskGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TaskGrantState, opts ...pulumi.ResourceOption) (*TaskGrant, error) {
	var resource TaskGrant
	err := ctx.ReadResource("snowflake:index/taskGrant:TaskGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TaskGrant resources.
type taskGrantState struct {
	// The name of the database containing the current or future tasks on which to grant privileges.
	DatabaseName *string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all future tasks in the given schema. When this is true and no schema*name is provided apply this grant on all future tasks in the given database. The task*name field must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future task.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future tasks on which to grant privileges.
	SchemaName *string `pulumi:"schemaName"`
	// The name of the task on which to grant privileges immediately (only valid if onFuture is false).
	TaskName *string `pulumi:"taskName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

type TaskGrantState struct {
	// The name of the database containing the current or future tasks on which to grant privileges.
	DatabaseName pulumi.StringPtrInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future tasks in the given schema. When this is true and no schema*name is provided apply this grant on all future tasks in the given database. The task*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future task.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future tasks on which to grant privileges.
	SchemaName pulumi.StringPtrInput
	// The name of the task on which to grant privileges immediately (only valid if onFuture is false).
	TaskName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (TaskGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*taskGrantState)(nil)).Elem()
}

type taskGrantArgs struct {
	// The name of the database containing the current or future tasks on which to grant privileges.
	DatabaseName string `pulumi:"databaseName"`
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants *bool `pulumi:"enableMultipleGrants"`
	// When this is set to true and a schema*name is provided, apply this grant on all future tasks in the given schema. When this is true and no schema*name is provided apply this grant on all future tasks in the given database. The task*name field must be unset in order to use on*future.
	OnFuture *bool `pulumi:"onFuture"`
	// The privilege to grant on the current or future task.
	Privilege *string `pulumi:"privilege"`
	// Grants privilege to these roles.
	Roles []string `pulumi:"roles"`
	// The name of the schema containing the current or future tasks on which to grant privileges.
	SchemaName string `pulumi:"schemaName"`
	// The name of the task on which to grant privileges immediately (only valid if onFuture is false).
	TaskName *string `pulumi:"taskName"`
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption *bool `pulumi:"withGrantOption"`
}

// The set of arguments for constructing a TaskGrant resource.
type TaskGrantArgs struct {
	// The name of the database containing the current or future tasks on which to grant privileges.
	DatabaseName pulumi.StringInput
	// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
	// grants applied to roles and objects outside Terraform.
	EnableMultipleGrants pulumi.BoolPtrInput
	// When this is set to true and a schema*name is provided, apply this grant on all future tasks in the given schema. When this is true and no schema*name is provided apply this grant on all future tasks in the given database. The task*name field must be unset in order to use on*future.
	OnFuture pulumi.BoolPtrInput
	// The privilege to grant on the current or future task.
	Privilege pulumi.StringPtrInput
	// Grants privilege to these roles.
	Roles pulumi.StringArrayInput
	// The name of the schema containing the current or future tasks on which to grant privileges.
	SchemaName pulumi.StringInput
	// The name of the task on which to grant privileges immediately (only valid if onFuture is false).
	TaskName pulumi.StringPtrInput
	// When this is set to true, allows the recipient role to grant the privileges to other roles.
	WithGrantOption pulumi.BoolPtrInput
}

func (TaskGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*taskGrantArgs)(nil)).Elem()
}

type TaskGrantInput interface {
	pulumi.Input

	ToTaskGrantOutput() TaskGrantOutput
	ToTaskGrantOutputWithContext(ctx context.Context) TaskGrantOutput
}

func (*TaskGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**TaskGrant)(nil)).Elem()
}

func (i *TaskGrant) ToTaskGrantOutput() TaskGrantOutput {
	return i.ToTaskGrantOutputWithContext(context.Background())
}

func (i *TaskGrant) ToTaskGrantOutputWithContext(ctx context.Context) TaskGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskGrantOutput)
}

// TaskGrantArrayInput is an input type that accepts TaskGrantArray and TaskGrantArrayOutput values.
// You can construct a concrete instance of `TaskGrantArrayInput` via:
//
//	TaskGrantArray{ TaskGrantArgs{...} }
type TaskGrantArrayInput interface {
	pulumi.Input

	ToTaskGrantArrayOutput() TaskGrantArrayOutput
	ToTaskGrantArrayOutputWithContext(context.Context) TaskGrantArrayOutput
}

type TaskGrantArray []TaskGrantInput

func (TaskGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TaskGrant)(nil)).Elem()
}

func (i TaskGrantArray) ToTaskGrantArrayOutput() TaskGrantArrayOutput {
	return i.ToTaskGrantArrayOutputWithContext(context.Background())
}

func (i TaskGrantArray) ToTaskGrantArrayOutputWithContext(ctx context.Context) TaskGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskGrantArrayOutput)
}

// TaskGrantMapInput is an input type that accepts TaskGrantMap and TaskGrantMapOutput values.
// You can construct a concrete instance of `TaskGrantMapInput` via:
//
//	TaskGrantMap{ "key": TaskGrantArgs{...} }
type TaskGrantMapInput interface {
	pulumi.Input

	ToTaskGrantMapOutput() TaskGrantMapOutput
	ToTaskGrantMapOutputWithContext(context.Context) TaskGrantMapOutput
}

type TaskGrantMap map[string]TaskGrantInput

func (TaskGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TaskGrant)(nil)).Elem()
}

func (i TaskGrantMap) ToTaskGrantMapOutput() TaskGrantMapOutput {
	return i.ToTaskGrantMapOutputWithContext(context.Background())
}

func (i TaskGrantMap) ToTaskGrantMapOutputWithContext(ctx context.Context) TaskGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TaskGrantMapOutput)
}

type TaskGrantOutput struct{ *pulumi.OutputState }

func (TaskGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TaskGrant)(nil)).Elem()
}

func (o TaskGrantOutput) ToTaskGrantOutput() TaskGrantOutput {
	return o
}

func (o TaskGrantOutput) ToTaskGrantOutputWithContext(ctx context.Context) TaskGrantOutput {
	return o
}

// The name of the database containing the current or future tasks on which to grant privileges.
func (o TaskGrantOutput) DatabaseName() pulumi.StringOutput {
	return o.ApplyT(func(v *TaskGrant) pulumi.StringOutput { return v.DatabaseName }).(pulumi.StringOutput)
}

// When this is set to true, multiple grants of the same type can be created. This will cause Terraform to not revoke
// grants applied to roles and objects outside Terraform.
func (o TaskGrantOutput) EnableMultipleGrants() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TaskGrant) pulumi.BoolPtrOutput { return v.EnableMultipleGrants }).(pulumi.BoolPtrOutput)
}

// When this is set to true and a schema*name is provided, apply this grant on all future tasks in the given schema. When this is true and no schema*name is provided apply this grant on all future tasks in the given database. The task*name field must be unset in order to use on*future.
func (o TaskGrantOutput) OnFuture() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TaskGrant) pulumi.BoolPtrOutput { return v.OnFuture }).(pulumi.BoolPtrOutput)
}

// The privilege to grant on the current or future task.
func (o TaskGrantOutput) Privilege() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TaskGrant) pulumi.StringPtrOutput { return v.Privilege }).(pulumi.StringPtrOutput)
}

// Grants privilege to these roles.
func (o TaskGrantOutput) Roles() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *TaskGrant) pulumi.StringArrayOutput { return v.Roles }).(pulumi.StringArrayOutput)
}

// The name of the schema containing the current or future tasks on which to grant privileges.
func (o TaskGrantOutput) SchemaName() pulumi.StringOutput {
	return o.ApplyT(func(v *TaskGrant) pulumi.StringOutput { return v.SchemaName }).(pulumi.StringOutput)
}

// The name of the task on which to grant privileges immediately (only valid if onFuture is false).
func (o TaskGrantOutput) TaskName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *TaskGrant) pulumi.StringPtrOutput { return v.TaskName }).(pulumi.StringPtrOutput)
}

// When this is set to true, allows the recipient role to grant the privileges to other roles.
func (o TaskGrantOutput) WithGrantOption() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *TaskGrant) pulumi.BoolPtrOutput { return v.WithGrantOption }).(pulumi.BoolPtrOutput)
}

type TaskGrantArrayOutput struct{ *pulumi.OutputState }

func (TaskGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TaskGrant)(nil)).Elem()
}

func (o TaskGrantArrayOutput) ToTaskGrantArrayOutput() TaskGrantArrayOutput {
	return o
}

func (o TaskGrantArrayOutput) ToTaskGrantArrayOutputWithContext(ctx context.Context) TaskGrantArrayOutput {
	return o
}

func (o TaskGrantArrayOutput) Index(i pulumi.IntInput) TaskGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TaskGrant {
		return vs[0].([]*TaskGrant)[vs[1].(int)]
	}).(TaskGrantOutput)
}

type TaskGrantMapOutput struct{ *pulumi.OutputState }

func (TaskGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TaskGrant)(nil)).Elem()
}

func (o TaskGrantMapOutput) ToTaskGrantMapOutput() TaskGrantMapOutput {
	return o
}

func (o TaskGrantMapOutput) ToTaskGrantMapOutputWithContext(ctx context.Context) TaskGrantMapOutput {
	return o
}

func (o TaskGrantMapOutput) MapIndex(k pulumi.StringInput) TaskGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TaskGrant {
		return vs[0].(map[string]*TaskGrant)[vs[1].(string)]
	}).(TaskGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TaskGrantInput)(nil)).Elem(), &TaskGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*TaskGrantArrayInput)(nil)).Elem(), TaskGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TaskGrantMapInput)(nil)).Elem(), TaskGrantMap{})
	pulumi.RegisterOutputType(TaskGrantOutput{})
	pulumi.RegisterOutputType(TaskGrantArrayOutput{})
	pulumi.RegisterOutputType(TaskGrantMapOutput{})
}
