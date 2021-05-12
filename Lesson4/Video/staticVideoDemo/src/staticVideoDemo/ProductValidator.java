package staticVideoDemo;

public class ProductValidator {

//	static{
//		System.out.println("Static yapici blok calisti.");
//	}

	public ProductValidator() {
		System.out.println("Yapici blok calisti.");
	}

	public static boolean isValid(Product product) {

		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}

	public void bisey() {
		System.out.println("Bisey");
	}

//	// Ýnner Class
//	public static class BaskaBirClass(){
//
//		public static void Sil() {
//
//		}
//	}

}
