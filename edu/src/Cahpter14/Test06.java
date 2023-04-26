package Cahpter14;

interface StringFunc {
	String modify(String s);
}

interface MyFunc<T> {
	T modify(T t);
}

public class Test06 {

	public static void main(String[] args) {

		MyFunc<String> mf1 = (str) -> str.toUpperCase() + ":" + str.length(); //toupperCase는 String, length는 정수 // String + 정수 = 스트링
		System.out.println("String : " + mf1.modify("java"));
		System.out.println("String : " + mf1.modify("java programming"));

		MyFunc<Integer> mf2 = (n) -> n * 2;
		System.out.println("Integer : " + mf2.modify(23));
		System.out.println("Integer : " + mf2.modify(42));
	}
}