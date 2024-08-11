package practices1;

public class Degree {
	/*
	 * Create a class 'Degree' having a method 'getPrerequisite' that prints
	 * "To get a degree you need high school diploma".
	 * 
	 * 
	 * Class 'Degree' has 2 subclasses namely 'Bachelors' and Masters'. In Masters
	 * class override method 'getPrerequisite'. Call the method by creating an
	 * object of each of the three classes.
	 *  
	 * 
	 */
	public void getPrerequisite() {
		System.out.println("To get a degree you need high school diploma");
	}

	public static void main(String[] args) {
		Degree a=new Degree();
		a.getPrerequisite();
		Bachelors b=new Bachelors();
		b.getPrerequisite();
		Masters c=new Masters();
		c.getPrerequisite();
		
		

	}

}
class Bachelors extends Degree{
	public void getPrerequisite() {
		System.out.println("To get a degree you need Bachelors diploma");
	}
	
}
class Masters extends Degree{
	public void getPrerequisite() {
		System.out.println("To get a degree you need Masters diploma");
	}
	
}
