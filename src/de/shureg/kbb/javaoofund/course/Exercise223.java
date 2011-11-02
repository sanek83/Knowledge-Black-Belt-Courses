package de.shureg.kbb.javaoofund.course;
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
public class Exercise223 {
	
	public static void main (String...args){
		int v = 0;
		v++;
		int amount = v++;
		System.out.println(++v + " " + amount); // 3 1
		System.out.println(v);					// 3
		
	}

}
