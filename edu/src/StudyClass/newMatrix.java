package StudyClass;

public class newMatrix {

	public static void main(String[] args) {
		newMatrixclass A = new newMatrixclass(2, 3);
		newMatrixclass A1 = new newMatrixclass(2, 3);
		// newMatrixclass B = new newMatrixclass();
		// newMatrixclass C = new newMatrixclass();
		// newMatrixclass D = new newMatrixclass();
		
		
		A.setData();
		A1.setData();
		
		A.showData("A");
		A1.showData("A1");
		

		newMatrixclass A2 = newMatrixclass.addMatrix(A, A1); // matrix A와 A1을 집어넣어 A2생성. //클래스이름.addMatrix(함수)(변수1, 변수2); //클래스를 만들어 가져와 사용함.
		A2.showData("A2");
		int row = A2.getRowCount(); //파라미터 없고 return을 받아 row로 감
		System.out.println(row);
		
		A2.setRowCount(5); // 파라미터 있고 return값을 받을 것이 없음. = 함수는 void면 된다.
		System.out.println(A2.getRowCount());
		

	}

}
