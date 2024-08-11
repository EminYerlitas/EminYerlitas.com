package inheritance;

public class MultilevelInheritanceA {
	/*
	 * Write program for multilevel inheritance where class A is inherited by B and
	 * class B is inherited by class by C.
	 */
	String name, power, enemy;
	int age;

	public void displayInfo() {
		System.out.println(
				"Hero name: " + name + "\n" + "Power: " + power + "\n" + "Enemy: " + enemy + "\n" + "Age: " + age);
	}

	public static void main(String[] args) {
		MultilevelInheritanceA Batman=new MultilevelInheritanceA();
		Batman.name="Bruce Wayne";
		Batman.power="Bat Powers";
		Batman.enemy="Joker";
		Batman.age=40;
		Batman.displayInfo();

	}

}
