package de.shureg.kbb.javaoofund.course;
/**
 * Knowledgeblackbelt
 * Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */

/*
 * Write a loop that displays numbers from 1 to 100 except multiples of 5. 
 * 50 is an exception: it should be printed.
 */
public class Exercise263 {
	
	public static void main (String...args){

		for (int i = 1; i <= 100; i++){
			if ((i % 5 != 0) || (i == 50)){
				
				if (Integer.toString(i).endsWith("9")){
					System.out.println(i + " ");					
				}else{
					System.out.print(i + " ");
					
				}
			}
		}
		
	}

}
