package com.pinku;

public class SetMismatch645 {

	public static void main(String[] args) {
		
		int[] nums = {1,3,3,4,5};
		int[] result = findErrorNums(nums);
		System.out.println(result[0]+" "+result[1]);

	}

	private static int[] findErrorNums(int[] nums) {
		
		int[] result = new int[2];
		
		int[] ar = new int[nums.length];
		
		for(int i : nums) {
			ar[i-1]++;
		}
		for(int i = 0; i < ar.length; i++) {
			if(ar[i] == 2) {
				result[0] = i+1;
			}
			if(ar[i] == 0) {
				result[1] = i+1;
			}
		}
		
		
		return result;
	}

}
