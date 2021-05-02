package oopintro;

public class Product {

	//constructor block in java
	public Product() {
		System.out.println("Ben Çalýþtým");
	}
	public Product(int id, String name, double unitPrice, String detail) {
		
		this(); // "Ben çalýþtým" yazýsý ilk consructordaki parametresiz olduðundan böyle çalýþýyor.
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	}

	int id;
	String name;
	double unitPrice;
	String detail;

}
