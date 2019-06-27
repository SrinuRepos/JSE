package com.google.ex;

class Sample
	{
private static Sample s ;

private Sample()
{
	System.out.println(" Sample Object Created: From Constructor");
}



public static Sample getSample()
{
	synchronized(Sample.class)
	{
		if(s == null)
			{
		s = new Sample();
			}
	}

return s;
}


	}

public class SingleTonApp
	{
public static void main(String args[])
{
	
	Sample s1 = Sample.getSample();
	Sample s2 = Sample.getSample();
}
	}














