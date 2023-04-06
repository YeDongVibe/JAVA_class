package Chapter4;

import java.util.Scanner;
public class Test37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		double avg = 0.0;
		int max = 0;
		int min = 999;
		
		System.out.println("Put the Score 5 times ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i])
				min = arr[i];
		}
		
		avg = sum / arr.length;
		System.out.println("ALL: " + sum);
		System.out.println("Average: " + String.format("%.2f", avg));
		System.out.println("Max score: " + max);
		System.out.println("Min score: " + min);
		
		sc.close();
	}
}
