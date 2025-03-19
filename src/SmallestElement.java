
public class SmallestElement {

	public static void main(String[] args) {

		int[] elements = { 21, 33, 42, 11, 34, 16 };
		int smallEle = elements[0];

		for (int i : elements) {
			if (smallEle > i) {
				smallEle = i;
			}
		}
		System.out.println(smallEle);
	}

}
