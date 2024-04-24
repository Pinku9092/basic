package com.pinku.stream;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraysQuestions {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println("Before reverse");
		System.out.println(Arrays.toString(arr));
		reverseUsingStream(arr);
		System.out.println("After reverse with stream: "+Arrays.toString(arr));
		int[] arr2 = {6,7,8,4,5};
		commonArrayElement(arr,arr2);
		
		min2(arr);
		
	}

	private static void min2(int[] arr) {
		 
		int seconddMin = Arrays.stream(arr).sorted().skip(1).min().getAsInt();
		System.out.println(seconddMin);
		
	}

	private static void commonArrayElement(int[] arr1, int[] arr2) {
		List<Integer> result =
		Arrays.stream(arr1)
		.filter(a -> Arrays.stream(arr2).anyMatch(b -> a == b)
				).boxed().collect(Collectors.toList())
		;
		
		System.out.println(result.toString());
	}

	private static void reverseUsingStream(int[] arr) {
		IntStream.range(0, arr.length/2).forEach(i ->{
			int temp = arr[i];
			arr[i] = arr[arr.length-i-1];
			arr[arr.length-i-1] = temp;
		});
		
	}

}
