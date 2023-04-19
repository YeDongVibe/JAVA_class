package Chapter11;

public class Test01 {

	public static void main(String[] args) {
		try {// ArrayIndexOutOfBoundsException이 선언되었을 때 예외 처리하기 위해 선언.
			String s = new String("java");
			int len = s.length();
			s = null;
			s.length(); // s값이 null이므로 실행하면 new NullPointerException이 발생.
			int arr[] = new int[3];
			arr[3] = 30; // new ArrayIndexOutOfBoundsException()
			System.out.println("OK");

		} catch (ArrayIndexOutOfBoundsException e1) { // e1 변수 타입이 NullPointerException과 상관없는  ArrayIndexOutOfBoundsException으로 선언됨.
			System.out.println("e1 error message : " + e1.getMessage());
		} catch (NullPointerException e2) { //NullPointerException 타입의 변수 선언
			e2.printStackTrace(); //s.length()에서 발생한 NullPointerException과 같은 타입이므로 예외처리 간으. e2변수에 예외 객체의 주소를 저장후 "잘못된 참조"실행함. 이후 try-catch문 나와서 다음 명령문 실행.
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
		System.out.println("GOOD");
	}
}