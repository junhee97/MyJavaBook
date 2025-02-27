package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {

		// 10번 반복 - "HELLO WORLD"
		// 탈출용 변수 : i = 0
		// 탈출용 조건식 : i < 10
		// 탈출용 연산식 : i++
		// while(조건식) {
		// 조건식이 true 인 동안 실행되는 종속문장
		// }

		// 01 기본 - HELLO WORLD 10회 반복
//		int i = 0;
//		while (i < 10) {
//			System.out.println("HELLO WORLD");
//			i++;
//		}

		// 02 기본 - HELLO WORLD N회 반복
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 0;
//		while (i < n) {
//			System.out.println("HELLO WORLD");
//			i++;
//		}
//		sc.close();

		// 03 기본 - 1부터 10까지의 합
//		int i = 1; // 탈출용 변수
//		int sum = 0; // 누적 합 변수
//		while (i <= 10) { // 탈출용 조건식
//			sum += i;
//			System.out.println("i : " + i);
//			i++; // 탈출용 연산식
//		}
//		System.out.println("SUM : " + sum);

		// 04 기본 - 1부터 N까지 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while (i <= n) {
//			sum += i;
//			i++;
//		}
//		System.out.println(sum);
//
//		sc.close();

		// 05 기본 - N부터 M까지 합(N<M) - N>=M 인경우 N과 M을 Swap 하고 진행합니다
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//
//		if (n >= m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//
//		int sum = 0;
//		while (n <= m) {
//			sum += n;
//			n++;
//		}
//		System.out.println("SUM : " + sum);
//
//		sc.close();

		// 06 N - M 까지 수중 (N < M) 짝수의 합, 홀수의 합 각각 구해서 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//
//		if (n >= m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//
//		int evenSum = 0;
//		int oddSum = 0;
//		while (n <= m) {
//			System.out.println("n : " + n);
//			if (n % 2 == 0) {
//				evenSum += n;
//			} else {
//				oddSum += n;
//			}
//			n++;
//		}
//		System.out.println("짝수의 합 : " + evenSum + "\n홀수의 합 : " + oddSum);
//
//		sc.close();

		// 07 1 - N 까지 수중에 4의 배수를 출력하고 4의 배수가 아닌 나머지의 합을 구하세요
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//
//		while (i <= n) {
//			if (i % 4 == 0) {
//				System.out.println("4의 배수 : " + i);
//			} else {
//				sum += i;
//			}
//			i++;
//		}
//		System.out.println("SUM : " + sum);
//
//		sc.close();

		// 08 구구단 N단을 출력합니다(2<=N<=9)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단을 입력하세요 : ");
//		int n = sc.nextInt();
//		int i = 1;
//
//		if ((n >= 2) && (n <= 9)) {
//			System.out.printf("---- %d 단 ----\n", n);
//			while (i <= 9) {
//				System.out.printf("%d x %d = %d\n", n, i, n * i);
//				i++;
//			}
//		}else{
//			System.out.println("구구단의 범위는 2 - 9 사이값을 입력하셔야 됩니다.");
//		}
//		
//		while (n < 2 || n > 9) {
//			System.out.println("구구단의 범위는 2 -9 사이값을 입력하셔야 됩니다.");
//			System.out.print("단을 입력하세요 : ");
//			n = sc.nextInt();
//		}
//		System.out.printf("---- %d 단 ----\n", n);
//		while (i <= 9) {
//			System.out.printf("%d x %d = %d \n", n, i, n * i);
//			i++;
//		}
//		
//		sc.close();

	}

}
