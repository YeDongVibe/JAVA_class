package Chapter8;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int res1 = 0;
		int [] arr = new int [i];
		
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		for(int i = num; i>0; i++) {
			res1 = num %2;
			num = num/2;
			if (num == 0) break;
		}
		System.out.println(arr[i]);
		sc.close();

	}

}
