package voids;

import java.util.Scanner;

public class Student {
	/*
	 * Create a class Student that will have a method getGrade. Your method should
	 * accept the score of a student and return a grade: score > 90 - A score > 80 -
	 * B score > 70 - C score > 50 - D anything else - F
	 */
	int b;

	int grade(int a) {
		if (a >= 90 && a <= 100) {
			System.out.println("A score is ");
		} else if (a >= 80 && a < 90) {
			System.out.println("B score is ");
		} else if (a >= 70 && a < 80) {
			System.out.println("C score is ");
		} else if (a >= 50 && a < 70) {
			System.out.println("D score is ");
		} else if (a < 50 && a >= 0) {
			System.out.println("F score is ");
		} else {
			System.out.println("Score is invalid!!!");

		}

		return a;

	}

	public static void main(String[] args) {
		System.out.println("Enter your grade");
		Scanner scan = new Scanner(System.in);
		Student score = new Student();
		score.b = scan.nextInt();
		System.out.println(score.grade(score.b));
        scan.close();
	}


}
