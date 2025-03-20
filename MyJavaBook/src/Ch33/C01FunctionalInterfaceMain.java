package Ch33;

@FunctionalInterface // 함수형 인터페이스 선언 (Compiler 에게 전달) - 추상메소드가 하나만 존재
interface Func1 {
	void say(String message); // 추상메소드
}

public class C01FunctionalInterfaceMain {

	public static void main(String[] args) {

		// 01
		Func1 func1 = (message) -> {System.out.println(message + "~!");};
		func1.say("Hi");
		
		Func1 func1_1 = System.out::println;
		func1_1.say("Hi");

	}

}
