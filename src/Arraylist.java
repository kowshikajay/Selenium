import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volkswagen");
		cars.add("TATA");
		cars.add("Audi");
		cars.add("Mahindra");
		cars.add("Volkswagen");
		System.out.println(cars);
		for (String i : cars) {
			System.out.println(i);
		}
		System.out.println(cars.size());
		System.out.println(cars.get(0));
	}

}
