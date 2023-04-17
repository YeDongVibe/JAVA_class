package Chapter9;

public class Test02 {

	public static void main(String[] args) {

		String s1 = new String("java");
		String s2 = "java";

		String s3 = new String("java");
		String s4 = "java";

		if (s1 == s3) {
			System.out.println("s1과 s3는 동일 객체이다.");
		} else {
			System.out.println("s1과 s3는 다른 객체이다.");
		}
		if (s2 == s4) {
			System.out.println("s2과 s4는 동일 객체이다.");
		} else {
			System.out.println("s2과 s4는 다른 객체이다.");
		}
		if (s1.equals(s3)) {
			System.out.println("s1과 s3는 동일 문자열을 가집니다.");
		} else {
			System.out.println("s1과 s3는 다른 문자열을 가집니다.");
		}
		if (s2.equals(s4)) {
			System.out.println("s2과 s4는 동일 문자열을 가집니다.");
		} else {
			System.out.println("s2과 s4는 다른 문자열을 가집니다.");
		}
		String s5 = "JAVA";
		System.out.println("s1 : " + s1.hashCode() + ", s3 : " + s2.hashCode()); //new String 자바를 통해 문자열을 생성하는데, 코드최적화로 인해 서로 공유함.
		//코드 최적화 : 객체가 같은때 새로 만들지 않고 이전에 존재하는 것을 가져다 사용해서 hashcode가 같게 나옴
		System.out.println("s1 : " + s1.hashCode() + ", s3 : " + s3.hashCode());
		System.out.println("s1 : " + s1.hashCode() + ", s3 : " + s4.hashCode());
		System.out.println("s1 : " + s2.hashCode() + ", s3 : " + s3.hashCode());
		System.out.println("s1 : " + s2.hashCode() + ", s3 : " + s4.hashCode());
		System.out.println("s1 : " + s3.hashCode() + ", s3 : " + s4.hashCode());
		
		System.out.println("s1 식별코드 : "+ System.identityHashCode(s1));
		System.out.println("s2 식별코드 : "+ System.identityHashCode(s2));
		System.out.println("s3 식별코드 : "+ System.identityHashCode(s3));
		System.out.println("s4 식별코드 : "+ System.identityHashCode(s4));
		
		if (s1.equals(s5)) {
			System.out.println("s1과 s5는 동일 문자열을 가집니다.");
		} else {
			System.out.println("s1과 s5는 다른 문자열을 가집니다.");
		}

		if (s1.equalsIgnoreCase(s5)) {
			System.out.println("s1과 s5는 동일 문자열을 가집니다.");
		} else {
			System.out.println("s1과 s5는 다른 문자열을 가집니다.");
		}
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}