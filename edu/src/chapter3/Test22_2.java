package chapter3;

import java.util.Scanner;

public class Test22_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;

		System.out.println("Op[+,-,*,/]: ");
		char op = sc.next().charAt(0);
		if (op == '+' || op == '-' || op == '*' || op == '/') {
			System.out.println("1st number: ");
			 a = sc.nextInt();

			System.out.println("2nd number: ");
			 b = sc.nextInt();
		}
		
		switch (op) {
		case '+':
			System.out.println(a + b);
			break;
		case '-':
			System.out.println(a - b);
			break;
		case '*':
			System.out.println(a * b);
			break;
		case '/':
			System.out.println(a / b);
			break;
		default:
			sc.close();
			return;
		}
		sc.close();

	}

}
