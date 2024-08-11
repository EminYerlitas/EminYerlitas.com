package array;

public class Array2d4 {

	public static void main(String[] args) {
		/*
		 * Write a java program to find the second largest number in the array? Maximum
		 * and minimum number in the array?
		 * 
		 * 
		 */

		int[] numbers = { 8, 5, 6, 54, 577, 454, 574, 4464, 455, 7863 };

		int maxnum = numbers[0];
		int minum = numbers[0];
		int secmaxnum = numbers[0];
		for (int row : numbers) {
			if (row > maxnum) {
				maxnum = row;

			}

			if (minum > row) {
				minum = row;
			}

		}
		for(int row:numbers) {
			if(row>maxnum) {
				if(maxnum==row) {
					continue;
			}
				maxnum=secmaxnum;
			}
			
		}

		System.out.println(maxnum);
		System.out.println(secmaxnum);
		System.out.println(minum);
	}

}
