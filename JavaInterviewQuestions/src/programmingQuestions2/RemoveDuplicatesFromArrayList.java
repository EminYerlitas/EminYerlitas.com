package programmingQuestions2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

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
		list.add("c");
		Set<String>list2=new HashSet<>();
		list2.addAll(list);
		System.out.println(list2);
		
		
		

	}

}
