package com.pinku;

import java.util.function.Predicate;

import com.pinku.stream.Employee;

@FunctionalInterface
interface InterfP{
	
	boolean check(int n);
	
}

public class PredicateDemo {
	
	public static void main(String[] args) {
		InterfP P = n -> n%2 == 0;
		
		Predicate<Integer> p2 = n -> n%2 == 0;
		
		
		
		System.out.println(P.check(7));
		System.out.println(p2.test(4));
	}

}
