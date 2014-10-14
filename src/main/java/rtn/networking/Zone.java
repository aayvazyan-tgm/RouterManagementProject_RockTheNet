package rtn.networking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Zone
{
    private static final Logger logger = LoggerFactory.getLogger(Zone.class);

	private String name;

    public Zone(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}