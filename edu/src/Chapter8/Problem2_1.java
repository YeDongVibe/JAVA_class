package Chapter8;

import java.util.Scanner;

public class Problem2_1 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int rem = 0;
		int max = 0;
		int min = 0;
		
		if(num1 < num2) {
			max = num2;
			min = num1;
		} else {
			max = num1;
			min = num2;
		}
		sc.close();
	}
}