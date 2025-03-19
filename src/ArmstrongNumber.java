
public class ArmstrongNumber {

	public static void main(String[] args) {
		int number = 153;
		System.out.println(isArmstrong(number));

	}

	private static boolean isArmstrong(int number) {

		int digit = findDigit(number);
		int temp = number;
		double sum = 0;

		while (temp != 0) {
			int r = temp % 10;
			sum = sum + Math.pow(r, digit);
			temp = temp / 10;
		}
		if (sum == number) {
			return true;
		} else {
			return false;
		}
	}

	private static int findDigit(int number) {
		int count = 0;
		while (number != 0) {
			count++;
			number = number / 10;
		}
		return count;
	}

}
/*
 * //An Armstrong number is a special kind of number in math. It's a number that
 * equals the sum of its digits, each raised to a power. For example, if you
 * have a number like 153, it's an Armstrong number because 1^3 + 5^3 + 3^3
 * equals 153.
 */