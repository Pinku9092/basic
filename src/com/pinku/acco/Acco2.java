package com.pinku.acco;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Acco2 {

	public static void main(String[] args) {

		String str = "abc,abcd,abcde,abcdef,abcdefg";

		String[] strings = str.split(",");
		// Map<Integer, String> map =
		System.out.println(Arrays.asList(strings).stream().collect(Collectors.toMap(s -> s.length(), s -> s)));
		
		//System.out.println(Arrays.asList(strings).stream()
			//	.collect(Collectors.toCollection(String::length, String::valueOf, HashMap::new));
		System.out.println(Arrays.asList(str.split(",")).stream()
				.map(s -> s.length()).collect(Collectors.toCollection(LinkedList::new)));

	}
}
