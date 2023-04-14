package Chapter8;

interface Messenger {
	String getMessage();

	void setMessage(String msg);
}

//class GalaxyMessenger implements Messenger {
//	public String getMessage() {
//		return "galaxy";
//	}
//
//	public void setMessage(String msg) {
//		System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);
//
//	}
//
//	public void changeKeyboard() {
//		System.out.println("키보드아이콘 터치후 키보드를 변경합니다.");
//	}
//
//}

public class Hong05_AnonymousClass {

	public static void main(String[] args) {
		//GalaxyMessenger galaxy = new GalaxyMessenger();
		//좌항 : GalaxyMessenger galaxy에서 GalaxyMessenger는 인터페이스. galaxy는 변수.
		//우항 : new GalaxyMessenger에서 Galaxy~~는 클래스.(인터페이스). new는 객체생성자. 자바에서 그냥 GalaxyMessenger만쓰면 자동적으로 class를 생성한다. 이것을 익명 클래스라고 함.
		
		Messenger galaxy = new Messenger() { //생성자 Body를 아래의 코드로 지정함.
							//Messenger는 인터페이스.
			public String getMessage() {
			return "galaxy";
		}

		public void setMessage(String msg) {
			System.out.println("galaxy에서 메시지를 설정합니다 : " + msg);

		}

		public void changeKeyboard() {
			System.out.println("키보드아이콘 터치후 키보드를 변경합니다.");
		}
		}
		
		galaxy.getMessage();
		galaxy.setMessage("hi");
//		galaxy.changeKeyboard();

	}

}