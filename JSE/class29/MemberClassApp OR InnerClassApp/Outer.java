package com.google.ex;

public class Outer
	{

private int count = 10;

public void display()
{
	System.out.println(" From Outer class :: display()");
}

	public class Inner
	{
	public void getInfo()
		{
System.out.println(" From Inner class :: getInfo() => count = "+count);
		}
	}

	
	}
