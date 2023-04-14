package Chapter8;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		int[] res = new int [3];
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		a=2;
		b=3;
		c=5;
		
		num = a+b+c;
		res = arr[a][b][c];
		
		System.out.println(Integer.toBinaryString(num));
		sc.close();

	}
}
