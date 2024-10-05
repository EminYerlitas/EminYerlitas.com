package programmingQuestions2;

public class AlphaCharacters {

	public static void main(String[] args) {
		/*
		 * Find out how many alpha characters are present in a String? Find the number
		 * of words in a string? How many letters in a String? No numbers, no special
		 * characters.
		 */
		
		String alpha="JavaSelenium12345";
		String alpha2=alpha.replaceAll("[^a-zA-Z]", "");
		System.out.println(alpha2);
		alpha2.length();
		

	}

}
