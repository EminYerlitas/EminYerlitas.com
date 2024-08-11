package stringMethods;

import java.util.Scanner;

public class BoyOrGirlString {

	public static void main(String[] args) {
		/*
		 * 
		 * Homework 2: Write a program that reads two parent's first names and if they
		 * expecting boy or girl? Based on the input suggests a name for a baby: If it
		 * is a boy get half from dad and half from mom. If it is a girl get half from
		 * mom and half from dad.
		 * 
		 * Example Output: Mom's first name? Mary Dad's first name? Daniel Boy or Girl?
		 * boy Suggested baby name: DANRY Example Output: Mom's first name? Mary Dad's
		 * first name? Daniel Boy or Girl? girl Suggested baby name: MAIEL
		 */
		
		Scanner input=new Scanner(System.in);
		System.out.println("Mom's name?");
		String momname=input.next();
		System.out.println("Dad's name?");
		String dadname=input.next();
		System.out.println("Boy or Girl?");
		String boyorgirl=input.next();
		int middlemom=momname.length()/2;
		int middledad=dadname.length()/2;
		String boyname= dadname.substring(0, middledad)+momname.substring(middlemom);
		String girlname = momname.substring(0, middlemom)+dadname.substring(middledad);
		if(boyorgirl.equalsIgnoreCase("boy")) {
			System.out.println(boyname.toUpperCase());
			
		}
		else if(boyorgirl.equalsIgnoreCase("girl")) {
			System.out.println(girlname.toUpperCase());
		}
		else {
			System.out.println("Not valid gender.");
		}
		input.close();
		

		
		

	}

}
