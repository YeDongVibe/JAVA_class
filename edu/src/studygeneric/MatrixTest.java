//arr는 generic을 사용하면 안되기에 list로 변경

package studygeneric;

import java.util.ArrayList;
import java.util.Random;

public class MatrixTest <T> {
	private int rows;
	private int cols;
	//private int [][] data;
	
	private final Class<T> type;
	private ArrayList <T> data = new ArrayList<T>();

	public MatrixTest(int row, int col) { // 생성자 호출
		this.rows = row;
		this.cols = col;

		//this.data = new int [row][col];
		
		
		setData();

	}

	private void setData() {
		Random rand = new Random(System.currentTimeMillis());

		for (int i = 0; i < this.rows * this.cols; i++) {// data.length = this.rows /  data.length는 두 뭉텅이. data[i].length하면 행의 i번째의 길이를 의미.
			if(this.type == Integer.class) {
				data.add(rand.nextInt(100));
			}

		}
	}

	protected void showData(String name) {

		System.out.println(name + "의 행렬");
		for (int i = 0; i < this.rows; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(this.data[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}



}
