package DoubleComparison;

public class DoubleComparison {

	public static void main(String[] args) {
		/*
		 * 1. Create a Java program and name it DoubleComparison. Declare 2 double
		 * values and if the value of first the variable is higher then the second,
		 * print “Double value __ is larger than __ .” Otherwise print...
		 */

		double num1 = 52.52;
		double num2 = 34.34;
		if (num1 >= num2)

		{
			System.out.println("Double value " + num1 + " is larger than " + num2);
		}

		else {
			System.out.println("...");
		}
		System.out.println("\n====\n");

		/*
		 * 2. Create a Java program and name it TemperatureCheck. Create a variable to
		 * store temperature. Your program should check if the temperature is below 32
		 * If the temperature is below 32 then it should print
		 * "Water will freeze with temperature __", otherwise should print
		 * "Water will NOT freeze with temperature __".
		 */

		int temperature = 32;
		int temp1 = 31;
		if (temp1 < temperature) {
			System.out.println("Water will freeze with temperature " + temp1);
		} else {
			System.out.println("Water will NOT freeze with temperature" + temp1);
		}

	}

}
