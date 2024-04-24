package com.pinku.interview.powerShell;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
	public static void main(String[] args) {
		
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		System.out.println(dup(list));
	}

	private static List<Integer> dup(List<Integer> list) {
		
		
		Set<Integer> set = new HashSet<>();
		List<Integer> result =
		list.stream()
		.filter(n -> !set.add(n))
		.collect(Collectors.toList());
		
		return result;
		
	}
}
