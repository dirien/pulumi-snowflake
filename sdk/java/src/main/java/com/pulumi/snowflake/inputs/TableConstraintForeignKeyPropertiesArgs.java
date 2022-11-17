// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.snowflake.inputs.TableConstraintForeignKeyPropertiesReferencesArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TableConstraintForeignKeyPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final TableConstraintForeignKeyPropertiesArgs Empty = new TableConstraintForeignKeyPropertiesArgs();

    /**
     * The match type for the foreign key. Not applicable for primary/unique keys
     * 
     */
    @Import(name="match")
    private @Nullable Output<String> match;

    /**
     * @return The match type for the foreign key. Not applicable for primary/unique keys
     * 
     */
    public Optional<Output<String>> match() {
        return Optional.ofNullable(this.match);
    }

    /**
     * Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
     * 
     */
    @Import(name="onDelete")
    private @Nullable Output<String> onDelete;

    /**
     * @return Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
     * 
     */
    public Optional<Output<String>> onDelete() {
        return Optional.ofNullable(this.onDelete);
    }

    /**
     * Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
     * 
     */
    @Import(name="onUpdate")
    private @Nullable Output<String> onUpdate;

    /**
     * @return Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
     * 
     */
    public Optional<Output<String>> onUpdate() {
        return Optional.ofNullable(this.onUpdate);
    }

    /**
     * The table and columns that the foreign key references. Not applicable for primary/unique keys
     * 
     */
    @Import(name="references")
    private @Nullable Output<TableConstraintForeignKeyPropertiesReferencesArgs> references;

    /**
     * @return The table and columns that the foreign key references. Not applicable for primary/unique keys
     * 
     */
    public Optional<Output<TableConstraintForeignKeyPropertiesReferencesArgs>> references() {
        return Optional.ofNullable(this.references);
    }

    private TableConstraintForeignKeyPropertiesArgs() {}

    private TableConstraintForeignKeyPropertiesArgs(TableConstraintForeignKeyPropertiesArgs $) {
        this.match = $.match;
        this.onDelete = $.onDelete;
        this.onUpdate = $.onUpdate;
        this.references = $.references;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TableConstraintForeignKeyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TableConstraintForeignKeyPropertiesArgs $;

        public Builder() {
            $ = new TableConstraintForeignKeyPropertiesArgs();
        }

        public Builder(TableConstraintForeignKeyPropertiesArgs defaults) {
            $ = new TableConstraintForeignKeyPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param match The match type for the foreign key. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder match(@Nullable Output<String> match) {
            $.match = match;
            return this;
        }

        /**
         * @param match The match type for the foreign key. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder match(String match) {
            return match(Output.of(match));
        }

        /**
         * @param onDelete Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder onDelete(@Nullable Output<String> onDelete) {
            $.onDelete = onDelete;
            return this;
        }

        /**
         * @param onDelete Specifies the action performed when the primary/unique key for the foreign key is deleted. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder onDelete(String onDelete) {
            return onDelete(Output.of(onDelete));
        }

        /**
         * @param onUpdate Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder onUpdate(@Nullable Output<String> onUpdate) {
            $.onUpdate = onUpdate;
            return this;
        }

        /**
         * @param onUpdate Specifies the action performed when the primary/unique key for the foreign key is updated. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder onUpdate(String onUpdate) {
            return onUpdate(Output.of(onUpdate));
        }

        /**
         * @param references The table and columns that the foreign key references. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder references(@Nullable Output<TableConstraintForeignKeyPropertiesReferencesArgs> references) {
            $.references = references;
            return this;
        }

        /**
         * @param references The table and columns that the foreign key references. Not applicable for primary/unique keys
         * 
         * @return builder
         * 
         */
        public Builder references(TableConstraintForeignKeyPropertiesReferencesArgs references) {
            return references(Output.of(references));
        }

        public TableConstraintForeignKeyPropertiesArgs build() {
            return $;
        }
    }

}
