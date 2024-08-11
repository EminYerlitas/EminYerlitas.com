package Scanner;

import java.util.Scanner;

public class useScanner3 {

	public static void main(String[] args) {
		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into Celsius and print
		 * "The temperature is the city __ is __"
		 */
		System.out.println("What is your city?");
		Scanner input1 = new Scanner(System.in);
		String city = input1.nextLine();
		System.out.println("Your city is " + city + " .");
		System.out.println("What is the Fahrenheit in your city?");
		Scanner input2 = new Scanner(System.in);

		double Fahrenheit = input2.nextDouble();
		Fahrenheit = (Fahrenheit - 32) * 5/9;
		System.out.println("Your temperatue is " + Fahrenheit);
		System.out.println("The temperature in " + city + " is " + Fahrenheit + " Celsius.");
		input1.close();
		input2.close();
	}

}
