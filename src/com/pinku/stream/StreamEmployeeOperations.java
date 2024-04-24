
package com.pinku.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEmployeeOperations {

	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1110, "Amitap Bachan", 77, "Male", "Actor", 1970, 10000000));
		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
	
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		/*
		 * System.out.println("List down the names of all employees in each department"
		 * ); nameOfTheAllEmployeeInEachDepartment(employeeList);
		 * 
		 * System.out.
		 * println("What is the average and total salary of whole organization");
		 * totalAndAverageWholeOrg(employeeList);
		 * 
		 * System.out.println("Employee who are younger than and equal to 25");
		 * 
		 * employeeYoungerAndEqualTo25(employeeList);
		 * 
		 * System.out.println("Oldest employee"); oldestEmployee(employeeList);
		 * System.out.println("Find 2nd hightest salary");
		 * secondHighestSalary(employeeList);
		 */
		
		
		
		List<User> userList = new ArrayList<>();
		List<Address> addressList1 = new ArrayList<>();
		addressList1.add(new Address(1,11111,"delhi", "delhi"));
		addressList1.add(new Address(2,11112,"jaipur", "raj"));
		List<Address> addressList2 = new ArrayList<>();
		addressList2.add(new Address(3,11111,"delhi", "UP"));
		addressList2.add(new Address(4,11112,"noida", "UP"));
		List<Address> addressList3 = new ArrayList<>();
		addressList3.add(new Address(5,11115,"delhi", "delhi"));
 		userList.add(new User(1, 55, "sohan", addressList1));
 		userList.add(new User(2, 45, "rohan", addressList2));
 		userList.add(new User(3, 60, "kohan", addressList3));
		
		
	
 		userList.stream()
 		.filter(user -> user.getAge() > 50)
 		.filter(user -> user.getAddress().stream()
 				.anyMatch(address -> address.getCity().equals("delhi"))
 				
 				).forEach(System.out::println);


		 userList.stream()
				 .filter(user -> user.getAge() > 50)
						 .filter(user -> user.getAdress().stream()
								 .anyMatch(address -> address.getCity().equals("delhi")))
								 .forEach(System.out::println);
 		//Flat Map example
 		System.out.println("Flat Map example");
 		
 		
 		List<Address> l = 
 		userList.stream()
 		.flatMap(x -> x.getAddress().stream())
 		.filter(x -> x.getCity().toLowerCase().equals("delhi"))
 		.collect(Collectors.toList());
 		
 		
 		//count using flatMapping
 		
 		Map<Integer, Long> countUsingflatMapping = 
 				
 		userList.stream()
 		.collect(Collectors.groupingBy((User user) -> user.getAge(),
 			Collectors.flatMapping((User user) -> user.getAddress().stream(), Collectors.counting())));
 			
 		
 		System.out.println("countUsingflatMapping :"+countUsingflatMapping);

		/* Map<Integer, Long> contUsingFlatMapping4 = userList.stream()
				 .collect(Collectors.groupingBy(
						 (User user) -> user.getAge(),
						 Collectors.flatMapping(
								 (User user) -> user.getAddress.stream(), Collectors.counting()
						 )
				 ))*/
 		
 		//flatMaping
 		Map<Integer, Set<Address>> groupingbyAgeandFlatMapping =
 		userList.stream()
 		.collect(Collectors.groupingBy((User user) -> user.getAge(),
 			Collectors.flatMapping((User user) -> user.getAddress().stream(), Collectors.toSet())));
 		
 		System.out.println("groupingbyAgeandFlatMapping :"+groupingbyAgeandFlatMapping);
 		
 		//filtering
 		List<Employee> filtering = 
 		employeeList.stream()
 		.collect(Collectors.filtering((Employee e)  -> e.getAge() > 30, Collectors.toList()));
 		System.out.println("filtering :"+filtering);
 		
 		//partitionBy
 		Map<Boolean, List<Employee>> partitionByAge =
 		employeeList.stream()
 		.collect(Collectors.partitioningBy(e -> e.getAge() >30));
 		
 		
 		//groupBy
 		Map<String, Set<Employee>> map2 =
 		employeeList.stream()
 		.collect(Collectors.groupingBy(e -> e.getName(), Collectors.toSet()));
 		
 		Map<String, Set<Employee>> map3 =
 		employeeList.stream()
 		.collect(Collectors.groupingBy(e -> e.getName(), Collectors.toSet()));
 		
 		
 		//averagingDouble
 		double avgSalByaveragingDouble =
 		employeeList.stream()
 		.collect(Collectors.averagingDouble((Employee e) -> e.getSalary()));
 		
 		System.out.printf("averagingDouble: %.2f\n",avgSalByaveragingDouble);
 		
 		double avgSalByaveragingDouble2 =
 		employeeList.stream()
 		.collect(Collectors.averagingDouble(Employee :: getSalary));

		/* double avgSBAD =
				 employeeList.stream()
						 .collect(Collectors.avaragingDouble(Employee :: getSalary))*/
 		
 		//toMap
 		Map<Integer, Employee> toMapExample1 =
 		employeeList.stream()
 		.collect(Collectors.toMap(e ->e.getId(), Function.identity()));
 		
 		System.out.println("toMapExample1 :"+toMapExample1);

		/* Map<Integer, Employee> toMapDemo =
				 employeeList.stream()
						 .collect(Collectors.toMap(e -> e.getId(),
								 Function.identity()
								 ))*/

 		Map<Integer, Employee> toMapExample2 =
 		employeeList.stream()
 		.collect(Collectors.toMap(e -> e.getId(), Function.identity()));
 		
 		//toMap when duplicate key
 		
 		employeeList.add(new Employee(277, "pinku", 31, "Male", "Product Development", 2012, 35700.0));
 	/*	
 		Map<Integer, Employee> toMapExampleWhenKeyDuplicate =
 		 		employeeList.stream()
 		 		
 		 		.collect(Collectors.toMap(e ->e.getId(), Function.identity()));
 		 		
 		 		System.out.println("toMapExampleWhenKeyDuplicate :"+toMapExample1);
 		*/
 		
 		
 	 	//toMap when duplicate key : Solution
 		
 		
 		Map<Integer, Employee> toMapExampleWhenKeyDuplicateSolution =
 		 		employeeList.stream()
 		 		
 		 		.collect(Collectors.toMap(e ->e.getId(), Function.identity(), (emp, sameEmp) -> sameEmp));
 		 		
 		 		System.out.println("toMapExampleWhenKeyDuplicateSolution :"+toMapExample1);
 		
	/*	Map<Integer, Employee> toMapDemoDuplicateSolution =
		employeeList.stream()
				.collect(Collectors.toMap(
						e -> e.getId(),
						Function.identity(), (emp,sameEmp) -> sameEmp
				));		*/


 		//toCollection : TreeSet
 		Set<String> namesUsingtoCollectionTreeSet =  employeeList.stream()
 				.map(e -> e.getName())
 				.collect(Collectors.toCollection(TreeSet :: new));
 		
 		/*Set<String> namesSetToCollection = employeeList.stream()
				.map(e -> e.getName())
				.collect(Collectors.toCollection(TreeSet :: new));*/

 		Set<String> namesUsingtoCollectionTreeSet2 = 
 		employeeList.stream()
 		.map(e -> e.getName())
 		.collect(Collectors.toCollection(TreeSet :: new));
 		
 		//toCollection : LinkedList
 		
 		List<String> namesUsingtoCollection = employeeList.stream()
 				.map(e -> e.getName())
 				.collect(Collectors.toCollection(LinkedList::new));
 		System.out.println("toCollection: "+namesUsingtoCollection);

		/* List<String> namesUsingCollection = employeeList.stream()
				 .map(e -> e.getName())
				 .collect(Collectors.toCollection(LinkedList :: new));*/

 		//findFirst()
		
		String emp = employeeList.stream()
						.map(Employee::getName)
						.filter(e -> e != null)
						.filter(e -> e.length() > 2)
						.findFirst()
						.orElse(null);
						
			System.out.println(emp);
			
			
			
			
			//salary and age
			
			System.out.println("salary then name");
			
			employeeList.stream()
			
			.sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName))
			.forEach(System.out::println);

			/*employeeList.stream()
					.sorted(
							Comparator.comparing(Employee :: getSalary).thenComparing(Employee :: getName)
					).forEach(System.out::println);
			*/

			List<Employee> employeeSalaryNameSortedList =
			
			(List<Employee>) employeeList.stream()
			.sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName));
			//.forEach(System.out::println);

		/*List<Employee> employeeSortedBasedOnSalaryAndName =
		(List<Employee>)
			employeeList.stream()
					.sorted(
							Comparator.comaring(Employee :: getSalary)
									.thenComparing(Employee :: getName)
					);
			*/
			
			
		//toArray
		
			Employee[] employees = employeeList.stream()
									.toArray(Employee[] :: new);
		
			Employee[] employees1 =
			employeeList.stream()
			.toArray(Employee[] :: new);

			/*employeeList.stream()
					.toArray(Employee[] :: new);*/

		//flatMap
			
			List<List<String>> namesNested = Arrays.asList(
					
						Arrays.asList("A","B"),
						Arrays.asList("C","D")
					);

			/*List<List<String>> namesNested = Arrays.asList(
					Arrays.asList("A","B"),
					Arrays.asList("C","D")
			);*/
			List<String> namesFlatStream = namesNested.stream()
					.flatMap(Collection::stream)
					.collect(Collectors.toList());
			namesFlatStream.forEach(System.out::println);



			/*namesNested.stream()
					.flatMap(Collection :: stream)
					.collect(Collectors.toList());
			*/
			//peek
			
			List<Integer> peekResult = employeeList.stream()
										.map(e -> e.getAge())
										.peek(System.out::println)
										.collect(Collectors.toList());
					peekResult.forEach(System.out::println);
		//max
					Employee emp1 = employeeList.stream()
									.max(Comparator.comparing(Employee::getSalary))
									.orElseThrow(NoSuchElementException::new);
					System.out.println(emp1);
					
		//reduce
					
	Double sumSal =	employeeList.stream()
		.map(Employee :: getSalary)
		.reduce(0.0, Double::sum);
	
	System.out.println("Sum of employee salaries :"+sumSal);

	/*Double sumSal =
	employeeList.stream()
			.map(Employee :: getSalary)
			.reduce(0.0, Double::sum);*/
	
	//Joining
	String empNames = employeeList.stream()
						.map(Employee::getName)
						.collect(Collectors.joining(","))
						.toString();
	String empNames1 = 
	employeeList.stream()
				.map(Employee::getName)
				.collect(Collectors.joining(","));

	/*employeeList.stream()
			.map(Employee :: getName)
			.collect(Collectors.joining(","));*/

	//toCollection
	
	 ArrayList<String> namesCollection = employeeList.stream()
	 										.map(Employee::getName)
	 											.collect(Collectors.toCollection(ArrayList::new));
	 
	 //DoubleSummaryStatistics
	 DoubleSummaryStatistics stats = employeeList.stream()
			 							.collect(Collectors.summarizingDouble(Employee::getSalary));
	 System.out.println(stats.getSum());
	 
	 DoubleSummaryStatistics stats2 = employeeList.stream()
	 									.map(Employee::getSalary)
										.collect(Collectors.summarizingDouble(s ->s));
	 			System.out.println(stats.getAverage());
	 			
	 //partitioningBy(when requires in two parts)
	 List<Integer> inList = Arrays.asList(2,4,5,6,8);
	 	Map<Boolean, List<Integer>> isEven = inList.stream()
	 											.collect(
	 													Collectors.partitioningBy(i -> i%2 == 0));
	 //groupingBy(when requires more than two parts)
	 	Map<Boolean, List<Employee>> namesStartWith = employeeList.stream()
	 												
	 												.collect(
	 														Collectors.groupingBy(e -> e.getName().startsWith("J"))
	 														);
	 	System.out.println("groupBy :"+namesStartWith);
	 	
	 	//mapping(sometimes need after grouping element in some other type)
	 	System.out.println("group by then mapping");
	 	Map<Boolean, List<String>> namesGroupByAndMapping = employeeList.stream()
	 	.collect(
	 			
	 			Collectors.groupingBy(e -> e.getName().startsWith("J"),
	 					Collectors.mapping(Employee::getName, Collectors.toList()))
	 			
	 			);

		 /*Map<Boolean, List<String>> namesGroupByAndMapping5 = employeeList.stream()
				 .collect(
						 Collectors.groupingBy(e -> e.getName().startsWith("J"),
								 Collectors.mapping(Employee::getName, Collectors.toList()))
				 )*/

		/*
		 * employeeList.stream() .collect( Collectors.groupingBy(e ->
		 * e.getName().startsWith("J"), Collectors.mapping(Employee::getName,
		 * Collectors.toList())) );
		 */
	 	
	 	
	 	
	 	Set<Entry<Boolean, List<String>>> entrySet = namesGroupByAndMapping.entrySet();
	 	for(Entry<Boolean, List<String>> entry : entrySet) {
	 		if(entry.getKey()) {
	 			System.out.println("Key --> :"+entry.getKey());
	 				for(String str : entry.getValue()) {
	 					System.out.print(str+",");
	 				}
	 				System.out.println();
	 			
	 		}
	 	}
	 	
		/*
		 * Set<Entry<Boolean, List<String>>> entrySet1 =
		 * namesGroupByAndMapping.entrySet();
		 * 
		 * for(Entry<Boolean, List<String>> entry : entrySet) { if(entry.getKey()) {
		 * System.out.println("Key --> :"+entry.getKey()); for(String str :
		 * entry.getValue()) { System.out.print(str+","); } System.out.println(); } }
		 */
	 	
	 	//Java 9 Improvement takeWhile & dropWhile
	 	
		/*
		 * Stream.iterate(1, i -> i +1) .takeWhile(n -> n <=10) .map(x -> x*x)
		 * .forEach(System.out::println);
		 */
	 											
	}

	private static void secondHighestSalary(List<Employee> employeeList) {
		
		//System.out.println(employeeList.stream().sorted(e1,e2) -> e2.);
		
		//Hightest
		System.out.println(employeeList.stream().sorted((e1,e2)-> (int) e2.getSalary()- (int)e1.getSalary())
		.findFirst().get());

		/*employeeList.stream().sorted((e1,e2) -> (int) e2.getSalary() - (int) e1.getSalary()).findFirst().get()
		*/
		//employeeList.stream().sorted((e1, e2) -> (int) e2.getSalary() - (int)e1.getSalary()).findFirst().get();
		//2nd hightest
		System.out.println(employeeList.stream().sorted((e1,e2)-> (int) e2.getSalary()- (int)e1.getSalary())
				.skip(1)
				.findFirst().get());
		
		//employeeList.stream().sorted((e1,e2) -> (int) e2.getSalary() - (int)e1.getSalary()).skip(1).findFirst().get();
		
	}

	private static void oldestEmployee(List<Employee> employeeList) {
	
		Optional<Employee> oldEmp = employeeList.stream()
				.max(Comparator.comparing(Employee::getAge));
		
		//employeeList.stream().max(Comparator.comparing(Employee::getAge));

		/*Employee maxEmp5 = oldEmp.isPresent()? oldEmp.get():null;
		*/
		Employee maxEmp = oldEmp.isPresent()? oldEmp.get():null;
		
		System.out.println(maxEmp.getName()+" "+maxEmp.getAge()+" "+maxEmp.getDepartment());
		
	}

	private static void employeeYoungerAndEqualTo25(List<Employee> employeeList) {
		List<String> result = employeeList.stream()
		.filter(emp -> emp.getAge() <=25)
		.map(emp -> emp.getName()).collect(Collectors.toList());
		
		result.forEach(System.out::println);
		
		result.forEach(System.out::println);
		
		//partitioningBy
		
		Map<Boolean, List<Employee>> partitionEmpByAge = employeeList.stream()
				.collect(Collectors.partitioningBy(emp -> emp.getAge() <= 25));
		
		Set<Entry<Boolean, List<Employee>>> entrySet = partitionEmpByAge.entrySet();
		
		for(Entry<Boolean, List<Employee>> entry : entrySet) {
			if(entry.getKey()) {
				for(Employee emp : entry.getValue()) {
					System.out.println(emp.getName());
				}
			}
		}
		
		//employeeList.stream()
		//.collect(Collectors.partitioningBy(emp -> emp.getAge() <= 25), Collectors.mapping(Employee::getName, Collectors.toCollection(ArrayList::new)));
	}

	private static void totalAndAverageWholeOrg(List<Employee> employeeList) {
		DoubleSummaryStatistics empSummaryStatistics = employeeList.stream()
		.collect(Collectors.summarizingDouble(Employee::getSalary));
		
		System.out.println("Average Salary :"+empSummaryStatistics.getAverage());
		
		System.out.println("Total Salary :"+empSummaryStatistics.getSum());
		
		System.out.println("Min Salary :"+empSummaryStatistics.getMin());
		
		Employee minEmployee = employeeList.stream()
		.collect(Collectors.minBy(Comparator.comparing(Employee::getSalary))).get();

		/*Employee maxEmployee = employeeList.stream()
						.collect(
								Collectors.maxBy(
										Comparator.comparing(
												Employee :: getSalary
										)
								)
						).get();
		System.out.println(maxEmployee.getSalary());*/

		System.out.println("Min Salary by minBy:"+minEmployee.getSalary());
		
	}

	private static void nameOfTheAllEmployeeInEachDepartment(List<Employee> employeeList) {
		
		Map<String, List<Employee>> empNamesInEachDept = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		/*employeeList.stream()
				.collect(Collectors.groupingBy(Employee :: getDepartment));*/
						
		Set<Entry<String, List<Employee>>> entrySet = empNamesInEachDept.entrySet();
	/*	Set<Entry<String, List<Employee>>> entrySet = empNamesInEachDept.entrySet();*/
		for(Entry<String, List<Employee>> entry : entrySet) {
			System.out.println("Employee in :"+entry.getKey()+" ========   ");
			
			for(Employee e : entry.getValue()) {
				System.out.println(e.getName());
			}
		}
		

		/*for(Entry<String, List<Employee>> entry : entrySet){
			System.out.println(entry.getKey());
			for(Employee e : entry.getValue()){
				System.out.println(e.getName);
			}
		}*/
		
		
		
		
		
		Map<String, List<String>> departmentWiseEmployeeName =
		
		employeeList.stream()
		.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.mapping(Employee::getName, Collectors.toList())));
		
		
		departmentWiseEmployeeName.entrySet()
		.stream()
		.forEach(entry -> System.out.println(entry.getKey()+"====="+entry.getValue()));
		

	/*	departmentWiseEmployeeName.entrySet()
				.stream()
				.forEach(entry -> System.out.println(entry.getKey()+"====="+entry.getValue()))*/

	Map<Boolean, Integer> map = new HashMap<>();
	map.put(false, 5);
	map.put(true, 5);
	map.put(true, 6);
	map.put(true, 10);
	
	DoubleSummaryStatistics result =
	map.entrySet().stream()
	.filter(e -> e.getKey())
	.map(e -> e.getValue())
	.collect(Collectors.summarizingDouble(Integer::valueOf));
	
	System.out.println(result.getSum());
	
	
	map.forEach((k,v) -> System.out.println(k.toString()+" "+v.toString()));
	}
	
	

}
