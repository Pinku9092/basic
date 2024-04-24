package com.pinku.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {6,25,12,22,11};
		
		insertionSort(arr);
		
		List<Integer> list = Arrays.stream(arr)
				.boxed()
				.collect(Collectors.toList());
		
		
		String str = list.stream()
				.map(String::valueOf)
				.collect(Collectors.joining(","));
		
		System.out.println(str);
	}

	private static void insertionSort(int[] arr) {
		
		
		for(int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
		
		
		/*
		 * for(int i = 1; i < arr.length; i++) { int key = arr[i]; int j = i -1; while(j
		 * >= 0 && arr[j] > key) { arr[j+1] = arr[j]; j--; } arr[j+1] = key; }
		 */
		
		/*
		 * for(int i = 1; i < arr.length; i++) { int key = arr[i]; int j = i-1; while(j
		 * >= 0 && arr[j] > key) { arr[j+1] = arr[j]; j--; } arr[j+1] = key; }
		 */
		
	}
	

}
