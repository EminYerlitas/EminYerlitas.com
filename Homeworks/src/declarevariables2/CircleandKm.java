package declarevariables2;

public class CircleandKm {

	public static void main(String[] args) {
		/*
		 * 1. Write a java program to display the area and perimeter of a circle that
		 * has a radius of 5. Use pi = 3. Area = pi * radius * radius Perimeter = 2 * pi
		 * radius
		 */
		int radius = 5;
		int Pi = 3;
		int Area = Pi * radius * radius;
		int Perimeter = 2 * Pi * radius;
		System.out.println("Area of circle is ==> " + Area);
		System.out.println("Perimeter of circle is ==> " + Perimeter);
		System.out.println("\n" + "=====" + "\n");
		/*
		 * 2. Write a java program that converts mile to km and km to miles. Use scale 1
		 * mile = 1.609344. Print the conversion on the console. For example: 10 miles
		 * is 16.09344 kilometers
		 */
		double km = 0.621371;
		double mile = 1.609344;
		double kmtomile = 20 * km;
		double miletokm = 20 * mile;
		System.out.println("20 km is ==> " + kmtomile + " mile");
		System.out.println("20 mile is ==> " + miletokm + " km");
	}

}
