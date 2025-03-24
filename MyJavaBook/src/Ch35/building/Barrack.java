package Ch35.building;

import java.util.HashMap;
import java.util.Map;

import Ch35.unit.Marine;
import Ch35.unit.Medic;

public class Barrack extends Building {

	// 속이 찬 다이아몬드
//	UnitGenerator marine;
//	UnitGenerator medic;
//	
//	public Barrack() {
//		marine = new MarineGenerator();
//		medic = new MedicGenerator();
//	}

	// 속이 빈 다이아몬드
	Map<String, UnitGenerator> generator = new HashMap();

	void setGenerator(UnitGenerator gen, String type) {
		generator.put(type, gen);
	}

	public Marine getMarine() {
		if (!isDestroyed) {
			UnitGenerator marineGen = generator.get("marine");
			return marineGen != null ? (Marine) marineGen.gen() : null;
		} else {
			System.out.println("건물이 파괴되었거나 지어지는 중입니다");
			return null;
		}
	}

	public Medic getMedic() {
		if (!isDestroyed) {
			UnitGenerator medicGen = generator.get("meidc");
			return medicGen != null ? (Medic) medicGen.gen() : null;
		} else {
			System.out.println("건물이 파괴되었거나 지어지는 중입니다");
			return null;
		}
	}

	@Override
	public void buildStructure() {
		System.out.println("건설 시작");
		while (amor < 100 || hp < 100 || shield < 100) {
			try {
				Thread.sleep(100);
				if (amor != 100)
					amor++;
				if (hp != 100)
					hp++;
				if (shield != 100)
					shield++;
				System.out.printf("건물 짓는 중.. hp = %d, amor = %d, shield = %d\n", hp, amor, shield);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		setGenerator(new MarineGenerator(), "marine");
		setGenerator(new MedicGenerator(), "medic");

		// 건물 생성 처리
		System.out.println("건물 완성");
	}

}
