package com.pinku.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MaximumMeetingPosible {
	
	public static void main(String[] args) {
		int[] start = {1,3,0,5,8,5};
		int[] end =   {2,4,5,7,9,9};
		System.out.println(maxMeeting(start,end));
	}

	private static int maxMeeting(int[] start, int[] end) {
		ArrayList<Meeting> list = new ArrayList<>();
		for(int i = 0; i < start.length; i++) {
	
			list.add(new Meeting(start[i], end[i], i+1));
		}
		
		Comparator<Meeting> comparator = Comparator.comparing(Meeting::getEnd)
				.thenComparing(Meeting::getPos);
		
		Collections.sort(list,comparator);
		
		ArrayList<Integer> result = new ArrayList<>();
		result.add(list.get(0).pos);
		int prevEnd = list.get(0).end;
		
		for(int i = 1; i < start.length; i++) {
			
			if(list.get(i).start > prevEnd) {
				prevEnd = list.get(i).end;
				result.add(list.get(i).pos);
			}
			
		}
		
		result.forEach(System.out::println);
		return result.size();
	}
}
