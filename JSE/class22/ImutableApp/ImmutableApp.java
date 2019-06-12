package com.google.app;
import com.google.ex.Sample;

public class ImmutableApp
	{
public static void main(String args[])
{
	Sample s = new Sample(10,"Srinu");
	System.out.println(" Count ::"+s.getCount());
	System.out.println(" Name  ::"+s.getName());
	
}

	}