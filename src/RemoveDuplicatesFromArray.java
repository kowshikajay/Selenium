import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {

		int[] dup = { 1, 2, 2, 3, 3, 5 };
		int[] orgEle = originalElements(dup);
		for (int l : orgEle) {
			System.out.println(l);
		}

	}

	public static int[] originalElements(int[] dup) {

		Set<Integer> s = new HashSet<Integer>();

		for (int i : dup) {
			s.add(i);
		}

		int[] orgSet = new int[s.size()];
		int k = 0;
		for (int j : s) {
			orgSet[k] = j;
			k++;
		}
		return orgSet;

	}

}
