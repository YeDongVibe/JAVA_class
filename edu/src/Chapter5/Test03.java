package Chapter5;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2023;

		int[] result = new int[10];
		int idx = 0;

		while (idx < 10) {

			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
//			idx++;
				result[idx++] = year; // idx가 증가하면서 값을 대입하여 도출.

//					System.out.println(year); //조건에 맞는 값을 출력

			}
			year++; // 2023이 유년일수도 있기에 값의 증가변화를 방지하고자 여기에 기입.

		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]); // 배열 출력
		} // 이게 while 안에 있으면 동작이 총 10세트이루어져 버림. 그래서 밖으로 뱉음.

		// 4로 나누어 진다면
		// 4로 나누어 떠러잊더라도 100으로 나누어지면 평년
		// 3조건이 맞으면

//			result[idx++] = year;

//			if (result.length == 10)
//				break;
	}

}
