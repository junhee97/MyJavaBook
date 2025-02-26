package Ch04;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 :");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);
		
		sc.nextLine(); // next() 와 nextLine() 을 같이 쓰려면 sc.nextLine(); 한번 더 사용
		
		System.out.print("문자열 입력(띄어쓰기 포함) : ");
		String str2 = sc.nextLine(); // 띄어쓰기도 문자로 인식
		System.out.println("문자열 : " + str2);
//
//		System.out.print("실수 입력 :");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : " + num2);
//
//		System.out.print("문자열 입력 :");
//		String str1 = sc.next(); // 문자열 입력받기 기능함수, 띄어쓰기 x
//		System.out.println("입력된 문자열 :" + str1);
		
		sc.close();

	}

}
