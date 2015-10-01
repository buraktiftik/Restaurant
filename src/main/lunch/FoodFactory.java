package main.lunch;

public class FoodFactory {

	
	public Product getProduct(String productName){
		
		if(productName==null){
			return null;
		}
		
		if(productName.equalsIgnoreCase("Polish")){
			return (new MainCourse("Polish", 20, 10));
		}
		else if(productName.equalsIgnoreCase("Mexican")){
			
			return (new MainCourse("Mexican", 15, 8));
		}
		
		
		else if(productName.equalsIgnoreCase("Italian")){
			
			return (new MainCourse("Italian", 22, 7));
		}
		else if(productName.equalsIgnoreCase("PureCoke")){
			return (new Drink("Coke",false,false,8));
		}
		else if(productName.equalsIgnoreCase("IceCoke")){
			return (new Drink("Coke",true,false,8.5));
		}
		else if(productName.equalsIgnoreCase("LemonCoke")){
			return (new Drink("Coke",false,true,9));
		}
		else if(productName.equalsIgnoreCase("IceLemonCoke")){
			return (new Drink("Coke",true,true,9.5));
		}
		
		else{
			return null;
		}
	}
	
	
}
