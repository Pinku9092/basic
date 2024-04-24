package com.pinku;

import java.util.function.Supplier;

public class SupplierDemo {
	
	public static void main(String[] args) {
		
		Supplier<Integer> supplier = ()-> {
			return 123;
		};
		
		
		System.out.println(supplier.get());
	}

}
