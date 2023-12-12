package mx.com.kabec;

import mx.com.kabec.shop.Door;

public class Shop {

	public static void main(String[] args) {
		Door door = new Door();
		door.shopStatus(true);
		door.getLock().setLock(false);
		door.getLock().setBroken(true);
		door.shopStatus(true);
	}

}
