package de.shureg.kbb.javaoofund.course.Exercise312;
/**
 * Knowledgeblackbelt
 * Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */
public class Main {
	
	public static void goodCustomer(Customer c){
		if (c.isGoodCustomer()){
			System.out.println("Hello " + c.getName());
			if (c.getGender() == 'w'){
				System.out.println("What a nice dress!");
			}else
				System.out.println("Nice to see you again");
		}else{
			System.out.println("Go to hell " + c.getName());
		}
		
		
	}

	public static void main(String[] args) {
		Customer c1 = new Customer (true, "Marie", 'w');
		goodCustomer(c1);
		
		Customer c2 = new Customer (true, "John", 'm');
		goodCustomer(c2);
		
		Customer c3 = new Customer (false, "John", 'm');
		goodCustomer(c3);
		
		Customer c4 = new Customer (false, "Marie", 'w');
		goodCustomer(c4);
	}
}
