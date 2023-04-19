package StudyClass_Tetris;

//class안에 변수나 함수를 만들때는 무조건 Private으로 시작해라. 이후 사용할 때에 public 혹은 protected로 바꿔서 사용하는게 보안적으로도 좋다.

public class Block {
	
	private int a; 
	private String b;

	protected void Drop () { //TetrisMain에서 b.Drop()에서 괄호속에 아무것도 없으므로 여기서도 아무것도 안써야함.
		System.out.println("블럭이 떨어지고 있습니당당");
	}
}
