package hashMap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class MapofCarModels {

	public static void main(String[] args) {
		
		LinkedHashMap<String,Integer>cars=new LinkedHashMap<>();
		cars.put("Dogan", 5);
		cars.put("Kartal",2);
		cars.put("Renault", 3);
		cars.put("Audi", 4);
		cars.put("Ferrari", 10);
		cars.put("Mercedes", 7);
		System.out.println(cars.size());
		System.out.println(cars);
		System.out.println(cars.replace("Audi",4, 5));
		System.out.println(cars);
		cars.put("Sahin", 12);
		System.out.println(cars);
		System.out.println(cars.get("Ferrari"));
		System.out.println(cars.containsKey("Honda"));
		cars.remove("Mercedes");
		System.out.println(cars.keySet());
		Collection<Integer>numbers=cars.values();
		Iterator<Integer>it=numbers.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
		
		
		

	}

}
