package com.pinku.interview;

import java.util.Arrays;

public class EpamMaximumMeeting {
	
	public static void main(String[] args) {

		int[] start = {1,3,0,5,8,5};
		int[] end =   {2,4,5,7,9,9};
		System.out.println(maxMeeting(start,end));
	}

	private static int maxMeeting(int[] start, int[] end) {
		
		int count = 1;
		Arrays.sort(end);
		int prevEnd = end[0];
		for(int i = 1; i < start.length; i++) {
			
			if(start[i] > prevEnd && start[i] < end[i]) {
				count++;
				prevEnd = end[i];
			}
			
		}
		
		return count;
		
	}
	
}
