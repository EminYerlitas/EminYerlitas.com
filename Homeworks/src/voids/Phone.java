package voids;

public class Phone {
	/*
	 * Create a Class "Phone". Create 3 Objects of it: iPhone, Android, Nokia with
	 * specific attributes and behaviors.
	 */

	String name, color;
	Double storage;

	void stores() {
		System.out.println(name + " stores " + storage + " GB");
	}

	void looks() {
		System.out.println(name + " looks " + color);
	}

	public static void main(String[] args) {
		Phone iPhone = new Phone();
		Phone Android = new Phone();
		Phone Nokia = new Phone();
		iPhone.name = "iPhone 14";
		iPhone.color = "Gold";
		iPhone.storage = 128.56;
		Android.name = "Xioami 11T";
		Android.color = "Blue";
		Android.storage = 256.28;
		Nokia.name = "Nokia X20";
		Nokia.color = "Black";
		Nokia.storage = 56.00;
		iPhone.stores();
		iPhone.looks();
		Android.stores();
		Android.looks();
		Nokia.stores();
		Nokia.looks();

	}

}
