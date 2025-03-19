
public class LargestAndSmallestInArray {

	public static void main(String[] args) {

		int num[] = { 10, 33, 21, 4, 45 };
		int[] result = smallestAndLargest(num);
		System.out.println("smallest is" + " " + result[0]);
		System.out.println("Largest is" + " " + result[1]);
	}

	public static int[] smallestAndLargest(int[] num) {
		int smallest = num[0];
		int largest = num[1];
		for (int i : num) {
			if (i < smallest) {
				smallest = i;
			}
			if (i > largest) {
				largest = i;
			}
		}
		return new int[] { smallest, largest };
	}

}
