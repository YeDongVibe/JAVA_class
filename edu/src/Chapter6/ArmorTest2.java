package Chapter6;

public class ArmorTest2 {
	public static void main(String[] args) {
		Armor suit = new Armor();
		System.out.println(suit.getName());
		suit = null;
		suit.setName("mark6"); // 참조변수(suit)이 null인데, null.setName하면 가리키는것이 없기에 error가 생김. 그래서 null point가 예외가 됨. : 호출할 함수가 없음.
		suit.setHeight(180);
		System.out.println(suit.getName() + " : " + suit.getHeight());
	}
}