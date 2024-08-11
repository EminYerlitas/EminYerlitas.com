package Scanner;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by the user with explanation.
		 */
		Scanner mark = new Scanner(System.in);
		System.out.println("Enter a Grade");
		String grade = mark.nextLine();
		switch (grade) {
		case "A":
			System.out.println("A-Excellent");
			break;
		case "B":
			System.out.println("B-Good");
			break;
		case "C":
			System.out.println("C-Average");
			break;
		case "D":
			System.out.println("D-Bad");
			break;
		default:
			System.out.println("Not Acceptable");

		}

		mark.close();
	}

}
