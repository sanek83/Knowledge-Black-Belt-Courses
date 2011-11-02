package de.shureg.kbb.javaoofund.course;
/**
 * Knowledgeblackbelt
 * Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */

/*
 * The FizzBuzz Challenge: Display numbers from 1 to x, 
 * replacing the word 'fizz' for multiples of 3, 
 * 'buzz' for multiples of 5 and 'fizzbuzz' for multiples of both 3 and 5.
 */
public class Exercise262 {
	
	public static void main (String...args){
		int x = 100;
		
		for (int i = 1; i <= x; i++){
			if ((i % 3 == 0) && (i % 5 == 0)){
				System.out.print("fizzbuzz ");
			} else if (i % 3 == 0) {
				System.out.print("fizz ");
			}else if (i % 5 == 0){
				System.out.print("buzz ");
			}else{
				System.out.print(i + " ");
			}
			
		}
		
	}

}
