package Chapter7;


public class LMSTest2{
	public static void main(String[] args) {
		
		Employee e = new Employee("정임이", 47, "입학처"); // 생성자를 받기위해 Employee class에 가서 생성자 선언해야함.
		Professor p = new Professor("푸름이", 52, "빅데이터");
		Student s = new Student("유빈이", 20, "컴퓨터 과학");
		
		
		
		System.out.println(e.toString());
		System.out.println(p.toString());
		System.out.println(s.toString()); //System.out.println(s);라고 써도 출력가능. 왜냐하면 sysout에서 toString을 자동적으로 받아서 출력하기에(버전마다 다름)
		// 만약 출력이 안된다면 toString을 overridng을 했는지 확인하거나, 클래스의 상단에 있는 object를 확인하기.
	}
}