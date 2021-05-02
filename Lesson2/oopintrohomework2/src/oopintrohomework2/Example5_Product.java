package oopintrohomework2;

public class Example5_Product {
	
	//Consructor block
	public Example5_Product(int id,String name, String description, double price, int stockAmount, String colour) {
		
		System.out.println("Consructor block was run.");
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.colour = colour;
	}

	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String colour;

	// Getter
	public int getId() {
		return id;
	}
	// Getter
	public String getName() {
		return name;
	}
	// Getter
	public String getDescription() {
		return description;
	}
	// Getter
	public double getPrice() {
		return price;
	}
	// Getter
	public int getStockAmount() {
		return stockAmount;
	}
	// Getter
	public String getColour() {
		return colour;
	}
	// Getter
	public String getCode() {
		return name.substring(0,1) + id;
	}
	// Setter
	public void setId(int id) {
		this.id = id;
	}
	// Setter
	public void setName(String name) {
		this.name = name;
	}
	// Setter
	public void setDescription(String description) {
		this.description = description;
	}
	// Setter
	public void setPrice(double price) {
		this.price = price;
	}
	// Setter
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	// Setter
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	
	
	// Attribute | Field
	// private int id; //private is valid only in the block in which it is defined.
//	private int _id;
//	private String _name;
//	private String _description;
//	private double _price;
//	private int _stockAmount;
//	private String _colour;
//
//	// Getter
//	public int getId() {
//		return _id;
//	}
//	// Getter
//	public String getName() {
//		return _name;
//	}
//	// Getter
//	public String getDescription() {
//		return _description;
//	}
//	// Getter
//	public double getPrice() {
//		return _price;
//	}
//	// Getter
//	public int getStockAmount() {
//		return _stockAmount;
//	}
//	// Getter
//	public String getColour() {
//		return _colour;
//	}
//	// Getter
//	public String getCode() {
//		return _name.substring(0,1) + _id;
//	}
//	// Setter
//	public void setId(int id) {
//		_id = id;
//	}
//	// Setter
//	public void setName(String name) {
//		_name = name;
//	}
//	// Setter
//	public void setDescription(String description) {
//		_description = description;
//	}
//	// Setter
//	public void setPrice(double price) {
//		_price = price;
//	}
//	// Setter
//	public void setStockAmount(int stockAmount) {
//		_stockAmount = stockAmount;
//	}
//	// Setter
//	public void setColour(String colour) {
//		_colour = colour;
//	}

}
