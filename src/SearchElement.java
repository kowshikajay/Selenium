
public class SearchElement {

	public static void main(String[] args) {

		int arr[] = { 2, 4, 3, 33, 55, 11, 1 };
		int target = 2;
		int index = serachElement(arr, target);

		if (index != -1) {
			System.out.println("Element" + " " + target + " " + " found at position" + index);
		}
	}

	private static int serachElement(int[] arr, int target) {
		int j = -1;
		for (int i : arr) {
			j++;
			if (i == target) {
				return j;
			}
		}
		return -1;
	}

}
