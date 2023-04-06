package chapter3;

public class Test24 {

	public static void main(String[] args) {
		String nation = "Kor";
		
		switch(nation) {
		case "Kor":
		case "Jpn":
		case "Chn":
			System.out.println("Asia");
		break;
		
		case "Gbr":
		case "Fra":
		case "Eua":
			System.out.println("Europe");
		break;
		case "Usa":
		case "Can":
		case "Mex":
			System.out.println("North America");
		break;
		}

	}

}
