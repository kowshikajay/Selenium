import java.util.ArrayList;

public class FirstandLastElementinArray {

	public static void main(String[] args) {

		ArrayList<String> values = new ArrayList<String>();
		String firstElement;
		String lastElement;
		values.add("Kowshik");
		values.add("Ajay");
		values.add("Kovvur");
		values.add("Mygapula");
		values.add("Train");
		firstElement = values.get(0);
		lastElement = values.get(values.size() - 1);
		System.out.println(firstElement);
		System.out.println(lastElement);
	}

}
