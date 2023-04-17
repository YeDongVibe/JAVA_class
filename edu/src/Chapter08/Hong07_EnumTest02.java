package Chapter08;

enum Mandarin {
	금귤(600), 한라봉(500), 레드향(300), 천혜향(400), 황금향(800);

	private int price;

	Mandarin(int p) {
		price = p;
	}

	int getPrice() {
		return price;
	}
}

public class Hong07_EnumTest02 {
	public static void main(String[] args) {

		Mandarin ma = Mandarin.한라봉; //enum할때 선언방법.
		if (ma == Mandarin.한라봉)
			System.out.println("ma는 한라봉입니다.");
		System.out.println(ma + " 가격 : " + ma.getPrice());
		System.out.println(ma + "위치:" + ma.ordinal());
		System.out.println(ma + ":" + ma.compareTo(Mandarin.황금향));



		Mandarin list[] = Mandarin.values();
		System.out.println("== 귤의 종류 ==");
		for (Mandarin m : list)
			System.out.println(m + ":" + m.getPrice());
	}
}