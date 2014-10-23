package rtn.networking;

/**
 * Represents an action being made when a Firewall policy is being called.
 */
public class Action
{
	private String name;
	
    public Action(String name) {
        this.name = name;
    }

    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name) {
        this.name = name;
    }
}
