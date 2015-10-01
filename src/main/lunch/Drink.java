package main.lunch;

public class Drink implements Product {

	private String name;
	private double price;

	boolean ice;
	boolean lemon;

	public Drink(String name, boolean ice, boolean lemon, double price) {
		this.setName(name);
		this.setIce(ice);
		this.setLemon(lemon);
		this.setPrice(price);

	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	public String getName() {
		// TODO Auto-generated method stub

		
		return name;
	}

	public String toString() {
		StringBuilder result = new StringBuilder();

		result.append("Drink name: " + this.getName() + " with ice: " + this.isIce()
				+ " and with lemon: " + this.isLemon());

		return result.toString();
		
	}

	public boolean isIce() {
		return ice;
	}

	public void setIce(boolean ice) {
		this.ice = ice;
	}

	public boolean isLemon() {
		return lemon;
	}

	public void setLemon(boolean lemon) {
		this.lemon = lemon;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
