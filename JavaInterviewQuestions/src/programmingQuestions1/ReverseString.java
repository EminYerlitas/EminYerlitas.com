package programmingQuestions1;
public class ReverseString {

	public static void main(String[] args) {
		/*
		 * Write a java program to reverse a String? Reverse a string word by word? 1.
		 * Neotech -> hcetoeN 2. I love Java very much -> much very Java love I
		 */ String a = "Java";
		 String sentence="I love Java";
		System.out.println(reverse1(a));
		System.out.println(reverse2(a));
		System.out.println(reverse3(a));
		System.out.println(reverseSentence(sentence));
	}

	public static String reverse1(String str) {

		String b = "";
		for (int i = str.length() - 1; i > -1; i--) {
			b += str.charAt(i);
		}
		return b;

	}
	public static String reverse2(String str) {
		String b="";
		char[]array=str.toCharArray();
		for(int i=array.length-1;i>-1;i--) {
			b+=array[i];
		}
		return b;
		
		
	}
	public static StringBuffer reverse3(String str) {
		StringBuffer sb=new StringBuffer(str);
		return sb.reverse();
	}
	public static String reverseSentence(String str) {
	     String[]array=str.split(" ");
	     String b="";
	     for(int i=array.length-1;i>-1;i--) {
	    	 b+=array[i]+" ";
	     }
	     return b;
	     
	}

}
