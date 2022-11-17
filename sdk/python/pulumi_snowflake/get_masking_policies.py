# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs

__all__ = [
    'GetMaskingPoliciesResult',
    'AwaitableGetMaskingPoliciesResult',
    'get_masking_policies',
    'get_masking_policies_output',
]

@pulumi.output_type
class GetMaskingPoliciesResult:
    """
    A collection of values returned by getMaskingPolicies.
    """
    def __init__(__self__, database=None, id=None, masking_policies=None, schema=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if masking_policies and not isinstance(masking_policies, list):
            raise TypeError("Expected argument 'masking_policies' to be a list")
        pulumi.set(__self__, "masking_policies", masking_policies)
        if schema and not isinstance(schema, str):
            raise TypeError("Expected argument 'schema' to be a str")
        pulumi.set(__self__, "schema", schema)

    @property
    @pulumi.getter
    def database(self) -> str:
        """
        The database from which to return the schemas from.
        """
        return pulumi.get(self, "database")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="maskingPolicies")
    def masking_policies(self) -> Sequence['outputs.GetMaskingPoliciesMaskingPolicyResult']:
        """
        The maskingPolicies in the schema
        """
        return pulumi.get(self, "masking_policies")

    @property
    @pulumi.getter
    def schema(self) -> str:
        """
        The schema from which to return the maskingPolicies from.
        """
        return pulumi.get(self, "schema")


class AwaitableGetMaskingPoliciesResult(GetMaskingPoliciesResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetMaskingPoliciesResult(
            database=self.database,
            id=self.id,
            masking_policies=self.masking_policies,
            schema=self.schema)


def get_masking_policies(database: Optional[str] = None,
                         schema: Optional[str] = None,
                         opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetMaskingPoliciesResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_masking_policies(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the maskingPolicies from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getMaskingPolicies:getMaskingPolicies', __args__, opts=opts, typ=GetMaskingPoliciesResult).value

    return AwaitableGetMaskingPoliciesResult(
        database=__ret__.database,
        id=__ret__.id,
        masking_policies=__ret__.masking_policies,
        schema=__ret__.schema)


@_utilities.lift_output_func(get_masking_policies)
def get_masking_policies_output(database: Optional[pulumi.Input[str]] = None,
                                schema: Optional[pulumi.Input[str]] = None,
                                opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetMaskingPoliciesResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_masking_policies(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the maskingPolicies from.
    """
    ...