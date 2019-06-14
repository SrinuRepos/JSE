package com.google.app;
import com.google.ex.Sample;
import com.google.ex.Employee;


public class SampleApp
	{
public static void main(String args[])
{
	Employee emp1 = new Employee();
	Sample<Employee> s1 = new Sample<Employee>();
	s1.setData(emp1);
	System.out.println("Employee emp1 => Observe Default value not assigned  : "+s1.getData());

	
	Employee emp2 = new Employee(1242,"Srinu",5000f);
	s1.setData(emp2);

	System.out.println(" Emp2 Data "+s1.getData());
	
}
	}