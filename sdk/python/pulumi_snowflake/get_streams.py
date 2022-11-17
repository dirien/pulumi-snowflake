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
    'GetStreamsResult',
    'AwaitableGetStreamsResult',
    'get_streams',
    'get_streams_output',
]

@pulumi.output_type
class GetStreamsResult:
    """
    A collection of values returned by getStreams.
    """
    def __init__(__self__, database=None, id=None, schema=None, streams=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if schema and not isinstance(schema, str):
            raise TypeError("Expected argument 'schema' to be a str")
        pulumi.set(__self__, "schema", schema)
        if streams and not isinstance(streams, list):
            raise TypeError("Expected argument 'streams' to be a list")
        pulumi.set(__self__, "streams", streams)

    @property
    @pulumi.getter
    def database(self) -> str:
        """
        The database from which to return the streams from.
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
    @pulumi.getter
    def schema(self) -> str:
        """
        The schema from which to return the streams from.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def streams(self) -> Sequence['outputs.GetStreamsStreamResult']:
        """
        The streams in the schema
        """
        return pulumi.get(self, "streams")


class AwaitableGetStreamsResult(GetStreamsResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetStreamsResult(
            database=self.database,
            id=self.id,
            schema=self.schema,
            streams=self.streams)


def get_streams(database: Optional[str] = None,
                schema: Optional[str] = None,
                opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetStreamsResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_streams(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the streams from.
    :param str schema: The schema from which to return the streams from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getStreams:getStreams', __args__, opts=opts, typ=GetStreamsResult).value

    return AwaitableGetStreamsResult(
        database=__ret__.database,
        id=__ret__.id,
        schema=__ret__.schema,
        streams=__ret__.streams)


@_utilities.lift_output_func(get_streams)
def get_streams_output(database: Optional[pulumi.Input[str]] = None,
                       schema: Optional[pulumi.Input[str]] = None,
                       opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetStreamsResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_streams(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the streams from.
    :param str schema: The schema from which to return the streams from.
    """
    ...