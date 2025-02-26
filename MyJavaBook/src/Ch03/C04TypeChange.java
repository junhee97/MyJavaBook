package Ch03;

public class C04TypeChange {

	public static void main(String[] args) {

		// 정수 연산식(int 보다 작은 변수자료형(short, char, byte))
		// int 로 자동 형변환
		byte x = 10;
		byte y = 20;
		byte result1 = (byte) (x + y); // 연산식을 수행하면 int 형으로 자동 형변환

		int result2 = x + y;
		System.out.println(result1);
		System.out.println(result2);

		// 정수 연산식(int 보다 큰 변수자료형(long))
		// 큰 타입으로 자동 형변환
		byte var1 = 10;
		int var2 = 100;
		long var3 = 1000L;
		int result3 = (int) (var1 + var2 + var3); // 연산식을 수행하면 long 형으로 자동 형변환

		long result4 = var1 + var2 + var3;
		System.out.println(result3);
		System.out.println(result4);

		// 실수 연산식
		// 큰 타입으로 자동 형변환
		int intvar = 10;
		float flvar = 3.3F;
		double dbvar = 5.5;
		int result5 = (int) (intvar + flvar + dbvar); // 연산식을 수행하면 double 형으로 자동 형변환
														// result 가 int 형이기 때문에 int 로 강제 형변환 하면 데이터 손실 발생
		double result6 = intvar + flvar + dbvar;

		System.out.println(result5);
		System.out.println(result6);

	}

}
