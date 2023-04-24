package Chapter13;

import java.util.Arrays;
import java.util.List;

public class WildCardTest {

	public static void main(String[] args) {
		Integer[] inum = { 1, 2, 3, 4, 5 };
		Double[] dnum = { 1.0, 2.0, 3.0, 4.0, 5.0 };
		String[] snum = { "1", "2", "3", "4", "5" };

		List<Integer> iList = Arrays.asList(inum);
		List<Double> dList = Arrays.asList(dnum);
		List<String> sList = Arrays.asList(snum);

		double isum = sum(iList);
		double dsum = sum(dList);
		//double ssum = sum(sList); //iList는 int이기에, 오류 발생. String은 안된다. 

		System.out.println("inum의 합계 : " + isum);
		System.out.println("dnum의 합계 : " + dsum);
	}

	public static double sum(List<? extends Number> list) { //숫자들의 상위클래스가 Number임
		double total = 0;
		for (Number v : list) {
			total += v.doubleValue();
		}
		return total;
	}
}