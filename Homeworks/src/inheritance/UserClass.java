package inheritance;

public class UserClass {
	/*
	 * Write program: UserClass that has a constructor that initializes instance
	 * variable name and mobile number. Create a subclass UserInfo that will have
	 * user address variable and it also being initialized through constructor call.
	 * Print users name, mobile number and address in userDetails method. Test your
	 * code.
	 * 
	 */
	String name;
	int mobilenumber;

	public UserClass(String name, int mobilenumber) {
        this.name=name;
        this.mobilenumber=mobilenumber;
	}
	public static void main(String[] args) {
		
	}
	
}

 class UserInfo extends UserClass {
	String address;

	UserInfo(String name, int mobilenumber, String address) {
		super(name, mobilenumber);
		this.address=address;
		
	}
	void userDetails() {
		System.out.println(name+mobilenumber+address);
	}
	public static void main(String[] args) {
		UserInfo u1=new UserInfo("Emin ",541," N Ridge");
		u1.userDetails();
      
	}

	

}
