package StudyClass;

import java.util.Random;

class Fruit {
	private int a = 0;
}

public class typechangearr {

	private static <Taaaaa> void showMatrix(Taaaaa[][] m) {
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(m[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private static <T extends Number> T getNumber(T n) {
		return n;
	}

	private static <T> T getNumber(T n) {
		return n;
	}

	public static void main(String[] args) {

		Random rand = new Random(System.currentTimeMillis());

		// int
		Integer[][] intMatrix = new Integer[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				intMatrix[i][j] = rand.nextInt(100);
			}
		}
		System.out.println();
		// showMatrix(intMatrix);
		
		
		// double
		Double[][] doubleMatrix = new Double[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				doubleMatrix[i][j] = rand.nextDouble(100);
			}
		}
		System.out.println();
		// showMatrix(doubleMatrix);
		
		
		// long
		Long[][] longMatrix = new Long[2][3];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				longMatrix[i][j] = rand.nextLong(100);
			}
		}
		System.out.println();
		// showMatrix(longMatrix);

		// T
		System.out.println("interger");
		typechangearr.<Integer>showMatrix(intMatrix);
		System.out.println("double");
		typechangearr.<Double>showMatrix(doubleMatrix);
		System.out.println("long");
		typechangearr.<Long>showMatrix(longMatrix);

		Integer a = typechangearr.<Integer>getNumber(intMatrix[0][0]);
		Double b = typechangearr.<Double>getNumber(doubleMatrix[0][0]);
		Long c = typechangearr.<Long>getNumber(longMatrix[0][0]);

		Float d = typechangearr.<Float>getNumber(123.345f);

		Fruit f = new Fruit();

		Fruit fff = typechangearr.<Fruit>getNumber(f);

	}

}
