package de.shureg.kbb.javaoofund.course.Exercise311;

public class BankService {
	
	static void removeMoney(double amount, BankAccount ba) {
        ba.balance = ba.balance - amount;
    }

}
