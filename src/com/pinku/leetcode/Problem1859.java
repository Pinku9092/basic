package com.pinku.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Problem1859 {
	
	public static void main(String[] args) {
		String inputString = "is2 sentence4 This1 a3";
		
		method1(inputString);
		method2(inputString);
		
		
	}

	private static void method2(String inputString) {
		List<String> list = new ArrayList<>();
		
		for(String str : inputString.split(" ")) {
			list.add(str);
		}
		
		List<String> sortedString = 
				list.stream()
				.sorted((s1, s2) -> Integer.parseInt(s1.substring(s1.length()-1)) - Integer.parseInt(s2.substring(s2.length()-1)))
				.collect(Collectors.toList());
		
		List<String> listWithoutNumber =
				sortedString.stream()
				.map(str -> str.substring(0, str.length()-1))
				.collect(Collectors.toList());
		StringJoiner stringJoiner = new StringJoiner(" ");
		
		listWithoutNumber.forEach(str ->{
			stringJoiner.add(str);
		});
		System.out.println(stringJoiner);
		
	}

	private static void method1(String inputString) {
		Map<Integer, String> map = new HashMap<>();
		for(String str : inputString.split(" ")) {
			map.put(Integer.parseInt(str.substring(str.length()-1)), str.substring(0, str.length()-1));
		}
		
		Map<Integer, String> resultMap =
				map.entrySet().stream()
				.sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (old,newValue) -> old, LinkedHashMap::new));
		
		String result = "";
		StringJoiner joinner = new StringJoiner(" ");
		for(Map.Entry<Integer, String> entry : resultMap.entrySet()) {
			result += entry.getValue();
			joinner.add(entry.getValue());
		}
		
		System.out.println(result);
		System.out.println(joinner.toString());
		
	}

}
