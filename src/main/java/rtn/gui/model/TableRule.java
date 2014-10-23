package rtn.gui.model;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Definition of the Data in the Rules Table
 * 
 * @author Fabian Freudensprung
 */
public class TableRule {
    private static final Logger logger = LoggerFactory.getLogger(TableRule.class);

	private final SimpleStringProperty name;
	private final SimpleStringProperty zoneIn;
	private final SimpleStringProperty zoneOut;
	private final SimpleStringProperty service;
	private final SimpleStringProperty action;
	private final SimpleStringProperty addressIn;
	private final SimpleStringProperty addressOut;
	private final SimpleBooleanProperty logged;

    /**
     * Creates a new TableRule object.
     * 
     * @param name Name of the zone
     * @param zoneIn The inbound zone
     * @param zoneOut The outbound zone
     * @param service The service of the policy
     * @param action The action to perform
     * @param addressIn The source address
     * @param addressOut The destination address
     * @param log Enable logging yes/no
     */
	public TableRule(String name, String zoneIn, String zoneOut, String service, String action, String addressIn, String addressOut, Boolean log) {
        this.name = new SimpleStringProperty(name);
        this.zoneIn = new SimpleStringProperty(zoneIn);
        this.zoneOut = new SimpleStringProperty(zoneOut);
        this.service = new SimpleStringProperty(service);
        this.action = new SimpleStringProperty(action);
        this.addressIn = new SimpleStringProperty(addressIn);
        this.addressOut = new SimpleStringProperty(addressOut);
        this.logged = new SimpleBooleanProperty(log);
    }

	/**
	 * Sets the name
	 * 
	 * @param name Name of the policy
	 */
	public void setName(String name) {
		this.name.set(name);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name.get();
	}

	/**
	 * Rets the inbound zone
     *
	 * @param zoneIn The inbound zone
	 */
	public void setZoneIn(String zoneIn) {
		this.zoneIn.set(zoneIn);
	}

    /**
     * Returns the inbound zone
     *
     * @return the inbound zone
     */
	public String getZoneIn() {
		return zoneIn.get();
	}

	/**
	 * Sets the outbound zone
     *
	 * @param zoneOut The outbound zone
	 */
	public void setZoneOut(String zoneOut) {
		this.zoneOut.set(zoneOut);
	}

    /**
     * Returns the outbound zone
     *
	 * @return the outbound zone
	 */
	public String getZoneOut() {
		return zoneOut.get();
	}

	/**
	 * Sets the service
     *
	 * @param service The service of the policy
	 */
	public void setService(String service) {
		this.service.set(service);
	}

    /**
     * Returns the service of the policy
     *
	 * @return the service of the policy
	 */
	public String getService() {
		return service.get();
	}

	/**
	 * Sets the action to perform
     *
	 * @param action The action to perform
	 */
	public void setAction(String action) {
		this.action.set(action);
	}

    /**
     * Returns the action to perform
     *
	 * @return the action to perform
	 */
	public String getAction() {
		return action.get();
	}

	/**
	 * Sets the inbound address
     *
	 * @param addressIn The inbound address
	 */
	public void setAddressIn(String addressIn) {
		this.addressIn.set(addressIn);
	}

    /**
     * Returns the inbound address
     *
	 * @return the inbound address
	 */
	public String getAddressIn() {
		return addressIn.get();
	}

	/**
	 * Sets the outbound address
     *
	 * @param addressOut The outbound address
	 */
	public void setAddressOut(String addressOut) {
		this.addressOut.set(addressOut);
	}

    /**
     * Returns the outbound address
     *
	 * @return the outbound address
	 */
	public String getAddressOut() {
		return addressOut.get();
	}

	/**
	 * Enables/Disables logging
     *
	 * @param logged Enable/Disable logging
	 */
	public void setLogged(Boolean logged) {
		this.logged.set(logged);
	}
	/**
     * Returns, if the policy is logged
     *
	 * @return is logged
	 */
	public Boolean getLogged() {
		return logged.get();
	}
	
}
