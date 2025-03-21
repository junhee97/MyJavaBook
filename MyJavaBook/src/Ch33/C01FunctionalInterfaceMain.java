package Ch33;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface // 함수형 인터페이스 선언 (Compiler 에게 전달) - 추상메소드가 하나만 존재
interface Func1 {
	void say(String message); // 추상메소드
}

@FunctionalInterface // 함수형 인터페이스 선언 (Compiler 에게 전달) - 추상메소드가 하나만 존재
interface Func2 {
	int sum(Integer... args); // 추상메소드
}

@FunctionalInterface // 함수형 인터페이스 선언 (Compiler 에게 전달) - 추상메소드가 하나만 존재
interface Func3 {
	List<Integer> createListDesc(int... args); // 추상메소드
}

public class C01FunctionalInterfaceMain {

	public static void main(String[] args) {

		// 01
		Func1 func1 = (message) -> {
			System.out.println(message + "~!");
		};
		func1.say("Hi");

		Func1 func1_1 = System.out::println;
		func1_1.say("Hi");

		// 02
		Func2 func2 = (items) -> {
			// 모든 items 더한 값 리턴(반복문으로 items 의 item 을 누적해서 리턴
			int sum = 0;
			for (int item : items) {
				sum += item;
			}
			return sum;
		};
		System.out.println(func2.sum(10, 20, 30, 40, 5565, 6, 7, 8, 9));

		Func2 func2_2 = (items) -> {
			// {} 에 모든 items 를 더한 값 리턴(reduce)
			return Arrays.stream(items).reduce(0, Integer::sum);
		};
		System.out.println(func2_2.sum(10, 20, 30, 40, 5565, 6, 7, 8, 9));

		// 03 원시타입 int[] 받기 -> int를Integer로 boxing -> 내림차순(sorted) -> List<Integer> 변환
		Func3 func3 = (items) -> {
			return Arrays.stream(items).boxed().sorted((a, b) -> b - a).collect(Collectors.toList());
		};
		List<Integer> li = func3.createListDesc(10, 100, 20, 200, 30, 300, 40, 400);
		System.out.println(li);

	}

}
