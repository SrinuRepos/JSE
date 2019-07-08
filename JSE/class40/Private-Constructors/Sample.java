package com.google.ex;

public class Sample
	{
private Sample()
{
	System.out.println(" From DefaultConstructor :: sample()");
}

private Sample(String name , Integer count)
{
System.out.println(" From ParameterizedConstructor :: sample(name , count)");
System.out.println( count+ "  : "+name);
}

public void getInfo()
	{
	System.out.println(" From Sample getInfo()");
	}
	
	}

 