package th.co.ensogo.model;

public class Product {
	private int id;			// r
	private String name;	// rw
	private double price;	// rw
	
	// association
	private Category category;	// rw
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return name + ", " + price;
	}
	
	public int getId() { return id; }
	public String getName() { return name; }
	public double getPrice() { return price; }
	public Category getCategory() { return category; }
	
	public void setName(String n) { name = n; }
	public void setPrice(double p) { price = p; }
	public void setCateogry(Category c) { category = c; }
	
}
