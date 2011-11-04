package javaoofund.course;
/**
 * Knowledgeblackbelt
 * Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */

/*
 * Predict the result of the following code. What will be printed?
 * Then execute that code on your computer to verify your prediction.
 */
public class Exercise227 {
	
	public static void main (String...args){
		boolean canITakeHisMoney;
		int hisBalance = 5;
		long myBalance = 4;
		hisBalance += 8;
		canITakeHisMoney = hisBalance > myBalance; 					// true
		canITakeHisMoney = canITakeHisMoney && (hisBalance >= 3); 	// true && true
		System.out.println(canITakeHisMoney);						// true
		
	}

}
