package practices1;

import java.util.Arrays;
import java.util.Scanner;

public class A1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
		    
		    //TODO: write your code below
		    int temp = nums[0];
		    nums[0] = nums[nums.length-1];
		    nums[nums.length-1] = temp;
		    
		      int count2=nums.length/2;
		      int count=nums.length-1;
		 for(int i=1; i<nums.length;i++){
		   
		    count--;
		     nums[i]=nums[count];
		     if(count==nums.length/2){
		        break;

		      }
		   
		     }
		    for(int i2=nums.length-1;i2>1;i2--){

		        count2++;
		        nums[i2]=nums[count2];
		    if(count2==nums.length-1){
		      continue;

		    }}

		   
		 



		      //Do not change below statement:
		    System.out.println(Arrays.toString(nums));

	}

}
