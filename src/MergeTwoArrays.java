import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeTwoArrays {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 2, 3, 5, 6, 7, 7 };
		int[] merged = new int[arr1.length + arr2.length];
		int position = 0;
		for (int i : arr1) {
			merged[position] = i;
			position++;
		}
		System.out.println(position);
		for (int j : arr2) {
			merged[position] = j;
			position++;
		}
		System.out.println(Arrays.toString(merged));

		System.out.println("Unique values " + removeDuplicates(merged));
	}

	private static String removeDuplicates(int[] merged) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i : merged) {
			s.add(i);
		}
		//System.out.println(s);
		String svalues=s.toString();
		return svalues ;
	}

}
