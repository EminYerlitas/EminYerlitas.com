package programmingQuestions1;

public class PalindromeNumber {

	public static void main(String[] args) {
		/*
		 * Write a Java Program to find whether a String is palindrome or not?
		 * Palindrome a word, phrase, or sequence that reads the same backward as
		 * forward. radar yes; baba no; kayak yes; madam yes;
		 */
        String pal="madam";
        isPalindrome1(pal);
        isPalindrome2(pal);
        
        
	}
	public static void isPalindrome1(String str) {
		String reverse="";
		for(int i=str.length()-1;i>-1;i--) {
			reverse+=str.charAt(i);	
		}
		if(reverse.equals(str)) {
			System.out.println(str+" is palindrome");
		}
		else {
			System.out.println(str+" is not palindrome");
		}
	}
	public static void isPalindrome2(String str) {
		boolean isPalindrome=true;
		int lastIndex=str.length()-1;
		for(int i=0;i<str.length()-1;i++) {
			
			if(str.charAt(i)==str.charAt(lastIndex-i)) {
				isPalindrome=true;
			}
			else {
				isPalindrome=false;
			}
		}
		
		System.out.println(str+" is Palindrome: "+isPalindrome);
		
	}



}




