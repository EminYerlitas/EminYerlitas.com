package voids;

public class Student2 {
	int StudentNr, gradeLevel;
	String name;
	void study() {
   	  System.out.println(name+ " studies.");
     }
     void sleep() {
    	 System.out.println(name+ " sleeps.");
     }
	public static void main(String[] args) {
		/*
		 * // HW2 - Solution // Create a class of Student // int studentNr, String name,
		 * int gradeLevel // study(), sleep()
		 */
		Student2 Student=new Student2();
		Student.name="Joe";
		Student.sleep();
		Student.study();
		
		
		

	}

}


