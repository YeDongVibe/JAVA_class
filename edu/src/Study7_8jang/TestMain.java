package Study7_8jang;


public class TestMain {

	public static void main(String[] args) {
		
		Archer a = new Archer();
		Warrior w = new Warrior();
		Magician m = new Magician();
		
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
