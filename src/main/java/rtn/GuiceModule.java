package rtn;

import java.io.IOException;

import org.snmp4j.CommandResponder;
import org.snmp4j.TransportMapping;
import org.snmp4j.smi.UdpAddress;
import org.snmp4j.transport.DefaultUdpTransportMapping;

import rtn.networking.Configuration;
import rtn.networking.admin.IAdminProtocol;
import rtn.networking.admin.SSHProtocol;
import rtn.networking.trap.LoggerCommandResponder;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class GuiceModule extends AbstractModule
{
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
    	return new DefaultUdpTransportMapping(new UdpAddress(Configuration.getInstance().getRemoteip()+"/"+Configuration.getInstance().getSnmpport()));
    }
}