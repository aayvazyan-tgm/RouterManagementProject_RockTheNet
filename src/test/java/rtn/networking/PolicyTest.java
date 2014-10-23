package rtn.networking;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class PolicyTest contains tests for the class Policy.
 *
 * @generatedBy CodePro at 23.10.14 15:12
 * @author Andreas Willinger
 */
public class PolicyTest
{
	/**
	 * Run the Action getAction() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetAction_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		Action result = fixture.getAction();
		
		assertNotNull(result);
		assertEquals("", result.getName());
	}

	/**
	 * Run the String getDestination() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetDestination_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		String result = fixture.getDestination();
		assertEquals("", result);
	}

	/**
	 * Run the String getDisplayname() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetDisplayname_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		String result = fixture.getDisplayname();
		assertEquals("", result);
	}

	/**
	 * Run the Long getId() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetId_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		Long result = fixture.getId();

		assertNotNull(result);
		assertEquals("1", result.toString());
		assertEquals((byte) 1, result.byteValue());
		assertEquals((short) 1, result.shortValue());
		assertEquals(1, result.intValue());
		assertEquals(1L, result.longValue());
		assertEquals(1.0f, result.floatValue(), 1.0f);
		assertEquals(1.0, result.doubleValue(), 1.0);
	}

	/**
	 * Run the Zone getInzone() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetInzone_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		Zone result = fixture.getInzone();

		assertNotNull(result);
		assertEquals("", result.getName());
	}

	/**
	 * Run the Zone getOutzone() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetOutzone_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		Zone result = fixture.getOutzone();

		assertNotNull(result);
		assertEquals("", result.getName());
	}

	/**
	 * Run the Service getService() method test.
	 *
	 * @throws Exception An Exception
	@Test
	public void testGetService_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		Service result = fixture.getService();

		assertNotNull(result);
		assertEquals("", result.getName());
	}

	/**
	 * Run the String getSource() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testGetSource_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		String result = fixture.getSource();
		assertEquals("", result);
	}

	/**
	 * Run the boolean isLog() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testIsLog_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		boolean result = fixture.isLog();
		assertEquals(true, result);
	}

	/**
	 * Run the boolean isLog() method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testIsLog_2()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(false);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));

		boolean result = fixture.isLog();
		assertEquals(false, result);
	}

	/**
	 * Run the void setAction(Action) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetAction_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));
		Action action = new Action("");

		fixture.setAction(action);
	}

	/**
	 * Run the void setDestination(String) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetDestination_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));
		String destination = "";

		fixture.setDestination(destination);
	}

	/**
	 * Run the void setDisplayname(String) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetDisplayname_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));
		String displayname = "";

		fixture.setDisplayname(displayname);
	}

	/**
	 * Run the void setId(Long) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetId_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));
		Long id = new Long(1L);

		fixture.setId(id);
	}

	/**
	 * Run the void setInzone(Zone) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetInzone_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));
		Zone inzone = new Zone("");

		fixture.setInzone(inzone);
	}

	/**
	 * Run the void setLog(boolean) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetLog_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));
		boolean log = true;

		fixture.setLog(log);
	}

	/**
	 * Run the void setOutzone(Zone) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetOutzone_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));
		Zone outzone = new Zone("");

		fixture.setOutzone(outzone);
	}

	/**
	 * Run the void setService(Service) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetService_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));
		Service service = new Service("");

		fixture.setService(service);
	}

	/**
	 * Run the void setSource(String) method test.
	 *
	 * @throws Exception An Exception
	 */
	@Test
	public void testSetSource_1()
		throws Exception
	{
		Policy fixture = new Policy();
		fixture.setLog(true);
		fixture.setDestination("");
		fixture.setInzone(new Zone(""));
		fixture.setDisplayname("");
		fixture.setService(new Service(""));
		fixture.setSource("");
		fixture.setId(new Long(1L));
		fixture.setAction(new Action(""));
		fixture.setOutzone(new Zone(""));
		String source = "";

		fixture.setSource(source);
	}
}