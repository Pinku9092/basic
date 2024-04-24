package com.pinku.acco;

import java.util.Arrays;

public class Arrangement {
	
	public static void main(String[] args) {
		String str = "asdfgh1234kjhsg";
		
		int[] charCount = new int[26];
		
		int[] numberCount = new int[10];
		
		for(char ch : str.toCharArray()) {
			int a = ch;
			
			if(a >= 97 && a <= 122) {
				
				charCount[ch - 'a']++;
			}else {
				numberCount[ch - '0']++;
			}
		}
		String result = "";
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < charCount[i]; j++) {
				
				char ch = (char)(97 + i);
				result += ""+ ch;
			}
		}
		System.out.println(result);
		
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < numberCount[i]; j++) {
				
				char ch = (char)(48 + i);
				result += ""+ ch;
			}
		}
		System.out.println(result);
	}

}
