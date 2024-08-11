package programmingQuestions1;

import java.util.Arrays;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Write a java program to reverse a String? Reverse a string word by word? 1.
		 * Neotech -> hcetoeN 2. I love Java very much -> much very Java love I
		 */
      String a="Neotech";
      StringBuffer b=new StringBuffer(a);
      System.out.println(b.reverse());
      String neo="I love Java very much";
      String[]arrayn=neo.split(" ");
      String[]array=new String[arrayn.length];
      for(int i=0;i<arrayn.length;i++) {
    	  array[i]=arrayn[arrayn.length-i-1];
    	  
      }
      System.out.println(Arrays.toString(array));
		
	}

}
