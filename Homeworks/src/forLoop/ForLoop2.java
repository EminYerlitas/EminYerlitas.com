package forLoop;

import java.util.Scanner;

public class ForLoop2 {

	public static void main(String[] args) {
		/*
		 * Write a program that asks user to enter his/her username and password until
		 * user enters them correctly.
		 */

		Scanner input = new Scanner(System.in);

		String rusername = "Emin";
		String rpassword = "3452";
		boolean login = true;
		while (login) {
			System.out.println("Enter your username:");
			String username = input.nextLine();
			System.out.println("Enter your password:");
			String password = input.nextLine();
			if (username.equals("Emin") && password.equals("3452")) {
				System.out.println("You are welcome.");
			} else {
				System.out.println("Please try again!");
			}

		}

	}

}
