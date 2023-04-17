package Chapter07;

public class Student extends Person {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public String toString() {
		return "Student [name =" + getName() +", age = " + getAge() + ", major = " + getMajor() + "]";
	}
}