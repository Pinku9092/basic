package com.pinku;

public class ValidPalindromeAfterDeletionOneChar680 {

	public static void main(String[] args) {
		
		System.out.println(validPalindrom("abca"));

	}

	private static boolean validPalindrom(String string) {
		
		int a_pointer = 0;
		int b_pointer = string.length()-1;
		
		while(a_pointer <= b_pointer) {
			
			if(string.charAt(a_pointer) != string.charAt(b_pointer)) {
				return helperMethod(string, a_pointer+1, b_pointer) || helperMethod(string, a_pointer, b_pointer-1);
			}
			
			
			a_pointer++;
			b_pointer--;
		}
		
		
		return true;
	}

	private static boolean helperMethod(String string, int i, int j) {
		int a_pointer = i;
		int b_pointer = j;
		
		
		while(a_pointer <= b_pointer) {
			
			if(string.charAt(a_pointer) != string.charAt(b_pointer)) {
				return false;
			}
			
			
			a_pointer++;
			b_pointer--;
		}
		
		
		return true;
	}

}
