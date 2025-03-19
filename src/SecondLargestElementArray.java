
public class SecondLargestElementArray {

	public static void main(String[] args) {

		int[] arr1 = { 10, 3, 2, 33, 345, 335 };
		int SecondL = secondLargest(arr1);
		System.out.println(SecondL);
	}

	private static int secondLargest(int[] arr1) {

		int first = arr1[1];
		int second = arr1[2];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > first) {
				first = arr1[i];
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > second && arr1[i] != first) {
				second = arr1[i];
			}
		}
		return second;
	}

}
