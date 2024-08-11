package declarevariables;

public class DeclareVariables {

	public static void main(String[] args) {

		/*
		 * 1. Create a Java Program (class) and name it DeclareVariables. Create
		 * variables for all 8 primitive Data Types (byte, short, int, long, float,
		 * double, char, boolean). I want you to print out each variable on a separate
		 * line. Try to assign a value outside its range (capacity).
		 */
		byte verysmall = 2;
		short small = 5;
		int usual = 10;
		long big = 15L;
		float verybig = 20.31F;
		double amazing = 35.34;
		char me = 'D';
		boolean iLikedThat = false;
		System.out.println("\n=====\n" + verysmall + "\n" + small + "\n" + usual + "\n" + big + "\n" + verybig + "\n"
				+ amazing + "\n" + me + "\n" + iLikedThat + "\n=====\nE\nM\nI\nN\n=====");
		/*
		 * 2. Create a Java program and name it VariableValues In your program create
		 * variables to store all different types of primitive data. Print the value of
		 * each variable. Update value of each variable. Print the value of each
		 * variable after updating.
		 */
		verysmall = 1;
		small = 3;
		usual = 8;
		big = 25L;
		verybig = 30.31F;
		amazing = 40.34;
		me = 'B';
		iLikedThat = true;
		System.out.println(verysmall + "\n" + small + "\n" + usual + "\n" + big + "\n" + verybig + "\n" + amazing + "\n"
				+ me + "\n" + iLikedThat + "\n=====");
	}

}
