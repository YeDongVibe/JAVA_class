package Chapter08;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0;
		int e = 1;
		int s = 1;
		int oh = 1;
		int res = 0;
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		res = num - (2+3+5);
		
		if (res> 5) {
			res = res-5*(res % 5);
		}
		else if (res>3) {
			res = res- 3*(res % 3);
		}
		else {
			res = res - 2*(res % 2);
		}
		
	
		System.out.println(res);
		System.out.println("총 추의 수(5g, 3g, 2g) : " + oh + " ," + s + " ," + e + "개");
		sc.close();

	}
}
