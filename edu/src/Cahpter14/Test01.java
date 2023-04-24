package Cahpter14;

interface MyInterface {
	public void print();
}

class MyClass1 implements MyInterface {//클래스 선언시 'implements 인터페이스명'을 선언 후 인터페이스에 선언된 추상 메서드(?)를 오버라이딩.

	@Override
	public void print() {
		System.out.println("MyCalss1");
	}

}

class MyClass2 implements MyInterface {

	@Override
	public void print() {
		System.out.println("MyCalss2");

	}

}

public class Test01 {
	public static void test(MyInterface mi) {//test(MyInterface mi) 메서드는 MyInterface타입으로 매개변수가 선언.
		mi.print();
	}

	public static MyInterface test2() {
		MyInterface mi = new MyInterface() {

			@Override
			public void print() {
				System.out.println("return타입 : Test2()메서드에서 반환된 MYInterface.");

			}
		};
		return mi;
	}

	public static void main(String[] args) {
		MyClass1 mc1 = new MyClass1();//익명 클래스로 MyInterface 인터페이스를 구현.
		MyClass2 mc2 = new MyClass2();
		mc1.print(); //MyClass1
		mc2.print(); //MyClass2

		MyInterface mi = new MyInterface() { 

			@Override
			public void print() {
				System.out.println("매게변수 : 익명클래스로 구현.");

			}
		};

		test(mc1); //MyClass1
		test(mi); //익명클래스로 구현

		mi.print(); //호출 : 익명 클래스로 구현//mi의 객체//MyInterface를 구현한 익명 클래스가 생성되고 mi 변수가 참조.
		(new MyInterface() {

			@Override
			public void print() {
				System.out.println("선언, 생성, 호출을 한번에 처리.");

			}
		}).print(); //선언, 생성, 호출을 한번에 처리

		MyInterface mi2 = test2();
		mi2.print(); //test2() 메서드에서 반환된 MyInterface
		MyInterface m = () -> System.out.println("람다식 구현 : hello");
		//() -> sysout(); : 람다식
		m.print();

	}
}
