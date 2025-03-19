
public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words = "Kowshik is not working";
		/*
		 * String[] count=words.split("\\s"); int i=0;
		 * 
		 * for(String j:count) { i++; }
		 * 
		 * 
		 * System.out.println(i);
		 */

		int count = words.split("\\s").length;
		System.out.println(count + " new code");
	}

}
