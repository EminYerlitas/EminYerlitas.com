package com.neotech.lesson04;

public class RelationalEqualityOperator {

	public static void main(String[] args) {
		System.out.println(6 < 8);
		int a = 6;
		int b = 8;
		System.out.println(a < b);
		System.out.println(a > b);
		int c = 8;
		System.out.println(c = b);
       //assignment operator ===> =
       //relational operator(equal) ==> ==
       //! not   != not equal
		System.out.println(c == b);
		System.out.println(c != b);

	}

}
