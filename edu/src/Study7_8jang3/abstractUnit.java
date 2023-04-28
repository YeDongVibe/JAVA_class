package Study7_8jang3;

public abstract class abstractUnit{
	//abstract는 다중상속이 불가하다.
	//abstract를 상속받는 class는 반드시 상위클래스의 매서드를 구현해야함.
	abstract void run();

	abstract void walk();

	abstract void attack();
	
	//abstract를 상속받는 class에서는 다른 함수를 추가 할 수 있다.
	public void Drink () {
		System.out.println("abstract : 회복포션 먹어요~");
	}

}
