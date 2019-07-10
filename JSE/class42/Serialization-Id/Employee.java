package com.google.ex;
import java.io.Serializable;

public class Employee implements Serializable
	{
static final long serialVersionUID = 22L;

private int empNo ;
private transient String empName;
private float  salary;

public Employee()
{
}

public Employee(int empNo,String empName,float  salary)
{
	this.empNo = empNo;
	this.empName = empName;
	this.salary = salary;
}

public void setEmpNo(int empNo)
{
	this.empNo = empNo;
}

public void setEmpName(String empName)
{
	this.empName = empName;
}

public void setSalary(float salary)
{	
	this.salary = salary;
}

public int getEmpNo()
	{
return empNo;
	}

public String getEmpName()
	{
	return empName;
	}

public float getSalary()
{
	return salary;
}

public String toString()
{
	return empNo + " : "+empName+" : "+salary+" : "+serialVersionUID ;
}
	}











