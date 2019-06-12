package com.google.ex;

public class StringImutabilityObservation
	{
public static void main(String args[])
{
	String s1 = "Welcome";
	System.out.println(" Before => s1 = "+s1);
		
	s1.concat(" To Hyd ");		
	System.out.println(" After => s1 = "+s1);
	
}
	}