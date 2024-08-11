package overriding;

import java.util.Scanner;

public class CreditCard {
	double interest = 0.5;
    void interest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your balance: ");
		double balance = input.nextDouble();
 	    double rate = balance * interest;
		double newbalance = rate + balance;
		System.out.println("Your new balance is: " + newbalance);
	}
	public static void main(String[] args) {
		CreditCard a = new CreditCard();
		a.interest();
		AX b = new AX();
		b.interest();
		Visa c = new Visa();
		c.interest();
	}
}
class AX extends CreditCard {
	double interest = 1.5;
    void interest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your balance: ");
		double balance = input.nextDouble();
        double rate = balance * interest;
		double newbalance = rate + balance;
		System.out.println("Your new balance is: " + newbalance);
	}
}
class Visa extends CreditCard {
	double interest = 1.8;
    void interest() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your balance: ");
		double balance = input.nextDouble();
        double rate = balance * interest;
		double newbalance = rate + balance;
		System.out.println("Your new balance is: " + newbalance);
	}

}
