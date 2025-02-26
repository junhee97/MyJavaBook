package Ch03;

public class C05TypeChange {

	public static void main(String[] args) {

		int num1 = 10, num2 = 4;
		double dnum1 = (double) (num1) / num2; // int 를 double 로 형변환
		double dnum2 = (num1 * 1.0) / num2; // int 형에 실수를 곱셈
		double dnum3 = num1 / num2;
		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);

	}

}
