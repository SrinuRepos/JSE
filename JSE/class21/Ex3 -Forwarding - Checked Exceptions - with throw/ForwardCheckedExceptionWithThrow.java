package com.google.app;
import com.google.ex.Sample;

public class ForwardCheckedExceptionWithThrow
	{
public static void main(String args[]) 
{
	Sample s = new Sample();
	try
	{
	s.validateAge(15);
	}catch(Exception exp)
	{
	System.out.println(exp);
	}
}
	}

