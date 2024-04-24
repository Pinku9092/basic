package com.pinku;

import java.util.ArrayList;
import java.util.List;

public class ShiftAllNegativeAtLeft {

	public static void main(String[] args) {
		
		
		int arr[] = new int[]{ -12, 11, -13, -5, 6, -7, 5, -3, -6 };
		int n = arr.length;
		reArrange(arr,n);
		List<Integer> list = new ArrayList<>();
		for(Integer i : arr) {
			list.add(i);
		}
		list.stream().forEach(System.out::print);

	}

	private static void reArrange(int[] arr, int n) {
		
		int key,j;
		for(int i = 0; i < arr.length; i++) {
			key = arr[i];
			
			if(key > 0)
				continue;
			
			j = i-1;
			while(j >= 0 && arr[j] > 0) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
		
	}

}
