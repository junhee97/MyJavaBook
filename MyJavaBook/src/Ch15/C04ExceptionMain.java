package Ch15;

public class C04ExceptionMain {

	public static void main(String[] args) {

		String str = null;
		try {
			str.toString(); // NULL Exception

			int arr[] = { 10, 20, 30, };
			arr[5] = 100;

			Integer.parseInt("a1234"); // Parse Exception

			Animal animal = new Dog();
			Cat yummi = (Cat) animal; // Cast Exception
//		} catch (NullPointerException e) {
//			System.out.println("예외 발생 : " + e.getMessage());
//		} catch (ArrayIndexOutOfBoundsException e2) {
//			System.out.println("예외 발생 : " + e2.getMessage());
//		} catch (NumberFormatException e3) {
//			System.out.println("예외 발생 : " + e3.getMessage());
//		} catch (ClassCastException e4) {
//			System.out.println("예외 발생 : " + e4.getMessage());
//		}
		} catch (Exception e) {
			System.out.println("예외 발생 : " + e.getMessage());
		}
		
		finally { // 예외 발생 여부와 상관없이 무조건 실행
			// 자원정리 작업
			System.out.println("Finally TEST..");
		}

		System.out.println("HELLO WORLD");

	}

}
