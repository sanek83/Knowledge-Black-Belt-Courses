package javaoofund.sandwich;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author alex
 * @version 0.1
 */
public class Worker {

	private String name;
	private int money;
	private List<Sandwich> sandwiches;

	public List<Sandwich> getSandwiches() {
		return sandwiches;
	}

	public Worker(String name, int money) {
		super();
		this.name = name;
		this.money = money;
		this.sandwiches = new ArrayList<Sandwich>();
	}

	public String getName() {
		return name;
	}

	public int getMoney() {
		return money;
	}

	public void purchase(Sandwich s) {

		if ((s != null) && (s.getOwner() != null)) {
			throw new RuntimeException(
					"Sandwich is already owned by another Worker");
		}

		if (this.money - s.getPrice() < 0) {
			throw new RuntimeException("Budget ist to low!");
		}

		this.sandwiches.add(s);
		s.setOwner(this);
		this.money -= s.getPrice();
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + "]";
	}
}
