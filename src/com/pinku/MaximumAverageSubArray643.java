package com.pinku;

public class MaximumAverageSubArray643 {

	public static void main(String[] args) {
		int[] nums = {5};
		
		int k = 4;
		System.out.println(findMaxSubArray(nums,4));

	}

	private static double findMaxSubArray(int[] nums, int k) {
		if(nums.length < k) {
			return 0;
		}
		int window_sum = 0;
		for(int i = 0; i < k; i++) {
			window_sum += nums[i];
		}
		if(nums.length == k) {
			return window_sum/k;
		}
		int max_sum = window_sum;
		for(int i = k; i < nums.length; i++) {
			window_sum += nums[i] - nums[i-k];
			max_sum = Math.max(window_sum, max_sum);
		}
		
		
		return max_sum/k;
	}

}
