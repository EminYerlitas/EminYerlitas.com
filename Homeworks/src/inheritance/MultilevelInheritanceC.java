package inheritance;

public class MultilevelInheritanceC extends MultilevelInheritanceB {
	static String speed;
	static void displayInfo3() {
		System.out.println("Speed: "+ speed);
	}

	public static void main(String[] args) {
		MultilevelInheritanceC Flash=new MultilevelInheritanceC();
		Flash.name="Bartholomew Henry";
		Flash.power="Super Speed";
		Flash.enemy="Professor Zoom";
		Flash.age=28;
		Flash.speed="1,750,000,000,000,000,000 miles per second";
		Flash.displayInfo();
		Flash.displayInfo3();
		
		

	}

}
