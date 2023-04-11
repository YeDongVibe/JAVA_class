package Chapter7;

public class Person {
		private String name;
		private int age;
		
		public Person() {
			System.out.println("Person 생성자가 호출됨");
			
		}
		
//		public static void main(String[] args) {
//			Person p = new Person();
//			p.setName("길동이의 나이는");
//			p.setAge(20);
//			
//			System.out.println(p);
//		}
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String toString() {
			return name + ":" + age; //이름과 나이 출력
		}
	}