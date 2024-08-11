package programmingQuestions1;

public class Fibonacci1 {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 * Fibonacci series: The next number is the sum of two previous numbers You have
		 * to print -> 1,1,2,3,5,8,13,21,34,55...
		 */
	     int a=1;
	     int b=1;
		int k=0;
		System.out.println(1);
    	System.out.println(1);
        while(k<50) {
        	k=a+b;
            System.out.println(k+" ");
        	a=b;
        	b=k;
        	
        }
		
		
		
	}

}
