package Chapter7;

public class Professor extends Person {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String toString() {
		return "Employee [name =" + getName() +", age = " + getAge() + ", subject = " + getSubject() + "]";
	}	

}
