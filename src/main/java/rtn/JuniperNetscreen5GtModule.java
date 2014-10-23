package rtn;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import rtn.networking.Configuration;
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

    @Provides
    public static Address getRouterAddress() {
        String remote = Configuration.getInstance().getRemoteip();
        int port = 162;
        Address address = GenericAddress.parse("udp://" + remote + "/" + String.valueOf(port));

        return address;
    }
}
