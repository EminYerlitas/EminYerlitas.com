package stringMethods;

public class TodayisTuesdayyadoTsiyadseuT {

	public static void main(String[] args) {
		/*
		 * Homework 2: Write a program to print out the following conversion: Today is
		 * Tuesday and we have a Java Class!!! to yadoT si yadseuT dna ew evah a avaJ
		 * !!!ssalC. You can use any other string as long as the format is correct.
		 */
        String day = ("Today is Tuesday and we have a Java Class!!!");
        String[] word =day.split(" ");
        for(String a:word) {
        	StringBuffer word2=new StringBuffer(a+" ").reverse();
        	System.out.print(word2);
        }
        
		
		
		
		
	}

}
