package Chapter10;

import java.util.ArrayList;
import java.util.Iterator;

public class Test02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //중간에 삭제 혹은 끼워넣기 가능.
		list.add("서울");
		list.add("북경");
		list.add("상해");
		list.add("서울");
		list.add("도쿄");
		list.add("뉴욕");

		for (int i = 0; i < list.size(); i++) {
			System.out.println("arrlist : " + list.get(i));
		}

		System.out.println("=".repeat(70));
		
		String [] sl = new String[10]; //중간에 삭제 혹은 끼워넣기 귀찮음.
		sl [0] = "서울";
		sl [1] = "부산";
		sl [2] = "대구";
		//sl [2] = sl [1]; 이런식으로 하나하나 이동 후 끼워넣기 해야함.
		for (String sx : sl) {
			System.out.println("sl : " + sx);
		}
		
		System.out.println("=".repeat(70));
		
		Iterator<String> iter = list.iterator(); //저장된 모든 데이터를 순차적으로 접근해 사용.
	  //인터페이스          변수  = 내가 만든 arr리스트의 매소드.
		while (iter.hasNext()) {
			System.out.println("iterator : "+ iter.next());
		}
	}

}
