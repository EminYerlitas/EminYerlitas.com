package inheritance;

public class Overloaded3Private {
	/*
	 * Create a class with 3 overloaded private methods. Then call each overloaded
	 * methods with specific arguments and observe the results.
	 */
	private String method(String a) {
		return a;
		
	}
	private String method(String a, String b) {
		return a+b;
		
	}
    private String method(String a, String b, String c) {
    	return a+b+c;
    }
	public static void main(String[] args) {
       
		Overloaded3Private m2=new Overloaded3Private();
		System.out.println(m2.method("I"));
		System.out.println(m2.method("I", " love."));
		System.out.println(m2.method("I", " love", " Java."));
		
		
		
		
		
		
		
	}

}
