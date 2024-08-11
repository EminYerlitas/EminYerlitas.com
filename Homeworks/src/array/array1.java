package array;

public class array1 {

	public static void main(String[] args) {

		/*
		 * Create an array of cars and store 6 elements into it. Print all values from
		 * the array.
		 * 
		 */
		String[] cars = { "Honda", "Toyota", "Hyundai", "Mercedes", "Subaru", "BMW" };
		System.out.println(cars[0] + " " + cars[1] + " " + cars[2] + " " + cars[3] + " " + cars[4] + " " + cars[5]);

		/*
		 * Create an array on integers and calculate the sum of all elements in an
		 * array.
		 */

		int[] numbers = { 52, 34, 31, 1, 28 };
		System.out.println(numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]);

		/*
		 * Create an array of countries. While retrieving all values from an array
		 * print capital for each country.
		 */
		String[] countries = new String[8];
		countries[0] = "Tbilisi";
		countries[1] = "Baku";
		countries[2] = "Ankara";
		countries[3] = "Skopje";
		countries[4] = "Tirana";
		countries[5] = "Sofia";
		countries[6] = "Kyiv";
		countries[7] = "Astana";
		System.out.println(countries[0] + " " + countries[1] + " " + countries[2] + " " + countries[3] + " "
				+ countries[4] + " " + countries[5] + " " + countries[6] + " " + countries[7]);

	}

}
