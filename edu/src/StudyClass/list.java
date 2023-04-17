package StudyClass;

public class list {
	public static void main(String[] args) {

		int[] arr = new int[] { 11, 12, 13, 14, 11 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[arr.length - i - 1]);  //c++이나 다른언어에서 배열선언과 초기화 동시 진행시 이렇게 사용 //배열 수는 5개지만 배열 index는 0부터 4까지라서 맞지 않음 그래서 배열수에서 하나를 빼서 배열 역순으로 출력.

		}
		System.out.println("=".repeat(50));
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.println(arr[i]);//배열 출력
		}
		// 회문여부 확인 코드
		boolean result = true;

		System.out.println("=".repeat(50));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == arr[arr.length - i - 1]) { //많이 사용.
				result = true;

			} else {
				result = false;
				break;
			}

		}
		if (result == true) {
			System.out.println("회문입니다");
		} else {
			System.out.println("회문이 아닙니다");
		}
	}

}

//선택정렬 알고리즘 : 처음값을 기준으로 잡고 모든 값을 비교하여 가장 작은값을 찾아 비교해 보다 작은수가 앞으로 오도록 재정렬.
//				 이후 두번째값으로 기준잡고 남은수와비교하여 가장 작은값을 찾아 비교해 보다 작은수가 앞으로 오도록 재정렬. 무한 반복.