package stringMethods;

public class AlphaCharacters {

	public static void main(String[] args) {
		/*
		 * 
		 * Homework 3: Create a String that should be combination of letters, numbers
		 * and special characters. Find out how many alpha characters are there in the
		 * String. (alpha characters means letters)
		 */
		String alpha=("Alpha/52.,Om,ega65!Beta400;:");
		String beta =alpha.replaceAll("[^a-zA-Z]","");
		System.out.println(beta.length());
		System.out.println(beta);
		
		

	}

}
