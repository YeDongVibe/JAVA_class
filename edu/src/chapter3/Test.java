package chapter3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int guk;
		int yeong;
		int su;

		System.out.println("국어점수: ");
		guk = sc.nextInt();

		System.out.println("영어점수: ");
		yeong = sc.nextInt();

		System.out.println("수학점수: ");
		su = sc.nextInt();
		
		if(guk < 0 || 100 < guk) {
			System.out.println("Score Error");
		}
				
		int total = guk + yeong + su;
		float avg = (float) (total / 3.0);
		if (avg > 60) {
			System.out.println("Sucess");
			System.out.println("총합계: " + total);
			System.out.println("평균: " + avg);
		} else {
			System.out.println("Fail");
			System.out.println("총합계: " + total);
			System.out.println("평균: " + avg);
		}
		sc.close();
		
		float avg1= 12.34567f;
		
		System.out.println(avg1);
		System.out.println(String.format("%.2f", avg1));
		
	}
}

//구구단
//public static void main(String[] args) {
//	Scanner sc = new Scanner(System.in);
//	int i;
//	System.out.println("Put Number:  ");
//	i = sc.nextInt();
//	for(int j=2; j<11; j++) {
//			System.out.println(i + "*" + j + "=" + (i * j));
//			
//	}
//}
//
//}




