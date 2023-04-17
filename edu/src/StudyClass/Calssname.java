package StudyClass;
class FishFrame {

	int fid; //맴버변수
	String color;
	int eyes = 2;
	
	FishFrame () {
		this.fid = 0;
		this.color = "노란색";
	}
	
	FishFrame(int f, String c) {
		this.fid = f;
	//int fid를 뜻함  //
		this.color = c;
	}
	
	int getEyes () {
		return this.eyes;
	}
	
	FishFrame getFish () {
		FishFrame fish = new FishFrame ();
		
		return fish;
	}
	
	void setFish (FishFrame fish) {
		this.fid = fish.fid;
		this.color = fish.color;
		//return이 없고 (void가 있어서) 파라미터로 fish를 받음
		return; //void함수를 종료함.
	}
}
public class Calssname {

	public static void main(String[] args) {

		FishFrame fish1 = new FishFrame(); 
							//FishFrame을 불러 생성. : 생성자
		FishFrame fish2 = new FishFrame(10,"까만색"); //f와 c가 들어가 출력. 
		
		
		
		System.out.println("fish1 : " + fish1.fid);
		System.out.println("fish1 : " + fish1.color);
		
		System.out.println("fish2 : " + fish2.fid);
		System.out.println("fish2 : " + fish2.color);
		
		int e = fish2.getEyes();
		
		System.out.println(fish2.getEyes());
		
		FishFrame fish3 = new FishFrame();
		
		FishFrame fish4 = fish3.getFish();
		
		
		}

}
