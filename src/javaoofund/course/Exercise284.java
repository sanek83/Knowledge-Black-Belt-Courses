package javaoofund.course;

/**
 * Knowledgeblackbelt Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */

/*
 * Write a method that receives a small integer in base 10 and prints out the
 * original number represented in base 2. For example, giving 8 will print out
 * "1000".
 */
public class Exercise284 {

	public static void getBinary(int num) {
		if (num > 0) { 
			getBinary(num / 2); 												
			System.out.print(num % 2);
		}
	}

	public static void main(String... args) {

		getBinary(8);
		System.out.println();
		getBinary(13);
		System.out.println();
		getBinary(255);
		

	}

}
