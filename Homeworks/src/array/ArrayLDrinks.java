package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLDrinks {
	
	public static void main(String[] args) {

		ArrayList<String> drinks = new ArrayList<>();
		drinks.add("Ayran");
		drinks.add("Raki");
		drinks.add("Coke");
		drinks.add("Dr. Pepper");
		drinks.add("Gin");
		Iterator<String> dr = drinks.iterator();
		while (dr.hasNext()) {
			String a = dr.next();
			if (a.contains("a") | a.contains("e")) {
				int indexofa = drinks.indexOf(a);
				drinks.set(indexofa, "Water");

			}

		}
		System.out.println(drinks);
		for (String Dri : drinks) {
			if (Dri.contains("a") | Dri.contains("e")) {
				int indexofDri = drinks.indexOf(Dri);
				drinks.set(indexofDri, "Water");

			}
		}
		System.out.println(drinks);

	}

}
