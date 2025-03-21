package Ch33;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

// 제공되는 함수형 인터페이스들
// Function<T, R> : apply 메서드를 가지고 있어서 하나의 인자(T)를 받아서 결과(R)를 반환하는 함수형 인터페이스 입니다.
// Supplier<T> : get 메서드를 가지고 있어서 어떠한 인자도 받지 않고 결과만을 제공하는 함수형 인터페이스 입니다.
// Consumer<T> : accept 메서드를 가지고 있어서 어떠한 인자를 받아서 결과를 반환하지 않는 함수형 인터페이스 입니다.
// Predicate<T> : test 메서드를 가지고 있어서 어떠한 인자를 받아서 불리언 결과를 반환하는 함수형 인터페이스 입니다.
// UnaryOperator<T> : apply 메서드를 가지고 있어서 하나의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.
// BinaryOperator<T> : apply 메서드를 가지고 있어서 두 개의 인자를 받아서 동일한 타입의 결과를 반환하는 함수형 인터페이스 입니다.

public class C03FunctionalInterfaceMain {

	// 01
	public static Function<Integer, Integer> func1 = a -> a * a;

	// 02
	public static Function<Integer, Integer> func2 = a -> a + a;

	// 03
	public static Function<List<Integer>, Integer> func3 = list -> list.stream().reduce(0, Integer::sum);

	// 04
	// List<Object>로 받은 파리미터 중에 Integer 만 추출해서 누적합 구하기
	// Integer 형만 필터링(instanceof) -> 누적 합(reduce)
	public static Function<List<Object>, Integer> func4 = li -> li.stream().filter(x -> x instanceof Integer)
			.map(x -> (Integer) x).reduce(0, Integer::sum);

	// 05
	// List<Object>로 받은 파리미터 중에 Integer 만 추출해서 리턴하기
	// Integer 형만 필터링(instanceOf) -> 재구성(map) -> 리스트로 변환(collect)
	public static Function<List<Object>, List<Integer>> func5 = li -> li.stream().filter(x -> x instanceof Integer)
			.map(x -> (Integer) x).collect(Collectors.toList());

	// 06
	public static Function<Integer, Integer> func6 = func1.andThen(func2);

	// 07
	public static Function<Integer, Integer> func7 = func2.andThen(func1);

	// 08
	public static Function<List<Integer>, Integer> subfunc = list -> list.stream().reduce(0, Integer::sum);
	public static Function<List<Object>, Integer> func8 = func5.andThen(subfunc);

	// 09
	public static Function<Integer, Function<Integer, Integer>> func9 = (x) -> {return (y) -> {return x + y;};};
	
	// 10
	public static Function<Integer, Function<Integer, Integer>> func10 = x -> y -> x + y;
	
	// 11
	public static Function<Integer, Function<Integer, Function<Integer, Integer>>> func11 = x -> y -> z -> x + y + z;

	public static void main(String[] args) {

		// 01
		System.out.println(func1.apply(15));

		// 02
		System.out.println(func2.apply(15));

		// 03
		System.out.println(func3.apply(Arrays.asList(10, 20, 30, 40, 50)));

		// 04
		System.out.println(func4.apply(Arrays.asList("홍길동", 100, 20, 300, 10.5, true, "b", "c")));

		// 05
		System.out.println(func5.apply(Arrays.asList("홍길동", 100, 20, 300, 10.5, true, "b", "c")));

		// 06
		System.out.println(func6.apply(15)); // func1 -> func2 = 450

		// 07
		System.out.println(func7.apply(15)); // func2 -> func1 = 900

		// 08
		System.out.println(func8.apply(Arrays.asList("홍길동", 100, 20, 300, 10.5, true, "b", "c")));

		// 09
		System.out.println(func9.apply(10).apply(20));
		
		// 10
		System.out.println(func10.apply(10).apply(20));
		
		// 11
		System.out.println(func11.apply(10).apply(20).apply(30));

	}

}
