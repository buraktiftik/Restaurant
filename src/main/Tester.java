package main;

import main.lunch.FoodFactory;
import main.lunch.Product;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Example Test Data");
		System.out.println();

		Product myProduct;

		FoodFactory myFactory = new FoodFactory();

		myProduct = myFactory.getProduct("Polish");

		System.out.println("Name of product is: " + myProduct.getName()
				+ " Price of product is: " + myProduct.getPrice());
		System.out.println(myProduct);
		System.out.println();

		myProduct = myFactory.getProduct("Mexican");

		System.out.println("Name of product is: " + myProduct.getName()
				+ " Price of product is: " + myProduct.getPrice());
		System.out.println(myProduct);
		System.out.println();

		myProduct = myFactory.getProduct("Italian");

		System.out.println("Name of product is: " + myProduct.getName()
				+ " Price of product is: " + myProduct.getPrice());
		System.out.println(myProduct);
		System.out.println();

		myProduct = myFactory.getProduct("PureCoke");

		System.out.println("Name of product is: " + myProduct.getName());
		System.out.println(myProduct);
		System.out.println("Price of product is:" +myProduct.getPrice());
		System.out.println();

		myProduct = myFactory.getProduct("IceCoke");

		System.out.println("Name of product is: " + myProduct.getName());
		System.out.println(myProduct);
		System.out.println("Price of product is:" +myProduct.getPrice());
		System.out.println();

		myProduct = myFactory.getProduct("LemonCoke");

		System.out.println("Name of product is: " + myProduct.getName());
		System.out.println(myProduct);
		System.out.println("Price of product is:" +myProduct.getPrice());
		System.out.println();

		myProduct = myFactory.getProduct("IceLemonCoke");
		System.out.println("Name of product is: " + myProduct.getName());
		System.out.println(myProduct);
		System.out.println("Price of product is:" +myProduct.getPrice());
		System.out.println();

	}

}
