package Chapter8;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num[] = new int[2];
		int max = 0;
		int min = 0;
		int rem = 0;

		System.out.println("숫자를 입력하세요");
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if (max <= num[i]) {
				max = num[i];
			} else {
				min = num[i];
			}
			//whilerem = max % min;
			if(rem == 0) { 
		}

	}

}
