package inheritance;

public class Shape {
	/*
	 * Write program: Shape class has a constructor that takes the radius and has a
	 * subclass as Circle class. In Circle class create a method to calculate the
	 * area of circle. Test your code
	 */
	double radius;
	Shape(double radius){
		this.radius=radius;
	}

	public static void main(String[] args) {

	}

}
class Circle extends Shape{
	Circle(double radius) {
		super(radius);
		
	}
    double pi=3.14;
	double area;
	public void area() {
		System.out.println(area=pi*radius*radius);
	}
	public static void main(String[] args) {
		Circle a = new Circle(5.0);
		a.area();
		

	}
	
	
}
