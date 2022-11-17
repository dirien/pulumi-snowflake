// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package snowflake

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type UserOwnershipGrant struct {
	pulumi.CustomResourceState

	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants pulumi.StringPtrOutput `pulumi:"currentGrants"`
	// The name of the user ownership is granted on.
	OnUserName pulumi.StringOutput `pulumi:"onUserName"`
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName pulumi.StringPtrOutput `pulumi:"revertOwnershipToRoleName"`
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName pulumi.StringOutput `pulumi:"toRoleName"`
}

// NewUserOwnershipGrant registers a new resource with the given unique name, arguments, and options.
func NewUserOwnershipGrant(ctx *pulumi.Context,
	name string, args *UserOwnershipGrantArgs, opts ...pulumi.ResourceOption) (*UserOwnershipGrant, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.OnUserName == nil {
		return nil, errors.New("invalid value for required argument 'OnUserName'")
	}
	if args.ToRoleName == nil {
		return nil, errors.New("invalid value for required argument 'ToRoleName'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource UserOwnershipGrant
	err := ctx.RegisterResource("snowflake:index/userOwnershipGrant:UserOwnershipGrant", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserOwnershipGrant gets an existing UserOwnershipGrant resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserOwnershipGrant(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserOwnershipGrantState, opts ...pulumi.ResourceOption) (*UserOwnershipGrant, error) {
	var resource UserOwnershipGrant
	err := ctx.ReadResource("snowflake:index/userOwnershipGrant:UserOwnershipGrant", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserOwnershipGrant resources.
type userOwnershipGrantState struct {
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants *string `pulumi:"currentGrants"`
	// The name of the user ownership is granted on.
	OnUserName *string `pulumi:"onUserName"`
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName *string `pulumi:"toRoleName"`
}

type UserOwnershipGrantState struct {
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants pulumi.StringPtrInput
	// The name of the user ownership is granted on.
	OnUserName pulumi.StringPtrInput
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName pulumi.StringPtrInput
}

func (UserOwnershipGrantState) ElementType() reflect.Type {
	return reflect.TypeOf((*userOwnershipGrantState)(nil)).Elem()
}

type userOwnershipGrantArgs struct {
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants *string `pulumi:"currentGrants"`
	// The name of the user ownership is granted on.
	OnUserName string `pulumi:"onUserName"`
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName *string `pulumi:"revertOwnershipToRoleName"`
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName string `pulumi:"toRoleName"`
}

// The set of arguments for constructing a UserOwnershipGrant resource.
type UserOwnershipGrantArgs struct {
	// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
	CurrentGrants pulumi.StringPtrInput
	// The name of the user ownership is granted on.
	OnUserName pulumi.StringInput
	// The name of the role to revert ownership to on destroy.
	RevertOwnershipToRoleName pulumi.StringPtrInput
	// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
	ToRoleName pulumi.StringInput
}

func (UserOwnershipGrantArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userOwnershipGrantArgs)(nil)).Elem()
}

type UserOwnershipGrantInput interface {
	pulumi.Input

	ToUserOwnershipGrantOutput() UserOwnershipGrantOutput
	ToUserOwnershipGrantOutputWithContext(ctx context.Context) UserOwnershipGrantOutput
}

func (*UserOwnershipGrant) ElementType() reflect.Type {
	return reflect.TypeOf((**UserOwnershipGrant)(nil)).Elem()
}

func (i *UserOwnershipGrant) ToUserOwnershipGrantOutput() UserOwnershipGrantOutput {
	return i.ToUserOwnershipGrantOutputWithContext(context.Background())
}

func (i *UserOwnershipGrant) ToUserOwnershipGrantOutputWithContext(ctx context.Context) UserOwnershipGrantOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOwnershipGrantOutput)
}

// UserOwnershipGrantArrayInput is an input type that accepts UserOwnershipGrantArray and UserOwnershipGrantArrayOutput values.
// You can construct a concrete instance of `UserOwnershipGrantArrayInput` via:
//
//	UserOwnershipGrantArray{ UserOwnershipGrantArgs{...} }
type UserOwnershipGrantArrayInput interface {
	pulumi.Input

	ToUserOwnershipGrantArrayOutput() UserOwnershipGrantArrayOutput
	ToUserOwnershipGrantArrayOutputWithContext(context.Context) UserOwnershipGrantArrayOutput
}

type UserOwnershipGrantArray []UserOwnershipGrantInput

func (UserOwnershipGrantArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserOwnershipGrant)(nil)).Elem()
}

func (i UserOwnershipGrantArray) ToUserOwnershipGrantArrayOutput() UserOwnershipGrantArrayOutput {
	return i.ToUserOwnershipGrantArrayOutputWithContext(context.Background())
}

func (i UserOwnershipGrantArray) ToUserOwnershipGrantArrayOutputWithContext(ctx context.Context) UserOwnershipGrantArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOwnershipGrantArrayOutput)
}

