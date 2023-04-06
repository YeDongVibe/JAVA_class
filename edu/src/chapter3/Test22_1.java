package chapter3;

import java.util.Scanner;

public class Test22_1 {

	public static void main(String[] args) {
		System.out.println("Op[+,-,*,/]: ");
		Scanner sc = new Scanner(System.in);

		char op = sc.next().charAt(0); // Char 형식
		// String op = sc.next(); //String 형식
		int a = 12;
		int b = 2;

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
			System.out.println("Wrong type calc");
			break;
		}
//		switch(op) { //String 형식
//		case "+"
//			System.out.println(a + b);
//			break;
//		case "-":
//			System.out.println(a - b);
//			break;
//		case "*":
//			System.out.println(a * b);
//			break;
//		case "/":
//			System.out.println(a / b);
//			break;
//		default:
//			System.out.println("Wrong type calc");
//			break;
//		}
		sc.close();

	}

}
