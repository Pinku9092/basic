package com.pinku.stream;

import java.util.List;

public class User {
	
	int id;
	int age;
	String name;
	List<Address> address;
	public User(int id, int age, String name, List<Address> address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Address> getAddress() {
		return address;
	}
	public void setAddress(List<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	
	

}
