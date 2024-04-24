package com.pinku.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MphasisStringInInteger {
	
	public static void main(String[] args) {
		String str = "-765j96";
		System.out.println(aotoi(str));
		Integer[] arr = {1,22,1,3,2,2,4};
		findDuplicateCount(arr);
	}

	private static void findDuplicateCount(Integer[] arr) {
		
		List<Integer> list = Arrays.asList(arr);
		
		Map<Integer, Long> map = list.stream()
										.collect(Collectors.groupingBy(
												i -> i, Collectors.counting())
												);
		/*
		 * Map<Integer, Long> result = list.stream() .collect(Collectors.groupingBy( i
		 * -> i, Collectors.counting() ));
		 */
		System.out.println(map);
	}

	private static int aotoi(String str) {
		
		if(str.length() == 0 ) {
			return 0;
		}
		int i;
		if(str.charAt(0) == '-') {
			i = 1;
			int a = str.charAt(i) - 48;
			if(a > 9)
				return 0;
		}else {
			i = 0;
			int a = str.charAt(i) - 48;
			if(a > 9)
				return 0;
		}
		int j;
		String result = "";
		for(j = i; j < str.length(); j++) {
			char ch = str.charAt(j);
			
			if((ch - 48) <= 9) {
				result += ch;
			}else {
				break;
			}
		}
		
		if(i == 1) {
			result = ""+"-" + result;
		}
	//	return Integer.parseInt(str.substring(0, j));
		return Integer.parseInt(result);
		
	}

}
