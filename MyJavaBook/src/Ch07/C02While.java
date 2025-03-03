package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {

		// 2단 - 9단 출력
//		int i = 2;
//		while (i < 10) {
//			System.out.println("-----" + i + "단-----");
//			int j = 1;
//			while (j < 10) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// 2단 - 9단 출력 (2x9, 2x8, ..., 9x9, 9x1)
//		int i = 2;
//		while (i < 10) {
//			System.out.println("-----" + i + "단-----");
//			int j = 9;
//			while (j > 0) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//				j--;
//			}
//			System.out.println();
//			i++;
//		}

		// 9단 - 2단 출력 (9x9, 9x8, ..., 2x2, 2x1)
//		int i = 9;
//		while (i > 1) {
//			System.out.println("-----" + i + "단-----");
//			int j = 9;
//			while (j > 0) {
//				System.out.printf("%d x %d = %d\n", i, j, i * j);
//				j--;
//			}
//			System.out.println();
//			i--;
//		}

		// 2단 - N단(N<9)
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("단을 입력하세요 : ");
//		int n = sc.nextInt();
//		int i = 2;
//
//		if ((n < 10) && (n > 1)) {
//			while (i <= n) {
//				System.out.println("-----" + i + "단-----");
//				int j = 1;
//				while (j < 10) {
//					System.out.printf("%d x %d = %d\n", i, j, i * j);
//					j++;
//				}
//				System.out.println();
//				i++;
//			}
//		} else
//			System.out.println("단을 다시 입력하세요.");
//
//		sc.close();

		// N단 - M단(N<M , N<9 , M<9)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("단을 입력하세요 : ");
//		int n = sc.nextInt();
//		System.out.print("단을 입력하세요 : ");
//		int m = sc.nextInt();
//
//		if ((n <= m) && (n < 10) && (m < 10)) {
//			while (n <= m) {
//				System.out.println("-----" + n + "단-----");
//				int j = 1;
//				while (j < 10) {
//					System.out.printf("%d x %d = %d\n", n, j, n * j);
//					j++;
//				}
//				System.out.println();
//				n++;
//			}
//		}else
//			System.out.println("단을 다시 입력하세요.");
//		
//		sc.close();

		// 별찍기(기본높이:4)
		// *****
		// *****
		// *****
		// *****
//		int i = 0;
//		while (i < 4) {
//			int j = 0;
//			while (j < 5) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// 높이 h 입력
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while ( i < h ) {
//			int j = 0;
//			while (j < 5) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		// *
		// **
		// ***
		// ****
//		int i = 0;
//		while (i < 4) {
//			int j = 0;
//			while (j < i + 1) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// 높이 h 입력
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while (i < h) {
//			int j = 0;
//			while ( j < i + 1) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		// ****
		// ***
		// **
		// *
//		int i = 0;
//		while (i < 4) {
//			int j = 0;
//			while (j < 4 - i) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println();
//			i++;
//		}

		// 높이 h 입력
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while ( i < h ) {
//			int j = 0;
//			while (j < h - i) {
//				System.out.print('*');
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		//    *
		//   ***
		//  *****
		// *******
//		int i = 0;
//		while (i < 4) {
//			int j = 0;
//			int k = 0;
//			while (j < 3 - i) {
//				System.out.print(" ");
//				j++;
//			}
//			while (k < 2 * i + 1) {
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		// 높이 h 입력
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while (i < h) {
//			int j = 0;
//			int k = 0;
//			while (j < (h - 1) - i) {
//				System.out.print(" ");
//				j++;
//			}
//			while (k < 2 * i + 1) {
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		// *******
		//  *****
		//   ***
		//    *
//		int i = 4;
//		while ( i > 0 ) {
//			int j = 4;
//			int k = 1;
//			while (j > i) {
//				System.out.print(" ");
//				j--;
//			}
//			while (k < 2 * i) {
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i--;
//		}

		// 높이 h 입력
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = h;
//		while ( i > 0 ) {
//			int j = h;
//			int k = 0;
//			while (j > i) {
//				System.out.print(" ");
//				j--;
//			}
//			while (k < 2 * i - 1) {
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i--;
//		}
//		sc.close();

//		int i = 0;
//		while (i < 4) {
//			int j = 0;
//			int k = 0;
//			while (j < i) {
//				System.out.print(" ");
//				j++;
//			}
//			while (k < (4 - i) * 2 - 1) {
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i++;
//		}

		// 높이 h 입력
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while (i < h) {
//			int j = 0;
//			int k = 0;
//			while (j < i) {
//				System.out.print(" ");
//				j++;
//			}
//			while (k < (h - i) * 2 - 1) {
//				System.out.print('*');
//				k++;
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		//    *
		//   ***
		//  *****
		// *******
		//  *****
		//   ***
		//    *
//		int i = 0;
//		while (i < 7) {
//			if (i < 4) {
//				int j = 0;
//				int k = 0;
//				while (j < 3 - i) {
//					System.out.print(" ");
//					j++;
//				}
//				while (k < 2 * i + 1) {
//					System.out.print('*');
//					k++;
//				}
//			} else {
//				int j = 0;
//				int k = 0;
//				while (j < i - 3) {
//					System.out.print(" ");
//					j++;
//				}
//				while (k < 13 - 2 * i) {
//					System.out.print('*');
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}

		// 높이 h 입력 (홀수 입력이 전제)
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while (i < h) {
//			if (i < (h / 2) + 1) {
//				int j = 0;
//				int k = 0;
//				while (j < (h - h / 2) - i - 1) {
//					System.out.print(" ");
//					j++;
//				}
//				while (k < 2 * i + 1) {
//					System.out.print('*');
//					k++;
//				}
//			} else {
//				int j = 0;
//				int k = 0;
//				while (j < i - (h / 2)) {
//					System.out.print(" ");
//					j++;
//				}
//				while (k < 2 * (h - i) - 1) {
//					System.out.print('*');
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
//		sc.close();

		// *******
		//  *****
		//   ***
		//    *
		//    *
		//   ***
		//  *****
		// *******
//		int i = 0;
//		while (i < 8) {
//			if (i < 4) {
//				int j = 0;
//				int k = 0;
//				while (j < i) {
//					System.out.print(" ");
//					j++;
//				}
//				while (k < (4 - i) * 2 - 1) {
//					System.out.print('*');
//					k++;
//				}
//			} else {
//				int j = 0;
//				int k = 0;
//				while (j < 7 - i) {
//					System.out.print(" ");
//					j++;
//				}
//				while (k < (2 * i) - 7) {
//					System.out.print('*');
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}

		// 높이 h 입력 (짝수 입력이 전제)
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int i = 0;
		while (i < h) {
			if (i < (h / 2)) {
				int j = 0;
				int k = 0;
				while (j < i) {
					System.out.print(" ");
					j++;
				}
				while (k < ((h / 2) - i) * 2 - 1) {
					System.out.print('*');
					k++;
				}
			} else {
				int j = 0;
				int k = 0;
				while (j < (h - 1) - i) {
					System.out.print(" ");
					j++;
				}
				while (k < (2 * i) - (h - 1)) {
					System.out.print('*');
					k++;
				}
			}
			System.out.println();
			i++;
		}
		sc.close();

	}

}
