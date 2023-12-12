package mx.com.kabec.shop;

public class Door {
	private Lock lock;

	public Door() {
		lock = new Lock(true, false);
	}

	public Lock getLock() {
		return lock;
	}

	public void shopStatus() {
		if (lock.isLock()) {
			System.out.println("Shop is closed, please visit later.");
		} else {
			System.out.println("Welcome, we are open.");
		}
	}

	public void shopStatus(boolean checkIsBroken) {
		if (checkIsBroken == false) {
			shopStatus();
		} else {
			if (lock.isBroken() == false) {
				shopStatus();
			} else {
				System.out.println("Welcome, door's open anyway.");
			}
		}
	}

	public class Lock {
		private boolean lock;
		private boolean broken;

		public Lock(boolean lock) {

			this.lock = lock;
		}

		public Lock(boolean lock, boolean broken) {
			this.lock = lock;
			this.broken = broken;
		}

		public boolean isLock() {
			return lock;
		}

		public void setLock(boolean lock) {
			this.lock = lock;
		}

		public boolean isBroken() {
			return broken;
		}

		public void setBroken(boolean broken) {
			this.broken = broken;
		}

	}

}
