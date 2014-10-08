package rtn.networking;

public class Policy
{
	private Long id;

	private String displayname;

	private String source;

	private String destination;

	private String action;

	private boolean log;

	private Service service;

	private Zone inzone;

	private Zone outzone;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getDisplayname()
	{
		return displayname;
	}

	public void setDisplayname(String displayname)
	{
		this.displayname = displayname;
	}

	public String getSource()
	{
		return source;
	}

	public void setSource(String source)
	{
		this.source = source;
	}

	public String getDestination()
	{
		return destination;
	}

	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	public String getAction()
	{
		return action;
	}

	public void setAction(String action)
	{
		this.action = action;
	}

	public boolean isLog()
	{
		return log;
	}

	public void setLog(boolean log)
	{
		this.log = log;
	}

	public Service getService()
	{
		return service;
	}

	public void setService(Service service)
	{
		this.service = service;
	}

	public Zone getInzone()
	{
		return inzone;
	}

	public void setInzone(Zone inzone)
	{
		this.inzone = inzone;
	}

	public Zone getOutzone()
	{
		return outzone;
	}

	public void setOutzone(Zone outzone)
	{
		this.outzone = outzone;
	}
}