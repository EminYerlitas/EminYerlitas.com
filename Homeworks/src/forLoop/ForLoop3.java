package forLoop;

public class ForLoop3 {

	public static void main(String[] args) {
		/*
		 * Print numbers from 1 to 50 except those that are divisible by 3.
		 */
		int num = 1;
		for (num = 1; num <= 50 && num >= 1; num++) {
			if (num % 3 != 0) {
				System.out.println(num);
			}
		}
	}

}
