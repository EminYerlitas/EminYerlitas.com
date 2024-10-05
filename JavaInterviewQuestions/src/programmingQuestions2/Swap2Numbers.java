package programmingQuestions2;

public class Swap2Numbers {

	public static void main(String[] args) {
		/*
		 * 
		 * Write a program to swap 2 numbers without a temporary variable? Swap 2
		 * strings without a temporary variable? int a = 5; int b = 10; At the end, the
		 * value of b will be 5 and the value of a will be 10. You can add them together
		 * and remove them from each other.
		 */
		int a=5;
		int b=10;
		a=a+b;//a=15
		b=a-b;//b=5
		a=a-b;//a=10
		System.out.println(a);
		System.out.println(b);
		String str1="Java";
		String str2="Selenium";
		str1=str1.concat(str2);//JavaSelenium
		str2=str1.substring(0,4);
		str1=str1.substring(4,str1.length());
		System.out.println(str1+"\n"+str2);
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
