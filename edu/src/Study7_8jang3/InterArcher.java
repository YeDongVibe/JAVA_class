package Study7_8jang3;

public class InterArcher implements Interfaceunit2 {

	//interfaceunit2를 상속받기 위해 부모클래스의 매서드를 반드시 명시해줘야함.
	@Override
	public void run() {
		System.out.println("interfaceunit2 override : 궁수가 달리고 있습니다.");
	}

	@Override
	public void walk() {
		System.out.println("interfaceunit2 override : 궁수가 걷고 있습니다.");
	}
	
	@Override
	public void attack() {
		System.out.println("interfaceunit2 override : 궁수가 (attack)활을 쏘고 있습니다.");

	}
	
	@Override
	public String toString () {

		return "toString override : 궁수입니다";
		
	}

}
