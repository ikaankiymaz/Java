package oopintro;

public class ProductManager {

	// Classlar ikiye ayr�l�r. �zellik tutucu classlar ve 
	// Method tutan classlar yani i� yap�c� classlar.
	// Bunlar� isimlendirme ile ay�r�r�z. Bu class i� yap�c� classt�r.
	
	public void addToCart(Product product) {
		
		System.out.println(product.name+" sepete eklendi.");
		
	}
	
}
