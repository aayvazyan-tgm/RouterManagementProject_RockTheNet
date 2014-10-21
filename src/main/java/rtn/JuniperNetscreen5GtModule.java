package rtn;

import com.google.inject.AbstractModule;
import rtn.networking.device.commands.*;
import rtn.networking.device.juniper_netscreen_5gt.*;

/**
 * Guice injections specific to juniper netscreen 5gt
 */
public class JuniperNetscreen5GtModule extends AbstractModule {
    @Override
    protected void configure() {
        //
        // commands
        //
        bind(IAddPolicy.class).to(AddPolicy.class);
        bind(IDeletePolicy.class).to(DeletePolicy.class);
        bind(IPullActions.class).to(PullActions.class);
        bind(IPullPolicies.class).to(PullPolicies.class);
        bind(IPullServices.class).to(PullServices.class);
        bind(IPullThroughput.class).to(PullThroughput.class);
        bind(IPullZones.class).to(PullZones.class);
        bind(IUpdatePolicy.class).to(UpdatePolicy.class);
    }
}
