// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.snowflake.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.snowflake.outputs.GetResourceMonitorsResourceMonitor;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetResourceMonitorsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The resource monitors in the database
     * 
     */
    private List<GetResourceMonitorsResourceMonitor> resourceMonitors;

    private GetResourceMonitorsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource monitors in the database
     * 
     */
    public List<GetResourceMonitorsResourceMonitor> resourceMonitors() {
        return this.resourceMonitors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceMonitorsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetResourceMonitorsResourceMonitor> resourceMonitors;
        public Builder() {}
        public Builder(GetResourceMonitorsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.resourceMonitors = defaults.resourceMonitors;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder resourceMonitors(List<GetResourceMonitorsResourceMonitor> resourceMonitors) {
            this.resourceMonitors = Objects.requireNonNull(resourceMonitors);
            return this;
        }
        public Builder resourceMonitors(GetResourceMonitorsResourceMonitor... resourceMonitors) {
            return resourceMonitors(List.of(resourceMonitors));
        }
        public GetResourceMonitorsResult build() {
            final var o = new GetResourceMonitorsResult();
            o.id = id;
            o.resourceMonitors = resourceMonitors;
            return o;
        }
    }
}
