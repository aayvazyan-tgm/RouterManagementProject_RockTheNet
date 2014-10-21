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
     * __        _______ _____ ___ ___ ___
     * \ \      / /_   _|  ___|__ \__ \__ \
     *  \ \ /\ / /  | | | |_    / / / / / /
     *   \ V  V /   | | |  _|  |_| |_| |_|
     *    \_/\_/    |_| |_|    (_) (_) (_)
     *
     * TODO ???
     * @param n ?
     * @param zi ?
     * @param zo ?
     * @param s ?
     * @param a ?
     * @param ai ?
     * @param ao ?
     * @param l ?
     */
	public TableRule(String n, String zi, String zo, String s, String a, String ai, String ao, Boolean l) {
        this.name = new SimpleStringProperty(n);
        this.zoneIn = new SimpleStringProperty(zi);
        this.zoneOut = new SimpleStringProperty(zo);
        this.service = new SimpleStringProperty(s);
        this.action = new SimpleStringProperty(a);
        this.addressIn = new SimpleStringProperty(ai);
        this.addressOut = new SimpleStringProperty(ao);
        this.logged = new SimpleBooleanProperty(l);
    }

	/**
	 * sets the name
	 */
	public void setName(String n) {
		name.set(n);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name.get();
	}

	/**
	 * sets the zoneIn
	 */
	public void setZoneIn(String zi) {
		zoneIn.set(zi);
	}
	/**
	 * @return the zoneIn
	 */
	public String getZoneIn() {
		return zoneIn.get();
	}

	/**
	 * sets the zoneOut
	 */
	public void setZoneOut(String zo) {
		zoneOut.set(zo);
	}
	/**
	 * @return the zoneOut
	 */
	public String getZoneOut() {
		return zoneOut.get();
	}

	/**
	 * sets the service
	 */
	public void setService(String s) {
		service.set(s);
	}
	/**
	 * @return the service
	 */
	public String getService() {
		return service.get();
	}

	/**
	 * sets the action
	 */
	public void setAction(String a) {
		action.set(a);
	}
	/**
	 * @return the action
	 */
	public String getAction() {
		return action.get();
	}

	/**
	 * sets the addressIn
	 */
	public void setAddressIn(String ai) {
		addressIn.set(ai);
	}
	/**
	 * @return the addressIn
	 */
	public String getAddressIn() {
		return addressIn.get();
	}

	/**
	 * sets the addressOut
	 */
	public void setAddressOut(String ao) {
		addressOut.set(ao);
	}
	/**
	 * @return the addressOut
	 */
	public String getAddressOut() {
		return addressOut.get();
	}

	/**
	 * sets the logged
	 */
	public void setLogged(Boolean l) {
		logged.set(l);
	}
	/**
	 * @return the logged
	 */
	public Boolean getLogged() {
		return logged.get();
	}
	
}
