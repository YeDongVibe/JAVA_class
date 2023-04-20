package StudyClass_Tetris;

//class안에 변수나 함수를 만들때는 무조건 Private으로 시작해라. 이후 사용할 때에 public 혹은 protected로 바꿔서 사용하는게 보안적으로도 좋다.

//떨어짐 : yPos, 이동 : xPos, 회전 : rotation

public class Block {

	// field, 지역변수 선언
	private String color;
	private String shape;
	private int rotation;
	private int xPos;
	private int yPos;

	// 생성자 만들기 : TetrisMain의 new Block에서 Block과 관련한 내용 만들기.
	public Block(String c, String s) { // color과 shape받는 파라미터 만들기

		this.color = c;
		this.shape = s;
		this.rotation = 0;
		this.xPos = 4;
		this.yPos = 20;

	}

	protected void Drop() { // TetrisMain에서 b.Drop()에서 괄호속에 아무것도 없으므로 여기서도 아무것도 안써야함.

		while (this.yPos > 0) { //계속 아래의 출력을 반복.yPos을 위한 조건 제시.

			System.out.println("블럭" + this.toString());// this : 클래스 안에서 사용할 떄 this.~~를 쓰면 함수등을 호출할 때 사용.
			this.yPos--;
			
			//1초를 쉬도록 하는 코드
			try {
				Thread.sleep(1000); //try~catch문을 필수로 써야함. / Thread.sleep(숫자) : 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() { //이걸 왜한건지 이해가 되지않으니 내일 여쭈어봐야겠담.....7장이후 내용한대용 아직도모르겠다;; 출력형식때문에 씀.안쓰면 해시코드가 나옴.
		String msg = "color = " + this.color + ", shape = " + this.shape + ", rotation = " + this.rotation + ", xPos = "
				+ this.xPos + ", yPos = " + this.yPos;
		return msg;

		// 위의 내용을 이렇게 써도 무관.
		// return "color = " + this.color + ", shape = " + this.shape + ", rotation = "
		// + this.rotation + ", xPos = " + this.xPos + ", yPos = " + this.yPos;

	}

	protected void MoveLeft() { //xPos이 감소하면서 이동
		this.xPos--;

	}

	protected void MoveRight() {
		this.xPos++;

	}

	protected void MoveAcc() {
		this.yPos--;

	}

	protected void Rotate() {
		this.rotation += 90; //90도씩 증가.
		this.rotation = this.rotation % 360;// = %=360이라고 써도 ㄱㅊ (아래의 if문과 같은 결과)
		
//		if(this.rotation >= 360) { //0, 90, 180, 360, 0으로 돌아가기 위한 반복문.
//			this.rotation = 0;
//		}

	}
}
