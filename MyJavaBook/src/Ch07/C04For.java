package Ch07;

import java.util.Scanner;

import Ch01.C01SystemOut;

public class C04For {

	public static void main(String[] args) {

		// While
//		int i = 0; // 탈출용 변수 선언
//		while (i < 10) { // 탈출용 조건식
//			System.out.println("HELLO WORLD");
//			i++; // 탈출용 연산식
//		}

		// For
//		for (int i = 0; i < 10; i++) { // 탈출용 변수 선언; 탈출용 조건식; 탈출용 연산식;
//			System.out.println("HELLO WORLD");
//		}

		// 1 - 10 까지 합
//		int sum = 0;
//		for (int i = 1; i < 11; i++)
//			sum += i;
//		System.out.println("SUM : " + sum);

		// 1 - N 까지 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= n; i++) {
//			sum += i;
//		}
//		System.out.println("SUM : " + sum);
//		
//		sc.close();

		// N - M 까지 합 (N < M)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int sum = 0;
//		if (n >= m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		for (int i = n; i <= m; i++) {
//			sum += i;
//		}
//		System.out.println("SUM : " + sum);
//
//		sc.close();

		// 2단 구구단
//		for (int i = 1; i <= 9; i++) {
//			System.out.printf("2 x %d = %d\n", i, 2 * i);
//		}

		// N단 구구단 (2 <= N <= 9)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		if ((n >= 2) && (n <= 9)) {
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d x %d = %d\n", n, i, n * i);
//			}
//		}
//
//		sc.close();

		// 2 - 9 구구단
//		for (int i = 2; i < 10; i++) {
//			System.out.println("=====" + i + "단=====");
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//			}
//		}

		// 2 - N 구구단
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		for (int i = 2; i<=n; i++) {
//			System.out.println("=====" + i + "단=====");
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//			}
//		}
//		
//		sc.close();

		// N - M 구구단
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		for (int i = n; i <= m; i++) {
//			System.out.println("=====" + i + "단=====");
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//			}
//		}
//
//		sc.close();

		// 별찍기

		// *
		// **
		// ***
		// ****
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < i + 1; j++)
//				System.out.print('*');
//			System.out.println();
//		}

		// 높이 h 입력
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j < i + 1; j++)
//				System.out.print('*');
//			System.out.println();
//		}
//		sc.close();

		//    *
		//   ***
		//  *****
		// *******
//		for (int i = 0; i < 4; i++) { // 개행
//			for (int j = 0; j < 3 - i; j++) // 공백
//				System.out.print(" ");
//			for (int k = 0; k < 2 * i + 1; k++) // 별찍기
//				System.out.print('*');
//			System.out.println();
//		}

		// 높이 h 입력
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		for (int i = 0; i < h; i++) {
//			for (int j = 0; j < h - 1 - i; j++)
//				System.out.print(" ");
//			for (int k = 0; k < 2 * i + 1; k++)
//				System.out.print('*');
//			System.out.println();
//		}
//		sc.close();

	}

}
