package rtn;

import java.util.List;
import rtn.networking.Action;
import rtn.networking.CommandProxy;
import rtn.networking.Configuration;
import rtn.networking.Policy;
import rtn.networking.Service;
import rtn.networking.Zone;
import rtn.networking.device.commands.IAddPolicy;
import rtn.networking.device.commands.IDeletePolicy;
import rtn.networking.device.commands.IPullActions;
import rtn.networking.device.commands.IPullServices;
import rtn.networking.device.commands.IPullZones;
import rtn.networking.device.commands.IUpdatePolicy;
/**
 * 
 * @author Djuric Daniel
 *
 */
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
		List<Service> ab;
		try {
			IPullServices ir = (IPullServices) CommandProxy.getCommand("PullServices"
					, Configuration.getInstance().getDevice());

			ir.execute();

			ab = (List<Service>) ir.getResult();
		}catch (Exception e){
			return null;
		}
		return ab;
	}

	@Override
	public List<Zone> getZones() {
		List<Zone> ab;
		try {
			IPullZones pz = (IPullZones) CommandProxy.getCommand("PullZones",
					Configuration.getInstance().getDevice());
			pz.execute();

			ab = (List<Zone>) pz.getResult();
		}catch (Exception e){
			return null;
		}
		return ab;
	}

	@Override
	public List<Action> getActions() {
		List<Action> ab;
		try{
			IPullActions pz = (IPullActions) CommandProxy.getCommand("PullAction",
					Configuration.getInstance().getDevice());
			pz.execute();

			ab = (List<Action>) pz.getResult();
		}catch (Exception e){
			return null;
		}
		return ab;

	}
}
