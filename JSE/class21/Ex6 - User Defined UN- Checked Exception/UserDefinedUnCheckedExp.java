package com.google.app;
import com.google.ex.Sample;
import com.google.exp.AgeLimitException;

public class UserDefinedUnCheckedExp
	{
public static void main(String args[]) 
{
	Sample s = new Sample();
	try
	{
	s.validateAge(15);
	}catch(AgeLimitException  exp)
	{
	System.out.println(exp);
	}
	
}
	}

