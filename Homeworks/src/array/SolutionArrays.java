package array;

import java.util.Scanner;

public class SolutionArrays {

	public static void main(String[] args) {
		// HW1 - Solution
		// Create the array (String[][] names)
		// Fill the array
		// Print the array
		Scanner scan = new Scanner(System.in);
		System.out.println("How many rows do you need?");
		int rows = scan.nextInt();

		System.out.println("How many columns do you need?");
		int cols = scan.nextInt();
		String[][] array=new String[rows][cols];
		for(String[] rows1:array) {
			for(String rows2:rows1) {
				System.out.println(array+" ");
			}
			System.out.println();
			
		}
		
		

	}

}
