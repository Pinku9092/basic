package com.pinku.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Expedia {
	
	public static void main(String[] args) {
		
		
		  int[] arr = new int[]{1,2,3,4,5,6,7}; 
		 // List<int[]> list = Arrays.asList(arr);
		 
		
		 // List<Integer> list = new ArrayList<>(); list.add(1); list.add(2);
		  //list.add(3); list.add(4); list.add(5); list.add(6); list.add(7);
		 
		
		int result = 
		Arrays.stream(arr)
		.filter(n -> n % 2 == 0)
		.map(n -> n*10).boxed()
		.mapToInt(Integer::valueOf).sum();
		
		System.out.println("Sum:"+result);

		/*Arrays.stream(arr)
				.filter(n -> n % 2 == 0)
				.map(n -> n*10).boxed()
				.mapToInt(Integer::valueOf).sum();*/
	}

}
