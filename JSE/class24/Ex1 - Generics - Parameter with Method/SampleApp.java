package com.google.app;
import com.google.ex.Sample;

public class SampleApp
	{
public static void main(String args[])
{
	Sample<Integer> s1 = new Sample<Integer>();
	s1.setData(10);
	System.out.println("s1 Data : "+s1.getData());


	Sample<String> s2 = new Sample<String>();
	s2.setData("Srinu");
	System.out.println("s2 Data : "+s2.getData());

	
}
	}