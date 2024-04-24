package com.pinku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSortDemo {
	
	public static void main(String[] args) {
		
		int[] arr = {6,25,12,22,11};
		
		selectionSort(arr);
		List<Integer> list = new ArrayList<>();
		//Arrays.asList(arr);
		for(int i : arr) {
			list.add(i);
		}
		
		list.forEach(System.out::println);
	}

	private static void selectionSort(int[] arr) {
		
		
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) {
			
			int min_index = i;
			
			for(int j = i+1; j < n; j++) {
				
				if(arr[j] < arr[min_index]) {
					min_index = j;
				}
			}
			
			int temp = arr[min_index];
			arr[min_index] = arr[i];
			arr[i] = temp;
		}
		
	}

}
