package inheritance;

public class MultilevelInheritanceB extends MultilevelInheritanceA {
	String weakness;
	public void displayInfo2() {
		System.out.println("Weakness: "+weakness);
	}

	public static void main(String[] args) {
		MultilevelInheritanceB Superman=new MultilevelInheritanceB();
		Superman.name="Clark Kent";
		Superman.power="Superhuman Strength";
		Superman.enemy="aliens";
		Superman.age=1500;
		Superman.weakness="Kryptonite";
		Superman.displayInfo();
		Superman.displayInfo2();

	}

}
