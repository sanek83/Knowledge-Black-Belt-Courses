package javaoofund.course;
/**
 * Knowledgeblackbelt
 * Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */

/*
 * Write a method that validates a bank account number. 
 * The validation rule is simple: the last 2 digits are equal 
 * to the rest of the number modulo 97. 
 * Your method returns a boolean.
 * 
 */
public class Exercise282 {
	
	public static boolean isValideAccount (int num){
		return (num/100) % 97 == num%100;
	}
	
	public static void main (String...args){

		System.out.println(isValideAccount(12355));//false
		System.out.println(isValideAccount(11114));//true
		
	}

}
