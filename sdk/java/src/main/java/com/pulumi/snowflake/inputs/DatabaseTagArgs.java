// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatabaseTagArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatabaseTagArgs Empty = new DatabaseTagArgs();

    /**
     * Name of the database that the tag was created in.
     * 
     */
    @Import(name="database")
    private @Nullable Output<String> database;

    /**
     * @return Name of the database that the tag was created in.
     * 
     */
    public Optional<Output<String>> database() {
        return Optional.ofNullable(this.database);
    }

    /**
     * Tag name, e.g. department.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Tag name, e.g. department.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Name of the schema that the tag was created in.
     * 
     */
    @Import(name="schema")
    private @Nullable Output<String> schema;

    /**
     * @return Name of the schema that the tag was created in.
     * 
     */
    public Optional<Output<String>> schema() {
        return Optional.ofNullable(this.schema);
    }

    /**
     * Tag value, e.g. marketing_info.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return Tag value, e.g. marketing_info.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private DatabaseTagArgs() {}

    private DatabaseTagArgs(DatabaseTagArgs $) {
        this.database = $.database;
        this.name = $.name;
        this.schema = $.schema;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatabaseTagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatabaseTagArgs $;

        public Builder() {
            $ = new DatabaseTagArgs();
        }

        public Builder(DatabaseTagArgs defaults) {
            $ = new DatabaseTagArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param database Name of the database that the tag was created in.
         * 
         * @return builder
         * 
         */
        public Builder database(@Nullable Output<String> database) {
            $.database = database;
            return this;
        }

        /**
         * @param database Name of the database that the tag was created in.
         * 
         * @return builder
         * 
         */
        public Builder database(String database) {
            return database(Output.of(database));
        }

        /**
         * @param name Tag name, e.g. department.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Tag name, e.g. department.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schema Name of the schema that the tag was created in.
         * 
         * @return builder
         * 
         */
        public Builder schema(@Nullable Output<String> schema) {
            $.schema = schema;
            return this;
        }

        /**
         * @param schema Name of the schema that the tag was created in.
         * 
         * @return builder
         * 
         */
        public Builder schema(String schema) {
            return schema(Output.of(schema));
        }

        /**
         * @param value Tag value, e.g. marketing_info.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Tag value, e.g. marketing_info.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public DatabaseTagArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
