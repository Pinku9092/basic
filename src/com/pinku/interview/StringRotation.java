package com.pinku.interview;

public class StringRotation {
	public static void main(String[] args) {
		System.out.println(rotateString("XYZ", 3));
	}

	private static String rotateString(String str, int n) {
		if(str == null || str == "" || n == 0) {
			return str;
		}
		
		char[] charArr = str.toCharArray();
		char[] result = new char[charArr.length];
		int rotationInt;
		for(int i = 0; i < charArr.length; i++ ) {
			int a  = charArr[i];
			int mod = n % 26;
			int sum = a + mod;
			if(sum > 90) {
				rotationInt = 64 + (sum-90);
			}else {
				rotationInt = sum;
			}
			
			result[i] = (char)(rotationInt);
			System.out.println(a);
			
		}
		
		return String.valueOf(result);
	}
}
