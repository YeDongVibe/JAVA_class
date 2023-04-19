package Chapter10;

import java.util.HashSet;
import java.util.Iterator;

class User {
	String ssn; // 주민번호
	String name; // 이름

	User(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}

	@Override
	public String toString() {
		return ssn + ":" + name;
	}

	@Override
	public int hashCode() { //object의 hashcode를 오버라이딩함.
		return Integer.parseInt(ssn);// ssn값을 int값으로 반환하여 나타냄. 만약 hashcode의 값이 같으면 아래의 equal 메서드 실행.
	}

	@Override
	public boolean equals(Object obj) {//object의 equals 메서드 오버라이딩.
		boolean result = false; // 매서드에서 반환하는 값 저장하기 위해 result 변수 선언 후 false로 초기값 선언.
		User u = (User) obj; //object 타입의 변수는 사용전 원래타입으로 변경해야함. 그래서 user타입으로 변경.
		if (this.ssn.equals(u.ssn)) //ssn 변숫값과 매개변수로 전달받은 ssn의 변숫값이 같은지 비교.
			result = true;
		return result;
	}
}

public class Test11 {

	public static void main(String[] args) {
		User u1 = new User("123", "김푸름");
		User u2 = new User("123", "김어둠");

		HashSet<User> users = new HashSet<User>();
		if(u1.equals(u2)) {users.add(u2);}
		else {users.add(u1);}

		users.add(u1);
		users.add(u2);

		Iterator<User> iter = users.iterator();
		while (iter.hasNext())
			System.out.println("iterator : " + iter.next());
		//System.out.println("toString : " + iter.next().toString());
	}
}