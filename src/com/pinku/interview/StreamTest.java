package com.pinku.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
	public static void main(String[] args) {
		
		List<List<Integer>> list = Arrays.asList(
				
				Arrays.asList(1,2),
				Arrays.asList(3,4)
				
				);
		
		list.stream()
		.forEach(arr ->{
			int sum = 0;
			for(int i : arr) {
				sum += i;
			}
			System.out.println(sum);
		});
		
		/*
		 * List<Integer> result = list.stream() .map(arr ->
		 * arr.stream().mapToInt(Integer::intValue).sum()
		 * 
		 * ).collect(Collectors.toList());
		 * 
		 * System.out.println(result.toString());
		 */
	}
}
