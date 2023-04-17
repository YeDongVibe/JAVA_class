package Chapter07;

public class calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price = 152365;
		
		//int omanwon = 0;
		//int illmanwon = 0;
		//int ocheonwon = 0;
		//int illchenonwon = 0;
		
		//int discount = 0;
		//int totalprice = 0;
		
		int ohmannamnenedon = price % 50000;
		int illmannamnendon = ohmannamnenedon % 10000;
		int ocheonnamnendon = illmannamnendon % 5000;
		int illchennamnenedon = ocheonnamnendon % 1000;
		
				
		System.out.println(price/50000);
		System.out.println(ohmannamnenedon/10000);
		System.out.println(illmannamnendon/5000);
		System.out.println(ocheonnamnendon/1000);
		
	}

}
