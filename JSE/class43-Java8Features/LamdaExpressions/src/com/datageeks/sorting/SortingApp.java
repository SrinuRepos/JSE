package com.datageeks.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SortingApp {
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee(555, "Naresh", 67500f);
		Employee emp2 = new Employee(666, "Arup", 500f);
		Employee emp3 = new Employee(111, "Sateesh", 57500f);
		Employee emp4 = new Employee(888, "Venkatesh", 60500f);
		Employee emp5 = new Employee(222, "Srikath", 167500f);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		
		Collections.sort(list,(empl1,empl2) -> empl1.getEmployeeId().compareTo(empl2.getEmployeeId()));
		
		list.forEach(emp -> System.out.println(emp));
		
		System.out.println(" \n\n Lamda Expresion  with filter");
		
		Stream<Employee> highSalEmps = list.stream().filter(emp -> emp.getEmployeeSalary() > 60000f);
		highSalEmps.forEach(emp -> System.out.println(emp));

	}

}
