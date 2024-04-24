package com.pinku;

interface Interrr{
	public static void m1() {
		System.out.println("In m1 static method");
	}
	
	public static void m2() {
		System.out.println("In m2 parent static method");
	}
}

class InterrrImplementation implements Interrr{
	
	//error in static method with @Override
	/*
	 * @Override public static void m1() {
	 * System.out.println("In m1 static method"); }
	 */
	
	//static method working fine without @Override
	public static void m2() {
		System.out.println("In m2 child static method");
	}
}

public class InterfaceWithStatic {
	
	public static void main(String[] args) {
		InterrrImplementation obj = new InterrrImplementation();
	//	Interrr obj = new InterrrImplementation(); 
		obj.m2();
	}

}
