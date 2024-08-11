package whiles;

import java.util.Scanner;

public class Username {

	public static void main(String[] args) {
		/*
		 * Write a program that asks user to enter his/her username and password until
		 * user enters them correctly.
		 */

		System.out.println("Enter the Username");
		Scanner name = new Scanner(System.in);
		String username = name.next("Emin");
		System.out.println("Enter the Password");
		Scanner name2 = new Scanner(System.in);

		String password = name2.next("3452");
		boolean isname;

		if (username.equals("Emin") && password.equals("3452")) {
			isname = true;

			while (isname) {
				System.out.println("Login is succesfull");
                break;}
		}
		else {
			System.out.println("Login is not succesfull");
		}
		
	}

}
