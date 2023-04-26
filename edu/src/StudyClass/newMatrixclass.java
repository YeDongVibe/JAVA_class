package StudyClass;

import java.util.Random;

public class newMatrixclass {
	private int[][] data; // 현재의 class에서만 사용하기 위해 private로 선언.
	private int rowCount;
	private int colCount;

	public int getRowCount() { // 파라미터는 없고, return값이 있음
		return rowCount;
	}

	public void setRowCount(int rowCount) {// 파라미터 있고, return 값이 없음.
		this.rowCount = rowCount;

	}

	public newMatrixclass(int rows, int cols) {
		this.data = new int[rows][cols]; // 함수 내 선언된 변수를 사용시 this.변수명 으로 사용하는게 보편적.
		this.rowCount = rows;
		this.colCount = cols;

	}

	public static newMatrixclass addMatrix(newMatrixclass m1, newMatrixclass m2) {// protected는 같은 package내에서는 사용가능.

		newMatrixclass result = new newMatrixclass(m1.rowCount, m1.colCount);

		for (int r = 0; r < m1.rowCount; r++) { // 행반복
			for (int c = 0; c < m1.colCount; c++) { // 열반복//Matrix의 r(행) 길이에 맞춰서 제한둠.
				result.data[r][c] = m1.data[r][c] + m2.data[r][c];
			}
		}
		return result;
	}

	protected void setData() {
		Random rand = new Random(System.currentTimeMillis()); // 현재시간을 millsecond단위로 값을 넣어줌.
		for (int r = 0; r < this.rowCount; r++) { // 행반복 //class 내의 변수를 직접 사용해야한다.data.rowCount라고 쓰면 안된다.
			for (int c = 0; c < this.colCount; c++) {// 열반복//Matrix의 r(행) 길이에 맞춰서 제한둠.
				data[r][c] = rand.nextInt(100);
			}
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void showData(String name) {

		System.out.println(name + " 행렬의 데이터");

		for (int r = 0; r < this.rowCount; r++) { // 행반복
			for (int c = 0; c < this.colCount; c++) {// 열반복//Matrix의 r(행) 길이에 맞춰서 제한둠.
				System.out.print(data[r][c] + "\t");
			}
			System.out.println("\n");
		}
	}

}
