package com.pinku.interview;

public class PermutationOfString {
	
	
	public static void main(String[] args) {
		
		String str = "abc";
		
		permutation(str, 0, str.length()-1);
	}

	private static void permutation(String str, int low, int high) {
		

		if(low == high) {
			System.out.print(str+" ");
		}else {
			for(int i = low; i <= high; i++) {
				str = swap(str,low,i);
				permutation(str, low+1, high);
				str = swap(str, low, i);
			}
		}
		
		
	}

	private static String swap(String str, int low, int i) {
		char temp;
		char[] charArray = str.toCharArray();
		temp = charArray[low];
		charArray[low] = charArray[i];
		charArray[i] = temp;
		
		return String.valueOf(charArray);
	}

}
