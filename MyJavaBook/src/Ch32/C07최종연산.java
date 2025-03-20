package Ch32;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class C07최종연산 {
	public static void main(String[] args) {

		// foreach
		List<String> names = Arrays.asList("John", "Jane", "Mike");
		names.stream().forEach(System.out::println); // 출력: John Jane Mike

		// collect
		List<String> names1 = Arrays.asList("John", "Jane", "Mike");
		Set<String> nameSet = names1.stream().collect(Collectors.toSet());
		System.out.println(nameSet); // 출력: [John, Jane, Mike]

		// reduce
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);
		System.out.println(sum.orElse(0)); // 출력: 15

		// min
		List<Integer> numbers1 = Arrays.asList(5, 2, 8, 1, 4);
		Optional<Integer> minNumber = numbers1.stream().min(Comparator.naturalOrder());
		System.out.println(minNumber.orElse(0)); // 출력: 1

		// max
		List<Integer> numbers2 = Arrays.asList(5, 2, 8, 1, 4);
		Optional<Integer> maxNumber = numbers2.stream().max(Comparator.naturalOrder());
		System.out.println(maxNumber.orElse(0)); // 출력: 8

		// count
		List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5);
		long count = numbers3.stream().count();
		System.out.println(count); // 출력: 5

		// anyMatch
		List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
		boolean hasEvenNumber = numbers4.stream().anyMatch(n -> n % 2 == 0);
		System.out.println(hasEvenNumber); // 출력: true

	}

}
