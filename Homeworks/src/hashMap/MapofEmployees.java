package hashMap;

import java.util.HashMap;
import java.util.Map;

public class MapofEmployees {

	public static void main(String[] args) {
		/*
		 * Homework 1: Create a Map that will store Employee name and salary. Write a
		 * logic to retrieve an employee who gets the highest salary. Output should be
		 * in the below format - John Smith=$100000
		 */
		Map<String, Integer>employee=new HashMap<>();
		employee.put("Emin", 10);
		employee.put("Emir", 15);
		employee.put("Emrah", 20);
		employee.put("Engin", 25);
		int highestsalary=0;
		String emp=null;
		for(Map.Entry<String, Integer> ent:employee.entrySet()) {
			if(ent.getValue()>highestsalary) {
				highestsalary=ent.getValue();
				emp=ent.getKey();
			}
		}
		System.out.println(emp+" = $"+highestsalary);

		
		
		
		
		
	}

}
