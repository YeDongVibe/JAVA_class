package Chapter08;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int fac = 1;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		for(int i = num; i>0; i--) {
			fac = i*fac;
		}
		System.out.println(fac);
		sc.close();

	}
}
