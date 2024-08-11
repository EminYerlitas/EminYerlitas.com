package methodTasks;

public class StringUtil {
	/*
	 * Create a StringUtil class with methods for common string operations (reverse,
	 * capitalize, concatenate, countOccurrences, etc.). Implement methods using the
	 * String class methods and basic loops/conditionals.
	 */
	String redapple;

	public String toLowerCase() {

		String b = redapple.toLowerCase();
		return b;

	}

	public String toUpperCase() {

		String c = redapple.toUpperCase();
		return c;

	}

	public StringUtil(String a) {
		this.redapple = a;
	}

	public static void main(String[] args) {
		StringUtil a = new StringUtil("al");
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());

	}

}
