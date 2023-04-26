package Cahpter14;

@FunctionalInterface // Annotation : 인터페이스에서는 함수가 하나여야함.


interface Multiply { //람다식 사용시 함수가 무조건 하나여야함. 아니면 오류생김.
	double getValue();
}

interface Verify { //매개변수 한개
	boolean check(int n);
}

interface Verify2 { //매개변수 여러개
	boolean check(int n, int d); 
}

public class Test02 {

	public static void main(String[] args) { //람다식 사용시 함수가 무조건 하나여야함. 아니면 오류생김.
		Multiply m;
		m = () -> 3.14 * 2;
		System.out.println("Multiply : m(3.14*2) = " + m.getValue());

		m = () -> 10 * 3;
		System.out.println("Multiply : m(10*3) = " + m.getValue());
		
		System.out.println("-".repeat(50));
		
		Verify isEven = (n) -> (n % 2) == 0;
		System.out.println("Verify : v = " + isEven.check(10));
		
		Verify isPositive = (n) -> n >= 0;
		System.out.println("Verify : v = " + isPositive.check(-5));

		System.out.println("-".repeat(50));
		
		Verify2 vf = (n, d) -> (n % d) ==0;
		System.out.println("Verify2 : vf = " + vf.check(24, 3));
	}

}
