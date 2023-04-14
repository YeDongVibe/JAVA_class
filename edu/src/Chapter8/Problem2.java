package Chapter8;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int rem = 0;
//		int rem2 = 0;
//		int rem3 = 0;
		
		if (num1 < num2) {
			rem = num2 % num1;
		
			System.out.println("최대공약수는 " + rem);
			
		 while(rem == 0) {
			 if (rem ==0) {
			 int gongyakso = num1;
				int gongbaeso = (num1 * num2) / gongyakso;
				System.out.println("최소공배수는 " + gongbaeso);
				System.out.println("최대공약수는 " + gongyakso);
		 }
		
		
		
		else if (rem == 0) {
			int gongyakso = num1;
			int gongbaeso = (num1 * num2) / gongyakso;
			System.out.println("최소공배수는 " + gongbaeso);
			System.out.println("최대공약수는 " + gongyakso);
		} else {
			num2 = num1;
			num1 = rem;
			num2 = num1;
			num1 = rem;
		}
		sc.close();
		
		}

		
	}

	}
}