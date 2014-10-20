package rtn;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test_GuiceModule {
    private static final Logger logger = LoggerFactory.getLogger(Test_GuiceModule.class);

    private Class clazz;

    public Test_GuiceModule(Class clazz) {
        this.clazz = clazz;
    }

    @Test(timeout = 500)
    public void test_canProvideNessesaryClasses() {
        logger.info("Trying to find a binding for class: " + clazz.toString());

        Module module = new AbstractModule() {
            @Override
            protected void configure() {
                install(new GuiceModule());

                requireBinding(clazz);
            }
        };
        Injector injector = Guice.createInjector(module);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        Class[] clazzes = new Class[] {
                rtn.networking.Action.class,
                rtn.networking.Policy.class,
                rtn.networking.CommandProxy.class,
                rtn.networking.trap.LoggerCommandResponder.class,
                rtn.networking.trap.TrapReceiver.class,
                rtn.networking.Zone.class,
                rtn.networking.admin.IAdminProtocol.class,
                rtn.networking.admin.SSHProtocol.class,
                rtn.networking.admin.TelnetProtocol.class,
                rtn.networking.Configuration.class,
                rtn.networking.device.juniper_netscreen_5gt.PullActions.class,
                rtn.networking.device.juniper_netscreen_5gt.PullThroughput.class,
                rtn.networking.device.juniper_netscreen_5gt.UpdatePolicy.class,
                rtn.networking.device.juniper_netscreen_5gt.DeletePolicy.class,
                rtn.networking.device.juniper_netscreen_5gt.PullZones.class,
                rtn.networking.device.juniper_netscreen_5gt.PullPolicies.class,
                rtn.networking.device.juniper_netscreen_5gt.PullServices.class,
                rtn.networking.device.juniper_netscreen_5gt.AddPolicy.class,
                rtn.networking.device.commands.IResult.class,
                rtn.networking.device.commands.IPullZones.class,
                rtn.networking.device.commands.IPullServices.class,
                rtn.networking.device.commands.IDeletePolicy.class,
                rtn.networking.device.commands.IPullThroughput.class,
                rtn.networking.device.commands.IUpdatePolicy.class,
                rtn.networking.device.commands.IDevCommand.class,
                rtn.networking.device.commands.IAddPolicy.class,
                rtn.networking.device.commands.IPullActions.class,
                rtn.networking.device.commands.IParametrized.class,
                rtn.networking.device.commands.IPullPolicies.class,
                rtn.networking.Service.class,
                rtn.networking.DataLoad.class,
                rtn.gui.view.AlertWindow.class,
                rtn.gui.model.TableRule.class,
                rtn.gui.controller.GraphController.class,
                rtn.gui.controller.AutoRefreshController.class,
                rtn.gui.controller.AlertController.class,
                rtn.gui.controller.RulesListController.class,
                rtn.gui.controller.MainController.class,
                rtn.gui.controller.MaxItemController.class,
                rtn.gui.controller.ConnectionController.class,
                rtn.gui.controller.RulesAdminController.class,
                rtn.email.EMail.class,
                rtn.email.EMailObserver.class,
                rtn.email.EMailWorker.class,
                rtn.email.EMailFactory.class,
                rtn.email.MalformedEMailAddressException.class,
                rtn.email.EMailAddress.class,
                rtn.ICommandCentre.class,
                rtn.CommandCentreImpl.class,
                rtn.DataSourceImpl.class,
                rtn.observer.Observer.class,
                rtn.observer.Observable.class,
                rtn.GuiceModule.class,
                rtn.MainApp.class,
                rtn.IDataSource.class,
                rtn.networking.trap.EmailCommandResponder.class
        };
        ArrayList<Object[]> data = new ArrayList<>();

        for(Class clazz: clazzes) {
            data.add(new Object[]{clazz});
        }

        return data;
    }
}