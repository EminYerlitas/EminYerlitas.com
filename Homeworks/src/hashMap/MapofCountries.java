package hashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapofCountries {

	public static void main(String[] args) {
		TreeMap<String, String>countries=new TreeMap();
		countries.put("Romania", "Bucharest");
		countries.put("Turkey", "Ankara");
		countries.put("New Zealand", "Wellington");
		countries.put("Australia", "Canberra");
		countries.put("Albania", "Tirana");
		System.out.println(countries);
		System.out.println(countries.containsKey("Turkey"));
		System.out.println(countries.containsValue("Ankara"));
		Set<String>country=countries.keySet();
		for(String each:country) {
			System.out.println(each+" "+countries.get(each));
		}
		Collection<String>capitals=countries.values();
		Iterator<String>it=capitals.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		

	}

}
