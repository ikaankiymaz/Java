package oopintro;

public class ProductManager {

	// Classlar ikiye ayrýlýr. Özellik tutucu classlar ve 
	// Method tutan classlar yani iþ yapýcý classlar.
	// Bunlarý isimlendirme ile ayýrýrýz. Bu class iþ yapýcý classtýr.
	
	public void addToCart(Product product) {
		
		System.out.println(product.name+" sepete eklendi.");
		
	}
	
}
