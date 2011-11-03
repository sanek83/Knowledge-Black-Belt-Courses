package de.shureg.kbb.javaoofund.course.Exercise312;

public class Customer  {
	
	private boolean isGoodCustomer;
	private String name;
	private char gender;
	
	public Customer(boolean isGoodCustomer, String name, char gender) {
		super();
		this.isGoodCustomer = isGoodCustomer;
		this.name = name;
		this.gender = gender;
	}

	public boolean isGoodCustomer() {
		return isGoodCustomer;
	}

	public String getName() {
		return name;
	}

	public char getGender() {
		return gender;
	}
	

}
