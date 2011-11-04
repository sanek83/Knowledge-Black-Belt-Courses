package javaoofund.sandwich;

import java.util.List;

public class Sandwich {

	private String name;
	private List<String> components;
	private int price;
	
	public Sandwich(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	} 
	
	public boolean addComponents(String component){
		return components.contains(component)? false: components.add(component)&&true;
	}
}
