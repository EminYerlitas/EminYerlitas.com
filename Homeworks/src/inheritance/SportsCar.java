package inheritance;

public class SportsCar extends Car {
     public void foryou() {
    	 System.out.println("This car is perfect for you if you like speed.");
     }
     public static void main(String[] args) {
    	 SportsCar ToyotaSupra= new SportsCar();
    	 ToyotaSupra.make="Toyota";
    	 ToyotaSupra.model="Supra";
    	 ToyotaSupra.maxspeed=160;
    	 ToyotaSupra.displayInfo();
    	 ToyotaSupra.foryou();
    	 
    	 
     }

}
