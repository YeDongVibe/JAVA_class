package Chapter7.abstraction;

public interface Messenger {

	public static final int MIN_SIZE = 1;
	public static final int MAX_SIZE = 104857600;

	public abstract String getMessage(); //abstract클래스에서는 글자가 빠지면 안되는데, 인터페이스에서는 글자가 없어도 자동으로 컴파일 하면 abstract를 넣어 동작함.

	public abstract void setMessage(String msg);

	public default void setLogin(boolean login) {
		log();
		if (login) {
			System.out.println("로그인 처리합니다.");
		} else {
			System.out.println("로그아웃 처리합니다");
		}
	}

	public static void getConnection() { //내부적으로 매서드 선언과 별개로 static은 바디까지 사용가능
		System.out.println("network에 연결합니다.");
	}

	private void log() { //해당 클래스에서 사용만 가능하기에 선언하여 바디까지 사용 가능
		System.out.println("start job!");
	}
}