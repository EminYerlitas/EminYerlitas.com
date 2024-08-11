package booleanif;

public class GoodMorning {

	public static void main(String[] args) {
		/*
		 * Homework 2: Write a program to implement following logic using if-else
		 * if-else statement: if hour is less than 12 noon, greet with Good Morning if
		 * hour is greater than or equal 12 noon but less than 3 pm, greet with Good
		 * Afternoon if hour is greater than or equal to 3 pm, greet with Good Evening
		 */
		int hour = 20;
		if (hour < 12) {
			System.out.println("Good Morning");
		} else if (hour >= 12 & hour < 15) {
			System.out.println("Good Afternoon");
		} else if (hour < 0) {
			System.out.println("Thats not an hour");
		} else if (hour > 24) {
			System.out.println("Thats not an hour");
		} else {
			System.out.println("Good Evening");
		}

	}


	
	
	
}
