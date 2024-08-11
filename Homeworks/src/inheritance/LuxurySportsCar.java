package inheritance;

public class LuxurySportsCar extends SportsCar {
     double cost;
     public void cost1() {
    	 System.out.println("If you have "+cost+"k you are rich.");
     }

	public static void main(String[] args) {
		LuxurySportsCar FerrariRoma= new LuxurySportsCar();
		FerrariRoma.make="Ferrari";
		FerrariRoma.model="Roma";
		FerrariRoma.maxspeed=210;
		FerrariRoma.displayInfo();
		FerrariRoma.foryou();
		FerrariRoma.cost=280.000;
		FerrariRoma.cost1();
				

	}

}
