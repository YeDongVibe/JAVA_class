package Chapter7;

//1부터 1000까지의 합과 짝수의 총합, 홀수의 총합을 출력하라.

public class Problem {

	private int total;
	private int oddsum;
	private int evensum;

	private void calc(int sum) {

		for (int i = 1; i <= sum; i++) {
			if (i % 2 == 0)
				evensum = +i;
			else
				oddsum = +i;
		}
		total = evensum + oddsum;
	}

	public int getTotal() {
		return total;
	}

	public int getEvensum() {
		return evensum;
	}

	public int getOddsum() {
		return oddsum;
	}

	public static void main(String[] args) {
		
		int sum(int a, int b) {
			int i = 0;

		}
			int a = 
		}
}
//		int sum = 0;
//		int sum1 = 0;
//		//int totalsum = 0;
//		
//		for(int i = 1; i <1001; i++) {
////			totalsum += i; 
//		
//		if ((i % 2)==0) {
//				sum += i;
//		}
//		else 
//			sum1 += i;
//			}
//		
//		System.out.println("전체 합은 " + (sum + sum1) +"입니다.");
//		//System.out.println("전체 합은 " + totalsum +"입니다.");
//		System.out.println("짝수의 합은 " + sum +"입니다.");
//		System.out.println("홀수의 합은 " + sum1 +"입니다.");
//	}
//
//}