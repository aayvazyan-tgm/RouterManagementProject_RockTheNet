package tgm.hit.rtn.dlock;

public interface Persistance<V> {

	public abstract void store(String key, V value);

	public abstract V load(String key);

}
