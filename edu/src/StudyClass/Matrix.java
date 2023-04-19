package StudyClass;

public class Matrix {

	public static void main(String[] args) {
		
		int [] [] arr1 = new int [][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int [] [] arr2 = new int [][] { {11, 12, 13}, {14, 15, 16}, {17, 18, 19}};
		
		System.out.println("arr1 출력 : ");
		for (int i = 0; i <3; i++) {// i는 행
			
			for(int j = 0; j <3; j++) { //j는 열
				
				//arr를 출력
				//System.out.println(arr1[i][j]); //i=0 일때 j = 0,1,2로 돔 : 그래서 1,2,3이 출력 이후 반복.
				//행렬 모양으로 출력 위해 가로로 출력
				System.out.print(arr1[i][j]+ "\t");
		}
			
			//행렬 모양으로 출력
			System.out.println("\n");
		
		}
		
		
		System.out.println("arr2 출력 : ");
		for (int i = 0; i <3; i++) {// i는 행
			
			for(int j = 0; j <3; j++) { //j는 열
				
				//arr를 출력
				//System.out.println(arr1[i][j]); //i=0 일때 j = 0,1,2로 돔 : 그래서 1,2,3이 출력 이후 반복.
				//행렬 모양으로 출력 위해 가로로 출력
				System.out.print(arr2[i][j]+ "\t");
		}
			
			//행렬 모양으로 출력
			System.out.println("\n");
		
		}

	}

}
