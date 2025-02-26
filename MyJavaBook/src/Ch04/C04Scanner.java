package Ch04;

import java.util.Scanner;

public class C04Scanner {

	public static void main(String[] args) {

		// 이름을 입력하세요? 홍길동
		// 홍길동 님의 나이를 입력하세요? 35
		// 홍길동 님의 주소를 입력하세요? 대구광역시 달서구 000
		// 홍길동 님의 나이는 35세 주소는 대구광역시 ~~ 입니다

		Scanner sc = new Scanner(System.in);

		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();

		System.out.printf("%s 님의 나이를 입력하세요 : ", name);
		int age = sc.nextInt();

		sc.nextLine();

		System.out.printf("%s 님의 주소를 입력하세요 : ", name);
		String addr = sc.nextLine();

		System.out.printf("%s 님의 나이는 %d세 주소는 %s 입니다", name, age, addr);
//		
//		
//		System.out.print("첫번째 수 : ");
//		int n1 = sc.nextInt();
//		
//		System.out.print("두번째 수 : ");
//		int n2 = sc.nextInt();
//		
//		int result = n1 + n2;
//		
//		System.out.printf("덧셈 결과 : %d", result);
//		
//		
//		System.out.println("[필수 정보 입력]");
//		
//		System.out.print("1. 이름 : ");
//		String name = sc.nextLine();
//		
//		System.out.print("2. 주민등록번호 앞자리 : ");
//		String id = sc.nextLine();
//		
//		System.out.print("3. 전화번호 : ");
//		String tel = sc.nextLine();
//		
//		System.out.println();
//		
//		System.out.println("[입력한 내용]");
//		System.out.println("이름 : " + name);
//		System.out.println("주민등록번호 앞자리 : " + id);
//		System.out.println("전화번호 : " + tel);
		
		sc.close();

	}

}
