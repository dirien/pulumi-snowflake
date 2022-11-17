# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = ['MaskingPolicyArgs', 'MaskingPolicy']

@pulumi.input_type
class MaskingPolicyArgs:
    def __init__(__self__, *,
                 database: pulumi.Input[str],
                 masking_expression: pulumi.Input[str],
                 return_data_type: pulumi.Input[str],
                 schema: pulumi.Input[str],
                 value_data_type: pulumi.Input[str],
                 comment: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a MaskingPolicy resource.
        :param pulumi.Input[str] database: The database in which to create the masking policy.
        :param pulumi.Input[str] masking_expression: Specifies the SQL expression that transforms the data.
        :param pulumi.Input[str] return_data_type: Specifies the data type to return.
        :param pulumi.Input[str] schema: The schema in which to create the masking policy.
        :param pulumi.Input[str] value_data_type: Specifies the data type to mask.
        :param pulumi.Input[str] comment: Specifies a comment for the masking policy.
        :param pulumi.Input[str] name: Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
        """
        pulumi.set(__self__, "database", database)
        pulumi.set(__self__, "masking_expression", masking_expression)
        pulumi.set(__self__, "return_data_type", return_data_type)
        pulumi.set(__self__, "schema", schema)
        pulumi.set(__self__, "value_data_type", value_data_type)
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def database(self) -> pulumi.Input[str]:
        """
        The database in which to create the masking policy.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: pulumi.Input[str]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="maskingExpression")
    def masking_expression(self) -> pulumi.Input[str]:
        """
        Specifies the SQL expression that transforms the data.
        """
        return pulumi.get(self, "masking_expression")

    @masking_expression.setter
    def masking_expression(self, value: pulumi.Input[str]):
        pulumi.set(self, "masking_expression", value)

    @property
    @pulumi.getter(name="returnDataType")
    def return_data_type(self) -> pulumi.Input[str]:
        """
        Specifies the data type to return.
        """
        return pulumi.get(self, "return_data_type")

    @return_data_type.setter
    def return_data_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "return_data_type", value)

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Input[str]:
        """
        The schema in which to create the masking policy.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: pulumi.Input[str]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="valueDataType")
    def value_data_type(self) -> pulumi.Input[str]:
        """
        Specifies the data type to mask.
        """
        return pulumi.get(self, "value_data_type")

    @value_data_type.setter
    def value_data_type(self, value: pulumi.Input[str]):
        pulumi.set(self, "value_data_type", value)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the masking policy.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _MaskingPolicyState:
    def __init__(__self__, *,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 masking_expression: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 qualified_name: Optional[pulumi.Input[str]] = None,
                 return_data_type: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 value_data_type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering MaskingPolicy resources.
        :param pulumi.Input[str] comment: Specifies a comment for the masking policy.
        :param pulumi.Input[str] database: The database in which to create the masking policy.
        :param pulumi.Input[str] masking_expression: Specifies the SQL expression that transforms the data.
        :param pulumi.Input[str] name: Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
        :param pulumi.Input[str] qualified_name: Specifies the qualified identifier for the masking policy.
        :param pulumi.Input[str] return_data_type: Specifies the data type to return.
        :param pulumi.Input[str] schema: The schema in which to create the masking policy.
        :param pulumi.Input[str] value_data_type: Specifies the data type to mask.
        """
        if comment is not None:
            pulumi.set(__self__, "comment", comment)
        if database is not None:
            pulumi.set(__self__, "database", database)
        if masking_expression is not None:
            pulumi.set(__self__, "masking_expression", masking_expression)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if qualified_name is not None:
            pulumi.set(__self__, "qualified_name", qualified_name)
        if return_data_type is not None:
            pulumi.set(__self__, "return_data_type", return_data_type)
        if schema is not None:
            pulumi.set(__self__, "schema", schema)
        if value_data_type is not None:
            pulumi.set(__self__, "value_data_type", value_data_type)

    @property
    @pulumi.getter
    def comment(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies a comment for the masking policy.
        """
        return pulumi.get(self, "comment")

    @comment.setter
    def comment(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "comment", value)

    @property
    @pulumi.getter
    def database(self) -> Optional[pulumi.Input[str]]:
        """
        The database in which to create the masking policy.
        """
        return pulumi.get(self, "database")

    @database.setter
    def database(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "database", value)

    @property
    @pulumi.getter(name="maskingExpression")
    def masking_expression(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the SQL expression that transforms the data.
        """
        return pulumi.get(self, "masking_expression")

    @masking_expression.setter
    def masking_expression(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "masking_expression", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="qualifiedName")
    def qualified_name(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the qualified identifier for the masking policy.
        """
        return pulumi.get(self, "qualified_name")

    @qualified_name.setter
    def qualified_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "qualified_name", value)

    @property
    @pulumi.getter(name="returnDataType")
    def return_data_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the data type to return.
        """
        return pulumi.get(self, "return_data_type")

    @return_data_type.setter
    def return_data_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "return_data_type", value)

    @property
    @pulumi.getter
    def schema(self) -> Optional[pulumi.Input[str]]:
        """
        The schema in which to create the masking policy.
        """
        return pulumi.get(self, "schema")

    @schema.setter
    def schema(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "schema", value)

    @property
    @pulumi.getter(name="valueDataType")
    def value_data_type(self) -> Optional[pulumi.Input[str]]:
        """
        Specifies the data type to mask.
        """
        return pulumi.get(self, "value_data_type")

    @value_data_type.setter
    def value_data_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "value_data_type", value)


