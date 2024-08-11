package whiles;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		int num3=3;
		
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter first number:");
	    num1=scan.nextInt();
	    System.out.println("Enter second number:");
	    num2=scan.nextInt();
	    System.out.println("Enter third number:");
	    num3=scan.nextInt();
	    int sum=num1+num2+num3;
	    System.out.println("Sum of numbers: "+sum);

	}

}
