package Chapter06;

class Count {
	public static int totalCount;
//	private int num; // private의 의미는 class내에서만 count를 사용할 수 있다는 의미. class범주 밖으로 가면 사용불가.
	int num;

	public void setNum(int n) {
		num = n;
	}

	public int getNum() { // public은 아래의 class. 즉 class밖에서도 적용가능.
		return num; // num이라는것을 반환함.
	}
}

public class CountTest { //file이름은 countTest이다. 여기서 사용할 class가 윗줄의 내용.
	int m =10; //m에 해당되는 함수
	public void show() { //static을 추가해야 사용가능.
		System.out.println("Hello");
	}

	public static void main(String[] args) { //main이 있는 class의 이름이 file의 이름.중요중요중중요
//		Count.show(); // 이렇게 선언해야 사용가능 : 그냥 show라고 선언하면 객체가 없기에 위의 class에서 static이라고 선언을 해야함.
		int num = 0;
		Count.totalCount = 10;//public, static이라서 사용가능.만약 public을 private라고 바꾸면 totalCount또한 사용 불가.public을 지워도 동작 가능함(default선언으로 인해 정의된 file내에서는 사용 가능).
//		Count.num = 20;//private에서 선언한였기에 사용불가.
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		Count.totalCount = 20;//10에서 20으로 변하면 heap영역의 값이 변화해 totalCount에도 변화가 생기는 것. totalCount가 변화하는 것이 아님.

		c1.num++; //c1은 변수.제일 위에 private로 선언하면 num은 여기 영역에서 사용 불가.
		c1.setNum(num);
		System.out.println("num = " + c1.getNum()); //c1.을 하는 이유 : c1은 변수고 counter가 getNum이기에.
		Count.totalCount++;
		c2.num++;
		Count.totalCount++;
		c3.num++;
		Count.totalCount++;

		System.out.println(Count.totalCount + " : " + c1.num);
		System.out.println(Count.totalCount + " : " + c2.num);
		System.out.println(Count.totalCount + " : " + c3.num);
	}
}

//하나의 파일.