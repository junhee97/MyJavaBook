package Ch12;

class Employee {
	public String name;
	private int age;
	private String addr;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddr() {
		return addr;
	}

	public Employee(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
}

class Parttimer extends Employee {
	private int hour_pay;

	public void setHourPay(int hour_pay) {
		this.hour_pay = hour_pay;
	}

	@Override
	public String toString() {
		return "Parttimer [hour_pay=" + hour_pay + ", name=" + name + "]";
	}

	Parttimer(String name, int age, String addr, int hour_pay) {
		super(name, age, addr);
		this.hour_pay = hour_pay;
	}
}

class Regular extends Employee {
	private int salary;

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Regular [salary=" + salary + ", name=" + name + "]";
	}

	Regular(String name, int age, String addr, int salary) {
		super(name, age, addr);
		this.salary = salary;
	}
}

public class C05Ex {

	public static void main(String[] args) {

		Parttimer emp1 = new Parttimer("홍길동", 25, "대구", 20000);
		Regular emp2 = new Regular("서길동", 45, "울산", 50000000);
		System.out.println(emp1);
		System.out.println(emp2);

	}

}
