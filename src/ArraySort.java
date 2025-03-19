import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		String[] cars = { "BMW", "Audi", "Volkswagen", "TATA", "Mahindra" };

		Arrays.sort(cars);
		//System.out.println(cars);
		for (String c : cars) {
			System.out.println(c);
		}

	}

}
