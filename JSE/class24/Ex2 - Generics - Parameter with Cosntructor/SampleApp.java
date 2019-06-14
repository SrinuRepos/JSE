package com.google.app;
import com.google.ex.Sample;

public class SampleApp
	{
public static void main(String args[])
{
	Sample<Integer> s1 = new Sample<Integer>(15);

	System.out.println("s1 Data : "+s1.getData());


	Sample<String> s2 = new Sample<String>("Kiran");
	System.out.println("s2 Data : "+s2.getData());

	
}
	}