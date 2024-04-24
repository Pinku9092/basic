package com.pinku.interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Persistent {
	public static void main(String[] args) {
		String [] s1= {"Hello","Bangalore"};
	      String [] s2= {"hi","bye"};
	      
	      Stream<String> stream1 = Arrays.stream(s1);
	      Stream<String> stream2 = Arrays.stream(s2);
	      
	     Stream<String> result = Stream.concat(stream1, stream2);
	     
	 //    String joinedString =
	   //  result.collect(Collectors.joining(","));
	   //  System.out.println(joinedString);
	     
	     String[] r = result.toArray(String[] :: new);
	     
			/*
			 * String[] newStringArray = Stream.concat(Arrays.stream(s1),
			 * Arrays.stream(s2)).toArray(String[]::new);
			 */
	     
	     System.out.println(Arrays.toString(r));
	     
	     for(int i = 0; i < r.length; i++) {
	    	 
	    	 System.out.print(r[i]+ ",");
	     }
	     
	      boolean flag = isAnagram("Bangalore");
	      
	      boolean f = isAna("asdfghjklpoiuytrewqzxcvbnm");
	      if(f)
	      System.out.println("Valid ana");
	      else
	    	  System.out.println("Not valid ana");
	      
	}

	private static boolean isAna(String str) {
		System.out.println();
		Set<Character> set = new HashSet<>();
		
		for(char ch : str.toCharArray()) {
			set.add(ch);
		}
		
		return set.size() == 26;
		
 		
		
	}

	private static boolean isAnagram(String str) {
		
		if(str.length() < 26) {
			return false;
		}
		
		int[] chrs = new int[26];
		String s = str.toLowerCase();
		for(char ch : s.toCharArray()) {
			chrs[ch - 'a']++;
		}
		boolean flag = true;
		for(int i = 0; i < chrs.length; i++) {
			
			if(chrs[i] == 0) {
				flag = false;
				break;
			}
		}
		
		
		
		return flag;
		
	}
}
