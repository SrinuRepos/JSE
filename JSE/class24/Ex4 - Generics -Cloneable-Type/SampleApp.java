package com.google.app;
import com.google.ex.Sample;
import com.google.ex.Employee;


public class SampleApp
	{
public static void main(String args[])
{
	Employee emp1 = new Employee(1242,"Srinu",5000f);
	Sample<Employee> s1 = new Sample<Employee>();
	s1.setData(emp1);
	System.out.println("Observation is Employee is Cloneable type => : "+s1.getData());


	
}
	}