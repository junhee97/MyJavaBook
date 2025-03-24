package Ch35;

import Ch35.gun.Pistol;
import Ch35.gun.Rifle;
import Ch35.unit.Marine;
import Ch35.unit.Medic;

public class Main {

	public static void main(String[] args) {

		Marine marine1 = new Marine();
		marine1.setGun(new Pistol());
		marine1.myGun.reload(10);
		marine1.setType("marine1");
		Medic medic1 = new Medic();
		medic1.setType("medic1");

		Marine marine2 = new Marine();
		marine2.setGun(new Rifle());
		marine2.myGun.reload(100);
		marine2.setType("marin2");

		// medic -> m1
		new Thread() {
			@Override
			public void run() {
				while (true) {
					medic1.Healing(marine1);
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();

		// m1 -> m2
		new Thread() {
			@Override
			public void run() {
				while (true) {
					marine1.attack(marine2);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();

		// m2 -> m1
		new Thread() {
			@Override
			public void run() {
				while (true) {
					marine2.attack(marine1);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}.start();

	}

}
