package com.pinku;

 class PolyTest {
	
	public void m1(Object obj) {
		System.out.println("Object argu");
	}
	
	public void m1(String obj) {
		System.out.println("String argu");
	}
	
	public void m1(Integer obj) {
		System.out.println("Integer argu");
	}
}

public class PolyDemo{
	
	public static void main(String[] args) {
		PolyTest test = new PolyTest();
		//test.m1(null);
	}
}
