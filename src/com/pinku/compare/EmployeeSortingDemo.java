package com.pinku.compare;

import java.util.Arrays;
import java.util.Comparator;

public class EmployeeSortingDemo {
	
	public static void main(String[] args) {
		Employee[] empArr = new Employee[4];
		
		empArr[0] = new Employee(10, "Mikey", 25, 10000);
		empArr[1] = new Employee(20, "Arun", 29, 20000);
		empArr[2] = new Employee(5, "Lisa", 35, 5000);
		empArr[3] = new Employee(1, "Pankaj", 32, 50000);
		
		System.out.println("Before sorting employees : "+Arrays.toString(empArr));
		Arrays.sort(empArr); //Employee class needs to implement Comparable interface
		System.out.println("After sorting employees : "+Arrays.toString(empArr));
		Arrays.sort(empArr,salaryComparator);
		System.out.println("After sorting employees based on salary : "+Arrays.toString(empArr));
		empArr[0] = new Employee(10, "ABC", 25, 10000);
		Arrays.sort(empArr, new EmployeeIdAndNameComparator());
		System.out.println("After sorting employees based on EmployeeIdAndNameComparator : "+Arrays.toString(empArr));
		
		Comparator<Employee> ageComparatordsc = ((o1, o2) -> o2.getAge() - o1.getAge());
		Arrays.sort(empArr, ageComparatordsc);
		System.out.println("After sorting employees based on age : "+Arrays.toString(empArr));
		
	}
	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
		
		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return (int) (o1.getSalay() - o2.getSalay());
		}
	};
	
	static Comparator<Employee> ageComparator = ((o1, o2) -> o1.getAge() - o2.getAge());
}
