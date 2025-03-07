package Ch13;

interface Remocon {
	int MAX_VOL = 100; // public static final
	int MIN_VOL = 0; // public static final

	void setVolumn(int vol);

	void powerOn(); // abstract function

	void powerOff(); // abstract function
}

interface Browser {
	void SearchURL(String url);
}

class Tv implements Remocon {

	private int vol;

	@Override
	public void powerOn() {
		System.out.println("Tv 를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("Tv 를 끕니다.");
	}

	@Override
	public void setVolumn(int vol) {
		if (vol > MAX_VOL) {
			vol = MAX_VOL;
			System.out.println("최대볼륨으로 설정합니다.");
		} else if (vol < MIN_VOL) {
			vol = MIN_VOL;
			System.out.println("최소볼륨으로 설정합니다.");
		} else {
			this.vol = vol;
			System.out.println("현재 볼륨 : " + this.vol);
		}
	}
}

class SmartTv extends Tv implements Browser {

	@Override
	public void SearchURL(String url) {
		System.out.println(url + " 로 이동합니다.");
	}

}

class Radio implements Remocon {

	private int vol;

	@Override
	public void powerOn() {
		System.out.println("Radio 를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("Radio 를 끕니다.");
	}

	@Override
	public void setVolumn(int vol) {
		if (vol > MAX_VOL) {
			vol = MAX_VOL;
			System.out.println("최대볼륨으로 설정합니다.");
		} else if (vol < MIN_VOL) {
			vol = MIN_VOL;
			System.out.println("최소볼륨으로 설정합니다.");
		} else {
			this.vol = vol;
			System.out.println("현재 볼륨 : " + this.vol);
		}
	}
}

public class C03InterfaceMain {

	public static void TurnOn(Remocon controller) {
		controller.powerOn();
	}

	public static void TurnOff(Remocon controller) {
		controller.powerOff();
	}

	public static void ChangeVolumn(Remocon controller, int vol) {
		controller.setVolumn(vol);
	}

	public static void Internet(Browser browser, String url) {
		browser.SearchURL(url);
	}

	public static void main(String[] args) {

		Tv tv = new Tv();
		SmartTv smarttv = new SmartTv();
		Radio radio = new Radio();

		TurnOn(tv);
		TurnOn(smarttv);
		TurnOn(radio);

		TurnOff(tv);
		TurnOff(radio);

		ChangeVolumn(tv, 90);
		ChangeVolumn(radio, 101);

		Internet(smarttv, "www.google.com");

	}

}
