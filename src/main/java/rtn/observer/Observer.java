package rtn.observer;

public interface Observer<T> {
    /**
     * Gets notified when event occurs.
     *
     * @param event Event that triggered the observer.
     */
	public abstract void notify(T event);

}
