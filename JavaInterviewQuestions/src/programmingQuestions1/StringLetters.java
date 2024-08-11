package programmingQuestions1;

public class StringLetters {

	public static void main(String[] args) {
		/*
		 * Find out how many alpha characters are present in a String? Find the number
		 * of words in a string? How many letters in a String? No numbers, no special
		 * characters.
		 */
		String a="I love Java";
		String[] b=a.split(" ");
		int c=b.length;
		System.out.println(c);
		String d=a.replace(" ", "");
		System.out.println(d);
		int e=d.length();
		System.out.println(e);
	}

}
