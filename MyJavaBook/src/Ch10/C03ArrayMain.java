package Ch10;

public class C03ArrayMain {

	public static void main(String[] args) {

		int arr[][] = {
				{ 10, 20, 30 },
				{ 40, 50, 60, 70, 80 },
				{ 90, 100, 110, 120, 130, 140 },
				{ 150, 160, 170, 180, 190, 200, 210 },
		};

		System.out.println("행의 길이 : " + arr.length);
		System.out.println("행의 길이 : " + arr[0].length);
		System.out.println("행의 길이 : " + arr[1].length);
		System.out.println("행의 길이 : " + arr[2].length);
		System.out.println("행의 길이 : " + arr[3].length);

	}

}
