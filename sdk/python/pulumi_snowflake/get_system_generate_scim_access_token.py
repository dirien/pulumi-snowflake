# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetSystemGenerateScimAccessTokenResult',
    'AwaitableGetSystemGenerateScimAccessTokenResult',
    'get_system_generate_scim_access_token',
    'get_system_generate_scim_access_token_output',
]

@pulumi.output_type
class GetSystemGenerateScimAccessTokenResult:
    """
    A collection of values returned by getSystemGenerateScimAccessToken.
    """
    def __init__(__self__, access_token=None, id=None, integration_name=None):
        if access_token and not isinstance(access_token, str):
            raise TypeError("Expected argument 'access_token' to be a str")
        pulumi.set(__self__, "access_token", access_token)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if integration_name and not isinstance(integration_name, str):
            raise TypeError("Expected argument 'integration_name' to be a str")
        pulumi.set(__self__, "integration_name", integration_name)

    @property
    @pulumi.getter(name="accessToken")
    def access_token(self) -> str:
        """
        SCIM Access Token
        """
        return pulumi.get(self, "access_token")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="integrationName")
    def integration_name(self) -> str:
        """
        SCIM Integration Name
        """
        return pulumi.get(self, "integration_name")


class AwaitableGetSystemGenerateScimAccessTokenResult(GetSystemGenerateScimAccessTokenResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetSystemGenerateScimAccessTokenResult(
            access_token=self.access_token,
            id=self.id,
            integration_name=self.integration_name)


def get_system_generate_scim_access_token(integration_name: Optional[str] = None,
                                          opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetSystemGenerateScimAccessTokenResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    scim = snowflake.get_system_generate_scim_access_token(integration_name="AAD_PROVISIONING")
    ```


    :param str integration_name: SCIM Integration Name
    """
    __args__ = dict()
    __args__['integrationName'] = integration_name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getSystemGenerateScimAccessToken:getSystemGenerateScimAccessToken', __args__, opts=opts, typ=GetSystemGenerateScimAccessTokenResult).value

    return AwaitableGetSystemGenerateScimAccessTokenResult(
        access_token=__ret__.access_token,
        id=__ret__.id,
        integration_name=__ret__.integration_name)


@_utilities.lift_output_func(get_system_generate_scim_access_token)
def get_system_generate_scim_access_token_output(integration_name: Optional[pulumi.Input[str]] = None,
                                                 opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetSystemGenerateScimAccessTokenResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    scim = snowflake.get_system_generate_scim_access_token(integration_name="AAD_PROVISIONING")
    ```


    :param str integration_name: SCIM Integration Name
    """
    ...