class MaskingPolicy(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 masking_expression: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 return_data_type: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 value_data_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        example_masking_policy = snowflake.MaskingPolicy("exampleMaskingPolicy",
            database="EXAMPLE_DB",
            masking_expression="case when current_role() in ('ANALYST') then val else sha2(val, 512) end",
            return_data_type="string",
            schema="EXAMPLE_SCHEMA",
            value_data_type="string")
        ```

        ## Import

        format is database name | schema name | policy name

        ```sh
         $ pulumi import snowflake:index/maskingPolicy:MaskingPolicy example 'dbName|schemaName|policyName'
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the masking policy.
        :param pulumi.Input[str] database: The database in which to create the masking policy.
        :param pulumi.Input[str] masking_expression: Specifies the SQL expression that transforms the data.
        :param pulumi.Input[str] name: Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
        :param pulumi.Input[str] return_data_type: Specifies the data type to return.
        :param pulumi.Input[str] schema: The schema in which to create the masking policy.
        :param pulumi.Input[str] value_data_type: Specifies the data type to mask.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: MaskingPolicyArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_snowflake as snowflake

        example_masking_policy = snowflake.MaskingPolicy("exampleMaskingPolicy",
            database="EXAMPLE_DB",
            masking_expression="case when current_role() in ('ANALYST') then val else sha2(val, 512) end",
            return_data_type="string",
            schema="EXAMPLE_SCHEMA",
            value_data_type="string")
        ```

        ## Import

        format is database name | schema name | policy name

        ```sh
         $ pulumi import snowflake:index/maskingPolicy:MaskingPolicy example 'dbName|schemaName|policyName'
        ```

        :param str resource_name: The name of the resource.
        :param MaskingPolicyArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(MaskingPolicyArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 comment: Optional[pulumi.Input[str]] = None,
                 database: Optional[pulumi.Input[str]] = None,
                 masking_expression: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 return_data_type: Optional[pulumi.Input[str]] = None,
                 schema: Optional[pulumi.Input[str]] = None,
                 value_data_type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = MaskingPolicyArgs.__new__(MaskingPolicyArgs)

            __props__.__dict__["comment"] = comment
            if database is None and not opts.urn:
                raise TypeError("Missing required property 'database'")
            __props__.__dict__["database"] = database
            if masking_expression is None and not opts.urn:
                raise TypeError("Missing required property 'masking_expression'")
            __props__.__dict__["masking_expression"] = masking_expression
            __props__.__dict__["name"] = name
            if return_data_type is None and not opts.urn:
                raise TypeError("Missing required property 'return_data_type'")
            __props__.__dict__["return_data_type"] = return_data_type
            if schema is None and not opts.urn:
                raise TypeError("Missing required property 'schema'")
            __props__.__dict__["schema"] = schema
            if value_data_type is None and not opts.urn:
                raise TypeError("Missing required property 'value_data_type'")
            __props__.__dict__["value_data_type"] = value_data_type
            __props__.__dict__["qualified_name"] = None
        super(MaskingPolicy, __self__).__init__(
            'snowflake:index/maskingPolicy:MaskingPolicy',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            comment: Optional[pulumi.Input[str]] = None,
            database: Optional[pulumi.Input[str]] = None,
            masking_expression: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            qualified_name: Optional[pulumi.Input[str]] = None,
            return_data_type: Optional[pulumi.Input[str]] = None,
            schema: Optional[pulumi.Input[str]] = None,
            value_data_type: Optional[pulumi.Input[str]] = None) -> 'MaskingPolicy':
        """
        Get an existing MaskingPolicy resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comment: Specifies a comment for the masking policy.
        :param pulumi.Input[str] database: The database in which to create the masking policy.
        :param pulumi.Input[str] masking_expression: Specifies the SQL expression that transforms the data.
        :param pulumi.Input[str] name: Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
        :param pulumi.Input[str] qualified_name: Specifies the qualified identifier for the masking policy.
        :param pulumi.Input[str] return_data_type: Specifies the data type to return.
        :param pulumi.Input[str] schema: The schema in which to create the masking policy.
        :param pulumi.Input[str] value_data_type: Specifies the data type to mask.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _MaskingPolicyState.__new__(_MaskingPolicyState)

        __props__.__dict__["comment"] = comment
        __props__.__dict__["database"] = database
        __props__.__dict__["masking_expression"] = masking_expression
        __props__.__dict__["name"] = name
        __props__.__dict__["qualified_name"] = qualified_name
        __props__.__dict__["return_data_type"] = return_data_type
        __props__.__dict__["schema"] = schema
        __props__.__dict__["value_data_type"] = value_data_type
        return MaskingPolicy(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def comment(self) -> pulumi.Output[Optional[str]]:
        """
        Specifies a comment for the masking policy.
        """
        return pulumi.get(self, "comment")

    @property
    @pulumi.getter
    def database(self) -> pulumi.Output[str]:
        """
        The database in which to create the masking policy.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter(name="maskingExpression")
    def masking_expression(self) -> pulumi.Output[str]:
        """
        Specifies the SQL expression that transforms the data.
        """
        return pulumi.get(self, "masking_expression")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        Specifies the identifier for the masking policy; must be unique for the database and schema in which the masking policy is created.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="qualifiedName")
    def qualified_name(self) -> pulumi.Output[str]:
        """
        Specifies the qualified identifier for the masking policy.
        """
        return pulumi.get(self, "qualified_name")

    @property
    @pulumi.getter(name="returnDataType")
    def return_data_type(self) -> pulumi.Output[str]:
        """
        Specifies the data type to return.
        """
        return pulumi.get(self, "return_data_type")

    @property
    @pulumi.getter
    def schema(self) -> pulumi.Output[str]:
        """
        The schema in which to create the masking policy.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter(name="valueDataType")
    def value_data_type(self) -> pulumi.Output[str]:
        """
        Specifies the data type to mask.
        """
        return pulumi.get(self, "value_data_type")
