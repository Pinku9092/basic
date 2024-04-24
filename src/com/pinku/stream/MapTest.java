package com.pinku.stream;

import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapTest {
	public static void main(String[] args) {
		Map<Boolean, Integer> map = new HashMap<>();
		map.put(false, 5);
		map.put(true, 5);
		map.put(true, 6);
		map.put(true, 2);
		
		DoubleSummaryStatistics result =
		map.entrySet().stream()
		.filter(e -> e.getKey())
		.map(e -> e.getValue())
		.collect(Collectors.summarizingDouble(Integer::valueOf));
		
		System.out.println(result.getSum());
		
		List<Integer> list =	
		map.entrySet().stream()
		.filter(e -> e.getKey())
		.map(e -> e.getValue())
		.collect(Collectors.toList());
		
		int sum =
		list.stream().mapToInt(i -> i).sum();
		
		System.out.println(sum);
		
	}
}
