package forLoop;

import java.util.Scanner;

public class ForLoop4 {

	public static void main(String[] args) {
		/*
		 * Create a program that will be asking user to apply for a credit card 10
		 * times. As soon you get an "yes" from a user program should stop asking.
		 */
		Scanner input = new Scanner(System.in);
		int applied=1;
		
		for (applied = 1; applied < 100; applied++) {
			System.out.println("How many times did you apply for a credit card?");
			int applied1 = input.nextInt();

			if (applied < 10) {
				System.out.println("No");
				
			} if (applied >= 10) {
				System.out.println("Yes");
				break;
			}
		}
	}

}
