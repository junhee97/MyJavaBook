package Ch16;

class Animal {
	String name;
}

class Panda extends Animal {
	// 생성자
	public Panda(String name) {
		this.name = name;
	}

	// toString
	@Override
	public String toString() {
		return "Panda [name=" + name + "]";
	}
}

class Tiger extends Animal {
	// 생성자
	public Tiger(String name) {
		this.name = name;
	}

	// toString
	@Override
	public String toString() {
		return "Tiger [name=" + name + "]";
	}
}

public class C04GenericMain {

	// GENERIC
	public static <T extends Animal> void PrintByGeneric(T[] arr) {
		for (T el : arr)
			System.out.println(el);
	}

	// OBJECT
	public static void PrintByObject(Object[] animal) {
		for(Object el : animal)
			System.out.println(el);

	}

	public static void main(String[] args) {

		Tiger arr1[] = { new Tiger("시베리아"), new Tiger("벵갈") };
		PrintByGeneric(arr1);

		Panda arr2[] = { new Panda("래서판다"), new Panda("푸바오") };
		PrintByGeneric(arr2);

		Object arr3[] = { new Tiger("벵갈"), new Panda("래서판다") };
		PrintByObject(arr3);

	}

}
