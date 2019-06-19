package com.google.ex;

public class Outer
	{
private int count = 10;

	public void getInfo()
		{
	
	class Inner
	{
		public void display()
		{
System.out.println(" From Local Inner class display() => count = "+count );
		}
	}

	Inner in = new Inner();
	in.display();

		}

	

	
	}
