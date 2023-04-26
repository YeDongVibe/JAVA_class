package StudyClass;

public class newMatrix {

	public static void main(String[] args) {
		newMatrixclass A = new newMatrixclass(2, 3);
		newMatrixclass A1 = new newMatrixclass(2, 3);
		newMatrixclass B = new newMatrixclass(3, 4);

		
		
		A.setData();
		A1.setData();
		B.setData();
		
		A.showData("A");
		A1.showData("A1");
		B.showData("B");
		

		newMatrixclass A2 = newMatrixclass.addMatrix(A, A1); // matrix A와 A1을 집어넣어 A2생성. //클래스이름.addMatrix(함수)(변수1, 변수2); //클래스를 만들어 가져와 사용함.
		A2.showData("A2");
		//int row = A2.getRowCount(); //파라미터 없고 return을 받아 row를 print해줌.
		//System.out.println(row); //A를 (2,3)으로 만들었기에 2가 출력됨.
		
		//A2.setRowCount(A2.getRowCount()); // 파라미터 있고 return값을 받을 것이 없음. = 함수는 void면 된다.
		//System.out.println(A2.getRowCount()); //<5로 값을 변경했기에 5로 출력됨.> 이후 값의 변경위험때문에 getRowCount로 변경함.그러면 A2을 받아 출력됨.
		
		newMatrixclass D = A.Transpose();
		D.showData("D");
		
		newMatrixclass C = newMatrixclass.multiplyMatix(A, B);
		C.showData("c");
		
	}

}
