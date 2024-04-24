package com.pinku.interview;

import java.util.Arrays;

public class ReverseString {
	static String result = "";
	public static void main(String[] args) {
		String str = "pinku";
		System.out.println(reverseString(str));
		//char chr = 
		System.out.println(Arrays.toString(reverse(str.toCharArray())));
		
		char[] chrs = str.toCharArray();
		reverseChrs(chrs, chrs.length-1, 0);
		System.out.println(Arrays.toString(chrs));
	}

	private static void reverseChrs(char[] chrs, int i, int j) {
		
		if(i < j) {
			return;
		}
		
		char temp = chrs[i];
		chrs[i] = chrs[j];
		chrs[j] = temp;
		i--;
		j++;
		reverseChrs(chrs, i, j);
		
	}

	private static char[] reverse(char[] charArray) {
		
		int left = 0;
		int right = charArray.length-1;
		while(left < right) {
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		return charArray;
	}

	private static String reverseString(String str) {
		
		 
		if(str.length() == 0) {
			return result;
		}
		result += str.charAt(str.length()-1);
		return reverseString(str.substring(0, str.length()-1));
	}
	

}
