package de.shureg.kbb.javaoofund.course;

/**
 * Knowledgeblackbelt Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */

/*
 * Write a method called reverse, that takes an int as argument 
 * and returns an int. The method reverses the digits of the given number and returns it. 
 * If given 5433, the method returns 3345. 
 * Don't make it too difficult. 
 * Just small positive int's are ok :)
 */
public class Exercise283 {

	public static int reverse(int a) {
		int revertedNum = 0;
		while (a != 0) {
			revertedNum = (revertedNum * 10) + (a % 10);
			a /= 10;
		}
		return revertedNum;

	}

	public static void main(String... args) {

		System.out.println(reverse(1123));
		System.out.println(reverse(12));

	}

}
