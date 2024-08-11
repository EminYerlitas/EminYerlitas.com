package stringMethods;

public class StringMethods1 {

	public static void main(String[] args) {
		/*
		 * Homework 1: Create a String that will hold a sentence. Write a program to get
		 * a new String without any spaces.
		 */
		String sentence="    Neotech academy is my favorite.   ";
		String sentence2=sentence.replaceAll(" ", "");
		System.out.println(sentence2);
		
		

	}

}
