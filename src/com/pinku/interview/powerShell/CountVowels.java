package com.pinku.interview.powerShell;
import java.util.*;
public class CountVowels {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("My name is bharat");
		list.add("Your name is pinku");
		countVowelsInList(list);
	}

	private static void countVowelsInList(List<String> list) {
		
		if(list.isEmpty()) {
			return;
		}
		
		for(String str : list) {
			str = str.toLowerCase();
			System.out.println(str);
			int count = 1;
			char[] charArr = str.toCharArray();
			Arrays.sort(charArr);
			Map<Character, Integer> map = new HashMap<>();
			for(char ch : charArr ) {
				
				if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					if(map.containsKey(ch)) {
						map.put(ch, map.get(ch)+1);
					}else {
						map.put(ch, 1);
					}
					
				}
			}
			System.out.println(count);
		}
		
		
	}
}
