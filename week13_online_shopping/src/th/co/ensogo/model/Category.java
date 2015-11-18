package th.co.ensogo.model;

import java.util.ArrayList;

public class Category {
	private int id;
	private String name;
	private ArrayList<Product> productList = new ArrayList<Product>();
	
	// association
	private Category parentCategory;
	
	public Category(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public ArrayList<Product> getProductList() {
		return productList;
	}
	
	public double getTotalPrice() {
		double total = 0;
		for(Product p : productList) {
			total += p.getPrice();					
		}
		return total;
	}
		
	
	public void add(Product p) {
		productList.add(p);
	}

	public Category getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(Category parentCategory) {
		this.parentCategory = parentCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	
}
