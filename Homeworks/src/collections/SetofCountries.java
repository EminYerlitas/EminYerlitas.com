package collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetofCountries {
	/*
	 * Create a Set collection in which you need to add names of the countries. In
	 * this set we want all objects to be sorted in alphabetical order. Using 2
	 * different ways retrieve all elements from set.
	 */

	public static void main(String[] args) {
		Set<String>countries=new TreeSet<>();
		countries.add("Turkiye");
		countries.add("Portugal");
		countries.add("Georgia");
		countries.add("Czech Republic");
		countries.add("Turkiye");
		for(String each:countries) {
			System.out.print(each+" ");
		}
		Iterator<String>it=countries.iterator();
        System.out.println();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}

}
