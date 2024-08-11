package programmingQuestions1;

public class MaxMinSecMax {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array? Maximum
		 * and minimum number in the array? Do it in one iteration.
		 */
      int numbers[]= {2,4,6,8,10};
      int max=0;
      int min=numbers[0];
      int secmax=numbers[0];
      for(int i=0;i<numbers.length;i++) {
    	  if(max<numbers[i]) {
    		  secmax=max;
    		  max=numbers[i];
    	  }
    	  if(min>numbers[i]) {
    		  min=numbers[i];
    	  }
    	 
    	  
    	 
      }
      System.out.println(max);
      System.out.println(min);
      System.out.println(secmax);
	}

}
