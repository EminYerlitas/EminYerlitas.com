package exceptions;

public class CheckUserName {

	public static void main(String[] args) {
		/*
		 * Create a method checkUserNamethat will throw a runtime exception. Method
		 * should throw an exception when the entered username is less than 5
		 * characters.
		 */
	   user("Emin");
 
	}
	public static void user(String username) {
		if(username.length()<5) {
			throw new RuntimeException("Try a longer name than "+username);
			
		}
		else {
			System.out.println(username);
		}
	}

}
