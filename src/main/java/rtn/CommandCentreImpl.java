package rtn;

import java.util.ArrayList;
import java.util.List;

import com.sun.media.sound.AlawCodec;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import rtn.networking.Action;
import rtn.networking.CommandProxy;
import rtn.networking.Configuration;
import rtn.networking.Policy;
import rtn.networking.SNMPManager;
import rtn.networking.Service;
import rtn.networking.Zone;
import rtn.networking.device.commands.IAddPolicy;
import rtn.networking.device.commands.IDeletePolicy;
import rtn.networking.device.commands.IDevCommand;
import rtn.networking.device.commands.IPullActions;
import rtn.networking.device.commands.IPullServices;
import rtn.networking.device.commands.IPullZones;
import rtn.networking.device.commands.IResult;
import rtn.networking.device.commands.IUpdatePolicy;
import rtn.networking.device.commands.IUpdatePolicyTest;
import rtn.networking.device.juniper_netscreen_5gt.AddPolicy;
import rtn.networking.device.juniper_netscreen_5gt.DeletePolicy;
import rtn.networking.device.juniper_netscreen_5gt.TableEvent;
import rtn.networking.device.juniper_netscreen_5gt.UpdatePolicy;

public class CommandCentreImpl implements ICommandCentre {
	@Override
	public boolean enableAlarm() {
		// NOT FINISHED BECUASE NOT IMPLEMENTED IN CONT
		// Boolean value
		boolean b = false;
		try {
			//
			CommandProxy.getCommand("enableAlarm", Configuration.getInstance()
					.getDevice());
			b = true;

		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {

			b = false;

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;
	}

	@Override
	public boolean disableAlarm() {
		// NOT FINISHED BECUASE NOT IMPLEMENTED IN CONT
		// Boolean value
		boolean b = false;
		try {
			//
			CommandProxy.getCommand("disableAlarm", Configuration.getInstance()
					.getDevice());
			b = true;

		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException e) {

			b = false;

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return b;

	}

	@Override
	public boolean addPolicy(Policy policy) {
		try {
			//
			IAddPolicy ab = (IAddPolicy) CommandProxy.getCommand("AddPolicy",
					Configuration.getInstance().getDevice());
			ab.setParams(policy);

			ab.execute();

			return true;

		} catch (Exception e) {

			return false;
		}
	}

	@Override
	public boolean updatePolicy(Policy newPolicy) {

		try {
			//
			IUpdatePolicy ab = (IUpdatePolicy) CommandProxy.getCommand("UpdatePolicy"
					
					,Configuration.getInstance().getDevice());
			
			ab.setParams(newPolicy);
			
			ab.execute();
			
			return true;
			
		} catch (Exception e) {

			return false;

		}

	}
	
	@Override
	public boolean deletePolicy(Policy policy) {
		try {
			//
			IDeletePolicy ab = (IDeletePolicy) CommandProxy.getCommand("DeletePolicy"
					,Configuration.getInstance().getDevice());
			
			ab.setParams(policy);
			
			ab.execute();
			
			return true;
			
		} catch (Exception e) {

			return false;

		}
	}

	@Override
	public List<Service> getServices() {
		IPullServices ir = (IPullServices) CommandProxy.getCommand("PullServices"
				,Configuration.getInstance().getDevice());
		
		ir.execute();
		
		List<Service> ab = (List<Service>) ir.getResult();
		
		return ab;
	}

	@Override
	public List<Zone> getZones() {
		IPullZones pz = (IPullZones) CommandProxy.getCommand("PullZones", 
				Configuration.getInstance().getDevice());
		pz.execute();
		
		List<Zone> ab = (List<Zone>) pz.getResult();
		
		return ab;
	}

	@Override
	public List<Action> getActions() {
		IPullActions pz = (IPullActions) CommandProxy.getCommand("PullAction", 
				Configuration.getInstance().getDevice());
		pz.execute();
		
		List<Action> ab = (List<Action>) pz.getResult();
		
		return ab;

	}
}
