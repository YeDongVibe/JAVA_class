package Chapter07.abstraction;

abstract class Employee { 
	String name;
	int salary;

	public abstract void calcSalary(); //부모매서드 /*abstract를 붙이면 추상 : 메소드의 바디를 못가짐 ({~~})*/ //메소드의 바디가 없는 경우

	public abstract void calcBonus();
}

class Salesman extends Employee {
	public void calcSalary() { //부모매서드를 그대로 상속받아 작성.
		System.out.println("Salesman 급여 = 기본급 + 판매 수당");
	}

	public void calcBonus() {
		System.out.println("Salesman 보너스 = 기본급 * 12 * 4");
	}
}

class Consultant extends Employee {
	public void calcSalary() {
		System.out.println("Consultant 급여 = 기본급 + 컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println("Consultant 보너스 = 기본급 * 12 * 2");
	}
}

abstract class Manager extends Employee { //Employee로부터 상속받음.
	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

}

class Director extends Manager { //매니저로부터(부모클래스) 상속받아서 calcSalary를 굳이 구현하지 않아도 자동적으로 구현이 된다. 그래서 일반클래스가 되고 밑에서 new~라고 선언이 가능함.
	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest {
	public static void main(String[] args) {//추상클래스가 아니라 일반클래스라 인스턴스 선언 가능.
		Salesman s = new Salesman();
		Consultant c = new Consultant();
		Director d = new Director();
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
	}
}
