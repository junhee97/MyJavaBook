package Ch35.unit;

public class Medic extends Unit {
	// hp, amor, type
	private int HealingPoint;

	public Medic() {
		hp = 100;
		amor = 100;
		HealingPoint = 30;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void Healing(Unit unit) {
		unit.hp += HealingPoint;
		System.out.println(unit.type + " 을 회복시킵니다" + unit.type + " 체력 : " + unit.hp);
	}

	@Override
	public void move() {
	}

	@Override
	public void UnderAttack(int damage) {
	}

}
