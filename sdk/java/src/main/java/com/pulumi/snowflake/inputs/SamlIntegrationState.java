// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SamlIntegrationState extends com.pulumi.resources.ResourceArgs {

    public static final SamlIntegrationState Empty = new SamlIntegrationState();

    /**
     * Date and time when the SAML integration was created.
     * 
     */
    @Import(name="createdOn")
    private @Nullable Output<String> createdOn;

    /**
     * @return Date and time when the SAML integration was created.
     * 
     */
    public Optional<Output<String>> createdOn() {
        return Optional.ofNullable(this.createdOn);
    }

    /**
     * Specifies whether this security integration is enabled or disabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Specifies whether this security integration is enabled or disabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="saml2DigestMethodsUsed")
    private @Nullable Output<String> saml2DigestMethodsUsed;

    public Optional<Output<String>> saml2DigestMethodsUsed() {
        return Optional.ofNullable(this.saml2DigestMethodsUsed);
    }

    /**
     * The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in WIth button on the login page.  FALSE: does not display the Log in With button on the login page.
     * 
     */
    @Import(name="saml2EnableSpInitiated")
    private @Nullable Output<Boolean> saml2EnableSpInitiated;

    /**
     * @return The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in WIth button on the login page.  FALSE: does not display the Log in With button on the login page.
     * 
     */
    public Optional<Output<Boolean>> saml2EnableSpInitiated() {
        return Optional.ofNullable(this.saml2EnableSpInitiated);
    }

    /**
     * The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake.
     * 
     */
    @Import(name="saml2ForceAuthn")
    private @Nullable Output<Boolean> saml2ForceAuthn;

    /**
     * @return The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake.
     * 
     */
    public Optional<Output<Boolean>> saml2ForceAuthn() {
        return Optional.ofNullable(this.saml2ForceAuthn);
    }

    /**
     * The string containing the IdP EntityID / Issuer.
     * 
     */
    @Import(name="saml2Issuer")
    private @Nullable Output<String> saml2Issuer;

    /**
     * @return The string containing the IdP EntityID / Issuer.
     * 
     */
    public Optional<Output<String>> saml2Issuer() {
        return Optional.ofNullable(this.saml2Issuer);
    }

    /**
     * The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     * 
     */
    @Import(name="saml2PostLogoutRedirectUrl")
    private @Nullable Output<String> saml2PostLogoutRedirectUrl;

    /**
     * @return The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
     * 
     */
    public Optional<Output<String>> saml2PostLogoutRedirectUrl() {
        return Optional.ofNullable(this.saml2PostLogoutRedirectUrl);
    }

    /**
     * The string describing the IdP. One of the following: OKTA, ADFS, Custom.
     * 
     */
    @Import(name="saml2Provider")
    private @Nullable Output<String> saml2Provider;

    /**
     * @return The string describing the IdP. One of the following: OKTA, ADFS, Custom.
     * 
     */
    public Optional<Output<String>> saml2Provider() {
        return Optional.ofNullable(this.saml2Provider);
    }

    /**
     * The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. If a value is not specified, Snowflake sends the urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress value in the authentication request to the IdP. NameID must be one of the following values: urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified, urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress, urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName, urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName, urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos, urn:oasis:names:tc:SAML:2.0:nameid-format:persistent, urn:oasis:names:tc:SAML:2.0:nameid-format:transient .
     * 
     */
    @Import(name="saml2RequestedNameidFormat")
    private @Nullable Output<String> saml2RequestedNameidFormat;

    /**
     * @return The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. If a value is not specified, Snowflake sends the urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress value in the authentication request to the IdP. NameID must be one of the following values: urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified, urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress, urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName, urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName, urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos, urn:oasis:names:tc:SAML:2.0:nameid-format:persistent, urn:oasis:names:tc:SAML:2.0:nameid-format:transient .
     * 
     */
    public Optional<Output<String>> saml2RequestedNameidFormat() {
        return Optional.ofNullable(this.saml2RequestedNameidFormat);
    }

    /**
     * The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed.
     * 
     */
    @Import(name="saml2SignRequest")
    private @Nullable Output<Boolean> saml2SignRequest;

    /**
     * @return The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed.
     * 
     */
    public Optional<Output<Boolean>> saml2SignRequest() {
        return Optional.ofNullable(this.saml2SignRequest);
    }

    @Import(name="saml2SignatureMethodsUsed")
    private @Nullable Output<String> saml2SignatureMethodsUsed;

    public Optional<Output<String>> saml2SignatureMethodsUsed() {
        return Optional.ofNullable(this.saml2SignatureMethodsUsed);
    }

    /**
     * The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Default: https://\n\n.\n\n.snowflakecomputing.com/fed/login
     * 
     */
    @Import(name="saml2SnowflakeAcsUrl")
    private @Nullable Output<String> saml2SnowflakeAcsUrl;

    /**
     * @return The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Default: https://\n\n.\n\n.snowflakecomputing.com/fed/login
     * 
     */
    public Optional<Output<String>> saml2SnowflakeAcsUrl() {
        return Optional.ofNullable(this.saml2SnowflakeAcsUrl);
    }

    /**
     * The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use.
     * 
     */
    @Import(name="saml2SnowflakeIssuerUrl")
    private @Nullable Output<String> saml2SnowflakeIssuerUrl;

    /**
     * @return The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use.
     * 
     */
    public Optional<Output<String>> saml2SnowflakeIssuerUrl() {
        return Optional.ofNullable(this.saml2SnowflakeIssuerUrl);
    }

    /**
     * Metadata created by Snowflake to provide to SAML2 provider.
     * 
     */
    @Import(name="saml2SnowflakeMetadata")
    private @Nullable Output<String> saml2SnowflakeMetadata;

    /**
     * @return Metadata created by Snowflake to provide to SAML2 provider.
     * 
     */
    public Optional<Output<String>> saml2SnowflakeMetadata() {
        return Optional.ofNullable(this.saml2SnowflakeMetadata);
    }

    /**
     * The Base64 encoded self-signed certificate generated by Snowflake for use with Encrypting SAML Assertions and Signed SAML Requests. You must have at least one of these features (encrypted SAML assertions or signed SAML responses) enabled in your Snowflake account to access the certificate value.
     * 
     */
    @Import(name="saml2SnowflakeX509Cert")
    private @Nullable Output<String> saml2SnowflakeX509Cert;

    /**
     * @return The Base64 encoded self-signed certificate generated by Snowflake for use with Encrypting SAML Assertions and Signed SAML Requests. You must have at least one of these features (encrypted SAML assertions or signed SAML responses) enabled in your Snowflake account to access the certificate value.
     * 
     */
    public Optional<Output<String>> saml2SnowflakeX509Cert() {
        return Optional.ofNullable(this.saml2SnowflakeX509Cert);
    }

    /**
     * The string containing the label to display after the Log In With button on the login page.
     * 
     */
    @Import(name="saml2SpInitiatedLoginPageLabel")
    private @Nullable Output<String> saml2SpInitiatedLoginPageLabel;

    /**
     * @return The string containing the label to display after the Log In With button on the login page.
     * 
     */
    public Optional<Output<String>> saml2SpInitiatedLoginPageLabel() {
        return Optional.ofNullable(this.saml2SpInitiatedLoginPageLabel);
    }

    /**
     * The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
     * 
     */
    @Import(name="saml2SsoUrl")
    private @Nullable Output<String> saml2SsoUrl;

    /**
     * @return The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
     * 
     */
    public Optional<Output<String>> saml2SsoUrl() {
        return Optional.ofNullable(this.saml2SsoUrl);
    }

    /**
     * The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
     * 
     */
    @Import(name="saml2X509Cert")
    private @Nullable Output<String> saml2X509Cert;

    /**
     * @return The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
     * 
     */
    public Optional<Output<String>> saml2X509Cert() {
        return Optional.ofNullable(this.saml2X509Cert);
    }

    private SamlIntegrationState() {}

    private SamlIntegrationState(SamlIntegrationState $) {
        this.createdOn = $.createdOn;
        this.enabled = $.enabled;
        this.name = $.name;
        this.saml2DigestMethodsUsed = $.saml2DigestMethodsUsed;
        this.saml2EnableSpInitiated = $.saml2EnableSpInitiated;
        this.saml2ForceAuthn = $.saml2ForceAuthn;
        this.saml2Issuer = $.saml2Issuer;
        this.saml2PostLogoutRedirectUrl = $.saml2PostLogoutRedirectUrl;
        this.saml2Provider = $.saml2Provider;
        this.saml2RequestedNameidFormat = $.saml2RequestedNameidFormat;
        this.saml2SignRequest = $.saml2SignRequest;
        this.saml2SignatureMethodsUsed = $.saml2SignatureMethodsUsed;
        this.saml2SnowflakeAcsUrl = $.saml2SnowflakeAcsUrl;
        this.saml2SnowflakeIssuerUrl = $.saml2SnowflakeIssuerUrl;
        this.saml2SnowflakeMetadata = $.saml2SnowflakeMetadata;
        this.saml2SnowflakeX509Cert = $.saml2SnowflakeX509Cert;
        this.saml2SpInitiatedLoginPageLabel = $.saml2SpInitiatedLoginPageLabel;
        this.saml2SsoUrl = $.saml2SsoUrl;
        this.saml2X509Cert = $.saml2X509Cert;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SamlIntegrationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SamlIntegrationState $;

        public Builder() {
            $ = new SamlIntegrationState();
        }

        public Builder(SamlIntegrationState defaults) {
            $ = new SamlIntegrationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param createdOn Date and time when the SAML integration was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(@Nullable Output<String> createdOn) {
            $.createdOn = createdOn;
            return this;
        }

        /**
         * @param createdOn Date and time when the SAML integration was created.
         * 
         * @return builder
         * 
         */
        public Builder createdOn(String createdOn) {
            return createdOn(Output.of(createdOn));
        }

        /**
         * @param enabled Specifies whether this security integration is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Specifies whether this security integration is enabled or disabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the SAML2 integration. This name follows the rules for Object Identifiers. The name should be unique among security integrations in your account.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder saml2DigestMethodsUsed(@Nullable Output<String> saml2DigestMethodsUsed) {
            $.saml2DigestMethodsUsed = saml2DigestMethodsUsed;
            return this;
        }

        public Builder saml2DigestMethodsUsed(String saml2DigestMethodsUsed) {
            return saml2DigestMethodsUsed(Output.of(saml2DigestMethodsUsed));
        }

        /**
         * @param saml2EnableSpInitiated The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in WIth button on the login page.  FALSE: does not display the Log in With button on the login page.
         * 
         * @return builder
         * 
         */
        public Builder saml2EnableSpInitiated(@Nullable Output<Boolean> saml2EnableSpInitiated) {
            $.saml2EnableSpInitiated = saml2EnableSpInitiated;
            return this;
        }

        /**
         * @param saml2EnableSpInitiated The Boolean indicating if the Log In With button will be shown on the login page. TRUE: displays the Log in WIth button on the login page.  FALSE: does not display the Log in With button on the login page.
         * 
         * @return builder
         * 
         */
        public Builder saml2EnableSpInitiated(Boolean saml2EnableSpInitiated) {
            return saml2EnableSpInitiated(Output.of(saml2EnableSpInitiated));
        }

        /**
         * @param saml2ForceAuthn The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder saml2ForceAuthn(@Nullable Output<Boolean> saml2ForceAuthn) {
            $.saml2ForceAuthn = saml2ForceAuthn;
            return this;
        }

        /**
         * @param saml2ForceAuthn The Boolean indicating whether users, during the initial authentication flow, are forced to authenticate again to access Snowflake. When set to TRUE, Snowflake sets the ForceAuthn SAML parameter to TRUE in the outgoing request from Snowflake to the identity provider. TRUE: forces users to authenticate again to access Snowflake, even if a valid session with the identity provider exists. FALSE: does not force users to authenticate again to access Snowflake.
         * 
         * @return builder
         * 
         */
        public Builder saml2ForceAuthn(Boolean saml2ForceAuthn) {
            return saml2ForceAuthn(Output.of(saml2ForceAuthn));
        }

        /**
         * @param saml2Issuer The string containing the IdP EntityID / Issuer.
         * 
         * @return builder
         * 
         */
        public Builder saml2Issuer(@Nullable Output<String> saml2Issuer) {
            $.saml2Issuer = saml2Issuer;
            return this;
        }

        /**
         * @param saml2Issuer The string containing the IdP EntityID / Issuer.
         * 
         * @return builder
         * 
         */
        public Builder saml2Issuer(String saml2Issuer) {
            return saml2Issuer(Output.of(saml2Issuer));
        }

        /**
         * @param saml2PostLogoutRedirectUrl The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
         * 
         * @return builder
         * 
         */
        public Builder saml2PostLogoutRedirectUrl(@Nullable Output<String> saml2PostLogoutRedirectUrl) {
            $.saml2PostLogoutRedirectUrl = saml2PostLogoutRedirectUrl;
            return this;
        }

        /**
         * @param saml2PostLogoutRedirectUrl The endpoint to which Snowflake redirects users after clicking the Log Out button in the classic Snowflake web interface. Snowflake terminates the Snowflake session upon redirecting to the specified endpoint.
         * 
         * @return builder
         * 
         */
        public Builder saml2PostLogoutRedirectUrl(String saml2PostLogoutRedirectUrl) {
            return saml2PostLogoutRedirectUrl(Output.of(saml2PostLogoutRedirectUrl));
        }

        /**
         * @param saml2Provider The string describing the IdP. One of the following: OKTA, ADFS, Custom.
         * 
         * @return builder
         * 
         */
        public Builder saml2Provider(@Nullable Output<String> saml2Provider) {
            $.saml2Provider = saml2Provider;
            return this;
        }

        /**
         * @param saml2Provider The string describing the IdP. One of the following: OKTA, ADFS, Custom.
         * 
         * @return builder
         * 
         */
        public Builder saml2Provider(String saml2Provider) {
            return saml2Provider(Output.of(saml2Provider));
        }

        /**
         * @param saml2RequestedNameidFormat The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. If a value is not specified, Snowflake sends the urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress value in the authentication request to the IdP. NameID must be one of the following values: urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified, urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress, urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName, urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName, urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos, urn:oasis:names:tc:SAML:2.0:nameid-format:persistent, urn:oasis:names:tc:SAML:2.0:nameid-format:transient .
         * 
         * @return builder
         * 
         */
        public Builder saml2RequestedNameidFormat(@Nullable Output<String> saml2RequestedNameidFormat) {
            $.saml2RequestedNameidFormat = saml2RequestedNameidFormat;
            return this;
        }

        /**
         * @param saml2RequestedNameidFormat The SAML NameID format allows Snowflake to set an expectation of the identifying attribute of the user (i.e. SAML Subject) in the SAML assertion from the IdP to ensure a valid authentication to Snowflake. If a value is not specified, Snowflake sends the urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress value in the authentication request to the IdP. NameID must be one of the following values: urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified, urn:oasis:names:tc:SAML:1.1:nameid-format:emailAddress, urn:oasis:names:tc:SAML:1.1:nameid-format:X509SubjectName, urn:oasis:names:tc:SAML:1.1:nameid-format:WindowsDomainQualifiedName, urn:oasis:names:tc:SAML:2.0:nameid-format:kerberos, urn:oasis:names:tc:SAML:2.0:nameid-format:persistent, urn:oasis:names:tc:SAML:2.0:nameid-format:transient .
         * 
         * @return builder
         * 
         */
        public Builder saml2RequestedNameidFormat(String saml2RequestedNameidFormat) {
            return saml2RequestedNameidFormat(Output.of(saml2RequestedNameidFormat));
        }

        /**
         * @param saml2SignRequest The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed.
         * 
         * @return builder
         * 
         */
        public Builder saml2SignRequest(@Nullable Output<Boolean> saml2SignRequest) {
            $.saml2SignRequest = saml2SignRequest;
            return this;
        }

        /**
         * @param saml2SignRequest The Boolean indicating whether SAML requests are signed. TRUE: allows SAML requests to be signed. FALSE: does not allow SAML requests to be signed.
         * 
         * @return builder
         * 
         */
        public Builder saml2SignRequest(Boolean saml2SignRequest) {
            return saml2SignRequest(Output.of(saml2SignRequest));
        }

        public Builder saml2SignatureMethodsUsed(@Nullable Output<String> saml2SignatureMethodsUsed) {
            $.saml2SignatureMethodsUsed = saml2SignatureMethodsUsed;
            return this;
        }

        public Builder saml2SignatureMethodsUsed(String saml2SignatureMethodsUsed) {
            return saml2SignatureMethodsUsed(Output.of(saml2SignatureMethodsUsed));
        }

        /**
         * @param saml2SnowflakeAcsUrl The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Default: https://\n\n.\n\n.snowflakecomputing.com/fed/login
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeAcsUrl(@Nullable Output<String> saml2SnowflakeAcsUrl) {
            $.saml2SnowflakeAcsUrl = saml2SnowflakeAcsUrl;
            return this;
        }

        /**
         * @param saml2SnowflakeAcsUrl The string containing the Snowflake Assertion Consumer Service URL to which the IdP will send its SAML authentication response back to Snowflake. This property will be set in the SAML authentication request generated by Snowflake when initiating a SAML SSO operation with the IdP. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use. Default: https://\n\n.\n\n.snowflakecomputing.com/fed/login
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeAcsUrl(String saml2SnowflakeAcsUrl) {
            return saml2SnowflakeAcsUrl(Output.of(saml2SnowflakeAcsUrl));
        }

        /**
         * @param saml2SnowflakeIssuerUrl The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use.
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeIssuerUrl(@Nullable Output<String> saml2SnowflakeIssuerUrl) {
            $.saml2SnowflakeIssuerUrl = saml2SnowflakeIssuerUrl;
            return this;
        }

        /**
         * @param saml2SnowflakeIssuerUrl The string containing the EntityID / Issuer for the Snowflake service provider. If an incorrect value is specified, Snowflake returns an error message indicating the acceptable values to use.
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeIssuerUrl(String saml2SnowflakeIssuerUrl) {
            return saml2SnowflakeIssuerUrl(Output.of(saml2SnowflakeIssuerUrl));
        }

        /**
         * @param saml2SnowflakeMetadata Metadata created by Snowflake to provide to SAML2 provider.
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeMetadata(@Nullable Output<String> saml2SnowflakeMetadata) {
            $.saml2SnowflakeMetadata = saml2SnowflakeMetadata;
            return this;
        }

        /**
         * @param saml2SnowflakeMetadata Metadata created by Snowflake to provide to SAML2 provider.
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeMetadata(String saml2SnowflakeMetadata) {
            return saml2SnowflakeMetadata(Output.of(saml2SnowflakeMetadata));
        }

        /**
         * @param saml2SnowflakeX509Cert The Base64 encoded self-signed certificate generated by Snowflake for use with Encrypting SAML Assertions and Signed SAML Requests. You must have at least one of these features (encrypted SAML assertions or signed SAML responses) enabled in your Snowflake account to access the certificate value.
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeX509Cert(@Nullable Output<String> saml2SnowflakeX509Cert) {
            $.saml2SnowflakeX509Cert = saml2SnowflakeX509Cert;
            return this;
        }

        /**
         * @param saml2SnowflakeX509Cert The Base64 encoded self-signed certificate generated by Snowflake for use with Encrypting SAML Assertions and Signed SAML Requests. You must have at least one of these features (encrypted SAML assertions or signed SAML responses) enabled in your Snowflake account to access the certificate value.
         * 
         * @return builder
         * 
         */
        public Builder saml2SnowflakeX509Cert(String saml2SnowflakeX509Cert) {
            return saml2SnowflakeX509Cert(Output.of(saml2SnowflakeX509Cert));
        }

        /**
         * @param saml2SpInitiatedLoginPageLabel The string containing the label to display after the Log In With button on the login page.
         * 
         * @return builder
         * 
         */
        public Builder saml2SpInitiatedLoginPageLabel(@Nullable Output<String> saml2SpInitiatedLoginPageLabel) {
            $.saml2SpInitiatedLoginPageLabel = saml2SpInitiatedLoginPageLabel;
            return this;
        }

        /**
         * @param saml2SpInitiatedLoginPageLabel The string containing the label to display after the Log In With button on the login page.
         * 
         * @return builder
         * 
         */
        public Builder saml2SpInitiatedLoginPageLabel(String saml2SpInitiatedLoginPageLabel) {
            return saml2SpInitiatedLoginPageLabel(Output.of(saml2SpInitiatedLoginPageLabel));
        }

        /**
         * @param saml2SsoUrl The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
         * 
         * @return builder
         * 
         */
        public Builder saml2SsoUrl(@Nullable Output<String> saml2SsoUrl) {
            $.saml2SsoUrl = saml2SsoUrl;
            return this;
        }

        /**
         * @param saml2SsoUrl The string containing the IdP SSO URL, where the user should be redirected by Snowflake (the Service Provider) with a SAML AuthnRequest message.
         * 
         * @return builder
         * 
         */
        public Builder saml2SsoUrl(String saml2SsoUrl) {
            return saml2SsoUrl(Output.of(saml2SsoUrl));
        }

        /**
         * @param saml2X509Cert The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
         * 
         * @return builder
         * 
         */
        public Builder saml2X509Cert(@Nullable Output<String> saml2X509Cert) {
            $.saml2X509Cert = saml2X509Cert;
            return this;
        }

        /**
         * @param saml2X509Cert The Base64 encoded IdP signing certificate on a single line without the leading -----BEGIN CERTIFICATE----- and ending -----END CERTIFICATE----- markers.
         * 
         * @return builder
         * 
         */
        public Builder saml2X509Cert(String saml2X509Cert) {
            return saml2X509Cert(Output.of(saml2X509Cert));
        }

        public SamlIntegrationState build() {
            return $;
        }
    }

}
