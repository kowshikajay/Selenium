
public class RemoveSpaces {

	public static void main(String[] args) {

		String s = "  Kowshik is    studying Javaa     ";
		//String a = s.replace(" ", "");
		 String a=s.replaceAll("\\s","");
		System.out.println(a);
	}

}
