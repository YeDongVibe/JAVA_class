package chapter3;

import java.util.Scanner;

public class Test21_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Put your Score :");
		int score = sc.nextInt();
		char grade;
		
		if(score < 0 || 100 < score) {
			System.out.println("Score Error");
		}
		sc.close();
	}

}
