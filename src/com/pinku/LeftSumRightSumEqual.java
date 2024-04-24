package com.pinku;

public class LeftSumRightSumEqual {
	
	public static void main(String[] args) {
		int[] nums = {1,7,3,6,5,6};
		
		System.out.println(returnIndexWhereEqual(nums));
		
	}
	private static int returnIndexWhereEqual(int[] nums) {
		int leftSum = 0;
		int totalSum = 0;
		int i = 0;
		while(i < nums.length) {
			totalSum += nums[i];
			i++;
		}
		
		int j = 0;
		while(j < nums.length) {
			
			if(totalSum - nums[j] == leftSum) {
				return j;
			}else {
				totalSum -= nums[j];
				leftSum += nums[j];
			}
			j++;
		}
		return -1;
	
	}
}
