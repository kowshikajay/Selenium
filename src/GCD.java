
public class GCD {

	public static void main(String[] args) {

		int num1 = 12;
		int num2 = 8;
		int gcd = 0;
		System.out.println(gcd(num1, num2));

	}

	private static int gcd(int num1, int num2) {
		int gcdm = 0;
		for (int i = 1; i <= num1 && i <= num2; i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcdm = i;
			}
		}
		return gcdm;
	}

}
