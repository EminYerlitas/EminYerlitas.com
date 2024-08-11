package programmingQuestions1;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Write a java program to check whether a given number is prime or not? Check
		 * if a number is divisible by any of smaller numbers. Use the mod operator.
		 */
      int a=42;
     for(int i=2;i<a;i++) {
    	  if(a%i==0) {
    		  System.out.println(a+" is not a prime number");
    		  break;
    	  }
    	  
    		  
    	  }
     if(a==2||a%2!=0&a%3!=0&a%5!=0&a%7!=0) {
    	 System.out.println(a+ " is a prime number");
    	 
     }
     
    	
    	  }
     
    	  
      }
      
		
	


