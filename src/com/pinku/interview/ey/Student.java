package com.pinku.interview.ey;

public class Student  extends Person{

	public Student(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	public void print() {
		super.print();
		System.out.println("Student class");
	}
}
