package rtn.networking;

/**
 * @author Ari Michael Ayvazyan
 * @version 28.09.2014
 */
import com.google.inject.AbstractModule;
import rtn.networking.monitoring.IMonitoringStrategy;
import rtn.networking.monitoring.PollingStrategy;

public class MonitoringInjector extends AbstractModule {

    @Override
    protected void configure() {
        //bind IMonitoringStrategy to PollingStrategy
        bind(IMonitoringStrategy.class).to(PollingStrategy.class);
    }
}