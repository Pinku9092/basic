package com.pinku;


final class Student {
	private final int id;
	private final String name;
	
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
}
public class ImmutableClassDemo {
	public static void main(String[] args) {
		Student obj = new Student(1, "pinku");
		System.out.println(obj.getName());
	}
}
