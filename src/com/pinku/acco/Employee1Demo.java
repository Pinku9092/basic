package com.pinku.acco;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Employee1Demo {
	
	public static void main(String[] args) {
		
		
		Map<Integer, Integer> m = new HashMap<>();
		int i = 1;
		m.put(i, 1);
		System.out.println(m);
		
		HashMap<Employee1,Integer> map = new HashMap<>();
		
		map.put(new Employee1(1, "rohan", 20), 1);
		map.put(new Employee1(2, "sohan", 20), 2);
		map.put(new Employee1(3, "mohan", 20), 3);
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee1::getAge).thenComparing(Employee1::getName))).forEach(System.out::println);
	
	//	map.entrySet()
		//.stream()
		//.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee1::getAge).thenComparing(Employee1::getName))).forEach(System.out::println);
	}

}
