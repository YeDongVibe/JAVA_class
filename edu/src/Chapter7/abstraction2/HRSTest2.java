package Chapter7.abstraction2;

abstract class Employee { 
	String name;
	int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public abstract void calcSalary(); //부모매서드 /*abstract를 붙이면 추상 : 메소드의 바디를 못가짐 ({~~})*/ //메소드의 바디가 없는 경우

	public abstract void calcBonus();
}

class Salesman extends Employee {
	int sale;
	
	public Salesman(String name, int salary, int sale) {
		super(name, salary);
		this.sale = sale;	
	}
	
	public void calcSalary () { //부모매서드를 그대로 상속받아 작성.
		System.out.println(name + "급여 = " + salary + sale );
	}

	public void calcBonus() {
		System.out.println(name + " 보너스 = " + (salary * 12 * 4));
	}
}

class Consultant extends Employee {
	public Consultant(String name, int salary, int sale) {
		super(name, salary);
	}

	public void calcSalary() {
		System.out.println(name + "급여 = " + salary + "컨설팅 특별 수당");
	}

	public void calcBonus() {
		System.out.println(name + " 보너스 = " + (salary * 12 * 2));
	}
}

abstract class Manager extends Employee { //Employee로부터 상속받음.
	public Manager(String name, int salary, int sale) {
		super(name, salary);
	}

	public void calcSalary() {
		System.out.println("Manager 급여 = 기본급 + 팀 성과 수당");
	}

}

class Director extends Manager { //매니저로부터(부모클래스) 상속받아서 calcSalary를 굳이 구현하지 않아도 자동적으로 구현이 된다. 그래서 일반클래스가 되고 밑에서 new~라고 선언이 가능함.
	public Director(String name, int salary, int sale) {
		super(name, salary, sale);
		// TODO Auto-generated constructor stub
	}

	public void calcBonus() {
		System.out.println("Director 보너스 = 기본급 * 12 * 6");
	}
}

public class HRSTest2 {
	public static void main(String[] args) {//추상클래스가 아니라 일반클래스라 인스턴스 선언 가능.
		Salesman s = new Salesman("Slaesman", 100 , 0);
		Consultant c = new Consultant("Consultant", 0, 0);
		Director d = new Director("Director", 0, 0);
		
		s.calcSalary();
		c.calcSalary();
		d.calcSalary();
		
	}
	
}
