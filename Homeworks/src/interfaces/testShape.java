package interfaces;

public class testShape {

	public static void main(String[] args) {

		Circle c = new Circle(5);
		c.calculateArea();
		c.calculatePerimeter();
		Square s = new Square(5);
		s.calculateArea();
		s.calculatePerimeter();

	}

}
