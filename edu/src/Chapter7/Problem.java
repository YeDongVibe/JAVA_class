package Chapter7;

//1부터 1000까지의 합과 짝수의 총합, 홀수의 총합을 출력하라.

class ProblemSub {

	private int total;
	private int oddsum;
	private int evnsum;

	public /*void*/ ProblemSub(int num) {
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0)
				evnsum += i;
			else
				oddsum += i;
		}
		total = evnsum + oddsum;
	}

	public int getTotal() {
		return total;
	}

	public int getOddsum() {
		return oddsum;
	}

	public int getEvnsum() {
		return evnsum;
	}
}

public class Problem {

	public static void main(String[] args) {

		int arg = Integer.parseInt(args[0]);

		ProblemSub cs = new ProblemSub(arg);
		/*cs.clac(arg);*/

		System.out.println("총계 : " + cs.getTotal());
		System.out.println("짝계 : " + cs.getEvnsum());
		System.out.println("홀계 : " + cs.getOddsum());
	}

}
