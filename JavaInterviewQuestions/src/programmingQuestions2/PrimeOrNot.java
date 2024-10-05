package programmingQuestions2;


public class PrimeOrNot {

	public static void main(String[] args) {
		/*
		 * 2. Write a java program to check whether a given number is prime or not?
		 * Check if a number is divisible by any of smaller numbers. Use the mod
		 * operator.
		 */
		boolean prime=true;
		int a=5;
		if(a==2) {
			System.out.println("a is a prime number");
		}
		if(a<2) {
			System.out.println("Enter a number more than 2");
		}
		
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				System.out.println("a is divisible by "+i);
				prime=false;
				break;
			}
			
			else if(a%i!=0) {
				System.out.println("a is a not divisible by "+i);
				prime=true;
				
			}
	
		}
		System.out.println("Is a prime number? "+prime);
		
	}

}
