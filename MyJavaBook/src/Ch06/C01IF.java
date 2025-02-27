package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {

		// 단순 IF
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//
//		if (age >= 8)
//			System.out.println("학교에 다닙니다.");
//		
//		System.out.println("첫번째 IF 코드 블럭 종료..");
//
//		if (age < 8)
//			System.out.println("학교에 다니지 않습니다.");
//		
//		System.out.println("두번째 IF 코드 블럭 종료..");
//		System.out.println("프로그램을 종료합니다.");
//
//		sc.close();

		// IF-ELSE
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이 : ");
//		int age = sc.nextInt();
//
//		if (age >= 8)
//			System.out.println("학교에 다닙니다.");
//		else
//			System.out.println("학교에 다니지 않습니다.");
//
//		System.out.println("프로그램을 종료합니다.");
//
//		sc.close();

		// 문제 1
		// 정수 한개 값을 입력받아 3의 배수이면 해당 수를 출력하세요
		// 3의 배수 이면서 5의 배수라면 출력
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수를 입력하세요 : ");
//		int i = sc.nextInt();
//
//		if ((i % 3 == 0) && (i % 5 == 0))
//			System.out.printf("%d는 3과 5의 배수입니다.", i);
//
//		else if (i % 3 == 0)
//			System.out.printf("%d는 3의 배수입니다.", i);
//
//		else
//			System.out.print("배수가 아닙니다.");
//
//		sc.close();

		// 문제 2
		// 두개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수를 입력하세요 : ");
//		int num1 = sc.nextInt();
//
//		System.out.print("정수를 입력하세요 : ");
//		int num2 = sc.nextInt();
//
//		if (num1 >= num2)
//			System.out.println("큰 수는 : " + num1);
//		else
//			System.out.println("큰 수는 : " + num2);
//
//		sc.close();

		// 문제 3
		// 세개의 정수를 입력받아 큰 수 출력
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//
//		System.out.print("정수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//
//		System.out.print("정수를 입력하세요 : ");
//		int n3 = sc.nextInt();
//		
//		int max = n1; // 최대값(max)이 n1이라고 가정 시작
//		if(max<n2) {
//			max = n2;
//		}
//		if(max<n3) {
//			max = n3;
//		}
//		
//		System.out.println("큰수 : " + max);
//
//		if ((n1 >= n2) && (n1 >= n3))
//			System.out.println("큰 수는 : " + n1);
//		else if ((n2 >= n1) && (n2 >= n3))
//			System.out.println("큰 수는 : " + n2);
//		else
//			System.out.println("큰 수는 : " + n3);
//
//		sc.close();

		// 문제 4
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("정수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//
//		System.out.print("정수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//
//		System.out.print("정수를 입력하세요 : ");
//		int n3 = sc.nextInt();
//		
//		int sum = n1 + n2 + n3;
//		int avg = sum /3;
//		
//		System.out.println("합 : " + sum);
//		System.out.println("평균 : " + avg);
//		
//		
//		sc.close();

		// 문제 5
		// 입력한 수가 짝수이고, 3의 배수라면 출력
		// 입력한 수가 홀수이고, 5의 배수라면 출력
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("정수를 입력하세요 : ");
//		int i = sc.nextInt();
//
//		if (i % 2 == 0) {
//			if (i % 3 == 0)
//				System.out.println("짝수이면서 3의 배수 : " + i);
//		} else {
//			if (i % 5 == 0)
//				System.out.println("홀수이면서 5의 배수 : " + i);
//		}
//		sc.close();

		// IF - ELSE IF - ELSE
		// 과목 1, 2, 3, 4 중 하나라도 40점 미만이면 불합격
		// 과목 평균이 100점만점 기준으로 60점 미만이면 불합격
		// 아니면 합격
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("점수 입력 : ");
//		int sub1 = sc.nextInt();
//		int sub2 = sc.nextInt();
//		int sub3 = sc.nextInt();
//		int sub4 = sc.nextInt();
//
//		double avg = (double) (sub1 + sub2 + sub3 + sub4) / 4;
//
//		if (sub1 < 40) {
//			System.out.println("불합격");
//		} else if (sub2 < 40) { // sub1 >= 40 && sub2 < 40
//			System.out.println("불합격");
//		} else if (sub3 < 40) { // sub1 >= 40 && sub2 >= 40 && sub3 < 40
//			System.out.println("불합격");
//		} else if (sub4 < 40) { // sub1 >= 40 && sub2 >= 40 && sub3 >= 40 && sub4 < 40
//			System.out.println("불합격");
//		} else if (avg < 60) { // sub1 >= 40 && sub2 >= 40 && sub3 >= 40 && sub4 >= 40 && avg < 60
//			System.out.println("불합격");
//		} else // sub1 >= 40 && sub2 >= 40 && sub3 >= 40 && sub4 >= 40 && avg >= 60
//			System.out.println("합격");
//		
//		sc.close();

		// 문제 6
		// 시험 점수를 입력받아
		// 90 ~ 100 A
		// 80 ~ 89 B
		// 70 ~ 79 C
		// 60 ~ 69 D
		// 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("시험 점수를 입력하세요 : ");
//		int score = sc.nextInt();
//
//		if (score >= 90) {
//			System.out.println("A");
//		} else if (score >= 80) {
//			System.out.println("B");
//		} else if (score >= 70) {
//			System.out.println("C");
//		} else if (score >= 60) {
//			System.out.println("D");
//		} else
//			System.out.println("F");
//
//		sc.close();

		// 문제 7
		// 나이별로 요금을 부과하는 else if 문을 만드세요.
		// 8세 미만 : 요금은 1000원
		// 14세 미만 : 요금은 2000원
		// 20세 미만 : 요금은 2500원
		// 20세 이상 : 요금은 3000원
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//
//		if (age < 8) {
//			System.out.println("요금은 1000원");
//		} else if (age < 14) {
//			System.out.println("요금은 2000원");
//		} else if (age < 20) {
//			System.out.println("요금은 2500원");
//		} else
//			System.out.println("요금은 3000원");
//
//		sc.close();

	}
}
