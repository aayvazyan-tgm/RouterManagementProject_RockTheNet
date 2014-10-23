package rtn.networking;

/**
 * Represents the in/outzone of an policy
 */
public class Zone
{
	private String name;

    public Zone(String name)
    {
        this.name=name;
    }
    
    /**
     * Gets the name.
     *
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Sets the name.
     *
     * @param name the new name
     */
    public void setName(String name)
    {
        this.name = name;
    }
}