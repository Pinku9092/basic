package com.pinku.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem2085 {
	
	public static void main(String[] args) {
		String[] word1 = {"leetcode","is","amazing","as","is"};
		String[] word2 = {"amazing","leetcode","is"};
		
		System.out.println(countWords(word1,word2));
	}

	private static int countWords(String[] word1, String[] word2) {
		
		Map<String, Integer> map1 = new HashMap<>();
		
		Map<String, Integer> map2 = new HashMap<>();
		
		Arrays.stream(word1)
		.forEach(str -> map1.put(str, map1.getOrDefault(str, 0) + 1));
		
		Arrays.stream(word2)
		.forEach(str -> map2.put(str, map2.getOrDefault(str, 0) + 1));
		
		
		  int count1 = (int) Arrays.stream(word1) 
				  .filter(str -> (map1.get(str) == 1)&& (map2.getOrDefault(str,0) == 1)) 
				  .count();
		 
		
		/*
		 * int count1 = 0;
		 * 
		 * for(String str : word1) { if(map1.get(str) == 1 && map2.getOrDefault(str,0)
		 * == 1) { count1++; } }
		 */
		return count1;
	}
	

}
