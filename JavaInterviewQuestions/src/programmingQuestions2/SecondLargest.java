package programmingQuestions2;

public class SecondLargest {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array? Maximum
		 * and minimum number in the array? Do it in one iteration.
		 */
		int numbers[]={1,2,3,5,4,6,7,9,8};
		int min=numbers[0];
		int max=numbers[0];
		int max2=numbers[0];
		for(int i=0;i<numbers.length;i++) {
			if(max<numbers[i]) {
				max2=max;
				max=numbers[i];
				
			}
			if(min>numbers[i]) {
				min=numbers[i];
				
			}
			
		}
		System.out.println(max+"\n"+max2+"\n"+min);
		

	}

}
