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
    'GetTasksResult',
    'AwaitableGetTasksResult',
    'get_tasks',
    'get_tasks_output',
]

@pulumi.output_type
class GetTasksResult:
    """
    A collection of values returned by getTasks.
    """
    def __init__(__self__, database=None, id=None, schema=None, tasks=None):
        if database and not isinstance(database, str):
            raise TypeError("Expected argument 'database' to be a str")
        pulumi.set(__self__, "database", database)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if schema and not isinstance(schema, str):
            raise TypeError("Expected argument 'schema' to be a str")
        pulumi.set(__self__, "schema", schema)
        if tasks and not isinstance(tasks, list):
            raise TypeError("Expected argument 'tasks' to be a list")
        pulumi.set(__self__, "tasks", tasks)

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
    @pulumi.getter
    def schema(self) -> str:
        """
        The schema from which to return the tasks from.
        """
        return pulumi.get(self, "schema")

    @property
    @pulumi.getter
    def tasks(self) -> Sequence['outputs.GetTasksTaskResult']:
        """
        The tasks in the schema
        """
        return pulumi.get(self, "tasks")


class AwaitableGetTasksResult(GetTasksResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetTasksResult(
            database=self.database,
            id=self.id,
            schema=self.schema,
            tasks=self.tasks)


def get_tasks(database: Optional[str] = None,
              schema: Optional[str] = None,
              opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetTasksResult:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_tasks(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the tasks from.
    """
    __args__ = dict()
    __args__['database'] = database
    __args__['schema'] = schema
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('snowflake:index/getTasks:getTasks', __args__, opts=opts, typ=GetTasksResult).value

    return AwaitableGetTasksResult(
        database=__ret__.database,
        id=__ret__.id,
        schema=__ret__.schema,
        tasks=__ret__.tasks)


@_utilities.lift_output_func(get_tasks)
def get_tasks_output(database: Optional[pulumi.Input[str]] = None,
                     schema: Optional[pulumi.Input[str]] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetTasksResult]:
    """
    ## Example Usage

    ```python
    import pulumi
    import pulumi_snowflake as snowflake

    current = snowflake.get_tasks(database="MYDB",
        schema="MYSCHEMA")
    ```


    :param str database: The database from which to return the schemas from.
    :param str schema: The schema from which to return the tasks from.
    """
    ...