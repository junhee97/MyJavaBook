package Ch07;

import java.util.Scanner;

public class C03Continue_Break {

	public static void main(String[] args) {

		// 1 break
		// -1 을 입력하기 전까지 정수 값을 누적하여 합을 구하고 출력
//		Scanner sc = new Scanner(System.in);
//		int n;
//		int sum = 0;
//		while (true) {
//			n = sc.nextInt();
//			if (n == -1)
//				break; // 가장 근접합 위치에 있는 반복문 종료
//
//			sum += n;
//		}
//		System.out.println("SUM : " + sum);
//
//		sc.close();

		// 모든 반복문 탈출 : flag
		// 7 x 7 = 49 출력 이후 모든 반복문 탈출
//		boolean flag = false;
//		int i = 2;
//		while (i < 10) {
//			System.out.println("-----" + i + "단-----");
//			int j = 1;
//			while (j < 10) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//				// 7 x 7 = 49 출력 이후 모든 반복문 탈출
//				if (i == 7 && j == 7) {
//					flag = true;
//					break;
//				}
//				j++;
//			}
//			System.out.println();
//
//			if (flag)
//				break;
//			i++;
//		}

		// : EXIT
//		int i = 2;
//		Exit:
//		while (i < 10) {
//			System.out.println("-----" + i + "단-----");
//			int j = 1;
//			while (j < 10) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//				// 7 x 7 = 49 출력 이후 모든 반복문 탈출
//				if (i == 7 && j == 7) {
//					break Exit;
//				}
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// continue
		// 1부터 10까지의 수 중에 3의 배수를 제외한 합 출력
		int i = 1;
		int sum = 0;
		while (i <= 10) {
			if(i%3==0) {
				i++;
				continue;
			}
			System.out.println("i : " + i);
			sum += i;
			i++;
		}
		System.out.println("SUM : " + sum);

	}

}
