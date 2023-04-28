package Study7_8jang2;

public class Archer1 extends unit {

	public void arrow() {
		System.out.println("궁수가 활을 쏘고 있습니다.");

	}

	// 유닛을 전사로 바꾸기 위해 상속받은클래스를 override 함.
	@Override
	public void run() {
		System.out.println("override : 궁수가 달리고 있습니다.");

	}
	
	@Override
	public void walk() {
		System.out.println("override : 궁수가 걷고 있습니다.");

	}
	
}
