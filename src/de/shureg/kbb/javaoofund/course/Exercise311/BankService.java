package de.shureg.kbb.javaoofund.course.Exercise311;
/**
 * Knowledgeblackbelt
 * Java & OO Fundamentals - Course
 * 
 * @author shureg
 * @version 0.1
 */
public class BankService {
	
	static void removeMoney(double amount, BankAccount ba) {
        ba.balance = ba.balance - amount;
    }

}
