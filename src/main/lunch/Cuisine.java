package main.lunch;

public abstract class Cuisine implements Product{

	private String name;
	private double price;
	
	
	
	
	
	
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
