package rtn.networking;

public interface IAdminStrategy {

	public abstract boolean enableTrap();

	public abstract boolean disableTrap();

	public abstract boolean addPolicy(Policy policy);

	public abstract boolean updatePolicy(Policy newPolicy, Policy oldPolicy);

	public abstract boolean deletePolicy(Policy policy);

}
