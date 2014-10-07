package rtn.observer;

public interface Observable {

	public abstract boolean register(Observer observer);

	public abstract boolean unregister(int observer);

	//TODO Fix non-overridable
	//public abstract void notify();

}
