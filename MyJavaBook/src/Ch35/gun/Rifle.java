package Ch35.gun;

import Ch35.unit.Unit;

public class Rifle extends Gun {

	public Rifle() {
		this.power = 30;
		this.curBullitCnt = 0;
		this.maxBullitCnt = 100;
	}

	@Override
	public void fire(Unit unit) {
		if (curBullitCnt == 0) {
			System.out.println("총알 : 0 재장전 필요...");
			return;
		}
		unit.UnderAttack(this.power);
		curBullitCnt--;
	}

	@Override
	public void reload(int bullit) {
		if (this.maxBullitCnt > this.curBullitCnt + bullit)
			this.curBullitCnt += bullit;
		else
			this.curBullitCnt = maxBullitCnt;
	}

}
