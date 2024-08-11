package methodTasks;

public class AnimalKingdom {
	/*
	 * Create a base class Animal with methods like makeSound() and move(). Derive
	 * classes like Dog, Cat, Bird, etc., each overriding makeSound() to produce the
	 * appropriate animal sound and move() to specify how they move.
	 */
	 String sound;
	 String howmoves;
      public void makeSound() {
    	 System.out.println(this.sound);
      }
      public void move() {
    	 System.out.println(this.howmoves);
      }


public static void main(String[]args) {
	  Dog Bolt=new Dog();
	  Bolt.makeSound();
	  Bolt.move(); 
	  
	  
	  
}}
    class Dog extends AnimalKingdom{
    	String sound;
   	    String howmoves;
         public void makeSound() {
       	 System.out.println("How");
         }
         public void move() {
       	 System.out.println("Walks");
         }

         
      }
      
      
      
	
	

