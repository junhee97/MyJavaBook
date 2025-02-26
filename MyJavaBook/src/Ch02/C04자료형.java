package Ch02;

public class C04자료형 {

	public static void main(String[] args) {

		// 정수 int - 4byte 정수 부호 o
//		int n1 = 0b10101101;	// 2진수 값
//		int n2 = 173;			// 10진 정수 값
//		int n3 = 0255;			// 8진수
//		int n4 = 0xad;			// 16진수
//		System.out.printf("%d %d %d %d\n", n1,n2,n3,n4);

		// 정수 byte - 1byte 정수 부호 o
//		byte n5 = (byte)-129;				// (byte) -강제 형변환(데이터 손실/변형 발생) - byte 값 범위를 벗어나서 (-128 ~ 127)
//		byte n6 = -30;
//		byte n7 = 30;
//		byte n8 = 127;
//		byte n9 = 129;						// 왜? 컴파일에러? - byte 값 범위를 벗어나서 (-128 ~ 127)
//		System.out.printf("%d", n9);		// 왜?
//		System.out.println(0b10101101);		// 왜? 음수 x? 기본 int형(4byte)이라서 양수
//		System.out.println(Integer.toBinaryString(-129));

		// 정수 short - 2byte 정수 부호 o | char - 2byte 정수 부호 x (양수만)
//		char n1 = 65535;		// (0~2^16-1)	(0~65535)
//		short n2 = 32767;		// (-2^15 ~ +2^15-1)	(-32768 ~ +32767)
//		
//		char n3 = 60000;
//		short n4 = n3;			// 문제발생... 왜? - short 값 범위를 벗어나서 / char , short 둘다 2byte이지만 short 형은 음수 값이 있어서
//		
//		System.out.printf("%d\n", n4);

		// 정수 long - 8byte 정수 부호 o
//		long n1 = 10000000000L;
//		long n2 = 20;				// L, l (리터럴 접미사) : long 자료형 사용하여 값 저장
//		
//		long n3 = 10000000000;		// 문제발생... 왜? - int형 의 최대값(약 +-21억) 보다 높은 값을 입력할때는 접미사를 붙여야 한다
//		long n4 = 10000000000L;

		// 실수 - 유리수와 무리수의 통칭
		// 소숫점 이하 값을 가지는 수 123.456
		// float : 4byte 실수(6-9자리)
		// double : 8byte 실수(15-18자리)

		// 정밀도 확인
//		float n1 = 0.123456789123456789F; // f,F : float 형 접미사
//		double n2 = 0.123456789123456789;
//
//		System.out.println(n1);
//		System.out.println(n2);
//
//		// 오차 확인
//		float num = 0.1F;
//		for (int i = 0; i <= 1E5; i++) {
//			num = num + 0.1F;
//			System.out.println(i);
//		}
//		System.out.println("num : " + num);

		// 단일문자 char 2byte 정수
		char ch1 = 'a';
		System.out.println(ch1);
		System.out.println((int) ch1); // 01100001

		char ch2 = 98;
		System.out.println(ch2);
		System.out.println((int) ch2); // 01100010

		char ch3 = 'b' + 1;
		System.out.println(ch3);
		System.out.println((int) ch3); // 01100011

		char ch4 = 'c' + 2;
		System.out.println(ch4);
		System.out.println((int) ch4); // 01100101

		char ch5 = 0xac00;
		char ch6 = 44032;

		System.out.println(ch5);
		System.out.println(ch6);
		System.out.println((char) (0b1010110000000000 + 1));

		char ch7 = 0xac00 + 1;
		System.out.printf("%c %c\n", ch5, ch6);

		// \\u : 유니코드 값 이스케이프 문자
		System.out.printf("%c\n", '\uACa1');

		System.out.printf("TEST : %c\n", '\uabcd');

		char n = 10;
		System.out.printf("HELLO %c WORLD\n", n);

		// 문자열 : String (클래스 자료형)
		// 클래스 자료형으로 만든 변수는 '참조변수'라고 하고
		// 참조변수는 데이터가 저장된 위치정보(메모리 주소값)가 저장된다.
		int n1 = 10;
		byte n2 = 20;
		char n3 = 40;

		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);

		// boolean : 논리형(true/false 저장)
		boolean flag = (10 > 11); // 참(긍정)
		if (flag) {
			System.out.println("참인경우 실행");
		} else {
			System.out.println("거짓인경우 실행");
		}

	}

}
