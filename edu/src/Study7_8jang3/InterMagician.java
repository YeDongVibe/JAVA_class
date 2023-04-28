package Study7_8jang3;

public class InterMagician implements Interfaceunit2 {

	// interfaceunit2를 상속받기 위해 부모클래스의 매서드를 반드시 명시해줘야함.
	@Override
	public void run() {
		System.out.println("interfaceunit2 override : 마법사가 달리고 있습니다.");
	}

	@Override
	public void walk() {
		System.out.println("interfaceunit2 override : 마법사가 걷고 있습니다.");
	}

	@Override
	public void attack() {
		System.out.println("interfaceunit2 override : 마법사가 (attack)활을 쏘고 있습니다.");

	}
	@Override
	public String toString () {

		return "toString override : 마법사입니다";
		
	}
}
