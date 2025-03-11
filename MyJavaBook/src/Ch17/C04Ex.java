package Ch17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04Ex {

	public static void main(String[] args) {

		// 1) 1 ~ 45 까지 숫자 6개를 랜덤으로 받아(Random 클래스를 이용) Set 에 저장 / 출력
		Set<Integer> randomNum = new HashSet();
		Random random = new Random();
		while(randomNum.size() < 6) {
			int num = random.nextInt(45)+1;
			randomNum.add(num);
		}
		System.out.println(randomNum);
		
		// 2) [추가] 저장된 Set 의 오름차순정렬을 해보세요(검색을 통해서 해결해봅니다 - 스트림함수 사용)
		List<Integer> sortNum = randomNum.stream().sorted().collect(Collectors.toList());
		System.out.println(sortNum);
		
		// 3)
		List<Integer> list = new ArrayList(randomNum);
		Collections.sort(list);
		System.out.println(list);
		
	}

}
