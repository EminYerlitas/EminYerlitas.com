package booleanif;

public class Allergy {

	public static void main(String[] args) {
		/*
		 * Homework 1:
		 * 
		 * Write a java program to check if a patient has allergies. If the patient does
		 * not have allergies print "You’re healthy!". If the patient has allergies,
		 * check if it is a peanut allergy, lactose allergy, bee allergy or seafood
		 * allergy and print a statement telling the patient "Don’t eat ___". (fill the
		 * line with the food names – peanut, seafood etc.)
		 */
		boolean noallergie = false;
		boolean peanutallergy = true;
		boolean lactoseallergy = true;
		boolean beeallergy = true;
		boolean seafoodallergy = true;
		if (noallergie) {
			System.out.println("You’re healthy!");
		}
		if (peanutallergy) {
			System.out.println("Don’t eat peanutallergy");
		}
		if (lactoseallergy) {
			System.out.println("Don’t eat lactoseallergy");
		}
		if (beeallergy) {
			System.out.println("Don’t eat beeallergy");
		}
		if (seafoodallergy) {
			System.out.println("Don’t eat seafoodallergy");
		

		} 
		}}
