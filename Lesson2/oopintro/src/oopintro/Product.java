package oopintro;

public class Product {

	//constructor block in java
	public Product() {
		System.out.println("Ben �al��t�m");
	}
	public Product(int id, String name, double unitPrice, String detail) {
		
		this(); // "Ben �al��t�m" yaz�s� ilk consructordaki parametresiz oldu�undan b�yle �al���yor.
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
