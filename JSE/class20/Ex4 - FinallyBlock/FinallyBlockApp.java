package com.google.ex;

public class FinallyBlockApp
	{
public static void main(String args[])
{
	try
	{
	String name = args[0];
	System.out.println("\n\n  Name :: "+name);
	}
	
	 catch(ArrayIndexOutOfBoundsException exp)
	{
	System.out.println(" \n From catch block:: Please pass  Command Line Argument");
	}
	
	finally
	{
	System.out.println(" \n From Finally Block :: Resources Released");
	}
	
}
	}