package com.pinku.acco;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public class Xebia {
	
	public static void main(String[] args) {
		String input = "this is long crazy interview";
		
		String[] charArray = input.split("");
		Map<Character, Integer> map = new HashMap<>();
		
		
		for(int i = 0; i < charArray.length; i++) {
			 String str = charArray[i];
			 char ch = str.charAt(0);
			 if(ch != ' ') {
				 if(!map.containsKey(ch)) {
					 map.put(ch, 1);
				 }else {
					 map.put(ch, map.get(ch)+1);
				 }
				// map.put(ch, map.getOrDefault(ch, 0)+1);
			 }
		}
	
		System.out.println(map);
		
		System.out.println("with Comparator.reverseOrder");
		
		Map<Character, Integer> resultMap =
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		System.out.println(resultMap);
		
		
		
		Map<Character, Integer> resultMap2 =
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newNew) -> oldValue, LinkedHashMap::new));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String firstKeyFromMap =
		resultMap.keySet()
		.stream()
		.map(String::valueOf).findFirst().get();
		
		System.out.println(firstKeyFromMap);
		
		Entry<Character, Integer> resultMap1 =
				 map.entrySet().stream()
		.max(Map.Entry.comparingByValue(Comparator.reverseOrder())).get();
			
		Character set1 = resultMap1.getKey();
		System.out.println(resultMap1);
		
		
		/*
		 * Map<Character, Integer> resultMap2 = (HashMap<Character, Integer>)
		 * map.entrySet().stream()
		 * .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).findFirst().
		 * get(); //.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
		 * (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		 */	
			
		/*
		 * Set<Character> set = resultMap2.keySet();
		 * 
		 * System.out.println("Only greater key "+set.toString());
		 */
		
		
		
		System.out.println("with reversed");
		Map<Character, Integer> linkedMap = new LinkedHashMap<>();
		
		map.entrySet().stream()
		.sorted(Map.Entry.<Character,Integer>comparingByValue().reversed())
		.forEachOrdered(x -> linkedMap.put(x.getKey(), x.getValue()));
		
		
		System.out.println(linkedMap);
		
		//custom Comparator
		Comparator<Integer> decendingCom = (a,b) -> b - a;
		
		System.out.println("mapWithCusCom");
		Map<Character, Integer> mapWithCusCom =
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(decendingCom))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		System.out.println(mapWithCusCom);
		
		//basic
		mapObectTest();
	}

	private static void mapObectTest() {
		String a = "levis";
		String b = new String("levis");
		
		Map<String, Integer> aMap = new HashMap<>();
		
		aMap.put(a, 14);
		aMap.put(b, 12);
		System.out.println(aMap.get("levis"));
		System.out.println(aMap.get(new String("levis")));
		
	}
	
	
}
