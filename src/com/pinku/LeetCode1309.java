package com.pinku;

public class LeetCode1309 {

	public static void main(String[] args) {
		
		String str = "10#11#12";
		StringBuilder result = new StringBuilder();
		int i = 0;
		StringBuilder sb = new StringBuilder(str.length());
		System.out.println(sb.append((char)
                         ((Integer.parseInt(str.substring(i, i+2)) -1) + 'a')));
		System.out.println((char)((Integer.parseInt(str.substring(i, i+2)) -1) + 'a'));
		System.out.println((char)106);

	}

}
