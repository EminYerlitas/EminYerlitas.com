package hashMap;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionofUnique {

	public static void main(String[] args) {
		/*
		 * Create the collection that will store single unique objects of a String type
		 * in which order is preserved. Write a logic to concatenate all string from the
		 * collection.
		 */
		Set<String>coll=new LinkedHashSet<>();
		coll.add("a");
		coll.add("b");
		coll.add("c");
		coll.add("d");
        Iterator<String>it=coll.iterator();
        while(it.hasNext()) {
        	System.out.print(it.next()+" ");
        }
	}

}
