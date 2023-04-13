package Chapter8;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();

		System.out.println(Integer.toBinaryString(num));
		sc.close();

	}
}
