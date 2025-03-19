
public class MissingNumberInArray {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 5, 6 };
		int missingNumber = findMissingNumber(num);
		System.out.println(missingNumber);
	}

	public static int findMissingNumber(int[] num) {
		int n = num.length + 1; // as one number is missing we have added +1
		int total = n * (n + 1) / 2; // to find sum of first n natural numbers
		int sum = 0;
		for (int i : num) {
			sum = sum + i;
		}

		return total - sum;
	}

}
