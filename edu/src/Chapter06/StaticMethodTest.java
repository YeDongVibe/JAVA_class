package Chapter06;

public class StaticMethodTest {
	public static void main(String[] args) {
		StaticMethodTest.print1();
	}

	public static void print1() { //객체가 안만들어져도 사용가능
		System.out.println("hello");
	}

	public void print2() { // 객체가 만들어져야 사용가능.
		System.out.println("java");
	}
}