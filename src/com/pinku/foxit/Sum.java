package com.pinku.foxit;

public class Sum {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,8,9,10};
		int sum = 10*(10+1)/2;
		
		for(int i : arr) {
			sum -= i;
		}
		
		System.out.println(sum);
		
	}

}
