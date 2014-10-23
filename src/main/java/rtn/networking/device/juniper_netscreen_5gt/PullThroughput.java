package rtn.networking.device.juniper_netscreen_5gt;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.snmp4j.smi.OID;
import rtn.networking.Policy;
import rtn.networking.device.commands.IPullThroughput;

public class PullThroughput implements IPullThroughput {
    private static final Logger logger = LoggerFactory.getLogger(PullThroughput.class);

   // private List<> //;
	/**
	 * @see rtn.networking.device.commands.IResult#getResult()
	 */
	@Override
	public Object getResult()
	{
		
		return null;
	}

	/**
	 * @see rtn.networking.device.commands.IDevCommand#execute()
	 */
	@Override
	public void execute()
	{

		OID[] columns = new OID[]{
                new OID("1.3.6.1.4.1.3224.10.2.1.6"),
                new OID("1.3.6.1.4.1.3224.10.2.1.6.1.0"),
                new OID("1.3.6.1.4.1.3224.10.2.1.1.1"),
                new OID("1.3.6.1.4.1.3224.10.2.1.6.3.0"),
                new OID("1.3.6.1.4.1.3224.10.2.1.6.8.0"),
                new OID("1.3.6.1.4.1.3224.10.2.1.6.42.0"),
                new OID("1.3.6.1.4.1.3224.10.2.1.6.43.0")};

		
		// TODO Auto-generated method stub
		
	}
}
