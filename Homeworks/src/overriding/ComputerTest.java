package overriding;

public class ComputerTest {

	public static void main(String[] args) {
		Computer a=new Apple();
		Apple ap=new Apple();
		ap.OS();
	    Computer l=new Lenovo();
		Computer h=new HP();
		Computer d=new Dell();
		Computer[]array={a,l,h,d};
		for(Computer arr:array) {
		      arr.displayInfo(1500, 16, "RTX4060");			
		}
		
		
		
		

	}

}
