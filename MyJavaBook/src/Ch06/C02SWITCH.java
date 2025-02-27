package Ch06;

import java.util.Scanner;

public class C02SWITCH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ranking = sc.nextInt();
		char medalColor;
		switch (ranking) { // if > switch
		case 1: // case 에는 상수만 입력 가능
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break; // break 를 사용하지 않으면 아래 case 까지 모두 실행
		case 2:
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:
			medalColor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.println(ranking + " 등 메달의 색은 " + medalColor + "입니다.");

		sc.close();
	}

}
