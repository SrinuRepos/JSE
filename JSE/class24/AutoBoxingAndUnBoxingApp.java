package com.google.app;

public class AutoBoxingAndUnBoxingApp
	{
public static void main(String args[])
{
	int count = 10;
	Integer c = count; // Converting Primitive to Wrapper is called Auto Boxing
	System.out.println(" Auto Boxing c =>  "+c);

	Integer b = new Integer(20);
	int d = b; // Converting Wrapper  to Primitive is called UnBoxing

	System.out.println(" Un Boxing  d => "+d);
}
	}