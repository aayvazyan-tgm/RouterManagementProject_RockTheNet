package rtn;

import com.google.inject.AbstractModule;

public class GUIModule extends AbstractModule
{
	@Override
	protected void configure()
	{
		bind(IDataSource.class).to(DataSourceImpl.class);
		bind(ICommandCentre.class).to(CommandCentreImpl.class);
	}
}