package rtn.observer;

public interface Observer {
    /**
     * notifies the observable
     * @param observable the notifier
     */
	public abstract void notify(Observable observable);

}
