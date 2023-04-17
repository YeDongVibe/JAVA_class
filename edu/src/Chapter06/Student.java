package Chapter06;

public class Student { // class의 이름의 첫글자는 대문자, 함수는 소문자
	private int sid; // class내에서는 sid라는 것을 사용 가능 : private떄문
	private String name;
	private String dept;
	public Student() {} //default(자동생성하는 값) 생산자
	public Student(int sid, String name, String dept) { //생성자 오버로딩 : 생성자를 여러개 만드는것, 이렇게 하면 디폴트 생성자를 넣어주지않음. 만약 생성자를 넣어주고 싶으면 디폴트생성자를 만들어줘야함.
		this.sid = sid; //this = 키워드 : receiver object(수신 객체)
		this.name = name;
		this.dept = dept;
	}
	public static void main(String[] args) {
		System.out.println("6장 시작");
		int n = 10;
		Student s = null; //Student s : class + 참조변수(로컬변수)(객체를 가리키는 변수) //초기값 선언
//		s = new Student();
		s = new Student (2023, "홍길동", "컴퓨터"); // new Student (2023, "홍길동", "컴퓨터") = 객체를 생성한다는 키워드 + class
		s.sid = 99;
		System.out.println(s.sid);
		System.out.println("student 객체 = " + s);
	}

}

//위의 방식은 추천하지 않음. 왜?