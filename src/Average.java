
public class Average {

	public static void main(String[] args) {

		int[] ele = { 10, 20, 30, 40, 50 };

		float sum = 0, avg = 0;

		int length = 0;

		length = ele.length;

		for (int i : ele) {
			sum = sum + i;
		}

		avg = sum / length;
		System.out.println(avg);

	}

}
