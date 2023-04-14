package Chapter8;

import java.util.Scanner;
public class Problem {

	public static void main(String[] args) {
		int num = 0;
		int res1 = 0;
		int[] arr = new int [8];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		num = sc.nextInt();
		
		while(true) {
			arr[res1]= num % 2;
			num = num /2;
			res1++;
			if(num == 0) {
				break;
			}
		}
		for(int i = (res1-1);i>=0;i--) {
			System.out.print(arr[i]);
		}
		
		sc.close();	
	}
}