package Chapter8.polymorphism;

abstract class Employee {
	private String name;
	private int salary;

	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public abstract void calcSalary();

	public abstract void calcBonus();
}

class Salesman extends Employee {
	int sale;
	public Salesman(String name, int salary, int sale) {
		super(name, salary);
		this.sale = sale;
	}

	public void calcSalary() {
		System.out.println("Salesman" + getName() + ": 급여 =" + (getSalary() + sale));
	}

	public void calcBonus() {
		System.out.println("Salesman " + getName() + ": 보너스 = "+ (getSalary() * 12 * 4));
	}
}

class Consultant extends Employee {
	int consult;
	
	public Consultant(String name, int salary, int consult) {
		super(name, salary);
		this.consult = consult;
	}
	public void calcSalary() {
		System.out.println("Consultant" + getName()+ ": 급여 = " +getSalary() + consult);
	}

	public void calcBonus() {
		System.out.println("Consultant" + getName()+ " : 보너스 = " + (getSalary() * 12 * 2));
	}
}
                                                                                             
class Manager extends Employee {
	int ps;
	
	public Manager(String name, int salary, int ps) {
		super(name, salary);
		this.ps = ps;
	}
	
	public void calcSalary() {
		System.out.println("Manager"+ getName() + ": 급여 = "+ (getSalary() + ps));
	}

	public void calcBonus() {
		System.out.println("Manager" + getName()+ ": 보너스 = " + (getSalary() * 12 * 2));
		// TODO Auto-generated method stub
		
	}

}


public class HRSTest {
	public static void calcTax(Employee e) {
		System.out.println("소득세를 계산합니다.");
	}
	public static void main(String[] args) {
		Salesman s1 = new Salesman("강두식", 300, 400);
		Employee s2 = new Salesman("강용식", 400, 500);
		Object s3 = new Salesman("이두팔",500, 600);

		Object m1 = new Manager("강두식", 300, 400);
		Employee m2 = new Manager("강용식", 400, 500);
		Manager m3 = new Manager("이두팔",500, 600); //manager가 부모 클래스라서 실행이 안된다.즉 왼쪽은 무조건 부모, 파라매터로 하고싶으면 받는쪽이 부모.
		
		Object arr[] = new Object[6];
		arr[0] = s1;
		arr[1] = s2;
		arr[2] = s3;
		arr[3] = m1;
		arr[4] = m2;
		arr[5] = m3;
		
		for(int i=0; i <arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
	}
}




//public class HRSTest {
//	public static void calcTax(Employee e) {
//		System.out.println("소득세를 계산합니다.");
//	}
//	public static void main(String[] args) {
//		Salesman s = new Salesman("강두식", 300, 400);
//		Consultant c = new Consultant("강용식", 400, 500);
//		Manager m = new Manager("이두팔",500, 600);
//		s.calcSalary();
//		s.calcBonus();
//		c.calcSalary();
//		c.calcBonus();
//		m.calcSalary();
//		m.calcBonus();
//		calcTax(s);
//		calcTax(c);
//		calcTax(m);
//		
//		Salesman s2 = s; //s와 s2는 메모리영역은 다름. 즉 스택의 다른 위치에 저장.
//		System.out.println(s2.toString());
//		
//		System.out.println(s.toString()); //부모클래스에 toString을 가지고있음(object에)
//		System.out.println(c.toString());
//		System.out.println(m.toString());
//		
//		if(s.equals(s2)) {//equals는 기본적으로 자기 해쉬코드를 비교한다.
//			System.out.println("동일한 객체입니다."); //똑같은 객체를 가리키는 참조변수. 즉 같은 객체
//		} else {
//			System.out.println("서로다른 객체입니다.");
//		}
//	}
//}