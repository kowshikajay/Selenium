import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {

		ArrayList<String> duplicate = new ArrayList<String>();
		duplicate.add("Kowshik");
		duplicate.add("Kowshik");
		duplicate.add("Ajay");
		duplicate.add("Kowshik");
		duplicate.add("Ajay");
		duplicate.add("Mygapula");

		ArrayList<String> original = removeDuplicates(duplicate);
		for (String i : original) {
			System.out.println(i);
		}
	}

	public static ArrayList<String> removeDuplicates(ArrayList<String> duplicate) {

		Set<String> s = new HashSet<>(duplicate);

		return new ArrayList<String>(s);
	}

}
