package com.java;

public class Contacts {
	private String firstName;
	private String lastName;
	public String email;
	public Address address;
	public long phone;


	public Contacts(String firstName, String lastName, String email,  String city, String state, String zip, long phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = new Address(city, state, zip);
		this.phone = phone;

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



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}


	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Persons [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address="
				+ address + ", phone=" + phone + "]";
	}

}