package de.shureg.kbb.javaoofund.course;

/**
 * Knowledgeblackbelt Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */

/*
 * Given 3 local variables defined as ints, write nested if statements to print
 * them sorted in ascending order. Even if we change the 3 variables' values,
 * they should still be printed in ascending order.
 */
public class Exercise264 {

	public static void main(String... args) {
		int mult = 4;
		int sum = 0;
		
		for (int y = 1; y <= mult; y++) {

			for (int x = 1; x <= mult; x++) {
				sum = sum + x * y;
				if (x == 4) {
					System.out.println(x * y + " = " + sum);
					sum = 0;
				} else {					
					System.out.print(x * y + " ");
				}
			}
		}
	}

}
