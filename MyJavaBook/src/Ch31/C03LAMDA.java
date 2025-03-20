package Ch31;

interface Calculator {
	int calculate(int num1, int num2);
}

public class C03LAMDA {

	public static void main(String[] args) {

		// 덧셈 - Calculator add
//		Calculator add = ((a , b) -> {return a + b;});
//		Calculator add = (a, b) -> a + b;
		Calculator add = Integer::sum;

		// 뺄셈 - Calculator sub
		Calculator sub = (a, b) -> a > b ? a - b : b - a;

		// 곱셈 - Calculator mul
		Calculator mul = (a, b) -> a * b;

		// 나눗셈 - Calculator div
		Calculator div = (a, b) -> a > b ? a / b : b / a;

		// 결과
		System.out.println("덧셈 결과 : " + add.calculate(10, 20));
		System.out.println("뺄셈 결과 : " + sub.calculate(30, 10));
		System.out.println("곱셈 결과 : " + mul.calculate(10, 20));
		System.out.println("나눗셈 결과 : " + div.calculate(100, 5));

	}

}
