package Chapter10;

import java.util.HashMap;
import java.util.Iterator;

public class Test06 {

	public static void main(String[] args) {

		String word[] = { "BUMBLEBEE", "HEAVEN", "ALTHOUGH", "WONDER" };
		String meaning[] = { "꿀벌과에 속하는 호박벌", "천국", "그럼에도 불구하고", "호기심이 들다" };

		HashMap<String, String> dic = new HashMap<String, String>(); //String 타입의 키값과 String 타입의 값을 저장하는 HashMap 생성

		for (int i = 0; i < word.length; i++) {
			dic.put(word[i], meaning[i]); //key값
		}

		System.out.println(dic);
		System.out.println(dic.size()); // 4

		System.out.println("toString : " + dic.toString());
		System.out.println("KeySet : " + dic.keySet()); // [HEAVEN, BUMBLEBEE, WONDER, ALTHOUGH]
		System.out.println("values : " + dic.values()); // [천국, 꿀벌과에 속하는 호박벌, 호기심이 들다, 그럼에도 불구하고]
		
		Iterator<String> keys = dic.keySet().iterator();
		while (keys.hasNext()) {
			String key = keys.next();
			System.out.println("iterator getkey " + dic.get(key));
		}
		
//--------------------------------------------------------------------------------------------------------------

		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		dic.replace("HEAVEN", "아주 행복한 감정");
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));
		dic.put("HEAVEN", "이상적인 세상");
		System.out.println("HEAVEN : " + dic.get("HEAVEN"));

		System.out.println(dic.containsKey("BUMBLEBEE")); // true
		System.out.println(dic.containsValue("자장가")); // false

		dic.remove("HAVEN");
		System.out.println(dic.containsKey("HAVEN")); // false

		dic.clear();
		System.out.println(dic.isEmpty()); // true
		System.out.println(dic.size()); // 0
	}
}
