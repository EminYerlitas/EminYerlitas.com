package nestedLoop;

import java.util.Scanner;

public class nestedLoop2 {

	public static void main(String[] args) {
		/*
		 * Homework 2:
		 * 
		 * Ask the user to enter an integer and build the following pattern: Hint: Use
		 * scanner, if user entered number 5, there should be two parts The first part,
		 * 1 to 5 The second part, 4 to 1 1
		 * 
		 * 1 
		 * 1 2 
		 * 1 2 3 
		 * 1 2 3 4 
		 * 1 2 3 4 5 
		 * 1 2 3 4 
		 * 1 2 3 
		 * 1 2 
		 * 1
		 * 
		 */
     Scanner input=new Scanner(System.in);
     System.out.println("Enter a number");
     int num1=input.nextInt();
     for(int row=1;row<=num1;row++) {
    	 for(int num2=1;num2<=row;num2++){
    		 
    		 System.out.print(num2+" ");
    		 
    		 
    	 }
    	 System.out.println("");
     }
     for(int row2=num1-1;row2>=0;row2--) {
    	 for(int num3=1;num3<=row2;num3++) {
    		 System.out.print(num3+" ");
    	 }
    	 System.out.println("");
     }
     
		
		
		
		
		
	}

}
