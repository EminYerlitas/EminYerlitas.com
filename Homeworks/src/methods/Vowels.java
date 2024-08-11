package methods;



class Vowels {
	 /*
	 * Create a method that will accept a String as a parameter and return a new
	 * String that consist only of vowels. Method should be available inside the
	 * class where it was declared and executed by calling it is name.
	 * 
	 * 
	 */
	private String a(String str0) {
		String str1=str0.replaceAll("[^aeuioAEUIO]", "");
		return str1;
	}
	

	public static void main(String[] args) {
		Vowels str2= new Vowels();
		String str3="ABCDE";
		System.out.println(str2.a(str3));
		
       

	}

	

	

	
	}


