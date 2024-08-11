package stringMethods;

public class SundayyadnuS {

	public static void main(String[] args) {
		/*
		 * Homework 1: Create a String and print it in reverse order (Sunday → yadnuS).
		 * Solve it using charAt(), toCharArray() and reverse() methods. Note: for
		 * charAt() and toCharArray() use String for reverse you have to declare a
		 * StringBuffer object
		 */
		String day = "Sunday";
		StringBuffer day2 = new StringBuffer ("Sunday");
		char[] chararray = day.toCharArray();
		
			for (int a = chararray.length - 1; a >= 0; a--) {
				System.out.print(chararray[a]);
				
			}
			System.out.println();
			for(int a=day2.length()-1;a>=0;a--) {
				System.out.print(day2.charAt(a));
				
			}
			
			System.out.println("\n"+day2.reverse());
			


		

	}

}
