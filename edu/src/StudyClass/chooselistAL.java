package StudyClass;

public class chooselistAL {

	public static void main(String[] args) {
		
		int [] arr = new int [] {15, 11, 1, 3, 8};
		
		for (int standard = 0; standard < arr.length-1; standard++) {
			System.out.println("기준값 : " + standard);
			
			int min = 999999; //비교값을 매우 크게 주는 이유는 값이 이것보다 작다는 확신하에 선언해준것.
			int minIndex = 0; //min값을 교체할 때 저장할 변수.

			for(int compare = standard + 1;compare < arr.length; compare++) { //기준값이 0일때 비굣값은 1~4까지 비교해야함으로 
				System.out.println("  비교값 : " + compare);
				if (min > arr[compare]) {
					min = arr[compare]; //standard가 1일때 최솟값은 1, 2일때 1, 3일때 3, 4일때 8임.
					minIndex = compare; //비교한 값을 저장.

				}	
			}
			System.out.println("min값 : " + min);
			
			if(arr[standard] > min) {
				int temp = arr[standard]; //기준값을 저장할 임의의 배열 저장.
				arr[standard] = min; //기준값과 비교한 최솟값을 저장.
				arr[minIndex] = temp; //저장한 값을 temp에 저장.
			}
		}
		for(int i = 0; i <arr.length; i++) {
			System.out.println("정렬한 최종 값 : " + arr[i]); //최종 배열 출력
		}
	}

}
