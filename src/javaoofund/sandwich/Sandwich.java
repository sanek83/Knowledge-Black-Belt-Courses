package javaoofund.sandwich;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Sandwich {

	private String name;
	private List<Supplement> components;
	private int price;
	
	private Worker owner;
	
	public Sandwich(String name, int price) {
		super();
		this.name = name;
		this.price = price;
		
		this.components = new ArrayList<Supplement>();
	}

	public String getName() {
		return name;
	}

	public List<Supplement> getComponents() {
		return components;
	}

	public int getPrice() {
		return price;
	}

	public Worker getOwner() {
		return owner;
	}

	public void setOwner(Worker worker) {
		this.owner = worker;		
	}

	@Override
	public String toString() {
		return "Sandwich [name=" + name + ", supplement=" + components
				+ ", price=" + price + ", owner=" + owner + "]";
	} 
	
	
	
	
}
