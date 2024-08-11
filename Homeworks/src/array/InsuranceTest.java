package array;

import java.util.ArrayList;
import java.util.Iterator;

public class InsuranceTest {
	

	public static void main(String[] args) {
		ArrayList <Insurance>ins=new ArrayList<>();
		ins.add(new Car("Toyota"));
		ins.add(new Pet("Dog"));
		ins.add(new Health());
		System.out.println("INDEX FOR LOOP");
		for(int i=0; i<ins.size();i++) {
			Insurance a=ins.get(i);
			a.getQuote();
			a.cancelInsurance();
		}
		
		System.out.println(ins);
		System.out.println("ADVANCED FOR LOOP");
		for(Insurance b:ins) {
			b.getQuote();
			b.cancelInsurance();
			
		}
		System.out.println(ins);
		System.out.println("ITERATOR");
		Iterator<Insurance>it=ins.iterator();
		while(it.hasNext()) {
			Insurance c=it.next();
			c.getQuote();
			c.cancelInsurance();
		}
		System.out.println(ins);
		
		
		

	}

}
 class Health extends Insurance{

	public Health() {
		super.insuranceName = "Blueshield";
		
	}
	public void getQuote() {
		System.out.println("Your quote for "+super.insuranceName+" is $550.");

	}

	public void cancelInsurance() {
		System.out.println("You have cancelled your "+super.insuranceName+" insurance.");

	}
}

