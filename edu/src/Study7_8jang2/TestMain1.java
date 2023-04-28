package Study7_8jang2;


public class TestMain1 {

	public static void main(String[] args) {

		Archer1 a = new Archer1();
		Warrior1 w = new Warrior1();
		Magician1 m = new Magician1();
		
		//run,walk 함수를 따로 생성하지 않아도 부모 클래스인 unit 클래스에서 상속받아서 함수를 이용할 수 있다.
		
		a.run();
		a.walk();
		a.arrow();

		w.run();
		w.walk();
		w.sword();

		m.run();
		m.walk();
		m.meteo();
	}

}
