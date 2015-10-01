package main.lunch;

public class MainCourse implements Product {

	private Lunch myLunch;
	private Dessert myDessert;

	public MainCourse(String cuisineName, double lunchPrice, double dessertPrice) {
		myLunch = new Lunch(cuisineName, lunchPrice);
		myDessert = new Dessert(cuisineName, dessertPrice);
	}

	public double getPrice() {
		// TODO Auto-generated method stub

		double finalPrice = 0.0;

		finalPrice += myLunch.getPrice();
		finalPrice += myDessert.getPrice();

		return finalPrice;
	}

	public String getName() {
		// TODO Auto-generated method stub
		String courseName=myLunch.getName()+" "+myDessert.getName();
		
		
		return courseName;
	}
	
	public String toString(){
		StringBuilder result=new StringBuilder();
		
		result.append("lunch name: "+myLunch.getName()+" price: "+myLunch.getPrice());
		result.append(" dessert name: "+myDessert.getName()+" price: "+myDessert.getPrice());
		
		return result.toString();
	}

}
