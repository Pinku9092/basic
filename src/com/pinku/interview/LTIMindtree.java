package com.pinku.interview;

import java.util.Arrays;

public class LTIMindtree {
	
	
	public static void main(String[] args) {
		System.out.println(secondLargest("my names is khan"));
	}

	private static String secondLargest(String str) {
		String result = "";
		int i = 0;
		//System.out.println(str.length());
		//System.out.println(str.lastIndexOf('n'));
		for(char ch : str.toCharArray()) {
			if(ch == ' ') {
				i++;
				continue;
			}
			int a = str.indexOf(ch);
			int b = str.lastIndexOf(ch);
			//System.out.println("b:" +b);
			if(a == b) {
				result += ""+ch;
			}else if(i == b) {
			//	System.out.println("ggg");
				result += ""+ch;
			}
			//System.out.println("i:"+i);
			i++;
		}
		
		System.out.println(result);
		System.out.println(
		Arrays.stream(str.split(" ")).sorted((s1,s2) -> s2.length() - s1.length()).skip(1).findFirst().get()
		);
		return Arrays.asList(str.split(" ")).stream()
		.sorted((s1,s2) -> s2.length() - s1.length()).skip(1)
		.findFirst().get();
		
		
		//return null;
	}

}
