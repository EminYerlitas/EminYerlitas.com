package programmingQuestions2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Write a java program to reverse a String? Reverse a string word by word? 1.
		 * Neotech -> hcetoeN 2. I love Java very much -> much very Java love I
		 */
		String str1="Java liku";
		String str2[]=str1.split(" ");
		
		
		
		String reverse="";
		char[] chArray=str2[1].toCharArray();
		for(int i=chArray.length-1;i>=0;i--) {
			char[] chArray2=str2[i].toCharArray();
			reverse+=chArray2[i];
		}
		System.out.println(reverse);
		
		
		
		
		
		
		}

	}


