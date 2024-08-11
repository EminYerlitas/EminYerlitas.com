package constructor;

public class Constructors1 {
	String heroname, power, enemy;
    int age;

	/*
	 * Write a program that will have 4 different access levels of constructors and
	 * create 3 objects of this class: 1 -inside same class; 2 -from outside the
	 * class; 3 -from different class inside different package and observe result.
	 * 
	 */
	Constructors1(){
		System.out.println("Default");
	}
	public Constructors1(String heroname, String power) {
		System.out.println("Hero name is: "+heroname+"\n"+"Power is:"+power);
		
	}
	protected Constructors1(int age) {
		System.out.println("Age is: "+age);
	}
	private Constructors1(String enemy) {
		System.out.println("Enemy is: "+enemy);
	}
	
	
	

	public static void main(String[] args) {
		Constructors1 spiderman0=new Constructors1("Peter Parker"," Spider powers");
		Constructors1 spiderman1=new Constructors1(25);
		Constructors1 spiderman2=new Constructors1("Green Goblin");
		
		
		
		
		
		
		
		
	}

}
