import java.util.HashSet;
import java.util.Set;

public class CommonEleBwTwoArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 2, 3, 6, 7 };
		Set<Integer> commonElements = findCommonElements(arr1, arr2);
		System.out.println(commonElements);
	}

	public static Set<Integer> findCommonElements(int[] arr1, int[] arr2) {
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();

		for (int i : arr1) {
			set1.add(i);
		}
		for (int j : arr2) {
			if (set1.contains(j)) {
				set2.add(j);
			}
		}
		return set2;
	}

}
