package rtn;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.snmp4j.CommandResponder;
import org.snmp4j.TransportMapping;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.transport.DefaultUdpTransportMapping;
import rtn.networking.Configuration;
import rtn.networking.admin.IAdminProtocol;
import rtn.networking.admin.SSHProtocol;
import rtn.networking.trap.LoggerCommandResponder;

import java.io.IOException;

public class GuiceModule extends AbstractModule
{
    private static final Logger logger = LoggerFactory.getLogger(GuiceModule.class);
	@Override
	protected void configure()
	{
        install(new JuniperNetscreen5GtModule());

		bind(IDataSource.class).to(DataSourceImpl.class);
		bind(ICommandCentre.class).to(CommandCentreImpl.class);

        bind(CommandResponder.class).to(LoggerCommandResponder.class);

        bind(IAdminProtocol.class).to(SSHProtocol.class);
	}

    @Override
    public void requireBinding(Class<?> type) {
        super.requireBinding(type);
    }
    
    @Provides
    public static TransportMapping getTransportMapping() throws IOException
    {
        UdpAddress address = new UdpAddress(
                Configuration.getInstance().getRemoteip()+"/"+Configuration.getInstance().getTrapListeningPort());
        DefaultUdpTransportMapping mapping = new DefaultUdpTransportMapping(address);
        logger.debug("Creating TransportMapping for: " + String.valueOf(mapping.getListenAddress()));
    	return mapping;
    }
}