// UserOwnershipGrantMapInput is an input type that accepts UserOwnershipGrantMap and UserOwnershipGrantMapOutput values.
// You can construct a concrete instance of `UserOwnershipGrantMapInput` via:
//
//	UserOwnershipGrantMap{ "key": UserOwnershipGrantArgs{...} }
type UserOwnershipGrantMapInput interface {
	pulumi.Input

	ToUserOwnershipGrantMapOutput() UserOwnershipGrantMapOutput
	ToUserOwnershipGrantMapOutputWithContext(context.Context) UserOwnershipGrantMapOutput
}

type UserOwnershipGrantMap map[string]UserOwnershipGrantInput

func (UserOwnershipGrantMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserOwnershipGrant)(nil)).Elem()
}

func (i UserOwnershipGrantMap) ToUserOwnershipGrantMapOutput() UserOwnershipGrantMapOutput {
	return i.ToUserOwnershipGrantMapOutputWithContext(context.Background())
}

func (i UserOwnershipGrantMap) ToUserOwnershipGrantMapOutputWithContext(ctx context.Context) UserOwnershipGrantMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserOwnershipGrantMapOutput)
}

type UserOwnershipGrantOutput struct{ *pulumi.OutputState }

func (UserOwnershipGrantOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserOwnershipGrant)(nil)).Elem()
}

func (o UserOwnershipGrantOutput) ToUserOwnershipGrantOutput() UserOwnershipGrantOutput {
	return o
}

func (o UserOwnershipGrantOutput) ToUserOwnershipGrantOutputWithContext(ctx context.Context) UserOwnershipGrantOutput {
	return o
}

// Specifies whether to remove or transfer all existing outbound privileges on the object when ownership is transferred to a new role.
func (o UserOwnershipGrantOutput) CurrentGrants() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UserOwnershipGrant) pulumi.StringPtrOutput { return v.CurrentGrants }).(pulumi.StringPtrOutput)
}

// The name of the user ownership is granted on.
func (o UserOwnershipGrantOutput) OnUserName() pulumi.StringOutput {
	return o.ApplyT(func(v *UserOwnershipGrant) pulumi.StringOutput { return v.OnUserName }).(pulumi.StringOutput)
}

// The name of the role to revert ownership to on destroy.
func (o UserOwnershipGrantOutput) RevertOwnershipToRoleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *UserOwnershipGrant) pulumi.StringPtrOutput { return v.RevertOwnershipToRoleName }).(pulumi.StringPtrOutput)
}

// The name of the role to grant ownership. Please ensure that the role that terraform is using is granted access.
func (o UserOwnershipGrantOutput) ToRoleName() pulumi.StringOutput {
	return o.ApplyT(func(v *UserOwnershipGrant) pulumi.StringOutput { return v.ToRoleName }).(pulumi.StringOutput)
}

type UserOwnershipGrantArrayOutput struct{ *pulumi.OutputState }

func (UserOwnershipGrantArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserOwnershipGrant)(nil)).Elem()
}

func (o UserOwnershipGrantArrayOutput) ToUserOwnershipGrantArrayOutput() UserOwnershipGrantArrayOutput {
	return o
}

func (o UserOwnershipGrantArrayOutput) ToUserOwnershipGrantArrayOutputWithContext(ctx context.Context) UserOwnershipGrantArrayOutput {
	return o
}

func (o UserOwnershipGrantArrayOutput) Index(i pulumi.IntInput) UserOwnershipGrantOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserOwnershipGrant {
		return vs[0].([]*UserOwnershipGrant)[vs[1].(int)]
	}).(UserOwnershipGrantOutput)
}

type UserOwnershipGrantMapOutput struct{ *pulumi.OutputState }

func (UserOwnershipGrantMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserOwnershipGrant)(nil)).Elem()
}

func (o UserOwnershipGrantMapOutput) ToUserOwnershipGrantMapOutput() UserOwnershipGrantMapOutput {
	return o
}

func (o UserOwnershipGrantMapOutput) ToUserOwnershipGrantMapOutputWithContext(ctx context.Context) UserOwnershipGrantMapOutput {
	return o
}

func (o UserOwnershipGrantMapOutput) MapIndex(k pulumi.StringInput) UserOwnershipGrantOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserOwnershipGrant {
		return vs[0].(map[string]*UserOwnershipGrant)[vs[1].(string)]
	}).(UserOwnershipGrantOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserOwnershipGrantInput)(nil)).Elem(), &UserOwnershipGrant{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserOwnershipGrantArrayInput)(nil)).Elem(), UserOwnershipGrantArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserOwnershipGrantMapInput)(nil)).Elem(), UserOwnershipGrantMap{})
	pulumi.RegisterOutputType(UserOwnershipGrantOutput{})
	pulumi.RegisterOutputType(UserOwnershipGrantArrayOutput{})
	pulumi.RegisterOutputType(UserOwnershipGrantMapOutput{})
}
