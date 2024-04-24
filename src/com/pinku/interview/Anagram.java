package com.pinku.interview;

import java.util.Arrays;

public class Anagram {
	
	public static void main(String[] args) {
		/*
		 * boolean result = anagram("abc","abc");
		 * 
		 * if(result) { System.out.println("It is Anagram"); }else {
		 * System.out.println("It is not Anagram"); }
		 */
		
		boolean flag = anagram2("abc","abc");
		if(flag) {
			System.out.println("It is Anagram");
		}else {
			System.out.println("It is not Anagram");
		}
	}

	private static boolean anagram2(String s1, String s2) {
		
		if(s1.length() != s2.length()) {
			return false;
		}
		
		char[] s1Arr = s1.toCharArray();
		char[] s2Arr = s2.toCharArray();
		
		sortMethod(s1Arr);
		sortMethod(s2Arr);
		//Arrays.sort(s1Arr);
		//Arrays.sort(s2Arr);
		
		for(int i = 0; i < s1Arr.length; i++) {
			
			if(s1Arr[i] != s2Arr[i]) {
				return false;
			}
			
		}
		
		
		
		return true;
		
	}

	private static void sortMethod(char[] s1Arr) {
		int n = s1Arr.length;
		for(int i = 0; i < n; i++) {
			boolean flag = false;
			for(int j = 0; j < n-i-1; j++) {
				
				if(s1Arr[j] > s1Arr[j+1]) {
					char ch = s1Arr[j];
					s1Arr[j] = s1Arr[j+1];
					s1Arr[j+1] = ch;
					flag = true;
				}
			}
			if(flag == false) {
				break;
			}
		}
		
	}

	private static boolean anagram(String str1, String str2) {
		
		if(str1.length() != str2.length()) {
			return false;
		}
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int[] count = new int[26];
		
		for(char ch : str1.toCharArray()) {
			count[ch - 'a']++;
		}

		for(char ch : str2.toCharArray()) {
			count[ch - 'a']--;
		}

		for(int i = 0; i < 26; i++) {
			if(count[i] != 0) {
				return false;
			}
		}
		return true;

	}

}
