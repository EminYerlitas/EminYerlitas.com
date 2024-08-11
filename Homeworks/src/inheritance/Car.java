package inheritance;

public class Car {
	/*
	 * Write a Java program called Car. Specify features and behaviours of the Car
	 * class. Create SportsCar and FamilyCar subclasses of the Car class with their
	 * own features and behaviours. Next, create a LuxurySportsCar that will inherit
	 * the SportsCar and also will have its own features and behaviours. Create
	 * objects from each class and test them.
	 */
	String make, model;
	int maxspeed;
	public void displayInfo() {
		System.out.println("Make: "+make+"\n"+"Model: "+model+"\n"+"Maxspeed: "+maxspeed);
		
	}

	public static void main(String[] args) {
		Car Toyota=new Car();
		Toyota.make="Toyota";
		Toyota.model="Prius";
		Toyota.maxspeed=120;
        Toyota.displayInfo();
	}

}
