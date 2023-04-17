package StudyClass;

public class jaegobso_while {

	public static void main(String[] args) {

		int value = 0;//while문 사용시 전역변수로 선언하면 초기값이 유지.
		int square = 1;
		int sum = 0;
		
		while(value <= 1000) {
			value = (int) Math.pow(2, square); //제곱 연산자 :  Math.pow(밑수, 인수)
			
			if (value>= 1000) {
				break;
			}
			
			System.out.println("value는 " + value);
			
			sum += value;
			
			square++;
			
		}
		System.out.println(sum);

	}

}
