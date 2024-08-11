package hashMap;

import java.util.HashMap;

public class BuldingHashMap {
	/*
	 * Create a map of a building. Store floor number and its associated company
	 * name. (Example: 1=Google, 2=Apple, 3=Neotech etc..). Insert 5 entries with
	 * duplicate keys and values. - Check how many entries you have? - Update
	 * company on a 4th floor - Remove company on the 3th floor - Print your map
	 */

	public static void main(String[] args) {
		
		HashMap<Integer,String>building=new HashMap<>();
		building.put(1, "Mice");
		building.put(2, "Red");
		building.put(3, "Inca");
		building.put(4, "Portal");
		System.out.println(building.size());
		building.put(4, "Portakal");
		building.remove(3);
		System.out.println(building);
		
		

	}

}
