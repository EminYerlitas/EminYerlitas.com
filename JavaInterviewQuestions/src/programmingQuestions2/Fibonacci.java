package programmingQuestions2;

import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to print the first 10 numbers of Fibonacci series.
		 * Fibonacci series: The next number is the sum of two previous numbers You have
		 * to print -> 1,1,2,3,5,8,13,21,34,55...
		 */
		int a=1;
		int b=1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<10;i++) {
			b=a+b;
			a=b-a;
		System.out.print(b+" ");	
		}
		
		System.out.println("\n"+"=======");
		int arr[]=new int[31];
		arr[0]=1;
		arr[1]=1;
		for(int i=2;i<arr.length;i++) {
			arr[i]=arr[i-1]+arr[i-2];
			
		}
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
