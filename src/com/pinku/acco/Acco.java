package com.pinku.acco;

import java.util.Arrays;

public class Acco {
	
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 5, 4, 7, 10};
		
		int i = 0;
		int j = arr.length-1;
		while(i < j) {
			while(i < arr.length && arr[i] % 2 == 0) {
				i++;
			}
			while(j >= 0 && arr[j] % 2 != 0) {
				j--;
			}
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			
		}
		
		if(i != j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int k = 1; k <= j; k++) {
			int key = arr[k];
			int l = k-1;
			while(l >= 0 && arr[l] > key) {
				arr[l+1] = arr[l];
				l--;
			}
			arr[l+1] = key;
		}
		
		
		for(int k = i+1; k < arr.length; k++) {
			int key = arr[k];
			int l = k-1;
			while(l >= i && arr[l] < key) {
				arr[l+1] = arr[l];
				l--;
			}
			arr[l+1] = key;
		}
		
		System.out.println(Arrays.toString(arr));

		
	}

}
