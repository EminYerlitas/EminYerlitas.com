package array;

abstract public class Insurance {
	String insuranceName;

	public abstract void getQuote();

	public abstract void cancelInsurance();

}

class Car extends Insurance {
	String carModel;

	public Car(String model) {
		super.insuranceName = "AllState";
		this.carModel = model;
	}
	public void getQuote() {
		System.out.println("Your quote for "+this.carModel+" is $150. ");

	}

	public void cancelInsurance() {
		System.out.println("You have cancelled your "+super.insuranceName+" insurance for "+this.carModel);

	}
}
class Pet extends Insurance{

	String petType;

	public Pet(String Type) {
		super.insuranceName = "healthypaws";
		this.petType = Type;
	}
	public void getQuote() {
		System.out.println("Your quote for "+this.petType+" is $350. ");

	}

	public void cancelInsurance() {
		System.out.println("You have cancelled your "+super.insuranceName+" insurance for "+this.petType);

	}
}
