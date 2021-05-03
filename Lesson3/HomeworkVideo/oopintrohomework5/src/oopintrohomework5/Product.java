package oopintrohomework5;

public class Product {

	// Consructor, Maindeki new Product(); dedigimizde cagirdigimiz yer burasidir.
	public Product(int id, String name, String description, double price, int stockAmount,String newFeature) {
		//Yukaridaki degerler su demek, ben Product'u bu parametleri verirsen kullandiririm demek.

		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.newFeature = newFeature;
//		System.out.println(name+" added to cart. ");
//		System.out.println(newFeature+" added to cart. ");
//		System.out.println("The " + name +"'s code is : " + name.substring(0, 1) + id);
		System.out.println("Yapici blok calisti.");
	}
	public Product() {
		
	}

	// Private kullanilirsa sadece tanimlandigi alanda gecerlidir.
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String newFeature;
	private String code;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getNewFeature() {
		return newFeature;
	}

	public void setNewFeature(String newFeature) {
		this.newFeature = newFeature;
	}

	public String getCode() {
		return this.name.substring(0, 1) + id;
	}

}
