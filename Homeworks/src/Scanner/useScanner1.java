package Scanner;

import java.util.Scanner;

public class useScanner1 {

	public static void main(String[] args) {
		/*
		 * You are a loan specialist and you need to ask the user what is the amount of
		 * loan that is needed. If loan is less or equal to 200,000 then you would lend
		 * the money otherwise you would reject the client.
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("How much money you need?");
		float loan = input.nextFloat();

		if (loan <= 200.000 && loan >= 0) {
			System.out.println("You are okay to take the loan.");
		} else {
			System.out.println("You are rejected!");
		}
		input.close();
	}

}
