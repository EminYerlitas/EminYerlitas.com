package hashMap;

import java.util.ArrayList;
import java.util.List;

public class CollectionofInt {

	public static void main(String[] args) {
		/*
		 *  Create a collection of integers in which you can keep duplicates. 
            Write a logic to find sum of all integers*/
       List<Integer>num=new ArrayList<>();
       num.add(10);
       num.add(15);
       num.add(10);
       num.add(25);
       int sum=0;
       for(int a:num) {
    	   sum+=a;
       }
       System.out.println(sum);
       
	}

}
