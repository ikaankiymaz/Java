package oopintro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product("Lenovo V14",1,15000,"32 GB RAM",10); // Örnek oluþturma, referans oluþturma , instance creation

		Product product2 = new Product(); // Örnek oluþturma, referans oluþturma , instance creation
		product2.setName("Lenovo L340");
		product2.setId(2);
		product2.setDetail("16 GB RAM");
		product2.setDiscount(10);
		product2.setUnitPrice(12000);
		
		System.out.println(product1.getUnitPriceAfterDiscount());
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Ýçecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Yiyecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		
		
//		Product product3 = new Product(); // Örnek oluþturma, referans oluþturma , instance creation
//		
//		
//		/* CLASSLAR REFERANS TÝPÝDÝR. */
//		Product[] products = {product1,product2,product3};
//		
//		for (Product product : products) {
//			
//			System.out.println(product.name);
//		}
//		
////		System.out.println(products.length);
//		
//		Category category1 = new Category();
//		category1.id = 1;
//		category1.name = "Bilgisayar";
//		
//		Category category2 = new Category();
//		category2.id = 2;
//		category2.name = "Telefon";
//		
//		Category category3 = new Category();
//		category3.id = 3;
//		category3.name = "Ev/Bahçe";
//		
//		Category[] categories = {category1,category2,category3};
//		
//		for (Category category : categories) {
//			
//			System.out.println(category.name);
//		}
//		
//		ProductManager productManager = new ProductManager();
//		
//		productManager.addToCart(product1);
//		
//		productManager.addToCart(product2);
//		
//		productManager.addToCart(product3);
		
	}
}
