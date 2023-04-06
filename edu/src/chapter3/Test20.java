package chapter3;

public class Test20 {

	public static void main(String[] args) {		
		int score = 90;
		char grade;
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 90) {
			grade = 'B';
		} else if(score >= 80) {
			grade = 'C';
		} else if(score >= 70) {
			grade = 'D';
		} else if(score >= 60) {
			grade = 'E';
		} else {
			grade = 'F';
		}
		System.out.println(grade);
	}

}
