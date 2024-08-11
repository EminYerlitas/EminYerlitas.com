package interfaces;

/*
 * create an Interface 'Shape' with undefined methods as calculateArea and 
		calculatePerimeter. Create 2 classes Circle & Square that implements 
		functionality defined in the Shape Interface. Test your code.
 */
public interface Shape {
	
	
	double calculateArea();
	double calculatePerimeter();

}
class Circle implements Shape{
	public double radius;
	Circle(double radius){
		this.radius=radius;
	}
	public double calculateArea() {
		return radius*radius*Math.PI;
	}
	public double calculatePerimeter() {
		return 2*radius*Math.PI;
		
	}}
	class Square implements Shape{
		public double side;
		Square(double side){
			this.side=side;
		}
		public double calculateArea() {
			return side*side;
		}
		public double calculatePerimeter() {
			return 4*side;
			
		}
		
		
		
	}
	

	
	
	
	
