package oopintrohomework5;

public class ProductManager {

	public void Add(Product product) {
		
		System.out.println(product.getName()+" added to cart. ");
		System.out.println(product.getNewFeature()+" added to cart. ");
		System.out.println("The " + product.getName() +"'s code is : " + product.getCode());
	}
	
	public void Add2(int id, String name, String description, int stockAmount, double price, String newFeature) {
		
		System.out.println(name+ " added to cart.");
	}
	
}
