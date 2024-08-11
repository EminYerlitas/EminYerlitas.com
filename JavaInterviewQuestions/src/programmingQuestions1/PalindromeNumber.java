package programmingQuestions1;

public class PalindromeNumber {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to find whether a String is palindrome or not?
		 * Palindrome a word, phrase, or sequence that reads the same backward as
		 * forward. radar yes; baba no; kayak yes; madam yes;
		 */
        String pal="madam";
        String reverse="";
        for(int i=pal.length()-1;i>=0;i--) {
        	reverse+=pal.charAt(i);
        }
        if(pal.equals(reverse)) {
        	System.out.println("Yes");
        }
        else {
        	System.out.println("No");
        }
        
        
        }
        
	}


