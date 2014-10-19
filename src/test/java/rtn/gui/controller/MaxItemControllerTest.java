package rtn.gui.controller;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>MaxItemControllerTest</code> contains tests for the class <code>{@link MaxItemController}</code>.
 *
 * @generatedBy CodePro at 10/19/14 10:27 PM
 * @author jakob
 * @version $Revision: 1.0 $
 */
public class MaxItemControllerTest {
	/**
	 * Run the MaxItemController() constructor test.
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testMaxItemController_1()
		throws Exception {
		MaxItemController result = new MaxItemController();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the Button getConfirm() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetConfirm_1()
		throws Exception {
		MaxItemController fixture = new MaxItemController();
		fixture.setTitle(new Text());
		fixture.setConfirm(new Button());
		fixture.setTextfield(new TextField());

		Button result = fixture.getConfirm();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MaxItemController
		assertNotNull(result);
	}

	/**
	 * Run the MaxItemController getInstance() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetInstance_1()
		throws Exception {

		MaxItemController result = MaxItemController.getInstance();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MaxItemController
		assertNotNull(result);
	}

	/**
	 * Run the TextField getTextfield() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetTextfield_1()
		throws Exception {
		MaxItemController fixture = new MaxItemController();
		fixture.setTitle(new Text());
		fixture.setConfirm(new Button());
		fixture.setTextfield(new TextField());

		TextField result = fixture.getTextfield();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MaxItemController
		assertNotNull(result);
	}

	/**
	 * Run the Text getTitle() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testGetTitle_1()
		throws Exception {
		MaxItemController fixture = new MaxItemController();
		fixture.setTitle(new Text());
		fixture.setConfirm(new Button());
		fixture.setTextfield(new TextField());

		Text result = fixture.getTitle();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MaxItemController
		assertNotNull(result);
	}

	/**
	 * Run the void initialize() method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testInitialize_1()
		throws Exception {
		MaxItemController fixture = new MaxItemController();
		fixture.setTitle(new Text());
		fixture.setConfirm(new Button());
		fixture.setTextfield(new TextField());

		fixture.initialize();

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.ExceptionInInitializerError
		//       at org.slf4j.impl.Log4jLoggerFactory.getLogger(Log4jLoggerFactory.java:66)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:277)
		//       at org.slf4j.LoggerFactory.getLogger(LoggerFactory.java:288)
		//       at rtn.gui.controller.MaxItemController.<clinit>(MaxItemController.java:12)
	}

	/**
	 * Run the void setConfirm(Button) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetConfirm_1()
		throws Exception {
		MaxItemController fixture = new MaxItemController();
		fixture.setTitle(new Text());
		fixture.setConfirm(new Button());
		fixture.setTextfield(new TextField());
		Button confirm = new Button();

		fixture.setConfirm(confirm);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MaxItemController
	}

	/**
	 * Run the void setInstance(MaxItemController) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetInstance_1()
		throws Exception {
		MaxItemController instance = new MaxItemController();

		MaxItemController.setInstance(instance);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MaxItemController
	}

	/**
	 * Run the void setTextfield(TextField) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetTextfield_1()
		throws Exception {
		MaxItemController fixture = new MaxItemController();
		fixture.setTitle(new Text());
		fixture.setConfirm(new Button());
		fixture.setTextfield(new TextField());
		TextField textfield = new TextField();

		fixture.setTextfield(textfield);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MaxItemController
	}

	/**
	 * Run the void setTitle(Text) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Test
	public void testSetTitle_1()
		throws Exception {
		MaxItemController fixture = new MaxItemController();
		fixture.setTitle(new Text());
		fixture.setConfirm(new Button());
		fixture.setTextfield(new TextField());
		Text title = new Text();

		fixture.setTitle(title);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NoClassDefFoundError: Could not initialize class rtn.gui.controller.MaxItemController
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 10/19/14 10:27 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(MaxItemControllerTest.class);
	}
}