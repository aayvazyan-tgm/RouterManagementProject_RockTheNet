package rtn.networking.device.juniper_netscreen_5gt;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import rtn.networking.Action;

public class PullActionsTest
{
	private PullActions actions;
	
	@Before
	public void setUp()
	{
		this.actions = new PullActions();
	}
	
	@Test
	public void testGetResultNoExecute()
	{
		List<Action> result = (ArrayList<Action>)this.actions.getResult();
		assertEquals(result.size(), 0);
	}
	
	@Test
	public void etstGetResultExecute()
	{
		this.actions.execute();
		List<Action> result = (ArrayList<Action>)this.actions.getResult();
		
		assertEquals(result.size(), 3);
	}
}