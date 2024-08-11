package voids;

public class Dog {
	/*
	 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	 * Labrador, Kangal with specific attributes and behaviors.
	 */
	String name, habitat, enjoy;

	void lives() {
		System.out.println(name + " lives in " + habitat);
	}

	void enjoy() {
		System.out.println(name + " enjoys " + enjoy);
	}

	public static void main(String[] args) {
		Dog Husky = new Dog();
		Dog Bulldog = new Dog();
		Dog Labrador = new Dog();
		Dog Kangal = new Dog();
		Husky.name = "Flurry";
		Bulldog.name = "Rocky";
		Labrador.name = "Joe";
		Kangal.name = "Tarzan";
		Husky.habitat = "Siberia";
		Bulldog.habitat = "apartments";
		Labrador.habitat = "Canada";
		Kangal.habitat = "Sivas";
		Husky.enjoy = "skiing";
		Bulldog.enjoy = "biting";
		Labrador.enjoy = "sitting";
		Kangal.enjoy = "hunting";
		Husky.lives();
		Husky.enjoy();
		Bulldog.lives();
		Bulldog.enjoy();
		Labrador.lives();
		Labrador.enjoy();
		Kangal.lives();
		Kangal.enjoy();
	}

}
