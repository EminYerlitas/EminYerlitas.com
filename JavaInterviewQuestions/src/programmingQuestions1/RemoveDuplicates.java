package programmingQuestions1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * How can you remove all duplicates from ArrayList? You can create a new
		 * ArrayList and add the values one by one, checking if the object exists or
		 * not. You can also use a Set.
		 */
      ArrayList<String>list=new ArrayList<>();
      list.add("a");
      list.add("a");
      list.add("b");
      list.add("b");
      list.add("c");
    System.out.println(list);
      Set<String>set=new HashSet<>();
      set.addAll(list);
      System.out.println(set);
      
       Map<String, Integer>a=new HashMap<String, Integer>();
       a.put("a", 3);
      
       
       
       	}

}
