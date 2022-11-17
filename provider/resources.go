// Copyright 2016-2018, Pulumi Corporation.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package snowflake

import (
	"fmt"
	snowflake "github.com/Snowflake-Labs/terraform-provider-snowflake/pkg/provider"
	"path/filepath"

	"github.com/dirien/pulumi-snowflake/provider/pkg/version"
	"github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfbridge"
	shim "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim"
	shimv2 "github.com/pulumi/pulumi-terraform-bridge/v3/pkg/tfshim/sdk-v2"
	"github.com/pulumi/pulumi/sdk/v3/go/common/resource"
)

// all of the token components used below.
const (
	// This variable controls the default name of the package in the package
	// registries for nodejs and python:
	mainPkg = "snowflake"
	// modules:
	mainMod = "index" // the snowflake module
)

// preConfigureCallback is called before the providerConfigure function of the underlying provider.
// It should validate that the provider can be configured, and provide actionable errors in the case
// it cannot be. Configuration variables can be read from `vars` using the `stringValue` function -
// for example `stringValue(vars, "accessKey")`.
func preConfigureCallback(vars resource.PropertyMap, c shim.ResourceConfig) error {
	return nil
}

// Provider returns additional overlaid schema and metadata associated with the provider..
func Provider() tfbridge.ProviderInfo {
	// Instantiate the Terraform provider
	p := shimv2.NewProvider(snowflake.Provider())

	// Create a Pulumi provider mapping
	prov := tfbridge.ProviderInfo{
		P:    p,
		Name: "snowflake",
		// DisplayName is a way to be able to change the casing of the provider
		// name when being displayed on the Pulumi registry
		DisplayName: "Snowflake",
		// The default publisher for all packages is Pulumi.
		// Change this to your personal name (or a company name) that you
		// would like to be shown in the Pulumi Registry if this package is published
		// there.
		Publisher: "Pulumi",
		// LogoURL is optional but useful to help identify your package in the Pulumi Registry
		// if this package is published there.
		//
		// You may host a logo on a domain you control or add an SVG logo for your package
		// in your repository and use the raw content URL for that file as your logo URL.
		LogoURL: "",
		// PluginDownloadURL is an optional URL used to download the Provider
		// for use in Pulumi programs
		// e.g https://github.com/org/pulumi-provider-name/releases/
		PluginDownloadURL: "github://api.github.com/dirien/pulumi-snowflake",
		Description:       "A Pulumi package for creating and managing snowflake cloud resources.",
		// category/cloud tag helps with categorizing the package in the Pulumi Registry.
		// For all available categories, see `Keywords` in
		// https://www.pulumi.com/docs/guides/pulumi-packages/schema/#package.
		Keywords:   []string{"pulumi", "snowflake", "category/database"},
		License:    "Apache-2.0",
		Homepage:   "https://www.pulumi.com",
		Repository: "https://github.com/dirien/pulumi-snowflake",
		// The GitHub Org for the provider - defaults to `terraform-providers`. Note that this
		// should match the TF provider module's require directive, not any replace directives.
		GitHubOrg: "Snowflake-Labs",
		Config:    map[string]*tfbridge.SchemaInfo{
			// Add any required configuration here, or remove the example below if
			// no additional points are required.
			// "region": {
			// 	Type: tfbridge.MakeType("region", "Region"),
			// 	Default: &tfbridge.DefaultInfo{
			// 		EnvVars: []string{"AWS_REGION", "AWS_DEFAULT_REGION"},
			// 	},
			// },
		},
		PreConfigureCallback: preConfigureCallback,
		Resources: map[string]*tfbridge.ResourceInfo{
			// Map each resource in the Terraform provider to a Pulumi type. Two examples
			// are below - the single line form is the common case. The multi-line form is
			// needed only if you wish to override types or other default options.
			//
			// "aws_iam_role": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "IamRole")}
			//
			// "aws_acm_certificate": {
			// 	Tok: tfbridge.MakeResource(mainPkg, mainMod, "Certificate"),
			// 	Fields: map[string]*tfbridge.SchemaInfo{
			// 		"tags": {Type: tfbridge.MakeType(mainPkg, "Tags")},
			// 	},
			// },
			"snowflake_account_grant":                  {Tok: tfbridge.MakeResource(mainPkg, mainMod, "AccountGrant")},
			"snowflake_api_integration":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ApiIntegration")},
			"snowflake_database":                       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Database")},
			"snowflake_database_grant":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "DatabaseGrant")},
			"snowflake_external_function":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ExternalFunction")},
			"snowflake_external_oauth_integration":     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ExternalOauthIntegration")},
			"snowflake_external_table":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ExternalTable")},
			"snowflake_external_table_grant":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ExternalTableGrant")},
			"snowflake_failover_group":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "FailoverGroup")},
			"snowflake_file_format":                    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "FileFormat")},
			"snowflake_file_format_grant":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "FileFormatGrant")},
			"snowflake_function":                       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Function")},
			"snowflake_function_grant":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "FunctionGrant")},
			"snowflake_integration_grant":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "IntegrationGrant")},
			"snowflake_managed_account":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ManagedAccount")},
			"snowflake_masking_policy":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MaskingPolicy")},
			"snowflake_masking_policy_grant":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MaskingPolicyGrant")},
			"snowflake_materialized_view":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MaterializedView")},
			"snowflake_materialized_view_grant":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "MaterializedViewGrant")},
			"snowflake_network_policy":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "NetworkPolicy")},
			"snowflake_network_policy_attachment":      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "NetworkPolicyAttachment")},
			"snowflake_notification_integration":       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "NotificationIntegration")},
			"snowflake_oauth_integration":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "OauthIntegration")},
			"snowflake_pipe":                           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Pipe")},
			"snowflake_pipe_grant":                     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "PipeGrant")},
			"snowflake_procedure":                      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Procedure")},
			"snowflake_procedure_grant":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ProcedureGrant")},
			"snowflake_resource_monitor":               {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ResourceMonitor")},
			"snowflake_resource_monitor_grant":         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ResourceMonitorGrant")},
			"snowflake_role":                           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Role")},
			"snowflake_role_grants":                    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RoleGrants")},
			"snowflake_role_ownership_grant":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RoleOwnershipGrant")},
			"snowflake_row_access_policy":              {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RowAccessPolicy")},
			"snowflake_row_access_policy_grant":        {Tok: tfbridge.MakeResource(mainPkg, mainMod, "RowAccessPolicyGrant")},
			"snowflake_saml_integration":               {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SamlIntegration")},
			"snowflake_schema":                         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Schema")},
			"snowflake_schema_grant":                   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SchemaGrant")},
			"snowflake_scim_integration":               {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ScimIntegration")},
			"snowflake_sequence":                       {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Sequence")},
			"snowflake_sequence_grant":                 {Tok: tfbridge.MakeResource(mainPkg, mainMod, "SequenceGrant")},
			"snowflake_share":                          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Share")},
			"snowflake_stage":                          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Stage")},
			"snowflake_stage_grant":                    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "StageGrant")},
			"snowflake_storage_integration":            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "StorageIntegration")},
			"snowflake_stream":                         {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Stream")},
			"snowflake_stream_grant":                   {Tok: tfbridge.MakeResource(mainPkg, mainMod, "StreamGrant")},
			"snowflake_table":                          {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Table")},
			"snowflake_table_constraint":               {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TableConstraint")},
			"snowflake_table_grant":                    {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TableGrant")},
			"snowflake_tag":                            {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Tag")},
			"snowflake_tag_association":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TagAssociation")},
			"snowflake_tag_grant":                      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TagGrant")},
			"snowflake_tag_masking_policy_association": {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TagMaskingPolicyAssociation")},
			"snowflake_task":                           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Task")},
			"snowflake_task_grant":                     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "TaskGrant")},
			"snowflake_user":                           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "User")},
			"snowflake_user_grant":                     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "UserGrant")},
			"snowflake_user_ownership_grant":           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "UserOwnershipGrant")},
			"snowflake_user_public_keys":               {Tok: tfbridge.MakeResource(mainPkg, mainMod, "UserPublicKeys")},
			"snowflake_view":                           {Tok: tfbridge.MakeResource(mainPkg, mainMod, "View")},
			"snowflake_view_grant":                     {Tok: tfbridge.MakeResource(mainPkg, mainMod, "ViewGrant")},
			"snowflake_warehouse":                      {Tok: tfbridge.MakeResource(mainPkg, mainMod, "Warehouse")},
			"snowflake_warehouse_grant":                {Tok: tfbridge.MakeResource(mainPkg, mainMod, "WarehouseGrant")},
		},
		DataSources: map[string]*tfbridge.DataSourceInfo{
			// Map each resource in the Terraform provider to a Pulumi function. An example
			// is below.
			// "aws_ami": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getAmi")},
			"snowflake_current_account":                    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getCurrentAccount")},
			"snowflake_database":                           {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDatabase")},
			"snowflake_databases":                          {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getDatabases")},
			"snowflake_external_functions":                 {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getExternalFunctions")},
			"snowflake_external_tables":                    {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getExternalTables")},
			"snowflake_file_formats":                       {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getFileFormats")},
			"snowflake_functions":                          {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getFunctions")},
			"snowflake_masking_policies":                   {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getMaskingPolicies")},
			"snowflake_materialized_views":                 {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getMaterializedViews")},
			"snowflake_pipes":                              {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getPipes")},
			"snowflake_procedures":                         {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getProcedures")},
			"snowflake_resource_monitors":                  {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getResourceMonitors")},
			"snowflake_role":                               {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getRole")},
			"snowflake_roles":                              {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getRoles")},
			"snowflake_row_access_policies":                {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getRowAccessPolicies")},
			"snowflake_schemas":                            {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSchemas")},
			"snowflake_sequences":                          {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSequences")},
			"snowflake_stages":                             {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getStages")},
			"snowflake_storage_integrations":               {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getStorageIntegrations")},
			"snowflake_streams":                            {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getStreams")},
			"snowflake_system_generate_scim_access_token":  {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSystemGenerateScimAccessToken")},
			"snowflake_system_get_aws_sns_iam_policy":      {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSystemGetAwsSnsIamPolicy")},
			"snowflake_system_get_privatelink_config":      {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSystemGetPrivatelinkConfig")},
			"snowflake_system_get_snowflake_platform_info": {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getSystemGetSnowflakePlatformInfo")},
			"snowflake_tables":                             {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getTables")},
			"snowflake_tasks":                              {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getTasks")},
			"snowflake_users":                              {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getUsers")},
			"snowflake_views":                              {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getViews")},
			"snowflake_warehouses":                         {Tok: tfbridge.MakeDataSource(mainPkg, mainMod, "getWarehouses")},
		},
		JavaScript: &tfbridge.JavaScriptInfo{
			PackageName: "@pulumi/snowflake",
			// List any npm dependencies and their versions
			Dependencies: map[string]string{
				"@pulumi/pulumi": "^3.0.0",
			},
			DevDependencies: map[string]string{
				"@types/node": "^10.0.0", // so we can access strongly typed node definitions.
				"@types/mime": "^2.0.0",
			},
			// See the documentation for tfbridge.OverlayInfo for how to lay out this
			// section, or refer to the AWS provider. Delete this section if there are
			// no overlay files.
			//Overlay: &tfbridge.OverlayInfo{},
		},
		Python: &tfbridge.PythonInfo{
			PackageName: "pulumi_snowflake",
			// List any Python dependencies and their version ranges
			Requires: map[string]string{
				"pulumi": ">=3.0.0,<4.0.0",
			},
		},
		Golang: &tfbridge.GolangInfo{
			ImportBasePath: filepath.Join(
				fmt.Sprintf("github.com/dirien/pulumi-%[1]s/sdk/", mainPkg),
				tfbridge.GetModuleMajorVersion(version.Version),
				"go",
				mainPkg,
			),
			GenerateResourceContainerTypes: true,
		},
		CSharp: &tfbridge.CSharpInfo{
			RootNamespace: "Pulumi",
			PackageReferences: map[string]string{
				"Pulumi": "3.*",
			},
		},
		Java: &tfbridge.JavaInfo{
			BasePackage: "com.pulumi",
		},
	}

	prov.SetAutonaming(255, "-")

	return prov
}
