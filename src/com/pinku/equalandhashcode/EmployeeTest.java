package com.pinku.equalandhashcode;

import java.util.HashSet;
import java.util.Set;

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setId(100);
		e2.setId(100);
		
		//System.out.println(e1.equals(e2)); //false without equals override
		
		
		//System.out.println(e1.equals(e2)); //true with equals override
		
		Set<Employee> set = new HashSet<>();
		
		set.add(e1);
		set.add(e2);
		
	//	System.out.println(set); //same duplicate object, when without hashcode
		
		System.out.println(set); //duplicate removed with hashcode
	}

}
