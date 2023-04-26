package Chapter15;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class Test01 {

	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(50);
		myList.add(10);
		myList.add(80);
		myList.add(70);
		myList.add(90);
		myList.add(60);
		myList.add(20);

		System.out.print("점수 목록 : ");
		Stream<Integer> myStream = myList.stream();
		myStream.forEach((n) -> System.out.print(n + " ")); //스트림의 모든 요소에 대해 (람다식)반복문을 실행.
		System.out.println();

		Optional<Integer> minVal = myList.stream().min(Integer::compare);//객체를 만들어 거기에 min 함수를 적용해 값 도출.
		System.out.println("최저 점수 : " + minVal.get());

		Optional<Integer> maxVal = myList.stream().max(Integer::compare);
		System.out.println("최고 점수 : " + maxVal.get());

		System.out.print("점수 정렬 : ");
		Stream<Integer> myStream2 = myList.stream().sorted();
		myStream2.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		System.out.print("낙제 점수 : ");
		Stream<Integer> failScore = myList.stream().filter((n) -> n < 60); //어레이리스트에 스트림을 통해 객체를 만들어 filter에 적용.
		failScore.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		System.out.print("점수 합계 : ");
		//int num = myList.stream().reduce((a, b) -> a + b); : 오류발생.
		Optional<Integer> totalScore = myList.stream().reduce((a, b) -> a + b); //reduce : 변수를 받아 계산식 진행.
		System.out.println(totalScore.get());

		System.out.print("5점 추가 : ");
		Stream<Integer> addScore = myList.stream().map((n) -> n + 5);
		addScore.forEach((n) -> System.out.print(n + " "));
		System.out.println();

		long cnt = myList.stream().count();
		System.out.println("점수 개수 : " + cnt);

		System.out.println("점수 평균 : " + totalScore.get() / cnt);
	}
}