package Ch00;

class Buyer {
	private int myMoney;
	private int appleCnt;

	// 모든 인자 생성자
	public Buyer(int myMoney, int appleCnt) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
	}

	public void payment(Seller seller, int money) { // 판매자에게 구매금액 전달 함수
		this.myMoney -= money; 						// 전달한 금액만큼 보유 금액에서 차감
		int applebuy = seller.receive(money); 		// 전달받은 사과개수
		this.appleCnt += applebuy; 					// 현재 보유사과개수에 전달받은 사과개수 누적
	}

	// toString
	@Override
	public String toString() {
		return "Buyer [money=" + myMoney + ", count=" + appleCnt + "]";
	}

}

class Seller {
	private int myMoney;
	private int appleCnt;
	private int price;

	// 모든 인자 생성자
	public Seller(int myMoney, int appleCnt, int price) {
		super();
		this.myMoney = myMoney;
		this.appleCnt = appleCnt;
		this.price = price;
	}

	public int receive(int money) {
		this.myMoney += money; 				// 전달받은 금액만큼 보유 금액에 누적
		int applesold = money / price; 		// 전달할 사과개수 계산
		this.appleCnt -= applesold; 		// 내 사과개수에서 전달할 사과개수 차감
		return applesold; 					// 전달할 사과개수 리턴
	}

	// toString
	@Override
	public String toString() {
		return "Seller [money=" + myMoney + ", count=" + appleCnt + ", price=" + price + "]";
	}
}

public class Main {

	public static void main(String[] args) {

		Buyer 홍길동 = new Buyer(10000, 0);
		Buyer 철수 = new Buyer(20000, 0);

		Seller 사과장수 = new Seller(100000, 100, 1000);

		홍길동.payment(사과장수, 5000);
		철수.payment(사과장수, 12000);

		System.out.println(홍길동);
		System.out.println(철수);
		System.out.println(사과장수);

	}

}
