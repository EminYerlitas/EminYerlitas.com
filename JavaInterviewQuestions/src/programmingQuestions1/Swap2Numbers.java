package programmingQuestions1;

public class Swap2Numbers {

	public static void main(String[] args) {
		/*
		 * Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable? int a = 5; int b = 10; At the end, the
		 * value of b will be 5 and the value of a will be 10. You can add them together
		 * and remove them from each other.
		 */
     int a=5;
     int b=10;
     if(b==10) {
    	 b=b-a;
     }
     if(a==5) {
    	 a=a+a;
     }
     System.out.println(a+" "+b);
 	String first="a";
 	String second="b";
 	if(first.equals("a")) {
 		first=second;
 	}
 	if(second.equals("b")) {
 		second=first;
 	}
 	System.out.println(first+second);
     
	}}

	


