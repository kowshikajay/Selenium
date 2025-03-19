
public class FindVowel {

	public static void main(String[] args) {

		System.out.println(checkVowel("iKwshk"));
	}

	public static boolean checkVowel(String ch) {
		return ch.toLowerCase().matches(".*[aeiou].*");

	}
}
// ^ at the beginning of a regular expression means “the start of the string”
//$ at the end means “the end of the string.”
/*
 * A pattern followed by a + means “zero or more times.”
 * 
 * So, "M[aeiou]+" matches “Miocene”, “Mr.”, “Ms”, “Mrs.”, “Miss”, and “Man”,
 * among many others.
 * 
 * A simple pattern followed by a ? means “zero or one times.”
 * 
 * So, "M[aeiou]?[^aeiou]" will not match “Miocene”. (The regex means: M
 * followed by at most one vowel, followed by a consonant. “Miocene” has two
 * vowels following the M.)
 * 
 * A simple pattern followed by a * means “one or more times.”
 * 
 * "M[aeiou]*" will match “Miocene” and “Miss”, but not “Mr.”
 */
/*
 * ^[aeiouAEIOU].*[aeiouAEIOU]$ means
 * "at the start of the string ^, match if there is a vowel [aeiouAEIOU], " +
 * "followed by zero or more other characters .*, " + "followed by another vowel
 * [aeiouAEIOU], and then the end of the string $
 */