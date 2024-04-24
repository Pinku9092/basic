package com.pinku.stream;

public class Address {
	
	int id;
	int pincode;
	String city;
	String state;
	public Address(int id, int pincode, String city, String state) {
		super();
		this.id = id;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", pincode=" + pincode + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
