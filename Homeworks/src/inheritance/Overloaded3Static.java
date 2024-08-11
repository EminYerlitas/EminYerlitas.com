package inheritance;

public class Overloaded3Static {
	/*
	 * Create a class with 3 overloaded static methods. Then call each overloaded
	 * methods with specific arguments and observe the results.
	 */
	protected static int method(int a) {
		return a;

	}

	protected static int method(int a, int b) {
		return a-b;
	}

	protected static double method(double c, double d) {
		return c*d;
	}

	public static void main(String[] args) {
		int a=5;
		int b=10;
		double c=5.0;
		double d=10.0;
		
	
		System.out.println(method(a));
		System.out.println(method(a,b));
		System.out.println(method(c,d));
		

	}

}
