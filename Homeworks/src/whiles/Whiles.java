package whiles;

public class Whiles {

	public static void main(String[] args) {
		// print only even numbers from 1 to 50

		int number =1;
		while (number <= 50 && number >= 1) {
			if (number % 2 == 0)
				System.out.println(number);
			number++;
			
		}
	}

}
