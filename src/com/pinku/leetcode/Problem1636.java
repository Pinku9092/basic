package com.pinku.leetcode;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Problem1636 {
		
	public static void main(String[] args) {
		
		int[] arr = {1,1,2,2,2,3};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
		}
		
		Map<Integer ,Integer> keySortedResult = map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByKey((a,b) -> b - a))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (old, newValue) -> old, LinkedHashMap::new));
		
		
		Map<Integer ,Integer> result = keySortedResult.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue((a,b) -> a - b))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (old, newValue) -> old, LinkedHashMap::new));
		
	//	System.out.println(result);
		
		//Collection<Integer> valueArray = result.values();
		int j = 0;
		for(Map.Entry<Integer, Integer> entry : result.entrySet()) {
			
			for(int i = 0; i < entry.getValue(); i++) {
				arr[j++] = entry.getKey();
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
