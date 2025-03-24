package Ch35.building;

public abstract class Building {
	public int hp; // 체력
	public int amor; // 보호장비
	public int shield; // 보호막
	public boolean isDestroyed;

	// 건물 짓기
	public abstract void buildStructure();

	// 공격 당함
	public void underAttack(int damage) {
		// shield -> amor -> hp
		if (shield - damage > 0) {
			this.shield -= damage;
		} else if (amor - (damage - shield) > 0) {
			this.amor -= damage;
			amor = amor - (damage - shield);
			shield = 0;
		} else if (hp - (damage - amor) > 0) {
			this.hp -= damage;
			hp = hp - (damage - amor);
			amor = 0;
		} else {
			shield = 0;
			amor = 0;
			hp = 0;
			isDestroyed = false;
			System.out.println("건물이 붕괴되었습니다.");
		}
	};

}
