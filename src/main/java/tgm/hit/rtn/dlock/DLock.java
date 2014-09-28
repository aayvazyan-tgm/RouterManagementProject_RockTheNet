package tgm.hit.rtn.dlock;

import java.util.concurrent.TimeUnit;

public class DLock implements GotLock {

	private PeerManager peerManager;

	private DLockClient dLockClient;

	public DLock() {

	}

	public void lockWhile(Callback call, Object params) {

	}

	public void lock() {

	}

	public boolean tryLock() {
		return false;
	}

	public boolean tryLock(long time, TimeUnit unit) {
		return false;
	}

	public void unlock() {

	}


	/**
	 * @see tgm.hit.rtn.dlock.GotLock#gotLock()
	 */
	public void gotLock() {

	}

}
