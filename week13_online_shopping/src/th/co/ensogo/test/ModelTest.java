package th.co.ensogo.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import th.co.ensogo.model.*;

public class ModelTest {

	@Test
	public void test1() {
		Category dinning = new Category(1, "Dinning");
		Category health = new Category(2, "Health and Beauty Service");
		Category travel = new Category(3, "Travel");
			
		dinning.add(new Product(1, "The Chinese Restaurant (Buffet) @ Dusit Princess Srinakarin", 485));		
		dinning.add(new Product(2, "Preecha Seafood Rama 3", 500));
		
		health.add(new Product(1,"MS Clinic",199));
		health.add(new Product(2,"Kalm SPA",690));
		
		travel.add(new Product(1, "Mode Sathorn Hotel Bangkok",2222));
		travel.add(new Product(2, "Oriental Beach Pearl Hua-hin",1590));
		
		ArrayList<Category> catalogue = new ArrayList<Category>();
		catalogue.add(dinning);
		catalogue.add(health);
		catalogue.add(travel);
		
		for(Category c : catalogue) {
			System.out.println( "[" + c.toString() + "]");	
			
			ArrayList<Product> list = c.getProductList();	// write getProductList()
			for(Product p : list) {
				System.out.println( "\t" + p.toString() );			// write toString()
			}
			
			System.out.println( "\t:: Total Price: "+c.getTotalPrice() );			
		}
		
		System.out.println("Total number of product = ");
		System.out.println("Total value of the catalogue = ");
	}

}
