package voids;

public class Teacher {
	/*
	 * 
	 * // Create a class of Teacher // String name, double salary, String subject //
	 * teach(), yellAtStudent()
	 */
	String name, subject, me;
	Double salary;

	void teach() {
		System.out.println(name + " teaches.");
	}

	void yellAtStudent() {
		System.out.println(name + " yells at student.");
	}

	String salary() {
		if (salary > 200.00) {
			System.out.println("You are rich " + name);
			return name;
		}
		if (salary < 200.00 && salary > 100.000) {
			System.out.println("You are poor " + name);
			return name;
		} else {
			System.out.println("That's me:(");
			return me;
		}

	}

	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.name = "Elion";
		t.subject = "Java";
		t.salary = 205.500;
		t.teach();
		t.yellAtStudent();
		t.salary();

	}

}
