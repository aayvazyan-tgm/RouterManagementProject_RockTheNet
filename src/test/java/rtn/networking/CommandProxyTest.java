package rtn.networking;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CommandProxyTest
{
	@Test(expected = ClassNotFoundException.class)
	public void testCommandNull() throws ReflectiveOperationException
	{
		CommandProxy.getCommand(null, "juniper_netscreen_5gt");
	}
	
	@Test(expected = ClassNotFoundException.class)
	public void testDeviceNull() throws ReflectiveOperationException
	{
		CommandProxy.getCommand("AddPolicy", null);
	}
	
	@Test(expected = ClassNotFoundException.class)
	public void testCommandEmpty() throws ReflectiveOperationException
	{
		CommandProxy.getCommand("", "juniper_netscreen_5gt");
	}
	
	@Test(expected = ClassNotFoundException.class)
	public void testDeviceEmpty() throws ReflectiveOperationException
	{
		CommandProxy.getCommand("AddPolicy", "");
	}
	
	@Test(expected = ClassNotFoundException.class)
	public void testNonExistantClass() throws ReflectiveOperationException
	{
		CommandProxy.getCommand("NonExistant", "non_existant_device");
	}
	
	@Test
	public void testSuccessfulInstantion() throws ReflectiveOperationException
	{
		assertNotNull(CommandProxy.getCommand("TestPolicy", "test"));
	}
}