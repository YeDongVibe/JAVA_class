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
	public int hashCode() {
		return Integer.parseInt(ssn);
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		User u = (User) obj;
		if (this.ssn.equals(u.ssn))
			result = true;
		return result;
	}
}

public class Test11 {

	public static void main(String[] args) {
		User u1 = new User("123", "김푸름");
		User u2 = new User("123", "김푸름");

		HashSet<User> users = new HashSet<User>();

		users.add(u1);
		users.add(u2);

		Iterator<User> iter = users.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());
	}
}