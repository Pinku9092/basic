package com.pinku.acco;

import java.util.Objects;

public class Employee1  {
	
	int id;
	String name;
	int age;
	public Employee1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public int hashCode() {
		return Objects.hash(age, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return age == other.age && id == other.id && Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
