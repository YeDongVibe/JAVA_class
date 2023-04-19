package StudyClass_Tetris;

import java.util.Random;
import java.util.Scanner;

public class TetrisMain implements Runnable {

	static private Block b; // main과 run main에서 사용하기 위해 밖에서 선언.

	public static void main(String[] args) {

		Thread cmd = new Thread(new TetrisMain());// 시작되는 시점부터 run이라는 Main함수가 실행된다.
		cmd.start(); // 시작되는 시점부터 run이라는 Main함수가 실행된다.

		while (true) {

			// 블럭을 만들때 white와 ㄱ을 랜덤하게 바꾸기
			String[] arrColor = new String[] { "white", "Purple", "Red", "Green", "Orange" }; // color 지정
			String[] arrShape = new String[] { "ㄱ", "ㄴ", "ㄹ", "ㅁ", "ㅣ" }; // shape 지정

			// 랜덤수(0~4) 생성 후 arrColor, arrShape에 적용
			Random rand = new Random(System.currentTimeMillis());

			int r1 = rand.nextInt(5); // 0부터 4까지 숫자 랜덤하게 생성.
			int r2 = rand.nextInt(5);
//			System.out.println("r1 : " + r1); //r1, r2값 확인용.
//			System.out.println("r2 : " + r2);

			// 블럭만들기
			b = new Block(arrColor[r1], arrShape[r2]); // 문자열을 넣어 받을 수 있는 파라미터. //r1, r2의 랜덤수를 받아 각 선택값을 랜덤하게 출력.

			// 블럭 떨어트리기 : 동시에 실행하기에는 Thread를 한 곳에서 사용할 수 없기에 두개의 곳에서 사용해 적용.(Runnable이라는
			// 클래스를 인터페이스하여 동작)
			b.Drop();

		}
	}

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void run() { // Implements Runnable을 선언해주기 위한 main 함수생성.
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		while (true) {// 방향지정.
			String c = sc.nextLine();

			switch (c) {
			case "a":
				b.MoveLeft();
				break;
			case "d":
				b.MoveRight();
				break;
			case "s":
				b.MoveAcc();
				break;
			case "w":
				b.Rotate();
				break;
			case "x":
				exit = true; // 프로그램을 종료하기 위한 코드
				break;
			}
			if (exit == true) {
				break;
			}

			// 1초를 쉬도록 하는 코드
			try {
				Thread.sleep(1000); // try~catch문을 필수로 써야함. / Thread.sleep(숫자) : 숫자만큼 쉬기.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		sc.close();

	}

}
