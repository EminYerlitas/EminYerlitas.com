package overriding;

public class Student {

	public void cheats() {
		System.out.println("Students always cheat.");
	}
	public static void main(String[] args) {
		Student Abuzer = new Student();
		Abuzer.cheats();
		Student Abuzittin = new CollegeStudent();
		Abuzittin.cheats();
		CollegeStudent Abu = (CollegeStudent) Abuzittin;
		Abu.escape();
		
		
	}
}
class NeotechStudent extends Student {
	public void cheats() {
		System.out.println("NeotechStudents never cheat.");
	}

}

class CollegeStudent extends Student {
	public void cheats() {
		System.out.println("CollegeStudents always cheat.");
	}

	public void escape() {
		System.out.println("Let's dip out.");
	}

}

class SchoolStudent extends Student {
	public void cheats() {
		System.out.println("CollegeStudents always cheat.");
	}

}
