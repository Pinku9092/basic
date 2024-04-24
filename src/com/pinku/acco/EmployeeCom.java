package com.pinku.acco;

import java.util.Comparator;

public class EmployeeCom  implements Comparator<Employee1>{

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		
		
		int a = o1.age - o2.age;
		if(a == 0) {
			return o1.name.compareToIgnoreCase(o2.name);
		}
		
		return a;
	}

}
