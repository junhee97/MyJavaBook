package Ch11;

class C02Simple {
	static int n1;
	int n2;

	void func1() {
		n1 = 100;
		n2 = 200;
	}

	static void func2() {
		n1 = 100;
		// n2 = 200; // static 함수에서 사용되는 변수 : static 변수 or 지역변수 선인 이후 사용가능
		// 일반 멤버 변수로의 접근 불가능
	}
}

public class C02StaticMain {

	public static void main(String[] args) {

	}

}
