package de.shureg.kbb.javaoofund.course.Exercise311;
/**
 * Knowledgeblackbelt
 * Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */
public class Main {

	public static void main(String[] args) {
		BankAccount johnBa = new BankAccount();
		johnBa.balance = 100;
		johnBa.number = "123-45676890-00";
		
		BankAccount nicolasBa = new BankAccount();
		nicolasBa.balance = 500;
		nicolasBa.number = "555-45676890-55";
		
		BankService.removeMoney(6, johnBa);
		System.out.println(johnBa.balance);
	}
}
