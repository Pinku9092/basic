package com.pinku.compare;

public class Employee implements Comparable<Employee> {
	
	private int id;
	private String name;
	private int age;
	private long salay;
	
	
	public Employee(int id, String name, int age, long salay) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.salay = salay;
	}
	
	
	
	public int getId() {
		return id;
	}



	public String getName() {
		return name;
	}



	public int getAge() {
		return age;
	}



	public long getSalay() {
		return salay;
	}



	@Override
	public int compareTo(Employee o) {
		
		return this.id - o.id;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salay=" + salay + "]";
	}
	
	


	

}
