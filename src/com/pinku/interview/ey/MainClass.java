package com.pinku.interview.ey;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass {
	public static void main(String[] args) {
		
		
		
		Person p = new Student("heel", 10);
		p.print();
		Student s = new Student("ggg", 0);
		
		
		Person obj1 = new Person("sonu", 20);
		Person obj2 = new Person("monu", 25);
		Person obj3 = new Person("sham", 10);
		Person obj4 = new Person("ram", 40);
		
		Set<Person> set = new HashSet<>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		System.out.println(set.size());
		
		List<Person> list = set.stream()
				.collect(Collectors.toList());
		
		Comparator<Person> com = (Person a,Person b) -> (int)a.getAge() - (int)b.getAge();
		
		Collections.sort(list, (Person a, Person b) -> a.getAge() - b.getAge());
		
		System.out.println(list);
		
		Collections.sort(list, (Person a, Person b) -> a.getName().substring(2).compareTo(b.getName().substring(2)));
		
		System.out.println(list);
		
		System.out.println(
		list.stream()
		.sorted((Person a, Person b) -> a.getName().substring(2).compareTo(b.getName().substring(2)))
		.collect(Collectors.toList()));
		
	}
}
