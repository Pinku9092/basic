package com.pinku;


abstract class parent{
	
	protected  abstract void show();
	
	abstract boolean check(int n);
}

class child extends parent{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	 boolean check(int n) {
		// TODO Auto-generated method stub
		return false;
	}
	
}

public class InheritanceDemo {

}
