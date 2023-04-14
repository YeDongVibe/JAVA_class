package Chapter8;

enum Status {
	READY, SEND, COMPLETE, CLOSE
}
//아래의 중복 코딩을 열거하여 클래스 선언
//	class Status {	
//		public static final int READY = 1;
//		public static final int SEND = 2;
//		public static final int COMPLETE = 3;
//		public static final int CLOSE = 4;
//	}

public class Hong06_NonEnumTest01 {
	public static void main(String[] args) {
		Status work = Status.COMPLETE;
		System.out.println(work.name());
		System.out.println(work.ordinal());
		int n = 2;

		switch (n) {
		case 1:
			work = Status.READY;
			break;
		case 2:
			work = Status.SEND;
			break;
		case 3:
			work = Status.COMPLETE;
			break;
		case 4:
			work = Status.CLOSE;
			break;
		}
		System.out.println("현재 작업 상태 : " + work);
		work.toString();
		String name = "hello";
		String sname = "good";
//		if (name > sname) {} //값이 아닌 문자열 비교라서 이렇게 쓰면 안된다.타입이 다르기에
		if (name.compareTo(sname) > 0) {}
	}
}