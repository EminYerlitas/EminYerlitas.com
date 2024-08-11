package Scanner;

import java.util.Scanner;

public class useScanner2 {

	public static void main(String[] args) {
		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */
		System.out.println("Tell me your age.");
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();
		if (age >= 18 && age <= 100) {
			System.out.println("I will issue a driver license to you.");
		} else if (age <= 18 && age >= 0) {
			System.out.println("You need to get a learners permit first.");
		} else if (age > 100) {
			System.out.println("How are you still alive???");
		}

		else {
			System.out.println("Your age is invalid!!!");
		}
		input.close();
	}

}
