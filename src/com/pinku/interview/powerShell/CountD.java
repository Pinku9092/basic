package com.pinku.interview.powerShell;

import java.util.HashSet;
import java.util.Set;

public class CountD {
	
	static Set<String> set = new HashSet<>();
	public static void main(String[] args) {
		
		String str = "abcjklabcpqrjk";
		for(int i = 0; i < str.length(); i++) {
		count(i,str);
		}
		
		System.out.println(set.toString());
	}

	private static void count(int j,String str) {
		
		///Set<String> set = new HashSet<>();
		
		for(int i = str.length()-1; i >= j; i--) {
			
			if(i != j && str.indexOf(str.substring(j,i+1)) != str.lastIndexOf(str.substring(j,i+1))) {
				set.add(str.substring(j,i+1));
				i = j;
			}
		}
		
		//System.out.println(set.toString());
		
	}

}
