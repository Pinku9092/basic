package com.pinku;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateDem {
	
	public static void main(String[] args) {
		
		
		
		
		List<String> names = Arrays.asList("Anish","mohan","sohan");
		
		Predicate<String> str = s -> s.startsWith("s");
		
		Predicate<String> lenP = s -> s.length() >=3;
		
		
		Consumer<String> consume = string -> System.out.println(string);
		//names.stream().filter(str).forEach(System.out::println);
		
		
		names.stream().filter(str.and(lenP)).forEach(consume);
	} 
	

}
