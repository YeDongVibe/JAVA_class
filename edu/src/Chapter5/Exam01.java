package Chapter5;

public class Exam01 {
	private static int methodSum(int i, int j) {
		int sum = i + j;
		return sum;
	}
	
	public static void main(String[] args) {
		int sum = methodSum(10, 20);
		System.out.println(sum);

	}
}
//	public static void main(String[] args) {
//		
//		Armor armor = new Armor();
//		armor.setName();
//		
//		String name = armor.getName();
//		System.out.println("Name: " + name);
//	}
//
//}
