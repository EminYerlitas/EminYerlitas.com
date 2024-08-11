package inheritance;

public class FamilyCar extends Car {
	int familymembers;
	public void numberofpersons() {
		System.out.println("We have "+familymembers+" persons in our family.");
	}

	public static void main(String[] args) {
		FamilyCar HyundaiKona= new FamilyCar();
		HyundaiKona.make="Hyundai";
		HyundaiKona.model="Kona";
		HyundaiKona.maxspeed=125;
		HyundaiKona.displayInfo();
		HyundaiKona.familymembers=6;
		HyundaiKona.numberofpersons();
		
		

	}

}
