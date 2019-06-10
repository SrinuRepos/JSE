package com.google.ex;

public class HandlingMultipleExceptionsApp
	{
public static void main(String args[])
{
	try
	{
	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int c = a/b;
	System.out.println(" Div is :: "+c);
	}
	
	 catch(ArrayIndexOutOfBoundsException exp)
	{
	System.out.println(" \n From catch block:: Please pass 2 Command Line Arguments");
	}
	
	catch(ArithmeticException exp)
	{
	System.out.println(" \n From catch block:: 2nd argument should not be zero");
	}
	catch(NumberFormatException exp)
	{
	System.out.println(" \n From catch block:: Please pass only Integer values");
	}
	catch(Exception exp)
		{
	System.out.println(" \n From Exception catch block::  block  :: "+exp);
		}
	
}
	}