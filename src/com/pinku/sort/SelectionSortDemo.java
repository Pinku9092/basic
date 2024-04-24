package com.pinku.sort;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionSortDemo {
	
	public static void main(String[] args) {
		
		int[] arr = {6,25,12,22,11};
		
		selectionSort(arr);
		List<Integer> list = new ArrayList<>();
		for(int i : arr) {
			list.add(i);
		}
		String  result =
		list.stream()
		.map(String::valueOf)
		.collect(Collectors.joining(","));
		
		System.out.println(result);
		list.forEach(System.out::print);
	}

	private static void selectionSort(int[] arr) {
		
		
		int n = arr.length;
		

		for(int i = 0; i < n -1; i++) {
			int index = i;
			
			for(int j = i+1; j < n; j++) {
				
				if(arr[j] < arr[index]) {
					index = j;
				}
			}
			
			if(index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
		
	}

}
