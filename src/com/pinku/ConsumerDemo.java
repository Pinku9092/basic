package com.pinku;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerDemo {
	
	
	public static void main(String[] args) {
		
		Consumer<String> consume = str -> System.out.println(str);
		
		Stream<String> cities = Stream.of("A","B","C","D");
		
		cities.forEach(consume);
		
		consume.accept("pinku");
	}

}
