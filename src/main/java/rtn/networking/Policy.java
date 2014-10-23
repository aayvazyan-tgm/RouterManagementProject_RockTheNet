package rtn.networking;

/**
 * This class represents an policy on the device, with each data associated to it.
 */
public class Policy
{
	private Long id;
	private String displayname;
	private String source;
	private String destination;
	private Action action;
	private boolean log;
	private Service service;
	private Zone inzone;
	private Zone outzone;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Long getId()
	{
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(Long id)
	{
		this.id = id;
	}

	/**
	 * Gets the displayname.
	 *
	 * @return the displayname
	 */
	public String getDisplayname()
	{
		return displayname;
	}

	/**
	 * Sets the displayname.
	 *
	 * @param displayname the new displayname
	 */
	public void setDisplayname(String displayname)
	{
		this.displayname = displayname;
	}

	/**
	 * Gets the source.
	 *
	 * @return the source
	 */
	public String getSource()
	{
		return source;
	}

	/**
	 * Sets the source.
	 *
	 * @param source the new source
	 */
	public void setSource(String source)
	{
		this.source = source;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public String getDestination()
	{
		return destination;
	}

	/**
	 * Sets the destination.
	 *
	 * @param destination the new destination
	 */
	public void setDestination(String destination)
	{
		this.destination = destination;
	}

	/**
	 * Gets the action.
	 *
	 * @return the action
	 */
	public Action getAction()
	{
		return action;
	}

	/**
	 * Sets the action.
	 *
	 * @param action the new action
	 */
	public void setAction(Action action)
	{
		this.action = action;
	}

	/**
	 * Checks if is log.
	 *
	 * @return true, if is log
	 */
	public boolean isLog()
	{
		return log;
	}

	/**
	 * Sets the log.
	 *
	 * @param log the new log
	 */
	public void setLog(boolean log)
	{
		this.log = log;
	}

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	public Service getService()
	{
		return service;
	}

	/**
	 * Sets the service.
	 *
	 * @param service the new service
	 */
	public void setService(Service service)
	{
		this.service = service;
	}

	/**
	 * Gets the inzone.
	 *
	 * @return the inzone
	 */
	public Zone getInzone()
	{
		return inzone;
	}

	/**
	 * Sets the inzone.
	 *
	 * @param inzone the new inzone
	 */
	public void setInzone(Zone inzone)
	{
		this.inzone = inzone;
	}

	/**
	 * Gets the outzone.
	 *
	 * @return the outzone
	 */
	public Zone getOutzone()
	{
		return outzone;
	}

	/**
	 * Sets the outzone.
	 *
	 * @param outzone the new outzone
	 */
	public void setOutzone(Zone outzone)
	{
		this.outzone = outzone;
	}
}