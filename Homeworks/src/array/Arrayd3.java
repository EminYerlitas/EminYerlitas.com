package array;

public class Arrayd3 {

	public static void main(String[] args) {
		/*
		 * Homework 1: Create an array of countries: north America countries, south
		 * America countries, Europe countries, Asian countries, African countries. Then
		 * print all values from that array using 2 different loops and calculate how
		 * many total countries been stored.
		 */

		String[][] countries = {{ "USA", "Canada", "Mexico", "Guatemala" },
		 { "Brazil", "Peru", "Argentina", "Chili" },
		 { "Germany", "France", "England", "Poland","Italy","Sweden" },
		 { "China", "Thailand", "India", "Pakistan","Japan" },
		 { "Mali", "Kenya", "Ethiopia", "Morocco" }};
		int sum=0;
		for(int row=0; row<countries.length; row++ ) {
			
			for(int col=0; col<countries[row].length;col++){
				sum++;
				System.out.print(countries[row][col]+" ");
				
			}
			System.out.println();
			
			
		}
		System.out.println("Number of countries are " + sum);
		
		

	}

}
