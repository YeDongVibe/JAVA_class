package Chapter06;

public class Member {
	private String name;
	private int age;

	public Member() {
		this("guest");
		//this.name = "guest";
		//this.age = 0;
	}

	public Member(String name) {
		this(name, 0);
		//this.name = name; //생성된 객체를 호출.
		//this.age = 0;

	}
	public Member(String name, int age) {
		this.name = name; //this.name <heap영역의 객체를 수신받음>= name<로컬변수>
		this.age = age;

	}
	
	public String toString () {
		return name + ":" + age;
	}

//	public void setName(String name) {
//	}
//	
//	public void show() { ///객체가 있어야 실행가능.//
//		System.out.println("name = " + name + "age : " + age);
//	}

	public static void main(String[] args) {
//		System.out.println("main() 메서드 실행");
		Member m1 = new Member(); //생성자
		Member m2 = new Member("Amy");
		Member m3 = new Member("Amy", 23);
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
//		m1.show(); //m : 수신객체(receive object)//
//		m2.show();
//		m3.show();
		
	
	}
}