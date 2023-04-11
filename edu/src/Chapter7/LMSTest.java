package Chapter7;

public class LMSTest{
	public static void main(String[] args) {
		
		Employee e = new Employee(); //개체 선언 및 정의
		System.out.println(e);
		
		Employee e1 = new Employee("길동이", 20, "입학처");
		System.out.println(e1);
		
		//Professor p = new Professor();
		//Student s = new Student();

		//e.setName("오정임");
		//e.setAge(47);
		//e.setDept("입학처");

		//p.setName("김푸름");
		//p.setAge(52);
		//p.setSubject("빅데이터");

		//s.setName("김유빈");
		//s.setAge(20);
		//s.setMajor("컴퓨터과학");

		//System.out.println(e.toString()); //person이라는 부모클래스에서 이름과 나이만 출력하게 만들어서 이름과 나이만 출력함.
		//System.out.println(p.toString());
		//System.out.println(s.toString());
	}
}