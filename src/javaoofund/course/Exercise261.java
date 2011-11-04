package de.shureg.kbb.javaoofund.course;
/**
 * Knowledgeblackbelt
 * Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */

/*
 * Given 3 local variables defined as ints, write nested if statements to print them sorted in ascending order. 
 * Even if we change the 3 variables' values, they should still be printed in ascending order.
 */
public class Exercise261 {
	
	public static void main (String...args){
		int a = 12;
		int b = 34;
		int c = 6;
		if ((a < b) && (a < c)) { //a smallest
			System.out.println(a);
			if ( b < c){
				System.out.println(b);
				System.out.println(c);
			}
			if ( b > c){ 
				System.out.println(c);
				System.out.println(b);
			}
		}else if((b < a) && (b < c)){//b smallest
			System.out.println(b);
			if ( a < c){
				System.out.println(a);
				System.out.println(c);
			}
			if ( a > c){ 
				System.out.println(c);
				System.out.println(a);
			}
		}else if((c < a) && (c < b)){//c smallest
			System.out.println(c);
			if ( b < a){
				System.out.println(b);
				System.out.println(a);
			}
			if ( b > a){ 
				System.out.println(a);
				System.out.println(b);
			}
		}
		
	}

}
