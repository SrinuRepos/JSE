package com.google.ex;
import com.google.exp.AgeLimitException;
public class Sample
	{

public void validateAge(int age)  throws AgeLimitException 
{
	if( age >= 18)
	{
	System.out.println( " \n\nYou are eligible for Vote ");
	}
	else
	{
	System.out.println( "\n\n You are not eligible for Vote ");
	throw new AgeLimitException(" Age is less than 18");
	}

	System.out.println(" Satement 1 => Please Apply for vote ");
	System.out.println(" Satement 2 => Choose Right Leader ");

}
	}