package array;

public class Array2d2 {

	public static void main(String[] args) {
		/*
		 * 2. Create a 2D array that first row will contain 4 names and second row will
		 * contain grades, all Strings. Then you program should print name of the
		 * students that has A and B grade
		 */
         String[][] students = {
        		 {"Jake","Justin","Jennifer","Joe"},
        		 {"A", "B", "C", "D"}
         };
		System.out.print(students[1][0]+" "+students[0][0]);
		
		
		
	}

}
