package Scanner;

import java.util.Scanner;

public class AndOr {

	public static void main(String[] args) {
		/*
		 * Ask the user to enter the height in inches. Person should be classified as
		 * one of the following: • short (under 60 inch) • medium (between 60 -72 inch)
		 * • tall (over 72 inch)
		 * 
		 */
		System.out.println("Enter your height");
		Scanner input = new Scanner(System.in);
		double height = input.nextDouble();

		if (height < 60) {
			System.out.println("You are short.:))");

		} else if (height >= 60 && height <= 72) {
			System.out.println("You are medium.");
		} else {
			System.out.println("You are tall.");
		}
		input.close();

	}

}
