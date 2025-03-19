
public class Factorial {

	public static void main(String[] args) {

		int fact = 1;
		int factNumber = 5;
		for (int i = 1; i <= factNumber; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
