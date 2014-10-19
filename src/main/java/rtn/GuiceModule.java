package rtn;

import com.google.inject.AbstractModule;
import org.snmp4j.CommandResponder;
import rtn.networking.trap.LoggerCommandResponder;

public class GuiceModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		bind(IDataSource.class).to(DataSourceImpl.class);
		bind(ICommandCentre.class).to(CommandCentreImpl.class);

        bind(CommandResponder.class).to(LoggerCommandResponder.class);
	}

    @Override
    public void requireBinding(Class<?> type) {
        super.requireBinding(type);
    }
}