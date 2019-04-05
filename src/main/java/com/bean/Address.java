package com.bean;

public class Address {

	private int Street;
	private String area;
	private String city;
	private String pincode;
	
	
	public Address(int street, String area, String city) {
		super();
		Street = street;
		this.area = area;
		this.city = city;
	}
	
	public int getStreet() {
		return Street;
	}
	public String getArea() {
		return area;
	}
	public String getCity() {
		return city;
	}

}
