package Chapter08;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int rem = 0;
		int gongbaeso = 0;
		int gongyakso = 0;


		if (num1 < num2) {
			rem = num2 % num1;

			while (rem > 0) {
				gongyakso = rem;
				rem = num1 % rem;

			}
			System.out.println("최대공약수는 " + gongyakso);

			gongbaeso = (num1 / gongyakso) * (num2 / gongyakso) * gongyakso;

			System.out.println("최소공배수는 " + gongbaeso);
		} else {
			rem = num1 % num2;

			while (rem > 0) {
				gongyakso = rem;
				rem = num2 % rem;

			}
			System.out.println("최대공약수는 " + gongyakso);

			gongbaeso = (num1 / gongyakso) * (num2 / gongyakso) * gongyakso;

			System.out.println("최소공배수는 " + gongbaeso);
		}
		sc.close();
	}

}
