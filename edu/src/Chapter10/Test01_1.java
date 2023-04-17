package Chapter10;

class Employee {
	String name;
	int age;
	int height;
	int weight;
	char bloodType;
	String email;

	public Employee (String name, int age, int height, int weight, char bloodType, String email) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.bloodType = bloodType;
		this.email = email;
	}
	public String toString() {
		return name + ", " + age + ", " + weight +", " + height + ", " + bloodType + ", " + email;
	}
}

	public class Test01_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int [10];
		Employee [] eset = new Employee[10];//배열생성
		
		eset[0] = new Employee("hong", 11, 130, 50, 'A', "bhhong@go.kr"); //객체 생성//0번째 arr에 저장.
		eset[1] = new Employee("kim", 11, 130, 50, 'A', "bhhong@go.kr");
		eset[2] = new Employee("lee",  11, 130, 50, 'A', "bhhong@go.kr");
		eset[3] = new Employee("park",  11, 130, 50, 'A', "bhhong@go.kr");
		eset[4] = eset[3];
		eset[3] = eset[2];
		eset[2] = new Employee("choi",  11, 130, 50, 'A', "bhhong@go.kr");
		
		for (int i = 0; i <5; i++) {
			//무조건 다 돌리는 방식.
//		for (Employee e : eset) {
			//무조건 다 돌리는 방식.
			System.out.println(eset[i].toString());
			
		}

	}

}
