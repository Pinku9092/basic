package com.pinku.interview;

import java.util.Arrays;

public class SelectionSort {

	
	public static void main(String[] args) {
		int[] ar =  {2,5,1,100, 45, 201, 23, 67, 89};
		System.out.println("Before :"+Arrays.toString(ar));
		for(int i = 0; i < ar.length; i++) {
		selectionSort(ar,i);
		}
		System.out.println(Arrays.toString(ar));
	}

	private static void selectionSort(int[] ar, int i) {
		
		int index = i;;
		
			
			for(int j = i+1; j < ar.length; j++) {
				
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		
		if(i != index) {
			int temp = ar[i];
			ar[i] = ar[index];
			ar[index] = temp;
		}
	}
}
