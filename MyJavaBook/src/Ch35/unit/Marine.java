package Ch35.unit;

import Ch35.gun.Gun;

public class Marine extends Unit {
	// hp, amor, type

	public Gun myGun;
	boolean isDead;

	public Marine() {
		isDead = true;
		hp = 100;
		amor = 100;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setGun(Gun gun) {
		this.myGun = gun;
	}

	public void attack(Unit unit) {
		// base_damage, gun's power
		// unit.underAttatck에 전달
		if (isDead) {
			myGun.fire(unit);
			System.out.println("[ATTACK] " + this.type + " 이" + unit.type + " 에게 공격합니다");
		}
	}

	@Override
	public void move() {
		System.out.println(type + "이동합니다");
	}

	@Override
	public void UnderAttack(int damage) {
		// amor-- -> hp-- -> dead
		if (amor - damage > 0) {
			this.amor -= damage;
		} else if (hp - (damage - amor) > 0) {
			this.hp -= damage;
			hp = hp - (damage - amor);
			amor = 0;
		} else {
			amor = 0;
			hp = 0;
			isDead = false;
			System.out.println(this.type + "사망...");
		}

	}

}
