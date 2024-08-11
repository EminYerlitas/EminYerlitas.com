package practices1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateInt {

	public static void main(String[] args) {
		int[]nums= {0,1,1,2,2,2};
		int target=1;
		System.out.println(searchRange(nums,target));
		
		

	}
	
	
		
public static String searchRange(int[] nums, int target) {
	int array[]=new int[2];
	for(int i=0;i<nums.length-1;i++) {
		if(nums[i]==nums[target]) {
			array[0]=i;
			array[1]=i+1;
			break;
		}
	}
	
	
	
	
	return Arrays.toString(array);
        
    }
	

}
