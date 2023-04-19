package Chapter10;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Test05 {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();//new LinkedList<>() : 이렇게 같으면 생략 가능.

		list.add("서울"); //새로운 노드를 만들어 데이터를 가리킴.
		list.add("북경");
		list.add("상해");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + "\t");
		}

		list.add(1, "LA");
		print(1, list); //객체없이 실행하기 위헤 static으로 선언 (t.print 이런식으로)
		list.addFirst("런던");
		print(2, list);
		list.addLast("서울");
		print(3, list);

		list.offer("파리");
		print(4, list);
		list.offerFirst("로마");
		print(5, list);
		list.offerLast("베른");
		print(6, list);

		System.out.println("7 : " + list.peek());
		System.out.println("8 : " + list.peekFirst());
		System.out.println("9 : " + list.peekLast());

		list.poll();
		print(10, list);
		list.pollFirst();
		print(11, list);
		list.pollLast();
		print(12, list);

		list.push("제주");
		print(13, list);
		System.out.println("14 : " + list.pop());

		System.out.println("15 : " + list.get(3));
		System.out.println("16 : " + list.getFirst());
		System.out.println("17 : " + list.getLast());

		System.out.println("18 : " + list.indexOf("서울"));
		System.out.println("19 : " + list.lastIndexOf("서울"));

		list.removeFirst();
		print(20, list);
		list.removeLast();
		print(21, list);
		list.remove(3);
		print(22, list);
		list.remove("LA");
		print(23, list);

		//-------------------------------------------------------------------------
		
		List<String> list2 = Arrays.asList("북경", "상해");//list를 만들어 출력
		list.addAll(list2);

		Object obj[] = list.toArray(); //object는 모든것의 root.
		System.out.println("24 : " + Arrays.toString(obj));

		String cities[] = new String[0];
		cities = list.toArray(cities);
		System.out.println("25 : " + Arrays.toString(cities));

		list.removeAll(list2);
		print(26, list);
	}

	public static void print(int n, List<String> list) {
		System.out.println(n + " : " + list);
	}
}
