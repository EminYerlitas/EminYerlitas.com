package collections;

import java.util.HashSet;
import java.util.Set;

public class SetofStudents {
	/*
	 * Create a Set collection that will hold Objects of Student Type. In this set
	 * we do not care about the insertion order. Each student object should have
	 * name and studentID. Display name of each student.
	 * 
	 */
    String name;
    String studentID;
    SetofStudents(String name, String studentID){
       this.name=name;
       this.studentID=studentID;
    }
	public static void main(String[] args) {
		Set<SetofStudents>students=new HashSet<>();
		SetofStudents a=new SetofStudents("Mert","1");
		students.add(a);
		SetofStudents b=new SetofStudents("Merih","3");
		students.add(b);
		students.add(new SetofStudents("Baris","21"));
		for(SetofStudents each:students) {
			System.out.println(each.name);
			
		}
		
		
		

	}

}
