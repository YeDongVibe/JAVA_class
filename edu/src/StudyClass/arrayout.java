package StudyClass;

import java.util.Random;

public class arrayout {

	private int[][] arr;

	public arrayout(int i, int j) {
		this.arr = new int[i][j];
	}

	protected void setDataInt() {

		Random rand = new Random(System.currentTimeMillis());
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(50);
			}
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void setDataDou() {

		Random rand = new Random(System.currentTimeMillis());
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) rand.nextDouble(50);
			}
		}
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	protected void showData(String name) {
		System.out.println(name + "행렬의 데이터 : showData");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		arrayout A = new arrayout(2, 3);

		A.setDataInt();
		A.showData("A");
		
		A.setDataDou();
		A.showData("AD");

	}

}
