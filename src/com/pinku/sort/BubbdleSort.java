package com.pinku.sort;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbdleSort {
	
	public static void main(String[] args) {
		int[] arr = {6,25,12,22,11};
		bubbleSort(arr);
		
		List<Integer> list = Arrays.stream(arr)
							.boxed()
							.collect(Collectors.toList());
		
		String str = list.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		System.out.println(str);
	}

	private static void bubbleSort(int[] arr) {
		
		
		for(int i = 0; i < arr.length-1; i++) {
			boolean flag = false;
			for(int j = 0; j < arr.length-i-1; j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					flag = true;
				}
			}
			
			if(flag == false) {
				break;
			}
		}
		
	}

}
