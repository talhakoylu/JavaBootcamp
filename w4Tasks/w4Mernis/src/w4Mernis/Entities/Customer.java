package w4Mernis.Entities;

import w4Mernis.Interfaces.Entity;

public class Customer implements Entity{
	private int id;
	private String firstName;
	private String lastName;
	private int birthYear;
	private String NationalityId;
	
	public Customer() {
	}

	public Customer(int id, String firstName, String lastName, int birthYear, String nationalityId) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthYear = birthYear;
		NationalityId = nationalityId;
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

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getNationalityId() {
		return NationalityId;
	}

	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}
	
	
}
