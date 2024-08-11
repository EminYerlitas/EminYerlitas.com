package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLEvenN {
	/*
	 * Create an arrayList of even numbers from 1 to 50. Using Iterator remove any
	 * number that is divisible by 5 from that arrayList.
	 * 
	 */

	public static void main(String[] args) {
		ArrayList<Integer>numbers=new ArrayList<>();
		for(int i=0;i<=50;i++) {
			if(i%2==0) {
			numbers.add(i);}
			
		}
		Iterator<Integer>five=numbers.iterator();
		while(five.hasNext()) {
			int a=five.next();
			if(a%5==0) {
				five.remove();
				
				
			}
			
		}
		System.out.println(numbers);
		

	}

}
