package Study7_8jang3;

import java.util.ArrayList;

public class TestMain3 {

	public static void main(String[] args) {
		InterArcher a = new InterArcher();
		InterWarrier w = new InterWarrier();
		InterMagician m = new InterMagician();
		
		String s = a.toString();
		System.out.println("toString을 직접 명시 : " + s);
		System.out.println("toString을 직접 명시 다른 방법 : " + a.toString());
		
		//Interfaceunit2의 유닛을 받아 배열 생성.
		ArrayList<Interfaceunit2> unitArray = new ArrayList<Interfaceunit2>();

		unitArray.add(a);
		unitArray.add(w);
		unitArray.add(m);

		for (int i = 0; i < 3; i++) {
			unitArray.get(i).run();
			unitArray.get(i).walk();
			unitArray.get(i).attack();
			
			//객체를 String타입으로만 받은 형태. 출력을 위해서는 sysout해야함.
			//unitArray.get(i).toString();
			
			//object에 toString이 default되어있기에 출력이 되긴함.
			System.out.println("toString : " + unitArray.get(i).toString());
			//Archer가 Interfaceunit2를 상속받았지만 그 위에 Object를 상속 받음.

		}

	}

}