package com.pinku;

public class LargestContinueSum {

	public static void main(String[] args) {

		 int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
	        System.out.println("Maximum contiguous sum is "
	                           + maxSubArraySum(a));
		
	}

	private static int maxSubArraySum(int[] a) {
		
		int sumOfFar = Integer.MIN_VALUE, current_sum = 0;
		
		for(int i = 0; i < a.length; i++) {
			current_sum += a[i];
			if(sumOfFar < current_sum) {
				sumOfFar = current_sum;
			}
			if(current_sum < 0) {
				current_sum = 0;
			}
		}
		return sumOfFar;
	}

}
