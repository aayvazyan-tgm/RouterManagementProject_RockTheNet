package rtn.networking;

/**
 * @author Ari Michael Ayvazyan
 * @version 28.09.2014
 */

import com.google.inject.AbstractModule;
import rtn.networking.device.juniper_netscreen_5gt.*;
public class AdminInjector extends AbstractModule {

    @Override
    protected void configure() {
        bind(IAdminStrategy.class).to(SSHStrategy.class);
    }
}

