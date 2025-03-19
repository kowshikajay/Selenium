import java.util.ArrayList;
import java.util.Collections;

public class ReverseList {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Kowshik");
		list.add("Ajay");
		list.add("Mygapula");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}

}
