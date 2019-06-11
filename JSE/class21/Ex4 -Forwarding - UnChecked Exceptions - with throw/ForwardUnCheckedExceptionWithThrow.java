package com.google.app;
import com.google.ex.Sample;

public class ForwardUnCheckedExceptionWithThrow
	{
public static void main(String args[]) 
{
	Sample s = new Sample();
	try
	{
	s.validateAge(15);
	}catch(RuntimeException exp)
	{
	System.out.println(exp);
	}
	
}
	}

