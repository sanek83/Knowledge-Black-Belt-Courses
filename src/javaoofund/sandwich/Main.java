package javaoofund.sandwich;

import java.util.ArrayList;
import java.util.List;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Sandwich usa 	= new Sandwich("U.S.A.", 300);
		Sandwich cheese = new Sandwich("Cheese", 350);
		Sandwich ham 	= new Sandwich("Ham", 300);

		Supplement salad = new Supplement("Salad");
		Supplement tomato = new Supplement("Tomato");
		Supplement egg = new Supplement("Egg");
		Supplement corn = new Supplement("Corn");
		
		usa.getComponents().add(salad);
		usa.getComponents().add(tomato);
		cheese.getComponents().add(corn);
		cheese.getComponents().add(tomato);
		ham.getComponents().add(egg);	
		ham.getComponents().add(corn);
		
		Worker marty = new Worker("Marty", 500);
		Worker biff = new Worker("Biff", 1200);
		
		marty.purchase(usa);
		//marty.purchase(cheese);
		
		biff.purchase(ham);
		biff.purchase(cheese);
		//biff.purchase(usa);
		
		
		List<Sandwich> sandwiches = new ArrayList<Sandwich>();
		sandwiches.add(usa);
		sandwiches.add(cheese);
		sandwiches.add(ham);
		
		for(Sandwich s: sandwiches){
			System.out.println(s);
		}
	}

}
