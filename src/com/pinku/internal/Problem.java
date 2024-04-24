package com.pinku.internal;

import java.util.HashMap;
import java.util.Map;

public class Problem {

	public static void main(String[] args) {
		int[] arr = {6,7,8,12,5,7,6,9,6,7,8};
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int num : arr) {
			
			if(!map.containsKey(num)) {
				map.put(num, 1);
			}else {
				map.put(num, map.get(num) + 1);
			}
		}
		
		map.entrySet()
		.stream()
		.forEach(e -> System.out.println(e.getKey()+"="+e.getValue()));
		
	}
}
