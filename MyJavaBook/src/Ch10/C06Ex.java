package Ch10;

import java.util.Scanner;

public class C06Ex {

	public static void main(String[] args) {

		// 5개의 정수 값을 입력받아 int형 배열에 저장하고
		// 최대값, 최소값, 전체합을 출력합니다.
//		Scanner sc = new Scanner(System.in);
//		int[] arr1 = new int[5];
//		System.out.print("정수를 입력하세요 : ");
//		arr1[0] = sc.nextInt();
//		arr1[1] = sc.nextInt();
//		arr1[2] = sc.nextInt();
//		arr1[3] = sc.nextInt();
//		arr1[4] = sc.nextInt();
//		
//		int max = arr1[0];
//		int min = arr1[0];
//		
//		for(int el : arr1) {
//			if(max<el)
//				max=el;
//			if(min>el)
//				min=el;
//		}
//		System.out.println("MAX : " + max);
//		System.out.println("MIN : " + min);
//		
//		sc.close();

		// 5명의 학생에 국영수 점수를 입력받아 2차원 배열 저장
		// 각 학생의 국영수 점수의 합/평균 구하고
		// 각 과목당 합 / 평균 구해보세요

		Scanner sc = new Scanner(System.in);
		int[][] arr1 = new int[5][3];

		for (int i = 0; i < arr1.length; i++) {
			System.out.println((i + 1) + "번 학생의 점수를 입력하세요");
			System.out.print("국어 점수를 입력하세요 : ");
			arr1[i][0] = sc.nextInt();
			System.out.print("영어 점수를 입력하세요 : ");
			arr1[i][1] = sc.nextInt();
			System.out.print("수학 점수를 입력하세요 : ");
			arr1[i][2] = sc.nextInt();
			System.out.println();
		}

		for (int i = 0; i < arr1.length; i++) {
			int sum = arr1[i][0] + arr1[i][1] + arr1[i][2];
			double avg = (double) sum / 3;
			System.out.printf("%d번 학생 점수의 합은 %d, 평균은 %f 입니다\n", i + 1, sum, avg);
		}
		System.out.println();

		int korean = 0;
		int english = 0;
		int math = 0;

		for (int i = 0; i < arr1.length; i++) {
			korean += arr1[i][0];
			english += arr1[i][1];
			math += arr1[i][2];
		}

		double avgKorean = (double) korean / arr1.length;
		double avgEnglish = (double) english / arr1.length;
		double avgMath = (double) math / arr1.length;

		System.out.printf("국어 점수의 합 : %d, 평균 : %f\n", korean, avgKorean);
		System.out.printf("영어 점수의 합 : %d, 평균 : %f\n", english, avgEnglish);
		System.out.printf("수학 점수의 합 : %d, 평균 : %f\n", math, avgMath);

		sc.close();

	}

}
