package InterfaceAbstractGameVideoWithMernis.Entities;

import java.time.LocalDate;

import InterfaceAbstractGameVideoWithMernis.Abstract.IEntity;

public class Customer extends User{
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private LocalDate dateOfBirth;
	
	public Customer() {
		
	}
	
	public Customer(int id, String firstName, String lastName, String nationalityId, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
}
