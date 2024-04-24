package com.pinku.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayDuplicate {
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);

		list.add(1);

		list.add(2);

		list.add(3);
		List<Integer> result = duplicate(list);
		result.forEach(System.out::println);
	}

	private static List<Integer> duplicate(List<Integer> list) {
		
		Set<Integer> set = new HashSet<>();
		List<Integer> result =
		 list.stream()
			.filter(n -> !set.add(n))
			.collect(Collectors.toList());
		
		/*list.stream()
				.filter(n -> !set.add(n))
				.collect(Collectors.toList());*/
		
		
		return result;
	}
}
