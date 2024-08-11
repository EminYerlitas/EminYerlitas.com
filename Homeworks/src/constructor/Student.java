package constructor;

public class Student {
	/*
	 * Write program as a Student class that has instance variables name and
	 * address. Create a constructor that will initialize those variables. Print
	 * name & address of given student using displayInfo method.
	 * 
	 */
	String name, address;
	Student(){
		
	}
	Student(String name,String address){
		this.name=name;
		this.address=address;
		
		
	}
	void displayInfo() {
		System.out.println(name+"\n"+address);
	}
	

	public static void main(String[] args) {
		Student ben= new Student();
		ben.name="Emin";
		ben.address="Home";
		ben.displayInfo();
		
		

	}

}
