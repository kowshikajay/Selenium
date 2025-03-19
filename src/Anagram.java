import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		String s1 = "listen";
		String s2 = "silent";
		//System.out.println(s1.length());
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(Arrays.equals(c1, c2));
	}

}

/*
 * Input: s1 = “geeks” s2 = “kseeg” Output: true Explanation: Both the string
 * have same characters with same frequency. So, they are anagrams
 */