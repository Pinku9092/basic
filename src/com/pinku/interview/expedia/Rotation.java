package com.pinku.interview.expedia;

import java.util.Arrays;

public class Rotation {
	
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9};
		// 1,3,5,9,7
		//5,3,1,9,7
		//7,9,1,3,5
		int k = 2;
		rotate(arr,k);
		
		System.out.println(Arrays.toString(arr));
	}

	private static void rotate(int[] arr, int k) {
		
		int n = arr.length;
	//	int p = n-k;
	//	int q = n-1;
		k = k%n;
		int i,j;
		i = n - k;
		j = n-1;
		while(i < j) {
			
			int temp = arr[i];
			//if(q < arr.length)
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		 i = 0;
		 j = n-k-1;
		
		while(i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
		i = 0;
		j = n-1;
		
		while(i <= j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}

}
