package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetofCities {
	/*
	 * Create a Set of cities in which you want to make sure that insertion order is
	 * maintained. Using Iterator remove any city that starts with “A”;
	 * 
	 */

	public static void main(String[] args) {
		Set<String> cities = new LinkedHashSet<>();
		cities.add("Istanbul");
		cities.add("Lisbon");
		cities.add("Ordu");
		cities.add("Tblisi");
		cities.add("Esenler");
		cities.add("Esenler");
		cities.add("Ankara");
		cities.add("Aleppo");
		Iterator<String> ito = cities.iterator();
		while (ito.hasNext()) {
			if (ito.next().startsWith("A")) {
				ito.remove();
			} 
		
		}
		System.out.println(cities);

	}

}
