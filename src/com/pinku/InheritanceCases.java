package com.pinku;


class Parentp{
	    Child12 msg() {
		System.out.println("Hi");
		return new Child12();
	}
	    
}
class Child12 extends Parentp{
	protected  Child12 msg() {
		System.out.println("Hello");
		return new Child12();
	}
	
	public void show() {
		System.out.println("child show method");
	}
}

public class InheritanceCases {
	public static void main(String[] args) {
		Parentp p = new Child12();
		p.msg();
	//	p.show();
	}
}
