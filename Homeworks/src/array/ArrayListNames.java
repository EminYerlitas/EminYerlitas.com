package array;

import java.util.ArrayList;

/*
 * Create a ArrayList that will store 5 names into it.▪ Find out whether the given ArrayList is empty or not?
▪ Check whether the specific name is present in an ArrayList or not?
▪ Find the size of your ArrayList and print all values from the ArrayList

 */

public class ArrayListNames {

	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<>();
		names.add("Caesar");
		names.add("Augustus");
		names.add("Maximus");
		names.add("Nero");
		names.add("Marcus");
		System.out.println(names.isEmpty());
		System.out.println(names.contains("Tiberius"));
		System.out.println(names.size());
		System.out.println(names);
		
		
		
		

	}

}
