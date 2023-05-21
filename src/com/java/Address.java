package com.java;

public class Address {
	public String city;
	public String state;
	public String zip;
	
	public Address(String city, String state, String zip) {
		super();
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return " [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
}