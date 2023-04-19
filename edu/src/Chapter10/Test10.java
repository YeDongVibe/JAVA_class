package Chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class Test10 {

	public static void main(String[] args) {

		lotto_generator(5);

	}

	public static void lotto_generator(int n) {
		Random number = new Random(); //랜덤 수 생성
		HashSet<Integer> lotto = null; //초기값 선언(6개의 세트를 가진 세트)
		HashSet<HashSet<Integer>> lotto2 = null;
		
		System.out.println("lotto : " + lotto);
		System.out.println("lotto : " + lotto2);
		for (int i = 0; i < n; i++) { //hashset 객체 선언.

			lotto = new HashSet<Integer>(); // hashset의 객체를 lotto라는 변수로 선언
			lotto2 = new HashSet<HashSet<Integer>>(); //순서가 없는 hashset.

			for (int j = 0; lotto.size() <= 6; j++) { //7개의 숫자를 지정
				lotto.add(number.nextInt(46));
				lotto2.add(lotto);
			}

			List<Integer> L = new ArrayList<Integer>(lotto); // 순서가 없는 hashset을 arrlist로 정렬하여 지정.
			Collections.sort(L); //collection에 있는걸을 sort로 정렬
			System.out.println("선택 번호 : " + L);
			System.out.println("lotto2 : " + lotto2);
		}
	}
}