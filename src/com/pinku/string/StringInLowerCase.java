package com.pinku.string;

public class StringInLowerCase {
	
	public static void main(String[] args) {
		
		String str = "HELLO";
		
		toLowerCase(str);
	}

	private static void toLowerCase(String str) {
		
		char[] charArr = str.toCharArray();
		String result = "";
		for(char ch : charArr) {
			int charAscii = ch;
			int add32 = charAscii + 32;
		//	int requiredChar = charAscii;
			char newChar = ch;
			if(add32 <= 122) {
				newChar = (char)add32;
			}
			result += ""+newChar;
		}
		System.out.println(result);
		//return result;
	}

}
