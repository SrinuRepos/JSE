package com.google.ex;

public class Outer
	{

private static int count = 10;

	public static class Inner
	{
	public void getInfo()
		{
System.out.println(" From Static Inner class :: getInfo() => count = "+count);
		}

	public static void print()
	{
	System.out.println(" From Static Inner class :: print()");
	}

	}

	
	}
