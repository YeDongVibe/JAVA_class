package Chapter8;

class Student {
	int sid;
	String sname;

	Student(int sid, String sname) { //생성자 만들기
		this.sid = sid;
		this.sname = sname;
	}
	void show() {
		System.out.println("sid = " + sid + ", sname = " + sname);
	}
}

public class Hong01_objectList {
	public static void main(String[] args) {
		int[] data = new int[10]; //배열생성
		Student[] sdata = new Student[10];//배열생성 : Heap 영역에 배열 할당
		data[0] = 10;
		sdata[0] = new Student(2023, "hong"); //배열 : 스튜던트 객체는 학번과 이름을 공간에 할당
		sdata[1] = new Student(2022, "kim");
		sdata[2] = new Student(2021, "lee");
		sdata[3] = new Student(2020, "park");
		sdata[4] = new Student(2019, "choi");
		
		for (int i = 0; i < 5; i++) {
			sdata[i].show();
		}
	}

}
