package interfaces;

public class Customer {
	
	private int id;
	private String firtsName;
	private String lastName;
	
	public Customer() {
		
	}

	public Customer(int id, String firtsName, String lastName) {
//		super(); 		// Bu s�n�f� inherit eden bir s�n�f varsa o s�n�f�n parametresiz s�n�f�n�da �al��t�r demek
		this.id = id;
		this.firtsName = firtsName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirtsName() {
		return firtsName;
	}

	public void setFirtsName(String firtsName) {
		this.firtsName = firtsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
