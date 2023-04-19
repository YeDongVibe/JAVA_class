package StudyClass;

public class Matrix_sum_upgrade {

	public static void main(String[] args) {

		int[][] arr1 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arr2 = new int[][] { { 11, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };

		System.out.println("arr1 출력 : ");
		ShowMatrix(arr1); //선언한 함수를 가져와 출력.
		System.out.println("arr2 출력 : ");
		ShowMatrix(arr2);
		System.out.println("arr3 = arr1 + arr2 : ");
		int[][] arr3 = SumMatrix(arr1, arr2);
		ShowMatrix(arr3);
		System.out.println("arr3 출력 : ");
		ShowMatrix(arr3);
	}

	static void ShowMatrix(int[][] m) { // 행렬 출력을 위한 함수 만들기 : return타입이 없으므로 void로 선언.
		for (int i = 0; i < 3; i++) {// i는 행

			for (int j = 0; j < 3; j++) { // j는 열

				// arr를 출력
				// System.out.println(arr1[i][j]); //i=0 일때 j = 0,1,2로 돔 : 그래서 1,2,3이 출력 이후 반복.
				// 행렬 모양으로 출력 위해 가로로 출력
				System.out.print(m[i][j] + "\t"); // m을 받아 출력.
				
			}
			// 행렬 모양으로 출력
			System.out.println("\n");

		}
	}

	static int[][] SumMatrix(int[][] m1, int[][] m2) { // 2차원 배열의 함수는 반드시 return 해야한다.
		int[][] result = new int[3][3];
		for (int i = 0; i < 3; i++) {// i는 행

			for (int j = 0; j < 3; j++) { // j는 열

				result[i][j] = m1[i][j] + m2[i][j];
			}
		}
		return result;// 합한 결과를 result에 넣어 arr3로 출력.
	}

}
