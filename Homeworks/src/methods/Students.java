package methods;

public class Students {
	String studentName;
	int studentID;
	static int numberOfStudents;

	public static void main(String[] args) {
		/*
		 * Create a Class called Students ▪ Create three variables studentName,
		 * studentID and numberOfStudents (should be a static variable) ▪ Create three
		 * objects of the Students Class ▪ Set the value for studentName, studentID and
		 * increment the numberOfStudents for each object ▪ Print out total the number
		 * of students
		 */
		Students student1 = new Students();
		student1.studentName = "Emin";
		student1.studentID = 2002;
		Students.numberOfStudents = 1;
		Students student2 = new Students();
		student2.studentName = "Yaren";
		student2.studentID = 2001;
		Students.numberOfStudents = 2;
		Students student3 = new Students();
		student3.studentName = "Okan";
		student3.studentID = 2000;
		Students.numberOfStudents = 3;
		System.out.println(" Number of Students are: "+ numberOfStudents);

		
	}

}
