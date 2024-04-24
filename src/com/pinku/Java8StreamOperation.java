package com.pinku;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamOperation {

	public static void main(String[] args) {
		System.out.println("StringJoiner for prefix and suffix");
		streamStringJoiner();
		System.out.println("Random number using forEach");
		get10RandomNumber();
		System.out.println("iterate stream using forEach");
		iterateStream();
		System.out.println("Minimum and Maximum from steam");
		minAndMaxFromStream();
		System.out.println("Map demo");
		multiplyBy3();
		System.out.println("Concat two stream");
		concateTwoStream();
		System.out.println("Sort the given list");
		sortTheList();
		System.out.println("2nd highest");
		secondHighest();
		
		//findFirst()
		Integer[] empIds = {1,2,3,4};
		
		flatMapExample();
		
		mapIteration();
	}

	private static void mapIteration() {
		Map<String, Integer> map = new HashMap<>();
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		Set<String> keySet = map.keySet();
		
		
		//max
		String maxKeyString = 
		entries.stream()
		.max(Map.Entry.comparingByValue()).get().getKey();


		
		Collection<Integer> values = map.values();
		int count =
		(int) entries.stream().filter(e -> e.getKey().endsWith("")).count();
		long count2 =
		keySet.stream().filter(k -> k.isEmpty()).count();
		List<Integer> list =
		values.stream().filter(v -> v == 1).collect(Collectors.toList());

		//values.tream().filter(v -> v == 1).collect(Collectors.toList());
		
	}

	private static void flatMapExample() {
		
		String[][] array = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};
		System.out.println("Flat Map Example");
		Stream<String[]> stream = Arrays.stream(array);
		
		List<String[]> result = stream
				.filter(x -> {
					for(String s : x) {
						if(s.equals("a")) {
							return false;
						}
					}
					return true;
				}).collect(Collectors.toList());

		/*List<String[]> result7 =
		stream.filter(str -> {
			for(String s : str){
				if (s.equals("a")){
					return false;
				}
			}
			return true;
		}).collect(Collectors.toList());

		result7.forEach(x -> System.out.println(Arrays.toString(x)));*/

		result.forEach(x -> System.out.println(Arrays.toString(x)));
		
		List<String> list =
		Stream.of(array)
		.flatMap(Stream::of)
		.filter(s -> s.equals(""))
		.collect(Collectors.toList());
		
		list.forEach(System.out::println);
	}

	private static void secondHighest() {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Optional<Integer> secondMax = list.stream().sorted((x,y) -> y-x).skip(1).findFirst();

		/*Optional<Integer> Max2 =
		list.stream().sorted((x,y) -> y - x).skip(1).findFirst();*/
		
		list.stream()
		.sorted((x,y) -> y-x)
		.skip(1)
		.findFirst();
		System.out.println(secondMax.get());
		
	}

	private static void sortTheList() {
		List<Integer> list = Arrays.asList(10,3,40,30,3,7);
		list.stream().sorted().forEach(System.out::println);
		int sum = list.stream().mapToInt(Integer::valueOf).sum();
		System.out.println("Sum is :"+
		sum);
		
	}

	private static void concateTwoStream() {
		List<Integer> list1 = Arrays.asList(1,2,3,4);
		List<Integer> list2 = Arrays.asList(5,6,7);
		Stream<Integer> concatStream = Stream.concat(list1.stream(), list2.stream());
		concatStream.forEach(System.out::println);
		
	}

	private static void multiplyBy3() {
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		List<Integer> result = list.stream().map(i -> i*3).collect(Collectors.toList());

		//list.stream().map(i -> i*3).collect(Collectors.toList());
		result.forEach(i-> System.out.println(i));
		
	}

	private static void minAndMaxFromStream() {
		Integer min = Stream.of(1,2,3,4,5)
				.min(Comparator.comparing(Integer::valueOf))
				.get();

		/*Stream.of(20,4,10,15)
						.min(Comparator.comparing(Integer::valueOf))
								.get();*/
		System.out.println("The minimum number is :"+min);
		Integer max = Stream.of(1,2,3,4,5)
				.max(Comparator.comparing(Integer::valueOf))
				.get();
		System.out.println("The maximum number is :"+max);
		
	}

	private static void iterateStream() {
		List<String> str = Arrays.asList("My","name","is","khan");
		str.stream().forEach(System.out::println);

		//Arrays.asList("My","name","is","khan").stream().forEach(System.out::println)
		
	}

	private static void get10RandomNumber() {
		Random random = new Random();
		
		random.ints().limit(10).forEach(System.out::println);

		//random.ints().limit(10).forEach(System.out::println);
		System.out.println("Only positive");
		//random.ints().limit(10).filter(n -> n > 0).forEach(n ->System.out.println(n))
		random.ints().limit(10).filter(n -> n > 0).forEach(System.out::println);
		
	}

	private static void streamStringJoiner() {
		StringJoiner stringJoiner = new StringJoiner(",","#","#");
		stringJoiner.add("A");
		stringJoiner.add("B");
		stringJoiner.add("C");
		System.out.println("String after adding # in suffix and prefix");
		System.out.println(stringJoiner);

		/*StringJoiner sj = new StringJoiner(",","#","#");
		sj.add("A");
		sj.add("B");
		sj.add("C");
		System.out.println(sj);*/
		
	}

}
