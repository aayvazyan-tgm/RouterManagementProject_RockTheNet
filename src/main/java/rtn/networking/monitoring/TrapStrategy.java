package rtn.networking.monitoring;

import rtn.networking.DataLoad;
import rtn.networking.Policy;

import java.util.List;

/**
 * Created by Ari on 02.10.2014.
 */
public class TrapStrategy implements IMonitoringStrategy {
    @Override
    public boolean getConnection(String address) {
        return false;
    }

    @Override
    public List getPolicies() {
        return null;
    }

    @Override
    public DataLoad getThroughputUpload(Policy policy, int since) {
        return null;
    }
}
