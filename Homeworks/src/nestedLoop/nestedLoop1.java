package nestedLoop;

import java.util.Scanner;

public class nestedLoop1 {
	public static void main(String[] args) {
		/*
		 * Homework 1:
		 * 
		 * Ask the user to enter an integer and build the following pattern: Hint: Use
		 * scanner, if user entered number 5, there should be 5 rows. In the first row,
		 * 0 spaces, (2 * 5) - 1 stars In the second row, 1 spaces, (2 * 4) - 1 stars In
		 * the third row, 2 spaces, (2 * 3) - 1 stars In the fourth row, 3 spaces, (2 *
		 * 2) - 1 stars In the fifth row, 4 spaces, (2 * 1) - 1 stars
		 *********
		  *******
		   *****
		    ***
		     *
		 * 
		 * 
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		for(int row=num;row>=0 ;row--) {
			for(int space=num-row;space>=0;space--) {
				System.out.print(" ");
				}
			
			
			for(int star=0;star<((row*2)-1);star++) {
				System.out.print("*");
			}
			
			
			System.out.println();
			
		}
		
         		
		
		
		
		
		

	}

}
