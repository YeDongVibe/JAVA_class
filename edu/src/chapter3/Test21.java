package chapter3;

import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = sc.nextInt();
		char grade;

		if (score < 0 || 100 < score) {
			System.out.println("Error");
		}

		if (90 <= score) {
			grade = 'A';
		} else if (80 <= score) {
			grade = 'B';
		} else if (70 <= score) {
			grade = 'C';
		} else if (60 <= score) {
			grade = 'D';
		} else if (50 <= score) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		System.out.println("Your grade is " + grade);
		sc.close();
	}

}
