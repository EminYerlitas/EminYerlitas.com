package interfaces;
public class Registration {
	private String email, userName, password;
	public void setEmail(String email) {
		if(!email.isEmpty()&email.contains("@yahoo")) {
			this.email=email;
			System.out.println(email);
			
		}
		else {
			System.out.println("Not valid email.");
		}
			
	}
	public String getEmail() {
		return email;
	}
	
	public void setuserName(String userName) {
		if(!userName.isEmpty()&userName.length()>=6) {
			this.userName=userName;
			System.out.println(userName);
			
		}
		else {
			System.out.println("Not valid userName.");
		}
		
	}
	
	public String getuserName() {
		return userName;
	}
	public void setpassword(String password) {
	  
		if(!password.isEmpty()&password.length()>=6&!password.equals(userName)) {
			this.password=password;
			System.out.println(password);
			
		}
		else {
			System.out.println("Not valid password.");
		}
		
	}
	public String getpassword() {
		return password;
	}
	

	

}
