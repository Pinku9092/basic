package com.pinku.interview;

import java.util.Arrays;

public class EpamNextGreater {
	
	public static void main(String[] args) {
		int[] arr =  {4,13,7,6,12};
		nextGreater(arr);
		
		//nextGreaterOptimal(arr);
		
		nextGreater2(arr);
		
	}

	private static void nextGreater2(int[] arr) {
		//int[] arr =  {13,7,6,12};
		System.out.println("Next greater 2");
		int max = arr[arr.length-1];
		//arr[arr.length-1] = -1;
		for(int i = arr.length-1; i >= 0; i--) {
			
			if(max <= arr[i]) {
				max = arr[i];
				arr[i] = -1;
			}else {
			arr[i] = max;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void nextGreaterOptimal(int[] arr) {
		System.out.println("Next greater with optimal");
		int max = Integer.MAX_VALUE;
		int[] result = new int[arr.length];
		max = arr[arr.length-1];
		result[arr.length-1] = -1;
		for(int i = arr.length-2; i >= 0; i--) {
			
			if( max < arr[i]) {
				max = arr[i];
			}
			if(arr[i] == max) {
			result[i] = -1;
			}else {
				result[i] = max;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" -> "+result[i]);
		}
		
	}

	private static void nextGreater(int[] arr) {
		
		
		int exit;
		
		for(int i = 0; i < arr.length; i++) {
			exit = -1;
			
			for(int j = i+1; j < arr.length; j++) {
				
				
				if(arr[i] < arr[j]) {
					exit = arr[j];
					break;
				}
			}
			
			System.out.println(arr[i]+" -> "+exit);
		}
		
	}

	

}
