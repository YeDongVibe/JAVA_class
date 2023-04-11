package Chapter7;

public class Employee extends Person {
	private String dept;
	
	public Employee() {
		System.out.println("Employee 생성자가 호출됨");
		
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;//파라매터로(String dept) 넘어온 dept를 내 필드 내로 호출
	}
	
	public String toString() {
		return "Employee [name =" + getName() +", age = " + getAge() + ", dept=" + dept + "]";
	} //name과 age를 받을려면 부모 클래스인 person에서 변수를 public으로 선언하면 된다.
	 // 혹은 get, set으로 호출하여 받으면 된다.(private일때)
}
