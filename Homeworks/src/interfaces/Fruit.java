package interfaces;

public class Fruit {

	public static void main(String[] args) {
		Peelable[] pel = new Peelable[3];
		pel[0] = new Orange();
		pel[1] = new Orange();
		pel[2] = new Apple();
		Fruit o = new Orange();
		Orange or = (Orange) o;
		or.wash();

		for (Peelable p : pel) {
			p.peel();
		}

	}

}

class Orange extends Fruit implements Peelable {

	public void peel() {
		System.out.println("Orange is peelable.");
	}

	public void wash() {
		System.out.println("Orange is washable.");
	}
}

class Apple extends Fruit implements Peelable {

	public void peel() {
		System.out.println("Apple is peelable.");
	}
}

interface Peelable {
	void peel();

}
