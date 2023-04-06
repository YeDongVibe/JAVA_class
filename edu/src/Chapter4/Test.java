package Chapter4;
//행렬 곱
public class Test {
	public static void main(String[] args) {
		int[][] arr1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		int[][] arr2 = { { 15, 16, 17 }, { 18, 19, 20 }, { 21, 22, 23 }, { 24, 25, 26 } };

		int arr1_row = arr1.length;
		int arr2_col = arr2[0].length;
		int arr2_row = arr2.length;

		int[][] arr3 = new int[arr1_row][arr2_col];

		for (int i = 0; i < arr1_row; i++)
			for (int j = 0; j < arr2_col; j++)
				for (int k = 0; k < arr2_row; k++)
					arr3[i][j] += arr1[i][k] * arr2[k][j];

		for (int i = 0; i < arr1_row; i++) {
			for (int j = 0; j < arr2_col; j++) {
				System.out.print("\t" + arr3[i][j]);
			}
			System.out.println();
		}
	}
}