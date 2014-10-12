package rtn.networking.admin;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class TelnetProtocolTest
{
	private TelnetProtocol protocol;
	
	@Before
	public void setUp()
	{
		this.protocol = new TelnetProtocol();
	}
	
	@Test
	public void testConnect()
	{
		assertFalse(this.protocol.connect());
	}
	
	@Test
	public void testSendCommand()
	{
		assertNull(this.protocol.sendCommand(""));
	}
	
	@Test
	public void testDisconnect()
	{
		assertFalse(this.protocol.disconnect());
	}
}