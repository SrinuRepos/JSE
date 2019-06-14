package com.google.ex;

public class Employee implements Cloneable
	{
private Integer empNo ;
private Float empSal ;
private String empName;

public Employee()
{
}

public Employee(Integer empNo, String empName , Float empSal)
{
	this.empNo = empNo;
	this.empName = empName;
	this.empSal = empSal;
}

public String toString()
	{
return empNo + " : "+empName+ " : "+empSal;
	}

	}