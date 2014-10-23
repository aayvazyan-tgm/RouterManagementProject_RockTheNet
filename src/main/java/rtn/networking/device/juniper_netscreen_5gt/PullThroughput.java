package rtn.networking.device.juniper_netscreen_5gt;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
				new OID("1.3.6.1.4.1.3224.10.1.1.1")};
		
		// TODO Auto-generated method stub
		
	}
}
