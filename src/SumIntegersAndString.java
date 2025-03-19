
public class SumIntegersAndString {

	public static void main(String[] args) {
		String arr[] = { "2", "q", "2", "d", "3", "33", "d" };
		int sumOfEle = findSum(arr);
		System.out.println(sumOfEle);
	}

	private static int findSum(String[] arr) {
		int num = 0, sum = 0;
		for (String i : arr) {
			try {
				num = Integer.parseInt(i);
				sum = sum + num;
			} catch (NumberFormatException e) {

			}
		}
		return sum;
	}

}
