package Chapter7;

public class Student extends Person {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return "Employee [name =" + getName() +", age = " + getAge() + ", major = " + getMajor() + "]";
	}
}