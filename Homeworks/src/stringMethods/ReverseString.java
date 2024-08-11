package stringMethods;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Homework 4: Write a java program to reverse String? Reverse a string word by
		 * word?
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("Write a sentence");
		String sentence = input.next();
		
		char[] str=sentence.toCharArray();
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.print(str[i]);

		}
		String[] sentence2=sentence.split(" ");
		for (int i = str.length - 1; i >= 0; i--) {
			System.out.println(str[i]);}
		System.out.println(" ");
		
		

	}

}
