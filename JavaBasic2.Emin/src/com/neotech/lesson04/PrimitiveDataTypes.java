package com.neotech.lesson04;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		double d1 = 3.7;
		System.out.println(d1);
		double d2 = 5;// widening

		// casting happened
		System.out.println(d2);
		// byte,short,int,long,float,double
		// int num=5.0
		int num2 = (int) 6.5;
		// narrowing, manuel casting
		System.out.println(num2);
		byte b1 = (byte) 3131;
		System.out.println(b1);
		long L2 = 5516546510651L;
		int number2 = (int) L2;
		System.out.println(number2);
		int number3 = 250;
		float f1 = (float) number3;
		float f2 = number3;
		//widening example
		
		

	}

}
