package hashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapOfContinents {

	public static void main(String[] args) {
		Map<String, String> europe= new TreeMap<>();
		europe.put("Turkiye","Ankara");
		europe.put("Serbia", "Belgrade");
		europe.put("Bosnia", "Sarajevo");
		europe.put("Romania", "Bucharest");
		Map<String, String> asia=new TreeMap<>();
		asia.put("China", "Beijing");
		asia.put("India", "Delhi");
		asia.put("Japan", "Tokyo");
		asia.put("Iran", "Tehran");
		Map<String, String> africa=new TreeMap<>();
		africa.put("Egypt", "Cairo");
		africa.put("Ethiopia", "Addis Ababa");
		africa.put("Morocco", "Rabat");
		africa.put("South African Republic", "Cape Town");
		//HW1 iterate Europe by getting keys
		//HW2 iterate Africa by getting values
		
	for(String europekeys:europe.keySet()) {
		System.out.print(europekeys+" ");
		
	}
	System.out.println("\n"+"=====");
	Collection<String>capitals=africa.values();
	for(String each:capitals) {
		System.out.print(each+" ");
	}
	System.out.println("\n"+"=====");
		List<Map<String, String>>world= new ArrayList<>();
		world.add(europe);
		world.add(asia);
		world.add(africa);
		
		for(Map<String, String>continent:world) {
			
			Set<String>countrynames=continent.keySet();
			
			Iterator<String>ito=countrynames.iterator();
			
			while(ito.hasNext()) {
				String country=ito.next();
			}
			while(ito.hasNext()) {
				System.out.println(" capital is "+continent.get(ito.next()));
			}
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}


