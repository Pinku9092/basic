package com.pinku;

import java.util.function.Function;



public class FunctionDemo {
	
	public static void main(String[] args) {
		
		Function<String, Integer> fun = str -> str.length();
		
		System.out.println(fun.apply("Pinku"));
	}

}
