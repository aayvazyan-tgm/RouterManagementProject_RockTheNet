package rtn.networking;

/**
 * @author Ari Michael Ayvazyan
 * @version 28.09.2014
 */

import com.google.inject.AbstractModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MonitoringInjector extends AbstractModule {
    private static final Logger logger = LoggerFactory.getLogger(MonitoringInjector.class);

    @Override
    protected void configure() {
        //bind IMonitoringStrategy to PollingStrategy
    }
}