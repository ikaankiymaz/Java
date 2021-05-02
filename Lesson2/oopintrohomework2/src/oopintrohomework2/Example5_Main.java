package oopintrohomework2;

public class Example5_Main {

	public static void main(String[] args) {
		
		Example5_Product product1 = new Example5_Product(1,"Laptop","Lenovo L340 Gaming Laptop",8900,7,"Blue");
		
//		Example5_Product product1 = new Example5_Product();
//		product1.setName("Laptop");
//		product1.setId(1);
//		product1.setPrice(8900);
//		product1.setDescription("Lenovo L340 Gaming Laptop");
//		product1.setStockAmount(7);
//		product1.setColour("Blue");
		
		Example5_ProductManager productManager1 = new Example5_ProductManager();
		productManager1.Add(product1);
		
		System.out.println(product1.getName());
		System.out.println(product1.getCode());
		
	}

}
