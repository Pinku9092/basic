package com.pinku;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionDem {
	
	public static void main(String[] args) {
		
		Function<String, Integer> func = str -> str.length();
		
		List<String> list = Arrays.asList("A","B");
		
		List<Integer> result = list.stream().map(func).collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
